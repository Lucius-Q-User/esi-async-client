package luser.esi.client;

import java.time.Instant;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class KillmailData {
    private List<KillAttacker> attackers;
    /**
     * attackers array
     */
    public void setAttackers(List<KillAttacker> val) {
        attackers = val;
    }
    /**
     * attackers array
     */
    @JsonProperty("attackers")
    public List<KillAttacker> getAttackers() {
        return attackers;
    }
    private int killmailId;
    /**
     * ID of the killmail
     */
    public void setKillmailId(int val) {
        killmailId = val;
    }
    /**
     * ID of the killmail
     */
    @JsonProperty("killmail_id")
    public int getKillmailId() {
        return killmailId;
    }
    private Instant killmailTime;
    /**
     * Time that the victim was killed and the killmail generated

     */
    public void setKillmailTime(Instant val) {
        killmailTime = val;
    }
    /**
     * Time that the victim was killed and the killmail generated

     */
    @JsonProperty("killmail_time")
    public Instant getKillmailTime() {
        return killmailTime;
    }
    private Integer moonId;
    /**
     * Moon if the kill took place at one
     */
    public void setMoonId(Integer val) {
        moonId = val;
    }
    /**
     * Moon if the kill took place at one
     */
    @JsonProperty("moon_id")
    public Integer getMoonId() {
        return moonId;
    }
    private int solarSystemId;
    /**
     * Solar system that the kill took place in

     */
    public void setSolarSystemId(int val) {
        solarSystemId = val;
    }
    /**
     * Solar system that the kill took place in

     */
    @JsonProperty("solar_system_id")
    public int getSolarSystemId() {
        return solarSystemId;
    }
    private KillVictim victim;
    /**
     * victim object
     */
    public void setVictim(KillVictim val) {
        victim = val;
    }
    /**
     * victim object
     */
    @JsonProperty("victim")
    public KillVictim getVictim() {
        return victim;
    }
    private Integer warId;
    /**
     * War if the killmail is generated in relation to an official war

     */
    public void setWarId(Integer val) {
        warId = val;
    }
    /**
     * War if the killmail is generated in relation to an official war

     */
    @JsonProperty("war_id")
    public Integer getWarId() {
        return warId;
    }
}
