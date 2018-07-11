package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class FwStats implements ApiParameterObject {
    private int lastWeek;
    public void setLastWeek(int val) {
        lastWeek = val;
    }
    @JsonProperty("last_week")
    public int getLastWeek() {
        return lastWeek;
    }
    private int total;
    public void setTotal(int val) {
        total = val;
    }
    @JsonProperty("total")
    public int getTotal() {
        return total;
    }
    private int yesterday;
    public void setYesterday(int val) {
        yesterday = val;
    }
    @JsonProperty("yesterday")
    public int getYesterday() {
        return yesterday;
    }
}
