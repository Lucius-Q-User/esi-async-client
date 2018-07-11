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
    public void setAggressor(WarParticipantInfo val) {
        aggressor = val;
    }
    @JsonProperty("aggressor")
    public WarParticipantInfo getAggressor() {
        return aggressor;
    }
    private List<WarAllyInfo> allies;
    public void setAllies(List<WarAllyInfo> val) {
        allies = val;
    }
    @JsonProperty("allies")
    public List<WarAllyInfo> getAllies() {
        return allies;
    }
    private Instant declared;
    public void setDeclared(Instant val) {
        declared = val;
    }
    @JsonProperty("declared")
    public Instant getDeclared() {
        return declared;
    }
    private WarParticipantInfo defender;
    public void setDefender(WarParticipantInfo val) {
        defender = val;
    }
    @JsonProperty("defender")
    public WarParticipantInfo getDefender() {
        return defender;
    }
    private Instant finished;
    public void setFinished(Instant val) {
        finished = val;
    }
    @JsonProperty("finished")
    public Instant getFinished() {
        return finished;
    }
    private int id;
    public void setId(int val) {
        id = val;
    }
    @JsonProperty("id")
    public int getId() {
        return id;
    }
    private boolean mutual;
    public void setMutual(boolean val) {
        mutual = val;
    }
    @JsonProperty("mutual")
    public boolean getMutual() {
        return mutual;
    }
    private boolean openForAllies;
    public void setOpenForAllies(boolean val) {
        openForAllies = val;
    }
    @JsonProperty("open_for_allies")
    public boolean getOpenForAllies() {
        return openForAllies;
    }
    private Instant retracted;
    public void setRetracted(Instant val) {
        retracted = val;
    }
    @JsonProperty("retracted")
    public Instant getRetracted() {
        return retracted;
    }
    private Instant started;
    public void setStarted(Instant val) {
        started = val;
    }
    @JsonProperty("started")
    public Instant getStarted() {
        return started;
    }
}
