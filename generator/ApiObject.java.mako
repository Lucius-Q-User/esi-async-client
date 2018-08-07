package luser.esi.client;

{{PUT_IMPORTS_HERE}}
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;

class ${tag}ApiImpl implements ${tag}Api {
    private ApiClient apiClient;
    ${tag}ApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    @Override
    public ApiClient getApiClient() {
        return apiClient;
    }
    % for path in paths:
    % for method in swg["paths"][path]:
    <% returnType = getReturnTypeName(path, method) %>
    @Override
    public CompletableFuture<EsiResponseWrapper<${returnType}>> \
${getFunctionName(path, method)}(\
        % for argty, argname in getArgNames(path, method):
${argty} ${argname}\
        %if not loop.last:
, \
        %endif
        %endfor
) {
        String url = "https://esi.evetech.net${path}";
        <%
            headerParDef = []
            queryParDef = []
            pathParDef = []
            bodyPar = None
            parDefs = swg["paths"][path][method]["parameters"]

            for par in parDefs:
                if "$ref" in par:
                    if par["$ref"] == "#/parameters/token":
                        continue
                    par = parameterRefs[par["$ref"]]
                if par["name"] == "language":
                    continue
                if par["in"] == "header":
                    headerParDef.append(par)
                elif par["in"] == "query":
                    queryParDef.append(par)
                elif par["in"] == "path":
                    pathParDef.append(par)
                elif par["in"] == "body":
                    bodyPar = par
        %>
        Map<String, String> parametersInHeaders = new HashMap<>(${len(headerParDef)});
        % for par in headerParDef:
        if (${toLcaseJava(par["name"])} != null) {
            String val = ${toLcaseJava(par["name"])}${".stringValue" if "enum" in par else ""};
            parametersInHeaders.put("${par["name"]}", val);
        }
        %endfor
        Map<String, String> parametersInQuery = new HashMap<>(${len(queryParDef)});
        % for par in queryParDef:
        <% skipNullCheck = (par["type"] == "integer" or par["type"] == "boolean" or par["type"] == "number") and "required" in par and par["required"] == True  %>
        \
        %if not skipNullCheck:
if (${toLcaseJava(par["name"])} != null) \
        %endif
{
            %if par["type"] == "integer" or par["type"] == "boolean" or par["type"] == "number":
            String val = String.valueOf(${toLcaseJava(par["name"])});
            %elif par["type"] == "array":
            String val = ApiClientBase.renderArrayToQuery(${toLcaseJava(par["name"])}, null);
            %else:
            String val = ${toLcaseJava(par["name"])}${".stringValue" if "enum" in par else ""};
            %endif
            parametersInQuery.put("${par["name"]}", val);
        }
        %endfor

        Map<String, String> parametersInUrl = new HashMap<>(${len(pathParDef)});
        % for par in pathParDef:
        parametersInUrl.put("${par["name"]}", String.valueOf(${toLcaseJava(par["name"])}));
        %endfor
        String body = null;
        %if bodyPar is not None:
        body = ApiClientBase.renderToBody(${toLcaseJava(bodyPar["name"])});
        %endif
        String method = "${method.upper()}";
        TypeReference<${returnType}> responseTypeRef = \
%if returnType == "Void":
null;
%else:
new TypeReference<${returnType}>() {};
%endif
        boolean needsAuth = ${first_lower(str("security" in swg["paths"][path][method]))};
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    %endfor
    %endfor
}
