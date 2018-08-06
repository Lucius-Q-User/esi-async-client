package luser.esi.client;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CorporationPOSInfo {
    private boolean allowAllianceMembers;
    /**
     * allow_alliance_members boolean
     */
    public void setAllowAllianceMembers(boolean val) {
        allowAllianceMembers = val;
    }
    /**
     * allow_alliance_members boolean
     */
    @JsonProperty("allow_alliance_members")
    public boolean getAllowAllianceMembers() {
        return allowAllianceMembers;
    }
    private boolean allowCorporationMembers;
    /**
     * allow_corporation_members boolean
     */
    public void setAllowCorporationMembers(boolean val) {
        allowCorporationMembers = val;
    }
    /**
     * allow_corporation_members boolean
     */
    @JsonProperty("allow_corporation_members")
    public boolean getAllowCorporationMembers() {
        return allowCorporationMembers;
    }
    private PostManagementAccessEnum anchor;
    /**
     * Who can anchor starbase (POS) and its structures
     */
    public void setAnchor(PostManagementAccessEnum val) {
        anchor = val;
    }
    /**
     * Who can anchor starbase (POS) and its structures
     */
    @JsonProperty("anchor")
    public PostManagementAccessEnum getAnchor() {
        return anchor;
    }
    private boolean attackIfAtWar;
    /**
     * attack_if_at_war boolean
     */
    public void setAttackIfAtWar(boolean val) {
        attackIfAtWar = val;
    }
    /**
     * attack_if_at_war boolean
     */
    @JsonProperty("attack_if_at_war")
    public boolean getAttackIfAtWar() {
        return attackIfAtWar;
    }
    private boolean attackIfOtherSecurityStatusDropping;
    /**
     * attack_if_other_security_status_dropping boolean
     */
    public void setAttackIfOtherSecurityStatusDropping(boolean val) {
        attackIfOtherSecurityStatusDropping = val;
    }
    /**
     * attack_if_other_security_status_dropping boolean
     */
    @JsonProperty("attack_if_other_security_status_dropping")
    public boolean getAttackIfOtherSecurityStatusDropping() {
        return attackIfOtherSecurityStatusDropping;
    }
    private Float attackSecurityStatusThreshold;
    /**
     * Starbase (POS) will attack if target's security standing is lower than this value
     */
    public void setAttackSecurityStatusThreshold(Float val) {
        attackSecurityStatusThreshold = val;
    }
    /**
     * Starbase (POS) will attack if target's security standing is lower than this value
     */
    @JsonProperty("attack_security_status_threshold")
    public Float getAttackSecurityStatusThreshold() {
        return attackSecurityStatusThreshold;
    }
    private Float attackStandingThreshold;
    /**
     * Starbase (POS) will attack if target's standing is lower than this value
     */
    public void setAttackStandingThreshold(Float val) {
        attackStandingThreshold = val;
    }
    /**
     * Starbase (POS) will attack if target's standing is lower than this value
     */
    @JsonProperty("attack_standing_threshold")
    public Float getAttackStandingThreshold() {
        return attackStandingThreshold;
    }
    private PostManagementAccessEnum fuelBayTake;
    /**
     * Who can take fuel blocks out of the starbase (POS)'s fuel bay
     */
    public void setFuelBayTake(PostManagementAccessEnum val) {
        fuelBayTake = val;
    }
    /**
     * Who can take fuel blocks out of the starbase (POS)'s fuel bay
     */
    @JsonProperty("fuel_bay_take")
    public PostManagementAccessEnum getFuelBayTake() {
        return fuelBayTake;
    }
    private PostManagementAccessEnum fuelBayView;
    /**
     * Who can view the starbase (POS)'s fule bay. Characters either need to have required role or belong to the starbase (POS) owner's corporation or alliance, as described by the enum, all other access settings follows the same scheme
     */
    public void setFuelBayView(PostManagementAccessEnum val) {
        fuelBayView = val;
    }
    /**
     * Who can view the starbase (POS)'s fule bay. Characters either need to have required role or belong to the starbase (POS) owner's corporation or alliance, as described by the enum, all other access settings follows the same scheme
     */
    @JsonProperty("fuel_bay_view")
    public PostManagementAccessEnum getFuelBayView() {
        return fuelBayView;
    }
    private List<StarbaseFuel> fuels;
    /**
     * Fuel blocks and other things that will be consumed when operating a starbase (POS)
     */
    public void setFuels(List<StarbaseFuel> val) {
        fuels = val;
    }
    /**
     * Fuel blocks and other things that will be consumed when operating a starbase (POS)
     */
    @JsonProperty("fuels")
    public List<StarbaseFuel> getFuels() {
        return fuels;
    }
    private PostManagementAccessEnum offline;
    /**
     * Who can offline starbase (POS) and its structures
     */
    public void setOffline(PostManagementAccessEnum val) {
        offline = val;
    }
    /**
     * Who can offline starbase (POS) and its structures
     */
    @JsonProperty("offline")
    public PostManagementAccessEnum getOffline() {
        return offline;
    }
    private PostManagementAccessEnum online;
    /**
     * Who can online starbase (POS) and its structures
     */
    public void setOnline(PostManagementAccessEnum val) {
        online = val;
    }
    /**
     * Who can online starbase (POS) and its structures
     */
    @JsonProperty("online")
    public PostManagementAccessEnum getOnline() {
        return online;
    }
    private PostManagementAccessEnum unanchor;
    /**
     * Who can unanchor starbase (POS) and its structures
     */
    public void setUnanchor(PostManagementAccessEnum val) {
        unanchor = val;
    }
    /**
     * Who can unanchor starbase (POS) and its structures
     */
    @JsonProperty("unanchor")
    public PostManagementAccessEnum getUnanchor() {
        return unanchor;
    }
    private boolean useAllianceStandings;
    /**
     * True if the starbase (POS) is using alliance standings, otherwise using corporation's
     */
    public void setUseAllianceStandings(boolean val) {
        useAllianceStandings = val;
    }
    /**
     * True if the starbase (POS) is using alliance standings, otherwise using corporation's
     */
    @JsonProperty("use_alliance_standings")
    public boolean getUseAllianceStandings() {
        return useAllianceStandings;
    }
}
