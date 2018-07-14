package luser.esi.client;

import java.time.Instant;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CloneInfo implements ApiParameterObject {
    private CloneHomeLocation homeLocation;
    /**
     * home_location object
     */
    public void setHomeLocation(CloneHomeLocation val) {
        homeLocation = val;
    }
    /**
     * home_location object
     */
    @JsonProperty("home_location")
    public CloneHomeLocation getHomeLocation() {
        return homeLocation;
    }
    private List<JumpCloneContents> jumpClones;
    /**
     * jump_clones array
     */
    public void setJumpClones(List<JumpCloneContents> val) {
        jumpClones = val;
    }
    /**
     * jump_clones array
     */
    @JsonProperty("jump_clones")
    public List<JumpCloneContents> getJumpClones() {
        return jumpClones;
    }
    private Instant lastCloneJumpDate;
    /**
     * last_clone_jump_date string
     */
    public void setLastCloneJumpDate(Instant val) {
        lastCloneJumpDate = val;
    }
    /**
     * last_clone_jump_date string
     */
    @JsonProperty("last_clone_jump_date")
    public Instant getLastCloneJumpDate() {
        return lastCloneJumpDate;
    }
    private Instant lastStationChangeDate;
    /**
     * last_station_change_date string
     */
    public void setLastStationChangeDate(Instant val) {
        lastStationChangeDate = val;
    }
    /**
     * last_station_change_date string
     */
    @JsonProperty("last_station_change_date")
    public Instant getLastStationChangeDate() {
        return lastStationChangeDate;
    }
}
