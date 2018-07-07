package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class WarInfo {
    private WarParticipantInfo aggressor;
    public void setAggressor(WarParticipantInfo val) {
        aggressor = val;
    }
    public WarParticipantInfo getAggressor() {
        return aggressor;
    }
    private List<WarAllyInfo> allies;
    public void setAllies(List<WarAllyInfo> val) {
        allies = val;
    }
    public List<WarAllyInfo> getAllies() {
        return allies;
    }
    private String declared;
    public void setDeclared(String val) {
        declared = val;
    }
    public String getDeclared() {
        return declared;
    }
    private WarParticipantInfo defender;
    public void setDefender(WarParticipantInfo val) {
        defender = val;
    }
    public WarParticipantInfo getDefender() {
        return defender;
    }
    private String finished;
    public void setFinished(String val) {
        finished = val;
    }
    public String getFinished() {
        return finished;
    }
    private int id;
    public void setId(int val) {
        id = val;
    }
    public int getId() {
        return id;
    }
    private boolean mutual;
    public void setMutual(boolean val) {
        mutual = val;
    }
    public boolean getMutual() {
        return mutual;
    }
    private boolean openForAllies;
    public void setOpenForAllies(boolean val) {
        openForAllies = val;
    }
    public boolean getOpenForAllies() {
        return openForAllies;
    }
    private String retracted;
    public void setRetracted(String val) {
        retracted = val;
    }
    public String getRetracted() {
        return retracted;
    }
    private String started;
    public void setStarted(String val) {
        started = val;
    }
    public String getStarted() {
        return started;
    }
    static WarInfo fromJson(Json json) {
        if (json == null) {
            return null;
        }
        WarInfo self = new WarInfo();
        Map<String, Json> js = json.asJsonMap();
        self.aggressor = WarParticipantInfo.fromJson(js.get("aggressor"));
        {
            List<Json> jl = js.get("allies").asJsonList();
            List<WarAllyInfo> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.set(i, WarAllyInfo.fromJson(jl.get(i)));
            }
            self.allies = rt;
        }

        self.declared = ApiClientBase.optGetString(js.get("declared"));
        self.defender = WarParticipantInfo.fromJson(js.get("defender"));
        self.finished = ApiClientBase.optGetString(js.get("finished"));
        self.id = ApiClientBase.optGetInteger(js.get("id"));
        self.mutual = ApiClientBase.optGetBoolean(js.get("mutual"));
        self.openForAllies = ApiClientBase.optGetBoolean(js.get("open_for_allies"));
        self.retracted = ApiClientBase.optGetString(js.get("retracted"));
        self.started = ApiClientBase.optGetString(js.get("started"));
        return self;
    }
}
