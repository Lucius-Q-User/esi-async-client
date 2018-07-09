package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class CorporationPOS {
    private Integer moonId;
    public void setMoonId(Integer val) {
        moonId = val;
    }
    public Integer getMoonId() {
        return moonId;
    }
    private Instant onlinedSince;
    public void setOnlinedSince(Instant val) {
        onlinedSince = val;
    }
    public Instant getOnlinedSince() {
        return onlinedSince;
    }
    private Instant reinforcedUntil;
    public void setReinforcedUntil(Instant val) {
        reinforcedUntil = val;
    }
    public Instant getReinforcedUntil() {
        return reinforcedUntil;
    }
    private long starbaseId;
    public void setStarbaseId(long val) {
        starbaseId = val;
    }
    public long getStarbaseId() {
        return starbaseId;
    }
    private StateEnum state;
    public void setState(StateEnum val) {
        state = val;
    }
    public StateEnum getState() {
        return state;
    }
    private int systemId;
    public void setSystemId(int val) {
        systemId = val;
    }
    public int getSystemId() {
        return systemId;
    }
    private int typeId;
    public void setTypeId(int val) {
        typeId = val;
    }
    public int getTypeId() {
        return typeId;
    }
    private Instant unanchorAt;
    public void setUnanchorAt(Instant val) {
        unanchorAt = val;
    }
    public Instant getUnanchorAt() {
        return unanchorAt;
    }
    static CorporationPOS fromJson(Json json) {
        if (json == null) {
            return null;
        }
        CorporationPOS self = new CorporationPOS();
        Map<String, Json> js = json.asJsonMap();
        self.moonId = ApiClientBase.optGetInteger(js.get("moon_id"));
        self.onlinedSince = ApiClientBase.optGetInstant(js.get("onlined_since"));
        self.reinforcedUntil = ApiClientBase.optGetInstant(js.get("reinforced_until"));
        self.starbaseId = ApiClientBase.optGetLong(js.get("starbase_id"));
        self.state = StateEnum.fromString(ApiClientBase.optGetString(js.get("state")));
        self.systemId = ApiClientBase.optGetInteger(js.get("system_id"));
        self.typeId = ApiClientBase.optGetInteger(js.get("type_id"));
        self.unanchorAt = ApiClientBase.optGetInstant(js.get("unanchor_at"));
        return self;
    }
    public static enum StateEnum {
        OFFLINE("offline"),
        ONLINE("online"),
        ONLINING("onlining"),
        REINFORCED("reinforced"),
        UNANCHORING("unanchoring");
        public final String stringValue;
        private StateEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        public static StateEnum fromString(String str) {
            for (StateEnum self : StateEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
}
