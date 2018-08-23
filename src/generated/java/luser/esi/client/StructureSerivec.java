package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StructureSerivec {
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
        @Override
        public String toString() {
            return stringValue;
        }
    }
}
