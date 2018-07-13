package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class EventResponse implements ApiParameterObject {
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
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
        @JsonCreator
        public static ResponseEnum fromString(String str) {
            for (ResponseEnum self : ResponseEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
}
