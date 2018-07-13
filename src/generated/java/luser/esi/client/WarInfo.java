package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class WarInfo implements ApiParameterObject {
    private WarParticipantInfo aggressor;
    /**
     * The aggressor corporation or alliance that declared this war, only contains either corporation_id or alliance_id
     */
    public void setAggressor(WarParticipantInfo val) {
        aggressor = val;
    }
    /**
     * The aggressor corporation or alliance that declared this war, only contains either corporation_id or alliance_id
     */
    @JsonProperty("aggressor")
    public WarParticipantInfo getAggressor() {
        return aggressor;
    }
    private List<WarAllyInfo> allies;
    /**
     * allied corporations or alliances, each object contains either corporation_id or alliance_id
     */
    public void setAllies(List<WarAllyInfo> val) {
        allies = val;
    }
    /**
     * allied corporations or alliances, each object contains either corporation_id or alliance_id
     */
    @JsonProperty("allies")
    public List<WarAllyInfo> getAllies() {
        return allies;
    }
    private Instant declared;
    /**
     * Time that the war was declared
     */
    public void setDeclared(Instant val) {
        declared = val;
    }
    /**
     * Time that the war was declared
     */
    @JsonProperty("declared")
    public Instant getDeclared() {
        return declared;
    }
    private WarParticipantInfo defender;
    /**
     * The defending corporation or alliance that declared this war, only contains either corporation_id or alliance_id
     */
    public void setDefender(WarParticipantInfo val) {
        defender = val;
    }
    /**
     * The defending corporation or alliance that declared this war, only contains either corporation_id or alliance_id
     */
    @JsonProperty("defender")
    public WarParticipantInfo getDefender() {
        return defender;
    }
    private Instant finished;
    /**
     * Time the war ended and shooting was no longer allowed
     */
    public void setFinished(Instant val) {
        finished = val;
    }
    /**
     * Time the war ended and shooting was no longer allowed
     */
    @JsonProperty("finished")
    public Instant getFinished() {
        return finished;
    }
    private int id;
    /**
     * ID of the specified war
     */
    public void setId(int val) {
        id = val;
    }
    /**
     * ID of the specified war
     */
    @JsonProperty("id")
    public int getId() {
        return id;
    }
    private boolean mutual;
    /**
     * Was the war declared mutual by both parties
     */
    public void setMutual(boolean val) {
        mutual = val;
    }
    /**
     * Was the war declared mutual by both parties
     */
    @JsonProperty("mutual")
    public boolean getMutual() {
        return mutual;
    }
    private boolean openForAllies;
    /**
     * Is the war currently open for allies or not
     */
    public void setOpenForAllies(boolean val) {
        openForAllies = val;
    }
    /**
     * Is the war currently open for allies or not
     */
    @JsonProperty("open_for_allies")
    public boolean getOpenForAllies() {
        return openForAllies;
    }
    private Instant retracted;
    /**
     * Time the war was retracted but both sides could still shoot each other
     */
    public void setRetracted(Instant val) {
        retracted = val;
    }
    /**
     * Time the war was retracted but both sides could still shoot each other
     */
    @JsonProperty("retracted")
    public Instant getRetracted() {
        return retracted;
    }
    private Instant started;
    /**
     * Time when the war started and both sides could shoot each other
     */
    public void setStarted(Instant val) {
        started = val;
    }
    /**
     * Time when the war started and both sides could shoot each other
     */
    @JsonProperty("started")
    public Instant getStarted() {
        return started;
    }
}
