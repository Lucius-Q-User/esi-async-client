package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ContactLabel {
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
