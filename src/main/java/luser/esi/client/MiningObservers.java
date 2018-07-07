package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class MiningObservers {
    private String lastUpdated;
    public void setLastUpdated(String val) {
        lastUpdated = val;
    }
    public String getLastUpdated() {
        return lastUpdated;
    }
    private long observerId;
    public void setObserverId(long val) {
        observerId = val;
    }
    public long getObserverId() {
        return observerId;
    }
    private ObserverTypeEnum observerType;
    public void setObserverType(ObserverTypeEnum val) {
        observerType = val;
    }
    public ObserverTypeEnum getObserverType() {
        return observerType;
    }
    static MiningObservers fromJson(Json json) {
        if (json == null) {
            return null;
        }
        MiningObservers self = new MiningObservers();
        Map<String, Json> js = json.asJsonMap();
        self.lastUpdated = ApiClientBase.optGetString(js.get("last_updated"));
        self.observerId = ApiClientBase.optGetLong(js.get("observer_id"));
        self.observerType = ObserverTypeEnum.fromString(ApiClientBase.optGetString(js.get("observer_type")));
        return self;
    }
    public static enum ObserverTypeEnum {
        STRUCTURE("structure");
        public final String stringValue;
        private ObserverTypeEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        public static ObserverTypeEnum fromString(String str) {
            for (ObserverTypeEnum self : ObserverTypeEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
}
