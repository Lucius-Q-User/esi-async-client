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
    /**
     * days_of_activity integer
     */
    public void setDaysOfActivity(Long val) {
        daysOfActivity = val;
    }
    /**
     * days_of_activity integer
     */
    @JsonProperty("days_of_activity")
    public Long getDaysOfActivity() {
        return daysOfActivity;
    }
    private Long minutes;
    /**
     * minutes integer
     */
    public void setMinutes(Long val) {
        minutes = val;
    }
    /**
     * minutes integer
     */
    @JsonProperty("minutes")
    public Long getMinutes() {
        return minutes;
    }
    private Long sessionsStarted;
    /**
     * sessions_started integer
     */
    public void setSessionsStarted(Long val) {
        sessionsStarted = val;
    }
    /**
     * sessions_started integer
     */
    @JsonProperty("sessions_started")
    public Long getSessionsStarted() {
        return sessionsStarted;
    }
}
