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
    private List<NewRolesEnum> newRoles;
    /**
     * new_roles array
     */
    public void setNewRoles(List<NewRolesEnum> val) {
        newRoles = val;
    }
    /**
     * new_roles array
     */
    @JsonProperty("new_roles")
    public List<NewRolesEnum> getNewRoles() {
        return newRoles;
    }
    private List<OldRolesEnum> oldRoles;
    /**
     * old_roles array
     */
    public void setOldRoles(List<OldRolesEnum> val) {
        oldRoles = val;
    }
    /**
     * old_roles array
     */
    @JsonProperty("old_roles")
    public List<OldRolesEnum> getOldRoles() {
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
    public static enum NewRolesEnum implements StringyEnum{
        ACCOUNT_TAKE_1("Account_Take_1"),
        ACCOUNT_TAKE_2("Account_Take_2"),
        ACCOUNT_TAKE_3("Account_Take_3"),
        ACCOUNT_TAKE_4("Account_Take_4"),
        ACCOUNT_TAKE_5("Account_Take_5"),
        ACCOUNT_TAKE_6("Account_Take_6"),
        ACCOUNT_TAKE_7("Account_Take_7"),
        ACCOUNTANT("Accountant"),
        AUDITOR("Auditor"),
        COMMUNICATIONS_OFFICER("Communications_Officer"),
        CONFIG_EQUIPMENT("Config_Equipment"),
        CONFIG_STARBASE_EQUIPMENT("Config_Starbase_Equipment"),
        CONTAINER_TAKE_1("Container_Take_1"),
        CONTAINER_TAKE_2("Container_Take_2"),
        CONTAINER_TAKE_3("Container_Take_3"),
        CONTAINER_TAKE_4("Container_Take_4"),
        CONTAINER_TAKE_5("Container_Take_5"),
        CONTAINER_TAKE_6("Container_Take_6"),
        CONTAINER_TAKE_7("Container_Take_7"),
        CONTRACT_MANAGER("Contract_Manager"),
        DIPLOMAT("Diplomat"),
        DIRECTOR("Director"),
        FACTORY_MANAGER("Factory_Manager"),
        FITTING_MANAGER("Fitting_Manager"),
        HANGAR_QUERY_1("Hangar_Query_1"),
        HANGAR_QUERY_2("Hangar_Query_2"),
        HANGAR_QUERY_3("Hangar_Query_3"),
        HANGAR_QUERY_4("Hangar_Query_4"),
        HANGAR_QUERY_5("Hangar_Query_5"),
        HANGAR_QUERY_6("Hangar_Query_6"),
        HANGAR_QUERY_7("Hangar_Query_7"),
        HANGAR_TAKE_1("Hangar_Take_1"),
        HANGAR_TAKE_2("Hangar_Take_2"),
        HANGAR_TAKE_3("Hangar_Take_3"),
        HANGAR_TAKE_4("Hangar_Take_4"),
        HANGAR_TAKE_5("Hangar_Take_5"),
        HANGAR_TAKE_6("Hangar_Take_6"),
        HANGAR_TAKE_7("Hangar_Take_7"),
        JUNIOR_ACCOUNTANT("Junior_Accountant"),
        PERSONNEL_MANAGER("Personnel_Manager"),
        RENT_FACTORY_FACILITY("Rent_Factory_Facility"),
        RENT_OFFICE("Rent_Office"),
        RENT_RESEARCH_FACILITY("Rent_Research_Facility"),
        SECURITY_OFFICER("Security_Officer"),
        STARBASE_DEFENSE_OPERATOR("Starbase_Defense_Operator"),
        STARBASE_FUEL_TECHNICIAN("Starbase_Fuel_Technician"),
        STATION_MANAGER("Station_Manager"),
        TERRESTRIAL_COMBAT_OFFICER("Terrestrial_Combat_Officer"),
        TERRESTRIAL_LOGISTICS_OFFICER("Terrestrial_Logistics_Officer"),
        TRADER("Trader");
        private final String stringValue;
        private NewRolesEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @Override
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
    }
    public static enum OldRolesEnum implements StringyEnum{
        ACCOUNT_TAKE_1("Account_Take_1"),
        ACCOUNT_TAKE_2("Account_Take_2"),
        ACCOUNT_TAKE_3("Account_Take_3"),
        ACCOUNT_TAKE_4("Account_Take_4"),
        ACCOUNT_TAKE_5("Account_Take_5"),
        ACCOUNT_TAKE_6("Account_Take_6"),
        ACCOUNT_TAKE_7("Account_Take_7"),
        ACCOUNTANT("Accountant"),
        AUDITOR("Auditor"),
        COMMUNICATIONS_OFFICER("Communications_Officer"),
        CONFIG_EQUIPMENT("Config_Equipment"),
        CONFIG_STARBASE_EQUIPMENT("Config_Starbase_Equipment"),
        CONTAINER_TAKE_1("Container_Take_1"),
        CONTAINER_TAKE_2("Container_Take_2"),
        CONTAINER_TAKE_3("Container_Take_3"),
        CONTAINER_TAKE_4("Container_Take_4"),
        CONTAINER_TAKE_5("Container_Take_5"),
        CONTAINER_TAKE_6("Container_Take_6"),
        CONTAINER_TAKE_7("Container_Take_7"),
        CONTRACT_MANAGER("Contract_Manager"),
        DIPLOMAT("Diplomat"),
        DIRECTOR("Director"),
        FACTORY_MANAGER("Factory_Manager"),
        FITTING_MANAGER("Fitting_Manager"),
        HANGAR_QUERY_1("Hangar_Query_1"),
        HANGAR_QUERY_2("Hangar_Query_2"),
        HANGAR_QUERY_3("Hangar_Query_3"),
        HANGAR_QUERY_4("Hangar_Query_4"),
        HANGAR_QUERY_5("Hangar_Query_5"),
        HANGAR_QUERY_6("Hangar_Query_6"),
        HANGAR_QUERY_7("Hangar_Query_7"),
        HANGAR_TAKE_1("Hangar_Take_1"),
        HANGAR_TAKE_2("Hangar_Take_2"),
        HANGAR_TAKE_3("Hangar_Take_3"),
        HANGAR_TAKE_4("Hangar_Take_4"),
        HANGAR_TAKE_5("Hangar_Take_5"),
        HANGAR_TAKE_6("Hangar_Take_6"),
        HANGAR_TAKE_7("Hangar_Take_7"),
        JUNIOR_ACCOUNTANT("Junior_Accountant"),
        PERSONNEL_MANAGER("Personnel_Manager"),
        RENT_FACTORY_FACILITY("Rent_Factory_Facility"),
        RENT_OFFICE("Rent_Office"),
        RENT_RESEARCH_FACILITY("Rent_Research_Facility"),
        SECURITY_OFFICER("Security_Officer"),
        STARBASE_DEFENSE_OPERATOR("Starbase_Defense_Operator"),
        STARBASE_FUEL_TECHNICIAN("Starbase_Fuel_Technician"),
        STATION_MANAGER("Station_Manager"),
        TERRESTRIAL_COMBAT_OFFICER("Terrestrial_Combat_Officer"),
        TERRESTRIAL_LOGISTICS_OFFICER("Terrestrial_Logistics_Officer"),
        TRADER("Trader");
        private final String stringValue;
        private OldRolesEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @Override
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
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
