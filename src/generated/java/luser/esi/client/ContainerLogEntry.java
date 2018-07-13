package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class ContainerLogEntry implements ApiParameterObject {
    private ActionEnum action;
    public void setAction(ActionEnum val) {
        action = val;
    }
    @JsonProperty("action")
    public ActionEnum getAction() {
        return action;
    }
    private int characterId;
    public void setCharacterId(int val) {
        characterId = val;
    }
    @JsonProperty("character_id")
    public int getCharacterId() {
        return characterId;
    }
    private long containerId;
    public void setContainerId(long val) {
        containerId = val;
    }
    @JsonProperty("container_id")
    public long getContainerId() {
        return containerId;
    }
    private int containerTypeId;
    public void setContainerTypeId(int val) {
        containerTypeId = val;
    }
    @JsonProperty("container_type_id")
    public int getContainerTypeId() {
        return containerTypeId;
    }
    private LocationFlagEnum locationFlag;
    public void setLocationFlag(LocationFlagEnum val) {
        locationFlag = val;
    }
    @JsonProperty("location_flag")
    public LocationFlagEnum getLocationFlag() {
        return locationFlag;
    }
    private long locationId;
    public void setLocationId(long val) {
        locationId = val;
    }
    @JsonProperty("location_id")
    public long getLocationId() {
        return locationId;
    }
    private Instant loggedAt;
    public void setLoggedAt(Instant val) {
        loggedAt = val;
    }
    @JsonProperty("logged_at")
    public Instant getLoggedAt() {
        return loggedAt;
    }
    private Integer newConfigBitmask;
    public void setNewConfigBitmask(Integer val) {
        newConfigBitmask = val;
    }
    @JsonProperty("new_config_bitmask")
    public Integer getNewConfigBitmask() {
        return newConfigBitmask;
    }
    private Integer oldConfigBitmask;
    public void setOldConfigBitmask(Integer val) {
        oldConfigBitmask = val;
    }
    @JsonProperty("old_config_bitmask")
    public Integer getOldConfigBitmask() {
        return oldConfigBitmask;
    }
    private PasswordTypeEnum passwordType;
    public void setPasswordType(PasswordTypeEnum val) {
        passwordType = val;
    }
    @JsonProperty("password_type")
    public PasswordTypeEnum getPasswordType() {
        return passwordType;
    }
    private Integer quantity;
    public void setQuantity(Integer val) {
        quantity = val;
    }
    @JsonProperty("quantity")
    public Integer getQuantity() {
        return quantity;
    }
    private Integer typeId;
    public void setTypeId(Integer val) {
        typeId = val;
    }
    @JsonProperty("type_id")
    public Integer getTypeId() {
        return typeId;
    }
    public static enum ActionEnum {
        ADD("add"),
        ASSEMBLE("assemble"),
        CONFIGURE("configure"),
        ENTER_PASSWORD("enter_password"),
        LOCK("lock"),
        MOVE("move"),
        REPACKAGE("repackage"),
        SET_NAME("set_name"),
        SET_PASSWORD("set_password"),
        UNLOCK("unlock");
        private final String stringValue;
        private ActionEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
        @JsonCreator
        public static ActionEnum fromString(String str) {
            for (ActionEnum self : ActionEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
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
    public static enum PasswordTypeEnum {
        CONFIG("config"),
        GENERAL("general");
        private final String stringValue;
        private PasswordTypeEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
        @JsonCreator
        public static PasswordTypeEnum fromString(String str) {
            for (PasswordTypeEnum self : PasswordTypeEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
}
