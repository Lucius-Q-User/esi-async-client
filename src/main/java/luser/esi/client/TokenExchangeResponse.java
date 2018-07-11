package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TokenExchangeResponse {
    private String accessToken;
    private String refreshToken;
    private String tokenType;
    private int expiresIn;
    @JsonProperty("access_token")
    public String getAccessToken() {
        return accessToken;
    }
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
    @JsonProperty("refresh_token")
    public String getRefreshToken() {
        return refreshToken;
    }
    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }
    @JsonProperty("token_type")
    public String getTokenType() {
        return tokenType;
    }
    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }
    @JsonProperty("access_token")
    public int getExpiresIn() {
        return expiresIn;
    }
    public void setExpiresIn(int expiresIn) {
        this.expiresIn = expiresIn;
    }
}
