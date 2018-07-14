package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public class CharacterBlueprint implements ApiParameterObject {
    private long itemId;
    /**
     * Unique ID for this item.
     */
    public void setItemId(long val) {
        itemId = val;
    }
    /**
     * Unique ID for this item.
     */
    @JsonProperty("item_id")
    public long getItemId() {
        return itemId;
    }
    private LocationFlagEnum locationFlag;
    /**
     * Type of the location_id
     */
    public void setLocationFlag(LocationFlagEnum val) {
        locationFlag = val;
    }
    /**
     * Type of the location_id
     */
    @JsonProperty("location_flag")
    public LocationFlagEnum getLocationFlag() {
        return locationFlag;
    }
    private long locationId;
    /**
     * References a solar system, station or item_id if this blueprint is located within a container. If the return value is an item_id, then the Character AssetList API must be queried to find the container using the given item_id to determine the correct location of the Blueprint.
     */
    public void setLocationId(long val) {
        locationId = val;
    }
    /**
     * References a solar system, station or item_id if this blueprint is located within a container. If the return value is an item_id, then the Character AssetList API must be queried to find the container using the given item_id to determine the correct location of the Blueprint.
     */
    @JsonProperty("location_id")
    public long getLocationId() {
        return locationId;
    }
    private int materialEfficiency;
    /**
     * Material Efficiency Level of the blueprint.
     */
    public void setMaterialEfficiency(int val) {
        materialEfficiency = val;
    }
    /**
     * Material Efficiency Level of the blueprint.
     */
    @JsonProperty("material_efficiency")
    public int getMaterialEfficiency() {
        return materialEfficiency;
    }
    private int quantity;
    /**
     * A range of numbers with a minimum of -2 and no maximum value where -1 is an original and -2 is a copy. It can be a positive integer if it is a stack of blueprint originals fresh from the market (e.g. no activities performed on them yet).
     */
    public void setQuantity(int val) {
        quantity = val;
    }
    /**
     * A range of numbers with a minimum of -2 and no maximum value where -1 is an original and -2 is a copy. It can be a positive integer if it is a stack of blueprint originals fresh from the market (e.g. no activities performed on them yet).
     */
    @JsonProperty("quantity")
    public int getQuantity() {
        return quantity;
    }
    private int runs;
    /**
     * Number of runs remaining if the blueprint is a copy, -1 if it is an original.
     */
    public void setRuns(int val) {
        runs = val;
    }
    /**
     * Number of runs remaining if the blueprint is a copy, -1 if it is an original.
     */
    @JsonProperty("runs")
    public int getRuns() {
        return runs;
    }
    private int timeEfficiency;
    /**
     * Time Efficiency Level of the blueprint.
     */
    public void setTimeEfficiency(int val) {
        timeEfficiency = val;
    }
    /**
     * Time Efficiency Level of the blueprint.
     */
    @JsonProperty("time_efficiency")
    public int getTimeEfficiency() {
        return timeEfficiency;
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
    public static enum LocationFlagEnum {
        AUTOFIT("AutoFit"),
        CARGO("Cargo"),
        CORPSEBAY("CorpseBay"),
        DRONEBAY("DroneBay"),
        FLEETHANGAR("FleetHangar"),
        DELIVERIES("Deliveries"),
        HIDDENMODIFIERS("HiddenModifiers"),
        HANGAR("Hangar"),
        HANGARALL("HangarAll"),
        LOSLOT0("LoSlot0"),
        LOSLOT1("LoSlot1"),
        LOSLOT2("LoSlot2"),
        LOSLOT3("LoSlot3"),
        LOSLOT4("LoSlot4"),
        LOSLOT5("LoSlot5"),
        LOSLOT6("LoSlot6"),
        LOSLOT7("LoSlot7"),
        MEDSLOT0("MedSlot0"),
        MEDSLOT1("MedSlot1"),
        MEDSLOT2("MedSlot2"),
        MEDSLOT3("MedSlot3"),
        MEDSLOT4("MedSlot4"),
        MEDSLOT5("MedSlot5"),
        MEDSLOT6("MedSlot6"),
        MEDSLOT7("MedSlot7"),
        HISLOT0("HiSlot0"),
        HISLOT1("HiSlot1"),
        HISLOT2("HiSlot2"),
        HISLOT3("HiSlot3"),
        HISLOT4("HiSlot4"),
        HISLOT5("HiSlot5"),
        HISLOT6("HiSlot6"),
        HISLOT7("HiSlot7"),
        ASSETSAFETY("AssetSafety"),
        LOCKED("Locked"),
        UNLOCKED("Unlocked"),
        IMPLANT("Implant"),
        QUAFEBAY("QuafeBay"),
        RIGSLOT0("RigSlot0"),
        RIGSLOT1("RigSlot1"),
        RIGSLOT2("RigSlot2"),
        RIGSLOT3("RigSlot3"),
        RIGSLOT4("RigSlot4"),
        RIGSLOT5("RigSlot5"),
        RIGSLOT6("RigSlot6"),
        RIGSLOT7("RigSlot7"),
        SHIPHANGAR("ShipHangar"),
        SPECIALIZEDFUELBAY("SpecializedFuelBay"),
        SPECIALIZEDOREHOLD("SpecializedOreHold"),
        SPECIALIZEDGASHOLD("SpecializedGasHold"),
        SPECIALIZEDMINERALHOLD("SpecializedMineralHold"),
        SPECIALIZEDSALVAGEHOLD("SpecializedSalvageHold"),
        SPECIALIZEDSHIPHOLD("SpecializedShipHold"),
        SPECIALIZEDSMALLSHIPHOLD("SpecializedSmallShipHold"),
        SPECIALIZEDMEDIUMSHIPHOLD("SpecializedMediumShipHold"),
        SPECIALIZEDLARGESHIPHOLD("SpecializedLargeShipHold"),
        SPECIALIZEDINDUSTRIALSHIPHOLD("SpecializedIndustrialShipHold"),
        SPECIALIZEDAMMOHOLD("SpecializedAmmoHold"),
        SPECIALIZEDCOMMANDCENTERHOLD("SpecializedCommandCenterHold"),
        SPECIALIZEDPLANETARYCOMMODITIESHOLD("SpecializedPlanetaryCommoditiesHold"),
        SPECIALIZEDMATERIALBAY("SpecializedMaterialBay"),
        SUBSYSTEMSLOT0("SubSystemSlot0"),
        SUBSYSTEMSLOT1("SubSystemSlot1"),
        SUBSYSTEMSLOT2("SubSystemSlot2"),
        SUBSYSTEMSLOT3("SubSystemSlot3"),
        SUBSYSTEMSLOT4("SubSystemSlot4"),
        SUBSYSTEMSLOT5("SubSystemSlot5"),
        SUBSYSTEMSLOT6("SubSystemSlot6"),
        SUBSYSTEMSLOT7("SubSystemSlot7"),
        FIGHTERBAY("FighterBay"),
        FIGHTERTUBE0("FighterTube0"),
        FIGHTERTUBE1("FighterTube1"),
        FIGHTERTUBE2("FighterTube2"),
        FIGHTERTUBE3("FighterTube3"),
        FIGHTERTUBE4("FighterTube4"),
        MODULE("Module");
        private final String stringValue;
        private LocationFlagEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
        @JsonCreator
        public static LocationFlagEnum fromString(String str) {
            for (LocationFlagEnum self : LocationFlagEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
}
