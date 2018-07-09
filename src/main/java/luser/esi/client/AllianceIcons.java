package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class AllianceIcons {
    private String px128x128;
    public void setPx128x128(String val) {
        px128x128 = val;
    }
    public String getPx128x128() {
        return px128x128;
    }
    private String px64x64;
    public void setPx64x64(String val) {
        px64x64 = val;
    }
    public String getPx64x64() {
        return px64x64;
    }
    static AllianceIcons fromJson(Json json) {
        if (json == null) {
            return null;
        }
        AllianceIcons self = new AllianceIcons();
        Map<String, Json> js = json.asJsonMap();
        self.px128x128 = ApiClientBase.optGetString(js.get("px128x128"));
        self.px64x64 = ApiClientBase.optGetString(js.get("px64x64"));
        return self;
    }
}
