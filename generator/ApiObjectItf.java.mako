package luser.esi.client;

{{PUT_IMPORTS_HERE}}
import java.util.concurrent.CompletableFuture;

public interface ${tag}Api {
    public ApiClient getApiClient();
    % for path in paths:
    % for method in swg["paths"][path]:
    /**
     * ${swg["paths"][path][method]["description"].replace("\n", "\n     * ")}
%for doc, var in getArgDocstring(path, method):
     * @param ${var} ${doc}
%endfor
     * @return ${getReturnDocstring(path, method)}
     */
    <% returnType = getReturnTypeName(path, method) %>
    public CompletableFuture<EsiResponseWrapper<${returnType}>> \
${getFunctionName(path, method)}(\
        % for argty, argname in getArgNames(path, method):
${argty} ${argname}\
        %if not loop.last:
, \
        %endif
        %endfor
);
    %endfor
    %endfor
}
