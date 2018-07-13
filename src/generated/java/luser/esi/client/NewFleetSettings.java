package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class NewFleetSettings implements ApiParameterObject {
    private Boolean isFreeMove;
    public void setIsFreeMove(Boolean val) {
        isFreeMove = val;
    }
    @JsonProperty("is_free_move")
    public Boolean getIsFreeMove() {
        return isFreeMove;
    }
    private String motd;
    public void setMotd(String val) {
        motd = val;
    }
    @JsonProperty("motd")
    public String getMotd() {
        return motd;
    }
}
