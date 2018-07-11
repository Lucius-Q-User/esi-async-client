package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class StandingsEntry implements ApiParameterObject {
    private int fromId;
    public void setFromId(int val) {
        fromId = val;
    }
    @JsonProperty("from_id")
    public int getFromId() {
        return fromId;
    }
    private FromTypeEnum fromType;
    public void setFromType(FromTypeEnum val) {
        fromType = val;
    }
    @JsonProperty("from_type")
    public FromTypeEnum getFromType() {
        return fromType;
    }
    private float standing;
    public void setStanding(float val) {
        standing = val;
    }
    @JsonProperty("standing")
    public float getStanding() {
        return standing;
    }
    public static enum FromTypeEnum {
        AGENT("agent"),
        NPC_CORP("npc_corp"),
        FACTION("faction");
        private final String stringValue;
        private FromTypeEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
        @JsonCreator
        public static FromTypeEnum fromString(String str) {
            for (FromTypeEnum self : FromTypeEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
}
