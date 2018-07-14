package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.carrotsearch.hppc.IntArrayList;
import com.carrotsearch.hppc.LongArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class ContactLabel implements ApiParameterObject {
    private long labelId;
    /**
     * label_id integer
     */
    public void setLabelId(long val) {
        labelId = val;
    }
    /**
     * label_id integer
     */
    @JsonProperty("label_id")
    public long getLabelId() {
        return labelId;
    }
    private String labelName;
    /**
     * label_name string
     */
    public void setLabelName(String val) {
        labelName = val;
    }
    /**
     * label_name string
     */
    @JsonProperty("label_name")
    public String getLabelName() {
        return labelName;
    }
}
