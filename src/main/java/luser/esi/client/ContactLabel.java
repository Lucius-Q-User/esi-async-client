package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class ContactLabel {
    private long labelId;
    public void setLabelId(long val) {
        labelId = val;
    }
    public long getLabelId() {
        return labelId;
    }
    private String labelName;
    public void setLabelName(String val) {
        labelName = val;
    }
    public String getLabelName() {
        return labelName;
    }
    static ContactLabel fromJson(Json json) {
        if (json == null) {
            return null;
        }
        ContactLabel self = new ContactLabel();
        Map<String, Json> js = json.asJsonMap();
        self.labelId = ApiClientBase.optGetLong(js.get("label_id"));
        self.labelName = ApiClientBase.optGetString(js.get("label_name"));
        return self;
    }
}
