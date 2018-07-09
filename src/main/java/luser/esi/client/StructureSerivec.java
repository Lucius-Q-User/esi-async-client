package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class StructureSerivec {
    private String name;
    public void setName(String val) {
        name = val;
    }
    public String getName() {
        return name;
    }
    private StateEnum state;
    public void setState(StateEnum val) {
        state = val;
    }
    public StateEnum getState() {
        return state;
    }
    static StructureSerivec fromJson(Json json) {
        if (json == null) {
            return null;
        }
        StructureSerivec self = new StructureSerivec();
        Map<String, Json> js = json.asJsonMap();
        self.name = ApiClientBase.optGetString(js.get("name"));
        self.state = StateEnum.fromString(ApiClientBase.optGetString(js.get("state")));
        return self;
    }
    public static enum StateEnum {
        ONLINE("online"),
        OFFLINE("offline"),
        CLEANUP("cleanup");
        public final String stringValue;
        private StateEnum(String stringValue) {
            this.stringValue = stringValue;
        }
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
