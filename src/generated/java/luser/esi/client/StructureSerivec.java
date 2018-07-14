package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public class StructureSerivec implements ApiParameterObject {
    private String name;
    /**
     * name string
     */
    public void setName(String val) {
        name = val;
    }
    /**
     * name string
     */
    @JsonProperty("name")
    public String getName() {
        return name;
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
    public static enum StateEnum {
        ONLINE("online"),
        OFFLINE("offline"),
        CLEANUP("cleanup");
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
