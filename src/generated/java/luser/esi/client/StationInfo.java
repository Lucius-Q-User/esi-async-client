package luser.esi.client;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

public class StationInfo {
    private float maxDockableShipVolume;
    /**
     * max_dockable_ship_volume number
     */
    public void setMaxDockableShipVolume(float val) {
        maxDockableShipVolume = val;
    }
    /**
     * max_dockable_ship_volume number
     */
    @JsonProperty("max_dockable_ship_volume")
    public float getMaxDockableShipVolume() {
        return maxDockableShipVolume;
    }
    private String name;
    /**
     * name string
     */
    public void setName(String val) {
        name = val;
    }
    /**
     * name string
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }
    private float officeRentalCost;
    /**
     * office_rental_cost number
     */
    public void setOfficeRentalCost(float val) {
        officeRentalCost = val;
    }
    /**
     * office_rental_cost number
     */
    @JsonProperty("office_rental_cost")
    public float getOfficeRentalCost() {
        return officeRentalCost;
    }
    private Integer owner;
    /**
     * ID of the corporation that controls this station
     */
    public void setOwner(Integer val) {
        owner = val;
    }
    /**
     * ID of the corporation that controls this station
     */
    @JsonProperty("owner")
    public Integer getOwner() {
        return owner;
    }
    private Coordinate position;
    /**
     * position object
     */
    public void setPosition(Coordinate val) {
        position = val;
    }
    /**
     * position object
     */
    @JsonProperty("position")
    public Coordinate getPosition() {
        return position;
    }
    private Integer raceId;
    /**
     * race_id integer
     */
    public void setRaceId(Integer val) {
        raceId = val;
    }
    /**
     * race_id integer
     */
    @JsonProperty("race_id")
    public Integer getRaceId() {
        return raceId;
    }
    private float reprocessingEfficiency;
    /**
     * reprocessing_efficiency number
     */
    public void setReprocessingEfficiency(float val) {
        reprocessingEfficiency = val;
    }
    /**
     * reprocessing_efficiency number
     */
    @JsonProperty("reprocessing_efficiency")
    public float getReprocessingEfficiency() {
        return reprocessingEfficiency;
    }
    private float reprocessingStationsTake;
    /**
     * reprocessing_stations_take number
     */
    public void setReprocessingStationsTake(float val) {
        reprocessingStationsTake = val;
    }
    /**
     * reprocessing_stations_take number
     */
    @JsonProperty("reprocessing_stations_take")
    public float getReprocessingStationsTake() {
        return reprocessingStationsTake;
    }
    private List<ServicesEnum> services;
    /**
     * services array
     */
    public void setServices(List<ServicesEnum> val) {
        services = val;
    }
    /**
     * services array
     */
    @JsonProperty("services")
    public List<ServicesEnum> getServices() {
        return services;
    }
    private int stationId;
    /**
     * station_id integer
     */
    public void setStationId(int val) {
        stationId = val;
    }
    /**
     * station_id integer
     */
    @JsonProperty("station_id")
    public int getStationId() {
        return stationId;
    }
    private int systemId;
    /**
     * The solar system this station is in
     */
    public void setSystemId(int val) {
        systemId = val;
    }
    /**
     * The solar system this station is in
     */
    @JsonProperty("system_id")
    public int getSystemId() {
        return systemId;
    }
    private int typeId;
    /**
     * type_id integer
     */
    public void setTypeId(int val) {
        typeId = val;
    }
    /**
     * type_id integer
     */
    @JsonProperty("type_id")
    public int getTypeId() {
        return typeId;
    }
    public static enum ServicesEnum implements StringyEnum{
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
        @Override
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
    }
}
