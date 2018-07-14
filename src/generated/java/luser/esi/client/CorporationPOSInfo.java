package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.carrotsearch.hppc.IntArrayList;
import com.carrotsearch.hppc.LongArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CorporationPOSInfo implements ApiParameterObject {
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
    private AnchorEnum anchor;
    /**
     * Who can anchor starbase (POS) and its structures
     */
    public void setAnchor(AnchorEnum val) {
        anchor = val;
    }
    /**
     * Who can anchor starbase (POS) and its structures
     */
    @JsonProperty("anchor")
    public AnchorEnum getAnchor() {
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
    private FuelBayTakeEnum fuelBayTake;
    /**
     * Who can take fuel blocks out of the starbase (POS)'s fuel bay
     */
    public void setFuelBayTake(FuelBayTakeEnum val) {
        fuelBayTake = val;
    }
    /**
     * Who can take fuel blocks out of the starbase (POS)'s fuel bay
     */
    @JsonProperty("fuel_bay_take")
    public FuelBayTakeEnum getFuelBayTake() {
        return fuelBayTake;
    }
    private FuelBayViewEnum fuelBayView;
    /**
     * Who can view the starbase (POS)'s fule bay. Characters either need to have required role or belong to the starbase (POS) owner's corporation or alliance, as described by the enum, all other access settings follows the same scheme
     */
    public void setFuelBayView(FuelBayViewEnum val) {
        fuelBayView = val;
    }
    /**
     * Who can view the starbase (POS)'s fule bay. Characters either need to have required role or belong to the starbase (POS) owner's corporation or alliance, as described by the enum, all other access settings follows the same scheme
     */
    @JsonProperty("fuel_bay_view")
    public FuelBayViewEnum getFuelBayView() {
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
    private OfflineEnum offline;
    /**
     * Who can offline starbase (POS) and its structures
     */
    public void setOffline(OfflineEnum val) {
        offline = val;
    }
    /**
     * Who can offline starbase (POS) and its structures
     */
    @JsonProperty("offline")
    public OfflineEnum getOffline() {
        return offline;
    }
    private OnlineEnum online;
    /**
     * Who can online starbase (POS) and its structures
     */
    public void setOnline(OnlineEnum val) {
        online = val;
    }
    /**
     * Who can online starbase (POS) and its structures
     */
    @JsonProperty("online")
    public OnlineEnum getOnline() {
        return online;
    }
    private UnanchorEnum unanchor;
    /**
     * Who can unanchor starbase (POS) and its structures
     */
    public void setUnanchor(UnanchorEnum val) {
        unanchor = val;
    }
    /**
     * Who can unanchor starbase (POS) and its structures
     */
    @JsonProperty("unanchor")
    public UnanchorEnum getUnanchor() {
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
    public static enum AnchorEnum {
        ALLIANCE_MEMBER("alliance_member"),
        CONFIG_STARBASE_EQUIPMENT_ROLE("config_starbase_equipment_role"),
        CORPORATION_MEMBER("corporation_member"),
        STARBASE_FUEL_TECHNICIAN_ROLE("starbase_fuel_technician_role");
        private final String stringValue;
        private AnchorEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
        @JsonCreator
        public static AnchorEnum fromString(String str) {
            for (AnchorEnum self : AnchorEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
    public static enum FuelBayTakeEnum {
        ALLIANCE_MEMBER("alliance_member"),
        CONFIG_STARBASE_EQUIPMENT_ROLE("config_starbase_equipment_role"),
        CORPORATION_MEMBER("corporation_member"),
        STARBASE_FUEL_TECHNICIAN_ROLE("starbase_fuel_technician_role");
        private final String stringValue;
        private FuelBayTakeEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
        @JsonCreator
        public static FuelBayTakeEnum fromString(String str) {
            for (FuelBayTakeEnum self : FuelBayTakeEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
    public static enum FuelBayViewEnum {
        ALLIANCE_MEMBER("alliance_member"),
        CONFIG_STARBASE_EQUIPMENT_ROLE("config_starbase_equipment_role"),
        CORPORATION_MEMBER("corporation_member"),
        STARBASE_FUEL_TECHNICIAN_ROLE("starbase_fuel_technician_role");
        private final String stringValue;
        private FuelBayViewEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
        @JsonCreator
        public static FuelBayViewEnum fromString(String str) {
            for (FuelBayViewEnum self : FuelBayViewEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
    public static enum OfflineEnum {
        ALLIANCE_MEMBER("alliance_member"),
        CONFIG_STARBASE_EQUIPMENT_ROLE("config_starbase_equipment_role"),
        CORPORATION_MEMBER("corporation_member"),
        STARBASE_FUEL_TECHNICIAN_ROLE("starbase_fuel_technician_role");
        private final String stringValue;
        private OfflineEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
        @JsonCreator
        public static OfflineEnum fromString(String str) {
            for (OfflineEnum self : OfflineEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
    public static enum OnlineEnum {
        ALLIANCE_MEMBER("alliance_member"),
        CONFIG_STARBASE_EQUIPMENT_ROLE("config_starbase_equipment_role"),
        CORPORATION_MEMBER("corporation_member"),
        STARBASE_FUEL_TECHNICIAN_ROLE("starbase_fuel_technician_role");
        private final String stringValue;
        private OnlineEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
        @JsonCreator
        public static OnlineEnum fromString(String str) {
            for (OnlineEnum self : OnlineEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
    public static enum UnanchorEnum {
        ALLIANCE_MEMBER("alliance_member"),
        CONFIG_STARBASE_EQUIPMENT_ROLE("config_starbase_equipment_role"),
        CORPORATION_MEMBER("corporation_member"),
        STARBASE_FUEL_TECHNICIAN_ROLE("starbase_fuel_technician_role");
        private final String stringValue;
        private UnanchorEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
        @JsonCreator
        public static UnanchorEnum fromString(String str) {
            for (UnanchorEnum self : UnanchorEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
}
