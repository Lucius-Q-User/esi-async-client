package luser.esi.client;

import java.time.Instant;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AllianceHistoryEntry implements ApiParameterObject {
    private Integer allianceId;
    /**
     * alliance_id integer
     */
    public void setAllianceId(Integer val) {
        allianceId = val;
    }
    /**
     * alliance_id integer
     */
    @JsonProperty("alliance_id")
    public Integer getAllianceId() {
        return allianceId;
    }
    private Boolean isDeleted;
    /**
     * True if the alliance has been closed
     */
    public void setIsDeleted(Boolean val) {
        isDeleted = val;
    }
    /**
     * True if the alliance has been closed
     */
    @JsonProperty("is_deleted")
    public Boolean getIsDeleted() {
        return isDeleted;
    }
    private int recordId;
    /**
     * An incrementing ID that can be used to canonically establish order of records in cases where dates may be ambiguous
     */
    public void setRecordId(int val) {
        recordId = val;
    }
    /**
     * An incrementing ID that can be used to canonically establish order of records in cases where dates may be ambiguous
     */
    @JsonProperty("record_id")
    public int getRecordId() {
        return recordId;
    }
    private Instant startDate;
    /**
     * start_date string
     */
    public void setStartDate(Instant val) {
        startDate = val;
    }
    /**
     * start_date string
     */
    @JsonProperty("start_date")
    public Instant getStartDate() {
        return startDate;
    }
}
