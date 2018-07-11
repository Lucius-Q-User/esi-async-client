package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class ContactLabel implements ApiParameterObject {
    private long labelId;
    public void setLabelId(long val) {
        labelId = val;
    }
    @JsonProperty("label_id")
    public long getLabelId() {
        return labelId;
    }
    private String labelName;
    public void setLabelName(String val) {
        labelName = val;
    }
    @JsonProperty("label_name")
    public String getLabelName() {
        return labelName;
    }
}
