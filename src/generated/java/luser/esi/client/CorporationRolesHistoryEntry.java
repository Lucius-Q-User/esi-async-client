package luser.esi.client;

import java.time.Instant;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

public class CorporationRolesHistoryEntry {
    private Instant changedAt;
    /**
     * changed_at string
     */
    public void setChangedAt(Instant val) {
        changedAt = val;
    }
    /**
     * changed_at string
     */
    @JsonProperty("changed_at")
    public Instant getChangedAt() {
        return changedAt;
    }
    private int characterId;
    /**
     * The character whose roles are changed
     */
    public void setCharacterId(int val) {
        characterId = val;
    }
    /**
     * The character whose roles are changed
     */
    @JsonProperty("character_id")
    public int getCharacterId() {
        return characterId;
    }
    private int issuerId;
    /**
     * ID of the character who issued this change
     */
    public void setIssuerId(int val) {
        issuerId = val;
    }
    /**
     * ID of the character who issued this change
     */
    @JsonProperty("issuer_id")
    public int getIssuerId() {
        return issuerId;
    }
    private List<CorporationRolesEnum> newRoles;
    /**
     * new_roles array
     */
    public void setNewRoles(List<CorporationRolesEnum> val) {
        newRoles = val;
    }
    /**
     * new_roles array
     */
    @JsonProperty("new_roles")
    public List<CorporationRolesEnum> getNewRoles() {
        return newRoles;
    }
    private List<CorporationRolesEnum> oldRoles;
    /**
     * old_roles array
     */
    public void setOldRoles(List<CorporationRolesEnum> val) {
        oldRoles = val;
    }
    /**
     * old_roles array
     */
    @JsonProperty("old_roles")
    public List<CorporationRolesEnum> getOldRoles() {
        return oldRoles;
    }
    private RoleTypeEnum roleType;
    /**
     * role_type string
     */
    public void setRoleType(RoleTypeEnum val) {
        roleType = val;
    }
    /**
     * role_type string
     */
    @JsonProperty("role_type")
    public RoleTypeEnum getRoleType() {
        return roleType;
    }
    public static enum RoleTypeEnum implements StringyEnum{
        GRANTABLE_ROLES("grantable_roles"),
        GRANTABLE_ROLES_AT_BASE("grantable_roles_at_base"),
        GRANTABLE_ROLES_AT_HQ("grantable_roles_at_hq"),
        GRANTABLE_ROLES_AT_OTHER("grantable_roles_at_other"),
        ROLES("roles"),
        ROLES_AT_BASE("roles_at_base"),
        ROLES_AT_HQ("roles_at_hq"),
        ROLES_AT_OTHER("roles_at_other");
        private final String stringValue;
        private RoleTypeEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @Override
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
    }
}
