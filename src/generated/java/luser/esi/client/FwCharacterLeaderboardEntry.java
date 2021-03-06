package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FwCharacterLeaderboardEntry {
    private Integer amount;
    /**
     * Amount of kills
     */
    public void setAmount(Integer val) {
        amount = val;
    }
    /**
     * Amount of kills
     */
    @JsonProperty("amount")
    public Integer getAmount() {
        return amount;
    }
    private Integer characterId;
    /**
     * character_id integer
     */
    public void setCharacterId(Integer val) {
        characterId = val;
    }
    /**
     * character_id integer
     */
    @JsonProperty("character_id")
    public Integer getCharacterId() {
        return characterId;
    }
}
