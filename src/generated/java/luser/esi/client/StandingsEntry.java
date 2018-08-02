package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

public class StandingsEntry {
    private int fromId;
    /**
     * from_id integer
     */
    public void setFromId(int val) {
        fromId = val;
    }
    /**
     * from_id integer
     */
    @JsonProperty("from_id")
    public int getFromId() {
        return fromId;
    }
    private FromTypeEnum fromType;
    /**
     * from_type string
     */
    public void setFromType(FromTypeEnum val) {
        fromType = val;
    }
    /**
     * from_type string
     */
    @JsonProperty("from_type")
    public FromTypeEnum getFromType() {
        return fromType;
    }
    private float standing;
    /**
     * standing number
     */
    public void setStanding(float val) {
        standing = val;
    }
    /**
     * standing number
     */
    @JsonProperty("standing")
    public float getStanding() {
        return standing;
    }
    public static enum FromTypeEnum implements StringyEnum{
        AGENT("agent"),
        NPC_CORP("npc_corp"),
        FACTION("faction");
        private final String stringValue;
        private FromTypeEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @Override
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
    }
}
