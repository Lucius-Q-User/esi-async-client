package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class NewMailContents implements ApiParameterObject {
    private int[] labels;
    /**
     * Labels to assign to the mail. Pre-existing labels are unassigned.
     */
    public void setLabels(int[] val) {
        labels = val;
    }
    /**
     * Labels to assign to the mail. Pre-existing labels are unassigned.
     */
    @JsonProperty("labels")
    public int[] getLabels() {
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
