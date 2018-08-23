package luser.esi.client;

{{PUT_IMPORTS_HERE}}
import java.util.concurrent.CompletableFuture;
import org.asynchttpclient.Dsl;
import org.asynchttpclient.RequestBuilder;

class ${tag}ApiImpl implements ${tag}Api {
    <% paginated = [] %>
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
    <%
        returnType = getReturnTypeName(path, method)
        pgn, descriptor = getArgNames(path, method)
        if pgn:
            paginated.append((path, method))
    %>
    @Override
    public CompletableFuture<EsiResponseWrapper<${returnType}>> ${getFunctionName(path, method)}(${descriptor}) {
<%
            headerParDef = []
            queryParDef = []
            bodyPar = None
            parDefs = swg["paths"][path][method]["parameters"]
            decompPath = path
            for par in parDefs:
                if "$ref" in par:
                    if par["$ref"] == "#/parameters/token":
                        continue
                    if par["$ref"] == "#/parameters/datasource":
                        continue

                    par = parameterRefs[par["$ref"]]
                if par["name"] == "language":
                    continue
                if par["in"] == "header":
                    headerParDef.append(par)
                elif par["in"] == "query":
                    queryParDef.append(par)
                elif par["in"] == "body":
                    bodyPar = par
                elif par["in"] == "path":
                    decompPath = decompPath.replace("{" + par["name"] + "}", "\" + " + toLcaseJava(par["name"]) + " + \"")
        %>\
        String url = "https://esi.evetech.net${decompPath}";
        RequestBuilder builder = Dsl.${method}(url);
        % for par in headerParDef:
        if (${toLcaseJava(par["name"])} != null) {
            String val = ${toLcaseJava(par["name"])}${".stringValue" if "enum" in par else ""};
            builder.addHeader("${par["name"]}", val);
        }
        %endfor
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
            builder.addQueryParam("${par["name"]}", val);
        }
        %endfor
        %if bodyPar is not None:
        builder.setBody(ApiClientBase.renderToBody(${toLcaseJava(bodyPar["name"])}));
        %endif
        TypeReference<${returnType}> responseTypeRef = \
%if returnType == "Void":
null;
%else:
new TypeReference<${returnType}>() {};
%endif
        boolean needsAuth = ${first_lower(str("security" in swg["paths"][path][method]))};
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    %endfor
    %endfor
    % for (path, method) in paginated:
    <%
        returnType = getReturnTypeName(path, method)
        pgn, descriptor = getArgNames(path, method, True)
    %>
    @Override
    public CompletableFuture<${returnType}> ${getFunctionName(path, method)}AllPages(${descriptor}) {
<%
        parDefs = swg["paths"][path][method]["parameters"]
        pd = []
        for par in parDefs:
            if "$ref" in par:
                if par["$ref"] == "#/parameters/token":
                    continue
                if par["$ref"] == "#/parameters/datasource":
                    continue
                if par["$ref"] == "#/parameters/language":
                    continue
                if par["$ref"] == "#/parameters/If-None-Match":
                    pd.append("null")
                    continue
                par = parameterRefs[par["$ref"]]                
            pd.append(toLcaseJava(par["name"]))
        pd = ", ".join(pd)
        %>\
        return ApiClientBase.pagingHelper((page) -> ${getFunctionName(path, method)}(${pd}), (${returnType})null);
    }
    % endfor
}
