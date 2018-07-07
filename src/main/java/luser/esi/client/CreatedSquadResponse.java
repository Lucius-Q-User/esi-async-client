package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class CreatedSquadResponse {
    private long squadId;
    public void setSquadId(long val) {
        squadId = val;
    }
    public long getSquadId() {
        return squadId;
    }
    static CreatedSquadResponse fromJson(Json json) {
        if (json == null) {
            return null;
        }
        CreatedSquadResponse self = new CreatedSquadResponse();
        Map<String, Json> js = json.asJsonMap();
        self.squadId = ApiClientBase.optGetLong(js.get("squad_id"));
        return self;
    }
}
