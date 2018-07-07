package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class CorporationPOSInfo {
    private boolean allowAllianceMembers;
    public void setAllowAllianceMembers(boolean val) {
        allowAllianceMembers = val;
    }
    public boolean getAllowAllianceMembers() {
        return allowAllianceMembers;
    }
    private boolean allowCorporationMembers;
    public void setAllowCorporationMembers(boolean val) {
        allowCorporationMembers = val;
    }
    public boolean getAllowCorporationMembers() {
        return allowCorporationMembers;
    }
    private AnchorEnum anchor;
    public void setAnchor(AnchorEnum val) {
        anchor = val;
    }
    public AnchorEnum getAnchor() {
        return anchor;
    }
    private boolean attackIfAtWar;
    public void setAttackIfAtWar(boolean val) {
        attackIfAtWar = val;
    }
    public boolean getAttackIfAtWar() {
        return attackIfAtWar;
    }
    private boolean attackIfOtherSecurityStatusDropping;
    public void setAttackIfOtherSecurityStatusDropping(boolean val) {
        attackIfOtherSecurityStatusDropping = val;
    }
    public boolean getAttackIfOtherSecurityStatusDropping() {
        return attackIfOtherSecurityStatusDropping;
    }
    private Float attackSecurityStatusThreshold;
    public void setAttackSecurityStatusThreshold(Float val) {
        attackSecurityStatusThreshold = val;
    }
    public Float getAttackSecurityStatusThreshold() {
        return attackSecurityStatusThreshold;
    }
    private Float attackStandingThreshold;
    public void setAttackStandingThreshold(Float val) {
        attackStandingThreshold = val;
    }
    public Float getAttackStandingThreshold() {
        return attackStandingThreshold;
    }
    private FuelBayTakeEnum fuelBayTake;
    public void setFuelBayTake(FuelBayTakeEnum val) {
        fuelBayTake = val;
    }
    public FuelBayTakeEnum getFuelBayTake() {
        return fuelBayTake;
    }
    private FuelBayViewEnum fuelBayView;
    public void setFuelBayView(FuelBayViewEnum val) {
        fuelBayView = val;
    }
    public FuelBayViewEnum getFuelBayView() {
        return fuelBayView;
    }
    private List<StarbaseFuel> fuels;
    public void setFuels(List<StarbaseFuel> val) {
        fuels = val;
    }
    public List<StarbaseFuel> getFuels() {
        return fuels;
    }
    private OfflineEnum offline;
    public void setOffline(OfflineEnum val) {
        offline = val;
    }
    public OfflineEnum getOffline() {
        return offline;
    }
    private OnlineEnum online;
    public void setOnline(OnlineEnum val) {
        online = val;
    }
    public OnlineEnum getOnline() {
        return online;
    }
    private UnanchorEnum unanchor;
    public void setUnanchor(UnanchorEnum val) {
        unanchor = val;
    }
    public UnanchorEnum getUnanchor() {
        return unanchor;
    }
    private boolean useAllianceStandings;
    public void setUseAllianceStandings(boolean val) {
        useAllianceStandings = val;
    }
    public boolean getUseAllianceStandings() {
        return useAllianceStandings;
    }
    static CorporationPOSInfo fromJson(Json json) {
        if (json == null) {
            return null;
        }
        CorporationPOSInfo self = new CorporationPOSInfo();
        Map<String, Json> js = json.asJsonMap();
        self.allowAllianceMembers = ApiClientBase.optGetBoolean(js.get("allow_alliance_members"));
        self.allowCorporationMembers = ApiClientBase.optGetBoolean(js.get("allow_corporation_members"));
        self.anchor = AnchorEnum.fromString(ApiClientBase.optGetString(js.get("anchor")));
        self.attackIfAtWar = ApiClientBase.optGetBoolean(js.get("attack_if_at_war"));
        self.attackIfOtherSecurityStatusDropping = ApiClientBase.optGetBoolean(js.get("attack_if_other_security_status_dropping"));
        self.attackSecurityStatusThreshold = ApiClientBase.optGetFloat(js.get("attack_security_status_threshold"));
        self.attackStandingThreshold = ApiClientBase.optGetFloat(js.get("attack_standing_threshold"));
        self.fuelBayTake = FuelBayTakeEnum.fromString(ApiClientBase.optGetString(js.get("fuel_bay_take")));
        self.fuelBayView = FuelBayViewEnum.fromString(ApiClientBase.optGetString(js.get("fuel_bay_view")));
        {
            List<Json> jl = js.get("fuels").asJsonList();
            List<StarbaseFuel> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.set(i, StarbaseFuel.fromJson(jl.get(i)));
            }
            self.fuels = rt;
        }

        self.offline = OfflineEnum.fromString(ApiClientBase.optGetString(js.get("offline")));
        self.online = OnlineEnum.fromString(ApiClientBase.optGetString(js.get("online")));
        self.unanchor = UnanchorEnum.fromString(ApiClientBase.optGetString(js.get("unanchor")));
        self.useAllianceStandings = ApiClientBase.optGetBoolean(js.get("use_alliance_standings"));
        return self;
    }
    public static enum AnchorEnum {
        ALLIANCE_MEMBER("alliance_member"),
        CONFIG_STARBASE_EQUIPMENT_ROLE("config_starbase_equipment_role"),
        CORPORATION_MEMBER("corporation_member"),
        STARBASE_FUEL_TECHNICIAN_ROLE("starbase_fuel_technician_role");
        public final String stringValue;
        private AnchorEnum(String stringValue) {
            this.stringValue = stringValue;
        }
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
        public final String stringValue;
        private FuelBayTakeEnum(String stringValue) {
            this.stringValue = stringValue;
        }
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
        public final String stringValue;
        private FuelBayViewEnum(String stringValue) {
            this.stringValue = stringValue;
        }
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
        public final String stringValue;
        private OfflineEnum(String stringValue) {
            this.stringValue = stringValue;
        }
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
        public final String stringValue;
        private OnlineEnum(String stringValue) {
            this.stringValue = stringValue;
        }
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
        public final String stringValue;
        private UnanchorEnum(String stringValue) {
            this.stringValue = stringValue;
        }
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
