package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class CorporationHistoryEntry {
    private int corporationId;
    public void setCorporationId(int val) {
        corporationId = val;
    }
    public int getCorporationId() {
        return corporationId;
    }
    private Boolean isDeleted;
    public void setIsDeleted(Boolean val) {
        isDeleted = val;
    }
    public Boolean getIsDeleted() {
        return isDeleted;
    }
    private int recordId;
    public void setRecordId(int val) {
        recordId = val;
    }
    public int getRecordId() {
        return recordId;
    }
    private Instant startDate;
    public void setStartDate(Instant val) {
        startDate = val;
    }
    public Instant getStartDate() {
        return startDate;
    }
    static CorporationHistoryEntry fromJson(Json json) {
        if (json == null) {
            return null;
        }
        CorporationHistoryEntry self = new CorporationHistoryEntry();
        Map<String, Json> js = json.asJsonMap();
        self.corporationId = ApiClientBase.optGetInteger(js.get("corporation_id"));
        self.isDeleted = ApiClientBase.optGetBoolean(js.get("is_deleted"));
        self.recordId = ApiClientBase.optGetInteger(js.get("record_id"));
        self.startDate = ApiClientBase.optGetInstant(js.get("start_date"));
        return self;
    }
}
