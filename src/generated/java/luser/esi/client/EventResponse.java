package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

public class EventResponse {
    private ResponseEnum response;
    /**
     * response string
     */
    public void setResponse(ResponseEnum val) {
        response = val;
    }
    /**
     * response string
     */
    @JsonProperty("response")
    public ResponseEnum getResponse() {
        return response;
    }
    public static enum ResponseEnum implements StringyEnum{
        ACCEPTED("accepted"),
        DECLINED("declined"),
        TENTATIVE("tentative");
        private final String stringValue;
        private ResponseEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @Override
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
    }
}
