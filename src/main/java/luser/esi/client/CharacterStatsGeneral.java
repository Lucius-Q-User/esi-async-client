package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class CharacterStatsGeneral {
    private Long daysOfActivity;
    public void setDaysOfActivity(Long val) {
        daysOfActivity = val;
    }
    public Long getDaysOfActivity() {
        return daysOfActivity;
    }
    private Long minutes;
    public void setMinutes(Long val) {
        minutes = val;
    }
    public Long getMinutes() {
        return minutes;
    }
    private Long sessionsStarted;
    public void setSessionsStarted(Long val) {
        sessionsStarted = val;
    }
    public Long getSessionsStarted() {
        return sessionsStarted;
    }
    static CharacterStatsGeneral fromJson(Json json) {
        if (json == null) {
            return null;
        }
        CharacterStatsGeneral self = new CharacterStatsGeneral();
        Map<String, Json> js = json.asJsonMap();
        self.daysOfActivity = ApiClientBase.optGetLong(js.get("days_of_activity"));
        self.minutes = ApiClientBase.optGetLong(js.get("minutes"));
        self.sessionsStarted = ApiClientBase.optGetLong(js.get("sessions_started"));
        return self;
    }
}
