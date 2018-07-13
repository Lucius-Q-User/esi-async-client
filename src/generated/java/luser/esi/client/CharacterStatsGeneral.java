package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CharacterStatsGeneral implements ApiParameterObject {
    private Long daysOfActivity;
    public void setDaysOfActivity(Long val) {
        daysOfActivity = val;
    }
    @JsonProperty("days_of_activity")
    public Long getDaysOfActivity() {
        return daysOfActivity;
    }
    private Long minutes;
    public void setMinutes(Long val) {
        minutes = val;
    }
    @JsonProperty("minutes")
    public Long getMinutes() {
        return minutes;
    }
    private Long sessionsStarted;
    public void setSessionsStarted(Long val) {
        sessionsStarted = val;
    }
    @JsonProperty("sessions_started")
    public Long getSessionsStarted() {
        return sessionsStarted;
    }
}
