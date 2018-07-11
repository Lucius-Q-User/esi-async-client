package luser.esi.client;

import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


public class TokenVerifyResponse {
    private int characterId;
    private String characterName;
    private List<EsiScope> scopes;
    private String tokenType;
    private String characterOwnerHash;
    private Instant expiresOn;
    @JsonProperty("CharacterID")
    public int getCharacterId() {
        return characterId;
    }
    public void setCharacterId(int characterId) {
        this.characterId = characterId;
    }
    @JsonProperty("CharacterName")
    public String getCharacterName() {
        return characterName;
    }
    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }
    @JsonProperty("Scopes")
    @JsonDeserialize(using = ScopesParser.class)
    public List<EsiScope> getScopes() {
        return scopes;
    }
    public void setScopes(List<EsiScope> scopes) {
        this.scopes = scopes;
    }
    @JsonProperty("TokenType")
    public String getTokenType() {
        return tokenType;
    }
    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }
    @JsonProperty("CharacterOwnerHash")
    public String getCharacterOwnerHash() {
        return characterOwnerHash;
    }
    public void setCharacterOwnerHash(String characterOwnerHash) {
        this.characterOwnerHash = characterOwnerHash;
    }
    @JsonDeserialize(using = DateParser.class)
    @JsonProperty("ExpiresOn")
    public Instant getExpiresOn() {
        return expiresOn;
    }
    public void setExpiresOn(Instant expiresOn) {
        this.expiresOn = expiresOn;
    }
    @JsonProperty("IntellectualProperty")
    public String getIntellectualProperty() {
        return intellectualProperty;
    }
    public void setIntellectualProperty(String intellectualProperty) {
        this.intellectualProperty = intellectualProperty;
    }
    private String intellectualProperty;
    private static class DateParser extends JsonDeserializer<Instant> {
        private static final DateTimeFormatter EXPIRES_ON_FORMAT =
                DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSSSSS").withZone(ZoneId.of("Z"));
        @Override
        public Instant deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            return EXPIRES_ON_FORMAT.parse(p.readValueAs(String.class), Instant::from);
        }
    }
    private static class ScopesParser extends JsonDeserializer<List<EsiScope>> {
        @Override
        public List<EsiScope> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            String[] strs = p.readValueAs(String.class).split(" ");
            ArrayList<EsiScope> ret = new ArrayList<>(strs.length);
            for (String scp : strs) {
                EsiScope scope = EsiScope.fromString(scp);
                if (scope != null) {
                    ret.add(scope);
                }
            }
            return ret;
        }
    }
}

