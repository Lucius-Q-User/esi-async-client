package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class DgmAttributeValue implements ApiParameterObject {
    private int attributeId;
    public void setAttributeId(int val) {
        attributeId = val;
    }
    @JsonProperty("attribute_id")
    public int getAttributeId() {
        return attributeId;
    }
    private float value;
    public void setValue(float val) {
        value = val;
    }
    @JsonProperty("value")
    public float getValue() {
        return value;
    }
}
