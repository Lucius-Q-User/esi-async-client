package luser.esi.client;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import mjson.Json;

public class TokenVerifyResponse {
    private int characterId;
    private String characterName;
    private List<EsiScope> scopes;
    private String tokenType;
    private String characterOwnerHash;
    private Instant expiresOn;
    public int getCharacterId() {
        return characterId;
    }
    public void setCharacterId(int characterId) {
        this.characterId = characterId;
    }
    public String getCharacterName() {
        return characterName;
    }
    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }
    public List<EsiScope> getScopes() {
        return scopes;
    }
    public void setScopes(List<EsiScope> scopes) {
        this.scopes = scopes;
    }
    public String getTokenType() {
        return tokenType;
    }
    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }
    public String getCharacterOwnerHash() {
        return characterOwnerHash;
    }
    public void setCharacterOwnerHash(String characterOwnerHash) {
        this.characterOwnerHash = characterOwnerHash;
    }
    public Instant getExpiresOn() {
        return expiresOn;
    }
    public void setExpiresOn(Instant expiresOn) {
        this.expiresOn = expiresOn;
    }
    public String getIntellectualProperty() {
        return intellectualProperty;
    }
    public void setIntellectualProperty(String intellectualProperty) {
        this.intellectualProperty = intellectualProperty;
    }
    private String intellectualProperty;
    private static final DateTimeFormatter EXPIRES_ON_FORMAT =
            DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSSSSS").withZone(ZoneId.of("Z"));
    static TokenVerifyResponse fromJson(Json json) {

        Map<String, Json> js = json.asJsonMap();
        TokenVerifyResponse self = new TokenVerifyResponse();
        self.characterId = js.get("CharacterID").asInteger();
        self.characterName = js.get("CharacterName").asString();
        self.expiresOn = EXPIRES_ON_FORMAT.parse(js.get("ExpiresOn").asString(), Instant::from);
        self.scopes = Arrays.stream(js.get("Scopes").asString().split(" "))
                .map(EsiScope::fromString).filter((t) -> t != null).collect(Collectors.toList());
        self.tokenType = js.get("TokenType").asString();
        self.characterOwnerHash = js.get("CharacterOwnerHash").asString();
        self.intellectualProperty = js.get("IntellectualProperty").asString();
        return self;

    }
}

