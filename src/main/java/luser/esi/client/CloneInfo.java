package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class CloneInfo {
    private CloneHomeLocation homeLocation;
    public void setHomeLocation(CloneHomeLocation val) {
        homeLocation = val;
    }
    public CloneHomeLocation getHomeLocation() {
        return homeLocation;
    }
    private List<JumpCloneContents> jumpClones;
    public void setJumpClones(List<JumpCloneContents> val) {
        jumpClones = val;
    }
    public List<JumpCloneContents> getJumpClones() {
        return jumpClones;
    }
    private Instant lastCloneJumpDate;
    public void setLastCloneJumpDate(Instant val) {
        lastCloneJumpDate = val;
    }
    public Instant getLastCloneJumpDate() {
        return lastCloneJumpDate;
    }
    private Instant lastStationChangeDate;
    public void setLastStationChangeDate(Instant val) {
        lastStationChangeDate = val;
    }
    public Instant getLastStationChangeDate() {
        return lastStationChangeDate;
    }
    static CloneInfo fromJson(Json json) {
        if (json == null) {
            return null;
        }
        CloneInfo self = new CloneInfo();
        Map<String, Json> js = json.asJsonMap();
        self.homeLocation = CloneHomeLocation.fromJson(js.get("home_location"));
        {
            List<Json> jl = js.get("jump_clones").asJsonList();
            List<JumpCloneContents> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.add(JumpCloneContents.fromJson(jl.get(i)));
            }
            self.jumpClones = rt;
        }
        self.lastCloneJumpDate = ApiClientBase.optGetInstant(js.get("last_clone_jump_date"));
        self.lastStationChangeDate = ApiClientBase.optGetInstant(js.get("last_station_change_date"));
        return self;
    }
}
