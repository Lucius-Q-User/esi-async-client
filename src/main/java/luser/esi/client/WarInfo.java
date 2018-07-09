package luser.esi.client;

import java.time.Instant;
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
    private Instant declared;
    public void setDeclared(Instant val) {
        declared = val;
    }
    public Instant getDeclared() {
        return declared;
    }
    private WarParticipantInfo defender;
    public void setDefender(WarParticipantInfo val) {
        defender = val;
    }
    public WarParticipantInfo getDefender() {
        return defender;
    }
    private Instant finished;
    public void setFinished(Instant val) {
        finished = val;
    }
    public Instant getFinished() {
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
    private Instant retracted;
    public void setRetracted(Instant val) {
        retracted = val;
    }
    public Instant getRetracted() {
        return retracted;
    }
    private Instant started;
    public void setStarted(Instant val) {
        started = val;
    }
    public Instant getStarted() {
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
                rt.add(WarAllyInfo.fromJson(jl.get(i)));
            }
            self.allies = rt;
        }
        self.declared = ApiClientBase.optGetInstant(js.get("declared"));
        self.defender = WarParticipantInfo.fromJson(js.get("defender"));
        self.finished = ApiClientBase.optGetInstant(js.get("finished"));
        self.id = ApiClientBase.optGetInteger(js.get("id"));
        self.mutual = ApiClientBase.optGetBoolean(js.get("mutual"));
        self.openForAllies = ApiClientBase.optGetBoolean(js.get("open_for_allies"));
        self.retracted = ApiClientBase.optGetInstant(js.get("retracted"));
        self.started = ApiClientBase.optGetInstant(js.get("started"));
        return self;
    }
}
