package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class CloneHomeLocation {
    private Long locationId;
    public void setLocationId(Long val) {
        locationId = val;
    }
    public Long getLocationId() {
        return locationId;
    }
    private LocationTypeEnum locationType;
    public void setLocationType(LocationTypeEnum val) {
        locationType = val;
    }
    public LocationTypeEnum getLocationType() {
        return locationType;
    }
    static CloneHomeLocation fromJson(Json json) {
        if (json == null) {
            return null;
        }
        CloneHomeLocation self = new CloneHomeLocation();
        Map<String, Json> js = json.asJsonMap();
        self.locationId = ApiClientBase.optGetLong(js.get("location_id"));
        self.locationType = LocationTypeEnum.fromString(ApiClientBase.optGetString(js.get("location_type")));
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
