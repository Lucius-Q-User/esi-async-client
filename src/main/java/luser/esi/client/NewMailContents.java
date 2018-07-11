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
    public void setLabels(int[] val) {
        labels = val;
    }
    @JsonProperty("labels")
    public int[] getLabels() {
        return labels;
    }
    private Boolean read;
    public void setRead(Boolean val) {
        read = val;
    }
    @JsonProperty("read")
    public Boolean getRead() {
        return read;
    }
}
