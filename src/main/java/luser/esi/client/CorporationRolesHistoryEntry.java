package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class CorporationRolesHistoryEntry {
    private Instant changedAt;
    public void setChangedAt(Instant val) {
        changedAt = val;
    }
    public Instant getChangedAt() {
        return changedAt;
    }
    private int characterId;
    public void setCharacterId(int val) {
        characterId = val;
    }
    public int getCharacterId() {
        return characterId;
    }
    private int issuerId;
    public void setIssuerId(int val) {
        issuerId = val;
    }
    public int getIssuerId() {
        return issuerId;
    }
    private List<NewRolesEnum> newRoles;
    public void setNewRoles(List<NewRolesEnum> val) {
        newRoles = val;
    }
    public List<NewRolesEnum> getNewRoles() {
        return newRoles;
    }
    private List<OldRolesEnum> oldRoles;
    public void setOldRoles(List<OldRolesEnum> val) {
        oldRoles = val;
    }
    public List<OldRolesEnum> getOldRoles() {
        return oldRoles;
    }
    private RoleTypeEnum roleType;
    public void setRoleType(RoleTypeEnum val) {
        roleType = val;
    }
    public RoleTypeEnum getRoleType() {
        return roleType;
    }
    static CorporationRolesHistoryEntry fromJson(Json json) {
        if (json == null) {
            return null;
        }
        CorporationRolesHistoryEntry self = new CorporationRolesHistoryEntry();
        Map<String, Json> js = json.asJsonMap();
        self.changedAt = ApiClientBase.optGetInstant(js.get("changed_at"));
        self.characterId = ApiClientBase.optGetInteger(js.get("character_id"));
        self.issuerId = ApiClientBase.optGetInteger(js.get("issuer_id"));
        {
            List<Json> jl = js.get("new_roles").asJsonList();
            List<NewRolesEnum> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.add(NewRolesEnum.fromString(jl.get(i).asString()));
            }
            self.newRoles = rt;
        }
        {
            List<Json> jl = js.get("old_roles").asJsonList();
            List<OldRolesEnum> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.add(OldRolesEnum.fromString(jl.get(i).asString()));
            }
            self.oldRoles = rt;
        }
        self.roleType = RoleTypeEnum.fromString(ApiClientBase.optGetString(js.get("role_type")));
        return self;
    }
    public static enum NewRolesEnum {
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
        public final String stringValue;
        private NewRolesEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        public static NewRolesEnum fromString(String str) {
            for (NewRolesEnum self : NewRolesEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
    public static enum OldRolesEnum {
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
        public final String stringValue;
        private OldRolesEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        public static OldRolesEnum fromString(String str) {
            for (OldRolesEnum self : OldRolesEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
    public static enum RoleTypeEnum {
        GRANTABLE_ROLES("grantable_roles"),
        GRANTABLE_ROLES_AT_BASE("grantable_roles_at_base"),
        GRANTABLE_ROLES_AT_HQ("grantable_roles_at_hq"),
        GRANTABLE_ROLES_AT_OTHER("grantable_roles_at_other"),
        ROLES("roles"),
        ROLES_AT_BASE("roles_at_base"),
        ROLES_AT_HQ("roles_at_hq"),
        ROLES_AT_OTHER("roles_at_other");
        public final String stringValue;
        private RoleTypeEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        public static RoleTypeEnum fromString(String str) {
            for (RoleTypeEnum self : RoleTypeEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
}
