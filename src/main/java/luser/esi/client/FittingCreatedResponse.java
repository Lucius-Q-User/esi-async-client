package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class FittingCreatedResponse {
    private int fittingId;
    public void setFittingId(int val) {
        fittingId = val;
    }
    public int getFittingId() {
        return fittingId;
    }
    static FittingCreatedResponse fromJson(Json json) {
        if (json == null) {
            return null;
        }
        FittingCreatedResponse self = new FittingCreatedResponse();
        Map<String, Json> js = json.asJsonMap();
        self.fittingId = ApiClientBase.optGetInteger(js.get("fitting_id"));
        return self;
    }
}
