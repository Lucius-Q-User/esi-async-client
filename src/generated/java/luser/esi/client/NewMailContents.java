package luser.esi.client;

import com.carrotsearch.hppc.IntArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;

public class NewMailContents implements ApiParameterObject {
    private IntArrayList labels;
    /**
     * Labels to assign to the mail. Pre-existing labels are unassigned.
     */
    public void setLabels(IntArrayList val) {
        labels = val;
    }
    /**
     * Labels to assign to the mail. Pre-existing labels are unassigned.
     */
    @JsonProperty("labels")
    public IntArrayList getLabels() {
        return labels;
    }
    private Boolean read;
    /**
     * Whether the mail is flagged as read
     */
    public void setRead(Boolean val) {
        read = val;
    }
    /**
     * Whether the mail is flagged as read
     */
    @JsonProperty("read")
    public Boolean getRead() {
        return read;
    }
}
