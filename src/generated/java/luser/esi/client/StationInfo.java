package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class StationInfo implements ApiParameterObject {
    private float maxDockableShipVolume;
    public void setMaxDockableShipVolume(float val) {
        maxDockableShipVolume = val;
    }
    @JsonProperty("max_dockable_ship_volume")
    public float getMaxDockableShipVolume() {
        return maxDockableShipVolume;
    }
    private String name;
    public void setName(String val) {
        name = val;
    }
    @JsonProperty("name")
    public String getName() {
        return name;
    }
    private float officeRentalCost;
    public void setOfficeRentalCost(float val) {
        officeRentalCost = val;
    }
    @JsonProperty("office_rental_cost")
    public float getOfficeRentalCost() {
        return officeRentalCost;
    }
    private Integer owner;
    public void setOwner(Integer val) {
        owner = val;
    }
    @JsonProperty("owner")
    public Integer getOwner() {
        return owner;
    }
    private Coordinate position;
    public void setPosition(Coordinate val) {
        position = val;
    }
    @JsonProperty("position")
    public Coordinate getPosition() {
        return position;
    }
    private Integer raceId;
    public void setRaceId(Integer val) {
        raceId = val;
    }
    @JsonProperty("race_id")
    public Integer getRaceId() {
        return raceId;
    }
    private float reprocessingEfficiency;
    public void setReprocessingEfficiency(float val) {
        reprocessingEfficiency = val;
    }
    @JsonProperty("reprocessing_efficiency")
    public float getReprocessingEfficiency() {
        return reprocessingEfficiency;
    }
    private float reprocessingStationsTake;
    public void setReprocessingStationsTake(float val) {
        reprocessingStationsTake = val;
    }
    @JsonProperty("reprocessing_stations_take")
    public float getReprocessingStationsTake() {
        return reprocessingStationsTake;
    }
    private List<ServicesEnum> services;
    public void setServices(List<ServicesEnum> val) {
        services = val;
    }
    @JsonProperty("services")
    public List<ServicesEnum> getServices() {
        return services;
    }
    private int stationId;
    public void setStationId(int val) {
        stationId = val;
    }
    @JsonProperty("station_id")
    public int getStationId() {
        return stationId;
    }
    private int systemId;
    public void setSystemId(int val) {
        systemId = val;
    }
    @JsonProperty("system_id")
    public int getSystemId() {
        return systemId;
    }
    private int typeId;
    public void setTypeId(int val) {
        typeId = val;
    }
    @JsonProperty("type_id")
    public int getTypeId() {
        return typeId;
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
        private final String stringValue;
        private ServicesEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
        @JsonCreator
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