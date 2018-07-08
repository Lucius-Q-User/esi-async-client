package luser.esi.client;

import java.util.Map;

import mjson.Json;

public class TokenExchangeResponse {
    private String accessToken;
    private String refreshToken;
    private String tokenType;
    private int expiresIn;
    public String getAccessToken() {
        return accessToken;
    }
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
    public String getRefreshToken() {
        return refreshToken;
    }
    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }
    public String getTokenType() {
        return tokenType;
    }
    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }
    public int getExpiresIn() {
        return expiresIn;
    }
    public void setExpiresIn(int expiresIn) {
        this.expiresIn = expiresIn;
    }
    static TokenExchangeResponse fromJson(Json json) {
        TokenExchangeResponse self = new TokenExchangeResponse();
        Map<String, Json> js = json.asJsonMap();
        self.accessToken = js.get("access_token").asString();
        self.expiresIn = js.get("expires_in").asInteger();
        self.refreshToken = js.get("refresh_token").asString();
        self.tokenType = js.get("token_type").asString();
        return self;
    }
}
