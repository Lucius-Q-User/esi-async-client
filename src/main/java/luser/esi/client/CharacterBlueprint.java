package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class CharacterBlueprint {
    private long itemId;
    public void setItemId(long val) {
        itemId = val;
    }
    public long getItemId() {
        return itemId;
    }
    private LocationFlagEnum locationFlag;
    public void setLocationFlag(LocationFlagEnum val) {
        locationFlag = val;
    }
    public LocationFlagEnum getLocationFlag() {
        return locationFlag;
    }
    private long locationId;
    public void setLocationId(long val) {
        locationId = val;
    }
    public long getLocationId() {
        return locationId;
    }
    private int materialEfficiency;
    public void setMaterialEfficiency(int val) {
        materialEfficiency = val;
    }
    public int getMaterialEfficiency() {
        return materialEfficiency;
    }
    private int quantity;
    public void setQuantity(int val) {
        quantity = val;
    }
    public int getQuantity() {
        return quantity;
    }
    private int runs;
    public void setRuns(int val) {
        runs = val;
    }
    public int getRuns() {
        return runs;
    }
    private int timeEfficiency;
    public void setTimeEfficiency(int val) {
        timeEfficiency = val;
    }
    public int getTimeEfficiency() {
        return timeEfficiency;
    }
    private int typeId;
    public void setTypeId(int val) {
        typeId = val;
    }
    public int getTypeId() {
        return typeId;
    }
    static CharacterBlueprint fromJson(Json json) {
        if (json == null) {
            return null;
        }
        CharacterBlueprint self = new CharacterBlueprint();
        Map<String, Json> js = json.asJsonMap();
        self.itemId = ApiClientBase.optGetLong(js.get("item_id"));
        self.locationFlag = LocationFlagEnum.fromString(ApiClientBase.optGetString(js.get("location_flag")));
        self.locationId = ApiClientBase.optGetLong(js.get("location_id"));
        self.materialEfficiency = ApiClientBase.optGetInteger(js.get("material_efficiency"));
        self.quantity = ApiClientBase.optGetInteger(js.get("quantity"));
        self.runs = ApiClientBase.optGetInteger(js.get("runs"));
        self.timeEfficiency = ApiClientBase.optGetInteger(js.get("time_efficiency"));
        self.typeId = ApiClientBase.optGetInteger(js.get("type_id"));
        return self;
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
        public final String stringValue;
        private LocationFlagEnum(String stringValue) {
            this.stringValue = stringValue;
        }
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
