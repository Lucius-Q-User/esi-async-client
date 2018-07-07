package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class JumpCloneContents {
    private int[] implants;
    public void setImplants(int[] val) {
        implants = val;
    }
    public int[] getImplants() {
        return implants;
    }
    private int jumpCloneId;
    public void setJumpCloneId(int val) {
        jumpCloneId = val;
    }
    public int getJumpCloneId() {
        return jumpCloneId;
    }
    private long locationId;
    public void setLocationId(long val) {
        locationId = val;
    }
    public long getLocationId() {
        return locationId;
    }
    private LocationTypeEnum locationType;
    public void setLocationType(LocationTypeEnum val) {
        locationType = val;
    }
    public LocationTypeEnum getLocationType() {
        return locationType;
    }
    private String name;
    public void setName(String val) {
        name = val;
    }
    public String getName() {
        return name;
    }
    static JumpCloneContents fromJson(Json json) {
        if (json == null) {
            return null;
        }
        JumpCloneContents self = new JumpCloneContents();
        Map<String, Json> js = json.asJsonMap();
        {
            List<Json> jl = js.get("implants").asJsonList();
            int[] rt = new int[jl.size()];
            for (int i = 0; i < jl.size(); i++) {
                rt[i] = jl.get(i).asInteger();
            }
            self.implants = rt;
        }
        self.jumpCloneId = ApiClientBase.optGetInteger(js.get("jump_clone_id"));
        self.locationId = ApiClientBase.optGetLong(js.get("location_id"));
        self.locationType = LocationTypeEnum.fromString(ApiClientBase.optGetString(js.get("location_type")));
        self.name = ApiClientBase.optGetString(js.get("name"));
        return self;
    }
    public static enum LocationTypeEnum {
        STATION("station"),
        STRUCTURE("structure");
        public final String stringValue;
        private LocationTypeEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        public static LocationTypeEnum fromString(String str) {
            for (LocationTypeEnum self : LocationTypeEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
}
