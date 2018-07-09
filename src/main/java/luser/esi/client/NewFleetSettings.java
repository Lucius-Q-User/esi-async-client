package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class NewFleetSettings extends JsonConvertible {
    private Boolean isFreeMove;
    public void setIsFreeMove(Boolean val) {
        isFreeMove = val;
    }
    public Boolean getIsFreeMove() {
        return isFreeMove;
    }
    private String motd;
    public void setMotd(String val) {
        motd = val;
    }
    public String getMotd() {
        return motd;
    }
    @Override
    Json toJson() {
        Json object = Json.object();
        object.set("is_free_move", Json.make(isFreeMove));
        object.set("motd", Json.make(motd));
        return object;
    }
}
