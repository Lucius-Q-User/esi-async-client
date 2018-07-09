package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class EventResponse extends JsonConvertible {
    private ResponseEnum response;
    public void setResponse(ResponseEnum val) {
        response = val;
    }
    public ResponseEnum getResponse() {
        return response;
    }
    @Override
    Json toJson() {
        Json object = Json.object();
        object.set("response", Json.make(response.stringValue));
        return object;
    }
    public static enum ResponseEnum {
        ACCEPTED("accepted"),
        DECLINED("declined"),
        TENTATIVE("tentative");
        public final String stringValue;
        private ResponseEnum(String stringValue) {
            this.stringValue = stringValue;
        }
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
