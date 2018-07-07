package luser.esi.client;

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
    private String lastCloneJumpDate;
    public void setLastCloneJumpDate(String val) {
        lastCloneJumpDate = val;
    }
    public String getLastCloneJumpDate() {
        return lastCloneJumpDate;
    }
    private String lastStationChangeDate;
    public void setLastStationChangeDate(String val) {
        lastStationChangeDate = val;
    }
    public String getLastStationChangeDate() {
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
                rt.set(i, JumpCloneContents.fromJson(jl.get(i)));
            }
            self.jumpClones = rt;
        }

        self.lastCloneJumpDate = ApiClientBase.optGetString(js.get("last_clone_jump_date"));
        self.lastStationChangeDate = ApiClientBase.optGetString(js.get("last_station_change_date"));
        return self;
    }
}
