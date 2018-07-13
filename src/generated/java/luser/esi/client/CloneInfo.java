package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CloneInfo implements ApiParameterObject {
    private CloneHomeLocation homeLocation;
    public void setHomeLocation(CloneHomeLocation val) {
        homeLocation = val;
    }
    @JsonProperty("home_location")
    public CloneHomeLocation getHomeLocation() {
        return homeLocation;
    }
    private List<JumpCloneContents> jumpClones;
    public void setJumpClones(List<JumpCloneContents> val) {
        jumpClones = val;
    }
    @JsonProperty("jump_clones")
    public List<JumpCloneContents> getJumpClones() {
        return jumpClones;
    }
    private Instant lastCloneJumpDate;
    public void setLastCloneJumpDate(Instant val) {
        lastCloneJumpDate = val;
    }
    @JsonProperty("last_clone_jump_date")
    public Instant getLastCloneJumpDate() {
        return lastCloneJumpDate;
    }
    private Instant lastStationChangeDate;
    public void setLastStationChangeDate(Instant val) {
        lastStationChangeDate = val;
    }
    @JsonProperty("last_station_change_date")
    public Instant getLastStationChangeDate() {
        return lastStationChangeDate;
    }
}
