package luser.esi.client;

import java.time.Instant;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ContainerLogEntry {
    private ActionEnum action;
    /**
     * action string
     */
    public void setAction(ActionEnum val) {
        action = val;
    }
    /**
     * action string
     */
    @JsonProperty("action")
    public ActionEnum getAction() {
        return action;
    }
    private int characterId;
    /**
     * ID of the character who performed the action.
     */
    public void setCharacterId(int val) {
        characterId = val;
    }
    /**
     * ID of the character who performed the action.
     */
    @JsonProperty("character_id")
    public int getCharacterId() {
        return characterId;
    }
    private long containerId;
    /**
     * ID of the container
     */
    public void setContainerId(long val) {
        containerId = val;
    }
    /**
     * ID of the container
     */
    @JsonProperty("container_id")
    public long getContainerId() {
        return containerId;
    }
    private int containerTypeId;
    /**
     * Type ID of the container
     */
    public void setContainerTypeId(int val) {
        containerTypeId = val;
    }
    /**
     * Type ID of the container
     */
    @JsonProperty("container_type_id")
    public int getContainerTypeId() {
        return containerTypeId;
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
    private Instant loggedAt;
    /**
     * Timestamp when this log was created
     */
    public void setLoggedAt(Instant val) {
        loggedAt = val;
    }
    /**
     * Timestamp when this log was created
     */
    @JsonProperty("logged_at")
    public Instant getLoggedAt() {
        return loggedAt;
    }
    private Integer newConfigBitmask;
    /**
     * new_config_bitmask integer
     */
    public void setNewConfigBitmask(Integer val) {
        newConfigBitmask = val;
    }
    /**
     * new_config_bitmask integer
     */
    @JsonProperty("new_config_bitmask")
    public Integer getNewConfigBitmask() {
        return newConfigBitmask;
    }
    private Integer oldConfigBitmask;
    /**
     * old_config_bitmask integer
     */
    public void setOldConfigBitmask(Integer val) {
        oldConfigBitmask = val;
    }
    /**
     * old_config_bitmask integer
     */
    @JsonProperty("old_config_bitmask")
    public Integer getOldConfigBitmask() {
        return oldConfigBitmask;
    }
    private PasswordTypeEnum passwordType;
    /**
     * Type of password set if action is of type SetPassword or EnterPassword
     */
    public void setPasswordType(PasswordTypeEnum val) {
        passwordType = val;
    }
    /**
     * Type of password set if action is of type SetPassword or EnterPassword
     */
    @JsonProperty("password_type")
    public PasswordTypeEnum getPasswordType() {
        return passwordType;
    }
    private Integer quantity;
    /**
     * Quantity of the item being acted upon
     */
    public void setQuantity(Integer val) {
        quantity = val;
    }
    /**
     * Quantity of the item being acted upon
     */
    @JsonProperty("quantity")
    public Integer getQuantity() {
        return quantity;
    }
    private Integer typeId;
    /**
     * Type ID of the item being acted upon
     */
    public void setTypeId(Integer val) {
        typeId = val;
    }
    /**
     * Type ID of the item being acted upon
     */
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
        @Override
        public String toString() {
            return stringValue;
        }
    }
    public static enum PasswordTypeEnum {
        CONFIG("config"),
        GENERAL("general");
        private final String stringValue;
        private PasswordTypeEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @Override
        public String toString() {
            return stringValue;
        }
    }
}
