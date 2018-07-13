package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CorporationPOS implements ApiParameterObject {
    private Integer moonId;
    public void setMoonId(Integer val) {
        moonId = val;
    }
    @JsonProperty("moon_id")
    public Integer getMoonId() {
        return moonId;
    }
    private Instant onlinedSince;
    public void setOnlinedSince(Instant val) {
        onlinedSince = val;
    }
    @JsonProperty("onlined_since")
    public Instant getOnlinedSince() {
        return onlinedSince;
    }
    private Instant reinforcedUntil;
    public void setReinforcedUntil(Instant val) {
        reinforcedUntil = val;
    }
    @JsonProperty("reinforced_until")
    public Instant getReinforcedUntil() {
        return reinforcedUntil;
    }
    private long starbaseId;
    public void setStarbaseId(long val) {
        starbaseId = val;
    }
    @JsonProperty("starbase_id")
    public long getStarbaseId() {
        return starbaseId;
    }
    private StateEnum state;
    public void setState(StateEnum val) {
        state = val;
    }
    @JsonProperty("state")
    public StateEnum getState() {
        return state;
    }
    private int systemId;
    public void setSystemId(int val) {
        systemId = val;
    }
    @JsonProperty("system_id")
    public int getSystemId() {
        return systemId;
    }
    private int typeId;
    public void setTypeId(int val) {
        typeId = val;
    }
    @JsonProperty("type_id")
    public int getTypeId() {
        return typeId;
    }
    private Instant unanchorAt;
    public void setUnanchorAt(Instant val) {
        unanchorAt = val;
    }
    @JsonProperty("unanchor_at")
    public Instant getUnanchorAt() {
        return unanchorAt;
    }
    public static enum StateEnum {
        OFFLINE("offline"),
        ONLINE("online"),
        ONLINING("onlining"),
        REINFORCED("reinforced"),
        UNANCHORING("unanchoring");
        private final String stringValue;
        private StateEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
        @JsonCreator
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
