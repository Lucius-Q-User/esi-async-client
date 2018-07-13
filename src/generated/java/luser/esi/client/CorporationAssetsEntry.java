package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CorporationAssetsEntry implements ApiParameterObject {
    private Boolean isBlueprintCopy;
    /**
     * is_blueprint_copy boolean
     */
    public void setIsBlueprintCopy(Boolean val) {
        isBlueprintCopy = val;
    }
    /**
     * is_blueprint_copy boolean
     */
    @JsonProperty("is_blueprint_copy")
    public Boolean getIsBlueprintCopy() {
        return isBlueprintCopy;
    }
    private boolean isSingleton;
    /**
     * is_singleton boolean
     */
    public void setIsSingleton(boolean val) {
        isSingleton = val;
    }
    /**
     * is_singleton boolean
     */
    @JsonProperty("is_singleton")
    public boolean getIsSingleton() {
        return isSingleton;
    }
    private long itemId;
    /**
     * item_id integer
     */
    public void setItemId(long val) {
        itemId = val;
    }
    /**
     * item_id integer
     */
    @JsonProperty("item_id")
    public long getItemId() {
        return itemId;
    }
    private LocationFlagEnum locationFlag;
    /**
     * location_flag string
     */
    public void setLocationFlag(LocationFlagEnum val) {
        locationFlag = val;
    }
    /**
     * location_flag string
     */
    @JsonProperty("location_flag")
    public LocationFlagEnum getLocationFlag() {
        return locationFlag;
    }
    private long locationId;
    /**
     * location_id integer
     */
    public void setLocationId(long val) {
        locationId = val;
    }
    /**
     * location_id integer
     */
    @JsonProperty("location_id")
    public long getLocationId() {
        return locationId;
    }
    private LocationTypeEnum locationType;
    /**
     * location_type string
     */
    public void setLocationType(LocationTypeEnum val) {
        locationType = val;
    }
    /**
     * location_type string
     */
    @JsonProperty("location_type")
    public LocationTypeEnum getLocationType() {
        return locationType;
    }
    private int quantity;
    /**
     * quantity integer
     */
    public void setQuantity(int val) {
        quantity = val;
    }
    /**
     * quantity integer
     */
    @JsonProperty("quantity")
    public int getQuantity() {
        return quantity;
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
        ASSETSAFETY("AssetSafety"),
        AUTOFIT("AutoFit"),
        BONUS("Bonus"),
        BOOSTER("Booster"),
        BOOSTERBAY("BoosterBay"),
        CAPSULE("Capsule"),
        CARGO("Cargo"),
        CORPDELIVERIES("CorpDeliveries"),
        CORPSAG1("CorpSAG1"),
        CORPSAG2("CorpSAG2"),
        CORPSAG3("CorpSAG3"),
        CORPSAG4("CorpSAG4"),
        CORPSAG5("CorpSAG5"),
        CORPSAG6("CorpSAG6"),
        CORPSAG7("CorpSAG7"),
        CRATELOOT("CrateLoot"),
        DELIVERIES("Deliveries"),
        DRONEBAY("DroneBay"),
        DUSTBATTLE("DustBattle"),
        DUSTDATABANK("DustDatabank"),
        FIGHTERBAY("FighterBay"),
        FIGHTERTUBE0("FighterTube0"),
        FIGHTERTUBE1("FighterTube1"),
        FIGHTERTUBE2("FighterTube2"),
        FIGHTERTUBE3("FighterTube3"),
        FIGHTERTUBE4("FighterTube4"),
        FLEETHANGAR("FleetHangar"),
        HANGAR("Hangar"),
        HANGARALL("HangarAll"),
        HISLOT0("HiSlot0"),
        HISLOT1("HiSlot1"),
        HISLOT2("HiSlot2"),
        HISLOT3("HiSlot3"),
        HISLOT4("HiSlot4"),
        HISLOT5("HiSlot5"),
        HISLOT6("HiSlot6"),
        HISLOT7("HiSlot7"),
        HIDDENMODIFIERS("HiddenModifiers"),
        IMPLANT("Implant"),
        IMPOUNDED("Impounded"),
        JUNKYARDREPROCESSED("JunkyardReprocessed"),
        JUNKYARDTRASHED("JunkyardTrashed"),
        LOSLOT0("LoSlot0"),
        LOSLOT1("LoSlot1"),
        LOSLOT2("LoSlot2"),
        LOSLOT3("LoSlot3"),
        LOSLOT4("LoSlot4"),
        LOSLOT5("LoSlot5"),
        LOSLOT6("LoSlot6"),
        LOSLOT7("LoSlot7"),
        LOCKED("Locked"),
        MEDSLOT0("MedSlot0"),
        MEDSLOT1("MedSlot1"),
        MEDSLOT2("MedSlot2"),
        MEDSLOT3("MedSlot3"),
        MEDSLOT4("MedSlot4"),
        MEDSLOT5("MedSlot5"),
        MEDSLOT6("MedSlot6"),
        MEDSLOT7("MedSlot7"),
        OFFICEFOLDER("OfficeFolder"),
        PILOT("Pilot"),
        PLANETSURFACE("PlanetSurface"),
        QUAFEBAY("QuafeBay"),
        REWARD("Reward"),
        RIGSLOT0("RigSlot0"),
        RIGSLOT1("RigSlot1"),
        RIGSLOT2("RigSlot2"),
        RIGSLOT3("RigSlot3"),
        RIGSLOT4("RigSlot4"),
        RIGSLOT5("RigSlot5"),
        RIGSLOT6("RigSlot6"),
        RIGSLOT7("RigSlot7"),
        SECONDARYSTORAGE("SecondaryStorage"),
        SERVICESLOT0("ServiceSlot0"),
        SERVICESLOT1("ServiceSlot1"),
        SERVICESLOT2("ServiceSlot2"),
        SERVICESLOT3("ServiceSlot3"),
        SERVICESLOT4("ServiceSlot4"),
        SERVICESLOT5("ServiceSlot5"),
        SERVICESLOT6("ServiceSlot6"),
        SERVICESLOT7("ServiceSlot7"),
        SHIPHANGAR("ShipHangar"),
        SHIPOFFLINE("ShipOffline"),
        SKILL("Skill"),
        SKILLINTRAINING("SkillInTraining"),
        SPECIALIZEDAMMOHOLD("SpecializedAmmoHold"),
        SPECIALIZEDCOMMANDCENTERHOLD("SpecializedCommandCenterHold"),
        SPECIALIZEDFUELBAY("SpecializedFuelBay"),
        SPECIALIZEDGASHOLD("SpecializedGasHold"),
        SPECIALIZEDINDUSTRIALSHIPHOLD("SpecializedIndustrialShipHold"),
        SPECIALIZEDLARGESHIPHOLD("SpecializedLargeShipHold"),
        SPECIALIZEDMATERIALBAY("SpecializedMaterialBay"),
        SPECIALIZEDMEDIUMSHIPHOLD("SpecializedMediumShipHold"),
        SPECIALIZEDMINERALHOLD("SpecializedMineralHold"),
        SPECIALIZEDOREHOLD("SpecializedOreHold"),
        SPECIALIZEDPLANETARYCOMMODITIESHOLD("SpecializedPlanetaryCommoditiesHold"),
        SPECIALIZEDSALVAGEHOLD("SpecializedSalvageHold"),
        SPECIALIZEDSHIPHOLD("SpecializedShipHold"),
        SPECIALIZEDSMALLSHIPHOLD("SpecializedSmallShipHold"),
        STRUCTUREACTIVE("StructureActive"),
        STRUCTUREFUEL("StructureFuel"),
        STRUCTUREINACTIVE("StructureInactive"),
        STRUCTUREOFFLINE("StructureOffline"),
        SUBSYSTEMBAY("SubSystemBay"),
        SUBSYSTEMSLOT0("SubSystemSlot0"),
        SUBSYSTEMSLOT1("SubSystemSlot1"),
        SUBSYSTEMSLOT2("SubSystemSlot2"),
        SUBSYSTEMSLOT3("SubSystemSlot3"),
        SUBSYSTEMSLOT4("SubSystemSlot4"),
        SUBSYSTEMSLOT5("SubSystemSlot5"),
        SUBSYSTEMSLOT6("SubSystemSlot6"),
        SUBSYSTEMSLOT7("SubSystemSlot7"),
        UNLOCKED("Unlocked"),
        WALLET("Wallet"),
        WARDROBE("Wardrobe");
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
    public static enum LocationTypeEnum {
        STATION("station"),
        SOLAR_SYSTEM("solar_system"),
        OTHER("other");
        private final String stringValue;
        private LocationTypeEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
        @JsonCreator
        public static LocationTypeEnum fromString(String str) {
            for (LocationTypeEnum self : LocationTypeEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
}
