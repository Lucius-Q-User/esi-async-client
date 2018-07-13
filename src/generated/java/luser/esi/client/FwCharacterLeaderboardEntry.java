package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class FwCharacterLeaderboardEntry implements ApiParameterObject {
    private Integer amount;
    public void setAmount(Integer val) {
        amount = val;
    }
    @JsonProperty("amount")
    public Integer getAmount() {
        return amount;
    }
    private Integer characterId;
    public void setCharacterId(Integer val) {
        characterId = val;
    }
    @JsonProperty("character_id")
    public Integer getCharacterId() {
        return characterId;
    }
}
