package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResolvedCharacterAffiliation {
    private Integer allianceId;
    /**
     * The character's alliance ID, if their corporation is in an alliance
     */
    public void setAllianceId(Integer val) {
        allianceId = val;
    }
    /**
     * The character's alliance ID, if their corporation is in an alliance
     */
    @JsonProperty("alliance_id")
    public Integer getAllianceId() {
        return allianceId;
    }
    private int characterId;
    /**
     * The character's ID
     */
    public void setCharacterId(int val) {
        characterId = val;
    }
    /**
     * The character's ID
     */
    @JsonProperty("character_id")
    public int getCharacterId() {
        return characterId;
    }
    private int corporationId;
    /**
     * The character's corporation ID
     */
    public void setCorporationId(int val) {
        corporationId = val;
    }
    /**
     * The character's corporation ID
     */
    @JsonProperty("corporation_id")
    public int getCorporationId() {
        return corporationId;
    }
    private Integer factionId;
    /**
     * The character's faction ID, if their corporation is in a faction
     */
    public void setFactionId(Integer val) {
        factionId = val;
    }
    /**
     * The character's faction ID, if their corporation is in a faction
     */
    @JsonProperty("faction_id")
    public Integer getFactionId() {
        return factionId;
    }
}
