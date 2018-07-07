package luser.esi.client;

import java.util.List;
import java.util.Map;

public class EsiResponseWrapper<T> {
    private T response;
    private int statusCode;
    private Map<String, List<String>> headers;
    public EsiResponseWrapper(int statusCode, Map<String, List<String>> headers, T response) {
        this.statusCode = statusCode;
        this.headers = headers;
        this.response = response;
    }
    public Map<String, List<String>> getHeaders() {
        return headers;
    }
    public int getStatusCode() {
        return statusCode;
    }

    public T get() {
        return response;
    }
    public Integer getXPages() {
        List<String> sl = headers.get("X-Pages");
        if (sl == null) {
            return null;
        }
        return Integer.parseInt(sl.get(0));
    }
}
