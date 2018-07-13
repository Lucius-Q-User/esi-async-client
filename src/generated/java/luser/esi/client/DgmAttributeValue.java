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
    /**
     * attribute_id integer
     */
    public void setAttributeId(int val) {
        attributeId = val;
    }
    /**
     * attribute_id integer
     */
    @JsonProperty("attribute_id")
    public int getAttributeId() {
        return attributeId;
    }
    private float value;
    /**
     * value number
     */
    public void setValue(float val) {
        value = val;
    }
    /**
     * value number
     */
    @JsonProperty("value")
    public float getValue() {
        return value;
    }
}
