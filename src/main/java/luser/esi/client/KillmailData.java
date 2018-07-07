package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class KillmailData {
    private List<KillAttacker> attackers;
    public void setAttackers(List<KillAttacker> val) {
        attackers = val;
    }
    public List<KillAttacker> getAttackers() {
        return attackers;
    }
    private int killmailId;
    public void setKillmailId(int val) {
        killmailId = val;
    }
    public int getKillmailId() {
        return killmailId;
    }
    private String killmailTime;
    public void setKillmailTime(String val) {
        killmailTime = val;
    }
    public String getKillmailTime() {
        return killmailTime;
    }
    private Integer moonId;
    public void setMoonId(Integer val) {
        moonId = val;
    }
    public Integer getMoonId() {
        return moonId;
    }
    private int solarSystemId;
    public void setSolarSystemId(int val) {
        solarSystemId = val;
    }
    public int getSolarSystemId() {
        return solarSystemId;
    }
    private KillVictim victim;
    public void setVictim(KillVictim val) {
        victim = val;
    }
    public KillVictim getVictim() {
        return victim;
    }
    private Integer warId;
    public void setWarId(Integer val) {
        warId = val;
    }
    public Integer getWarId() {
        return warId;
    }
    static KillmailData fromJson(Json json) {
        if (json == null) {
            return null;
        }
        KillmailData self = new KillmailData();
        Map<String, Json> js = json.asJsonMap();
        {
            List<Json> jl = js.get("attackers").asJsonList();
            List<KillAttacker> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.set(i, KillAttacker.fromJson(jl.get(i)));
            }
            self.attackers = rt;
        }

        self.killmailId = ApiClientBase.optGetInteger(js.get("killmail_id"));
        self.killmailTime = ApiClientBase.optGetString(js.get("killmail_time"));
        self.moonId = ApiClientBase.optGetInteger(js.get("moon_id"));
        self.solarSystemId = ApiClientBase.optGetInteger(js.get("solar_system_id"));
        self.victim = KillVictim.fromJson(js.get("victim"));
        self.warId = ApiClientBase.optGetInteger(js.get("war_id"));
        return self;
    }
}
