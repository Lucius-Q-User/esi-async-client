package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class DgmAttributeValue {
    private int attributeId;
    public void setAttributeId(int val) {
        attributeId = val;
    }
    public int getAttributeId() {
        return attributeId;
    }
    private float value;
    public void setValue(float val) {
        value = val;
    }
    public float getValue() {
        return value;
    }
    static DgmAttributeValue fromJson(Json json) {
        if (json == null) {
            return null;
        }
        DgmAttributeValue self = new DgmAttributeValue();
        Map<String, Json> js = json.asJsonMap();
        self.attributeId = ApiClientBase.optGetInteger(js.get("attribute_id"));
        self.value = ApiClientBase.optGetFloat(js.get("value"));
        return self;
    }
}
