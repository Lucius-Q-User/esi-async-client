package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

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
    public static enum ResponseEnum {
        ACCEPTED("accepted"),
        DECLINED("declined"),
        TENTATIVE("tentative");
        private final String stringValue;
        private ResponseEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @Override
        public String toString() {
            return stringValue;
        }
    }
}
