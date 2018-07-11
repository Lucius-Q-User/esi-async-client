package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class WarParticipantInfo implements ApiParameterObject {
    private Integer allianceId;
    public void setAllianceId(Integer val) {
        allianceId = val;
    }
    @JsonProperty("alliance_id")
    public Integer getAllianceId() {
        return allianceId;
    }
    private Integer corporationId;
    public void setCorporationId(Integer val) {
        corporationId = val;
    }
    @JsonProperty("corporation_id")
    public Integer getCorporationId() {
        return corporationId;
    }
    private float iskDestroyed;
    public void setIskDestroyed(float val) {
        iskDestroyed = val;
    }
    @JsonProperty("isk_destroyed")
    public float getIskDestroyed() {
        return iskDestroyed;
    }
    private int shipsKilled;
    public void setShipsKilled(int val) {
        shipsKilled = val;
    }
    @JsonProperty("ships_killed")
    public int getShipsKilled() {
        return shipsKilled;
    }
}
