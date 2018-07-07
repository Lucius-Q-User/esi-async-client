package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class StationInfo {
    private float maxDockableShipVolume;
    public void setMaxDockableShipVolume(float val) {
        maxDockableShipVolume = val;
    }
    public float getMaxDockableShipVolume() {
        return maxDockableShipVolume;
    }
    private String name;
    public void setName(String val) {
        name = val;
    }
    public String getName() {
        return name;
    }
    private float officeRentalCost;
    public void setOfficeRentalCost(float val) {
        officeRentalCost = val;
    }
    public float getOfficeRentalCost() {
        return officeRentalCost;
    }
    private Integer owner;
    public void setOwner(Integer val) {
        owner = val;
    }
    public Integer getOwner() {
        return owner;
    }
    private Coordinate position;
    public void setPosition(Coordinate val) {
        position = val;
    }
    public Coordinate getPosition() {
        return position;
    }
    private Integer raceId;
    public void setRaceId(Integer val) {
        raceId = val;
    }
    public Integer getRaceId() {
        return raceId;
    }
    private float reprocessingEfficiency;
    public void setReprocessingEfficiency(float val) {
        reprocessingEfficiency = val;
    }
    public float getReprocessingEfficiency() {
        return reprocessingEfficiency;
    }
    private float reprocessingStationsTake;
    public void setReprocessingStationsTake(float val) {
        reprocessingStationsTake = val;
    }
    public float getReprocessingStationsTake() {
        return reprocessingStationsTake;
    }
    private List<ServicesEnum> services;
    public void setServices(List<ServicesEnum> val) {
        services = val;
    }
    public List<ServicesEnum> getServices() {
        return services;
    }
    private int stationId;
    public void setStationId(int val) {
        stationId = val;
    }
    public int getStationId() {
        return stationId;
    }
    private int systemId;
    public void setSystemId(int val) {
        systemId = val;
    }
    public int getSystemId() {
        return systemId;
    }
    private int typeId;
    public void setTypeId(int val) {
        typeId = val;
    }
    public int getTypeId() {
        return typeId;
    }
    static StationInfo fromJson(Json json) {
        if (json == null) {
            return null;
        }
        StationInfo self = new StationInfo();
        Map<String, Json> js = json.asJsonMap();
        self.maxDockableShipVolume = ApiClientBase.optGetFloat(js.get("max_dockable_ship_volume"));
        self.name = ApiClientBase.optGetString(js.get("name"));
        self.officeRentalCost = ApiClientBase.optGetFloat(js.get("office_rental_cost"));
        self.owner = ApiClientBase.optGetInteger(js.get("owner"));
        self.position = Coordinate.fromJson(js.get("position"));
        self.raceId = ApiClientBase.optGetInteger(js.get("race_id"));
        self.reprocessingEfficiency = ApiClientBase.optGetFloat(js.get("reprocessing_efficiency"));
        self.reprocessingStationsTake = ApiClientBase.optGetFloat(js.get("reprocessing_stations_take"));
        {
            List<Json> jl = js.get("services").asJsonList();
            List<ServicesEnum> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.set(i, ServicesEnum.fromString(jl.get(i).asString()));
            }
            self.services = rt;
        }
        self.stationId = ApiClientBase.optGetInteger(js.get("station_id"));
        self.systemId = ApiClientBase.optGetInteger(js.get("system_id"));
        self.typeId = ApiClientBase.optGetInteger(js.get("type_id"));
        return self;
    }
    public static enum ServicesEnum {
        BOUNTY_MISSIONS("bounty-missions"),
        ASSASINATION_MISSIONS("assasination-missions"),
        COURIER_MISSIONS("courier-missions"),
        INTERBUS("interbus"),
        REPROCESSING_PLANT("reprocessing-plant"),
        REFINERY("refinery"),
        MARKET("market"),
        BLACK_MARKET("black-market"),
        STOCK_EXCHANGE("stock-exchange"),
        CLONING("cloning"),
        SURGERY("surgery"),
        DNA_THERAPY("dna-therapy"),
        REPAIR_FACILITIES("repair-facilities"),
        FACTORY("factory"),
        LABRATORY("labratory"),
        GAMBLING("gambling"),
        FITTING("fitting"),
        PAINTSHOP("paintshop"),
        NEWS("news"),
        STORAGE("storage"),
        INSURANCE("insurance"),
        DOCKING("docking"),
        OFFICE_RENTAL("office-rental"),
        JUMP_CLONE_FACILITY("jump-clone-facility"),
        LOYALTY_POINT_STORE("loyalty-point-store"),
        NAVY_OFFICES("navy-offices"),
        SECURITY_OFFICES("security-offices");
        public final String stringValue;
        private ServicesEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        public static ServicesEnum fromString(String str) {
            for (ServicesEnum self : ServicesEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
}
