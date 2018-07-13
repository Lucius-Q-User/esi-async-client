package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CorporationPOSInfo implements ApiParameterObject {
    private boolean allowAllianceMembers;
    public void setAllowAllianceMembers(boolean val) {
        allowAllianceMembers = val;
    }
    @JsonProperty("allow_alliance_members")
    public boolean getAllowAllianceMembers() {
        return allowAllianceMembers;
    }
    private boolean allowCorporationMembers;
    public void setAllowCorporationMembers(boolean val) {
        allowCorporationMembers = val;
    }
    @JsonProperty("allow_corporation_members")
    public boolean getAllowCorporationMembers() {
        return allowCorporationMembers;
    }
    private AnchorEnum anchor;
    public void setAnchor(AnchorEnum val) {
        anchor = val;
    }
    @JsonProperty("anchor")
    public AnchorEnum getAnchor() {
        return anchor;
    }
    private boolean attackIfAtWar;
    public void setAttackIfAtWar(boolean val) {
        attackIfAtWar = val;
    }
    @JsonProperty("attack_if_at_war")
    public boolean getAttackIfAtWar() {
        return attackIfAtWar;
    }
    private boolean attackIfOtherSecurityStatusDropping;
    public void setAttackIfOtherSecurityStatusDropping(boolean val) {
        attackIfOtherSecurityStatusDropping = val;
    }
    @JsonProperty("attack_if_other_security_status_dropping")
    public boolean getAttackIfOtherSecurityStatusDropping() {
        return attackIfOtherSecurityStatusDropping;
    }
    private Float attackSecurityStatusThreshold;
    public void setAttackSecurityStatusThreshold(Float val) {
        attackSecurityStatusThreshold = val;
    }
    @JsonProperty("attack_security_status_threshold")
    public Float getAttackSecurityStatusThreshold() {
        return attackSecurityStatusThreshold;
    }
    private Float attackStandingThreshold;
    public void setAttackStandingThreshold(Float val) {
        attackStandingThreshold = val;
    }
    @JsonProperty("attack_standing_threshold")
    public Float getAttackStandingThreshold() {
        return attackStandingThreshold;
    }
    private FuelBayTakeEnum fuelBayTake;
    public void setFuelBayTake(FuelBayTakeEnum val) {
        fuelBayTake = val;
    }
    @JsonProperty("fuel_bay_take")
    public FuelBayTakeEnum getFuelBayTake() {
        return fuelBayTake;
    }
    private FuelBayViewEnum fuelBayView;
    public void setFuelBayView(FuelBayViewEnum val) {
        fuelBayView = val;
    }
    @JsonProperty("fuel_bay_view")
    public FuelBayViewEnum getFuelBayView() {
        return fuelBayView;
    }
    private List<StarbaseFuel> fuels;
    public void setFuels(List<StarbaseFuel> val) {
        fuels = val;
    }
    @JsonProperty("fuels")
    public List<StarbaseFuel> getFuels() {
        return fuels;
    }
    private OfflineEnum offline;
    public void setOffline(OfflineEnum val) {
        offline = val;
    }
    @JsonProperty("offline")
    public OfflineEnum getOffline() {
        return offline;
    }
    private OnlineEnum online;
    public void setOnline(OnlineEnum val) {
        online = val;
    }
    @JsonProperty("online")
    public OnlineEnum getOnline() {
        return online;
    }
    private UnanchorEnum unanchor;
    public void setUnanchor(UnanchorEnum val) {
        unanchor = val;
    }
    @JsonProperty("unanchor")
    public UnanchorEnum getUnanchor() {
        return unanchor;
    }
    private boolean useAllianceStandings;
    public void setUseAllianceStandings(boolean val) {
        useAllianceStandings = val;
    }
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
