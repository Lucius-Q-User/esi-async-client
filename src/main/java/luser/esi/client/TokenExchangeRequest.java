package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

class TokenRequest {
    private static final String GRANT_TYPE_CODE = "authorization_code";
    private static final String GRANT_TYPE_REFRESH = "refresh_token";
    public static TokenRequest forCode(String code) {
        TokenRequest self = new TokenRequest();
        self.grantType = GRANT_TYPE_CODE;
        self.code = code;
        return self;
    }
    public static TokenRequest forRefToken(String refToken) {
        TokenRequest self = new TokenRequest();
        self.grantType = GRANT_TYPE_REFRESH;
        self.refreshToken = refToken;
        return self;
    }
    private String grantType;
    @JsonProperty("grant_type")
    public String getGrantType() {
        return grantType;
    }
    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }
    private String code;
    public void setCode(String code) {
        this.code = code;
    }
    @JsonProperty("code")
    @JsonInclude(Include.NON_NULL)
    public String getCode() {
        return code;
    }
    private String refreshToken;
    public void setRefreshToken(String code) {
        refreshToken = code;
    }
    @JsonProperty("refresh_token")
    @JsonInclude(Include.NON_NULL)
    public String getRefreshToken() {
        return refreshToken;
    }
}
