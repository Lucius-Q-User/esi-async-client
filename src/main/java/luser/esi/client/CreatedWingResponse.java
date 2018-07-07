package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class CreatedWingResponse {
    private long wingId;
    public void setWingId(long val) {
        wingId = val;
    }
    public long getWingId() {
        return wingId;
    }
    static CreatedWingResponse fromJson(Json json) {
        if (json == null) {
            return null;
        }
        CreatedWingResponse self = new CreatedWingResponse();
        Map<String, Json> js = json.asJsonMap();
        self.wingId = ApiClientBase.optGetLong(js.get("wing_id"));
        return self;
    }
}
