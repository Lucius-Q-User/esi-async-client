package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class AllianceHistoryEntry {
    private Integer allianceId;
    public void setAllianceId(Integer val) {
        allianceId = val;
    }
    public Integer getAllianceId() {
        return allianceId;
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
    private String startDate;
    public void setStartDate(String val) {
        startDate = val;
    }
    public String getStartDate() {
        return startDate;
    }
    static AllianceHistoryEntry fromJson(Json json) {
        if (json == null) {
            return null;
        }
        AllianceHistoryEntry self = new AllianceHistoryEntry();
        Map<String, Json> js = json.asJsonMap();
        self.allianceId = ApiClientBase.optGetInteger(js.get("alliance_id"));
        self.isDeleted = ApiClientBase.optGetBoolean(js.get("is_deleted"));
        self.recordId = ApiClientBase.optGetInteger(js.get("record_id"));
        self.startDate = ApiClientBase.optGetString(js.get("start_date"));
        return self;
    }
}
