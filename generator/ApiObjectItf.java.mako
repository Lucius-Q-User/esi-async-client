package luser.esi.client;

{{PUT_IMPORTS_HERE}}
import java.util.concurrent.CompletableFuture;

public interface ${tag}Api {
    public ApiClient getApiClient();
    <% paginated = [] %>
    % for path in paths:
    % for method in swg["paths"][path]:
    /**
     * ${swg["paths"][path][method]["description"].replace("\n", "\n     * ")}
%for doc, var in getArgDocstring(path, method):
     * @param ${var} ${doc}
%endfor
     * @return ${getReturnDocstring(path, method)}
     */
    <%
        returnType = getReturnTypeName(path, method)
        pgn, descriptor = getArgNames(path, method)
        if pgn:
            paginated.append((path, method))
    %>
    public CompletableFuture<EsiResponseWrapper<${returnType}>> ${getFunctionName(path, method)}(${descriptor});
    %endfor
    %endfor
    % for path, method in paginated:
    <%
        returnType = getReturnTypeName(path, method)
        _, descriptor = getArgNames(path, method, True)
    %>
    public CompletableFuture<${returnType}> ${getFunctionName(path, method)}AllPages(${descriptor});
    % endfor
}
