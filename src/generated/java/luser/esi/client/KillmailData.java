package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class KillmailData implements ApiParameterObject {
    private List<KillAttacker> attackers;
    public void setAttackers(List<KillAttacker> val) {
        attackers = val;
    }
    @JsonProperty("attackers")
    public List<KillAttacker> getAttackers() {
        return attackers;
    }
    private int killmailId;
    public void setKillmailId(int val) {
        killmailId = val;
    }
    @JsonProperty("killmail_id")
    public int getKillmailId() {
        return killmailId;
    }
    private Instant killmailTime;
    public void setKillmailTime(Instant val) {
        killmailTime = val;
    }
    @JsonProperty("killmail_time")
    public Instant getKillmailTime() {
        return killmailTime;
    }
    private Integer moonId;
    public void setMoonId(Integer val) {
        moonId = val;
    }
    @JsonProperty("moon_id")
    public Integer getMoonId() {
        return moonId;
    }
    private int solarSystemId;
    public void setSolarSystemId(int val) {
        solarSystemId = val;
    }
    @JsonProperty("solar_system_id")
    public int getSolarSystemId() {
        return solarSystemId;
    }
    private KillVictim victim;
    public void setVictim(KillVictim val) {
        victim = val;
    }
    @JsonProperty("victim")
    public KillVictim getVictim() {
        return victim;
    }
    private Integer warId;
    public void setWarId(Integer val) {
        warId = val;
    }
    @JsonProperty("war_id")
    public Integer getWarId() {
        return warId;
    }
}
