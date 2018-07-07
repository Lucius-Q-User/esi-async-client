package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class CorporationIcons {
    private String px128x128;
    public void setPx128x128(String val) {
        px128x128 = val;
    }
    public String getPx128x128() {
        return px128x128;
    }
    private String px256x256;
    public void setPx256x256(String val) {
        px256x256 = val;
    }
    public String getPx256x256() {
        return px256x256;
    }
    private String px64x64;
    public void setPx64x64(String val) {
        px64x64 = val;
    }
    public String getPx64x64() {
        return px64x64;
    }
    static CorporationIcons fromJson(Json json) {
        if (json == null) {
            return null;
        }
        CorporationIcons self = new CorporationIcons();
        Map<String, Json> js = json.asJsonMap();
        self.px128x128 = ApiClientBase.optGetString(js.get("px128x128"));
        self.px256x256 = ApiClientBase.optGetString(js.get("px256x256"));
        self.px64x64 = ApiClientBase.optGetString(js.get("px64x64"));
        return self;
    }
}
