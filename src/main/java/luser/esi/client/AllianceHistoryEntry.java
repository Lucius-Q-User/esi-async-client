package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class AllianceHistoryEntry implements ApiParameterObject {
    private Integer allianceId;
    public void setAllianceId(Integer val) {
        allianceId = val;
    }
    @JsonProperty("alliance_id")
    public Integer getAllianceId() {
        return allianceId;
    }
    private Boolean isDeleted;
    public void setIsDeleted(Boolean val) {
        isDeleted = val;
    }
    @JsonProperty("is_deleted")
    public Boolean getIsDeleted() {
        return isDeleted;
    }
    private int recordId;
    public void setRecordId(int val) {
        recordId = val;
    }
    @JsonProperty("record_id")
    public int getRecordId() {
        return recordId;
    }
    private Instant startDate;
    public void setStartDate(Instant val) {
        startDate = val;
    }
    @JsonProperty("start_date")
    public Instant getStartDate() {
        return startDate;
    }
}
