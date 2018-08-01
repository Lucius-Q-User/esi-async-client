package luser.esi.client;

import java.time.Instant;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public class CorporationPOS {
    private Integer moonId;
    /**
     * The moon this starbase (POS) is anchored on, unanchored POSes do not have this information
     */
    public void setMoonId(Integer val) {
        moonId = val;
    }
    /**
     * The moon this starbase (POS) is anchored on, unanchored POSes do not have this information
     */
    @JsonProperty("moon_id")
    public Integer getMoonId() {
        return moonId;
    }
    private Instant onlinedSince;
    /**
     * When the POS onlined, for starbases (POSes) in online state
     */
    public void setOnlinedSince(Instant val) {
        onlinedSince = val;
    }
    /**
     * When the POS onlined, for starbases (POSes) in online state
     */
    @JsonProperty("onlined_since")
    public Instant getOnlinedSince() {
        return onlinedSince;
    }
    private Instant reinforcedUntil;
    /**
     * When the POS will be out of reinforcement, for starbases (POSes) in reinforced state
     */
    public void setReinforcedUntil(Instant val) {
        reinforcedUntil = val;
    }
    /**
     * When the POS will be out of reinforcement, for starbases (POSes) in reinforced state
     */
    @JsonProperty("reinforced_until")
    public Instant getReinforcedUntil() {
        return reinforcedUntil;
    }
    private long starbaseId;
    /**
     * Unique ID for this starbase (POS)
     */
    public void setStarbaseId(long val) {
        starbaseId = val;
    }
    /**
     * Unique ID for this starbase (POS)
     */
    @JsonProperty("starbase_id")
    public long getStarbaseId() {
        return starbaseId;
    }
    private StateEnum state;
    /**
     * state string
     */
    public void setState(StateEnum val) {
        state = val;
    }
    /**
     * state string
     */
    @JsonProperty("state")
    public StateEnum getState() {
        return state;
    }
    private int systemId;
    /**
     * The solar system this starbase (POS) is in, unanchored POSes have this information
     */
    public void setSystemId(int val) {
        systemId = val;
    }
    /**
     * The solar system this starbase (POS) is in, unanchored POSes have this information
     */
    @JsonProperty("system_id")
    public int getSystemId() {
        return systemId;
    }
    private int typeId;
    /**
     * Starbase (POS) type
     */
    public void setTypeId(int val) {
        typeId = val;
    }
    /**
     * Starbase (POS) type
     */
    @JsonProperty("type_id")
    public int getTypeId() {
        return typeId;
    }
    private Instant unanchorAt;
    /**
     * When the POS started unanchoring, for starbases (POSes) in unanchoring state
     */
    public void setUnanchorAt(Instant val) {
        unanchorAt = val;
    }
    /**
     * When the POS started unanchoring, for starbases (POSes) in unanchoring state
     */
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
