package luser.esi.client;

import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

public class EsiResponseWrapper<T> {
    private T response;
    private int statusCode;
    private Map<String, List<String>> headers;
    private Integer xpages;
    private Instant expires;

    public EsiResponseWrapper(int statusCode, Map<String, List<String>> headers, T response) {
        List<String> sl = headers.remove("X-Pages");
        if (sl == null) {
            xpages = null;
        } else {
            xpages = Integer.parseInt(sl.get(0));
        }
        sl = headers.remove("Expires");
        if (sl == null) {
            expires = null;
        } else {
            expires = ZonedDateTime.parse(sl.get(0), DateTimeFormatter.RFC_1123_DATE_TIME).toInstant();
        }
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
        return xpages;
    }
    public Instant getExpires() {
        return expires;
    }
}
