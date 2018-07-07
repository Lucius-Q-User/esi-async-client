package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class CorporationTitles {
    private List<GrantableRolesEnum> grantableRoles;
    public void setGrantableRoles(List<GrantableRolesEnum> val) {
        grantableRoles = val;
    }
    public List<GrantableRolesEnum> getGrantableRoles() {
        return grantableRoles;
    }
    private List<GrantableRolesAtBaseEnum> grantableRolesAtBase;
    public void setGrantableRolesAtBase(List<GrantableRolesAtBaseEnum> val) {
        grantableRolesAtBase = val;
    }
    public List<GrantableRolesAtBaseEnum> getGrantableRolesAtBase() {
        return grantableRolesAtBase;
    }
    private List<GrantableRolesAtHqEnum> grantableRolesAtHq;
    public void setGrantableRolesAtHq(List<GrantableRolesAtHqEnum> val) {
        grantableRolesAtHq = val;
    }
    public List<GrantableRolesAtHqEnum> getGrantableRolesAtHq() {
        return grantableRolesAtHq;
    }
    private List<GrantableRolesAtOtherEnum> grantableRolesAtOther;
    public void setGrantableRolesAtOther(List<GrantableRolesAtOtherEnum> val) {
        grantableRolesAtOther = val;
    }
    public List<GrantableRolesAtOtherEnum> getGrantableRolesAtOther() {
        return grantableRolesAtOther;
    }
    private String name;
    public void setName(String val) {
        name = val;
    }
    public String getName() {
        return name;
    }
    private List<RolesEnum> roles;
    public void setRoles(List<RolesEnum> val) {
        roles = val;
    }
    public List<RolesEnum> getRoles() {
        return roles;
    }
    private List<RolesAtBaseEnum> rolesAtBase;
    public void setRolesAtBase(List<RolesAtBaseEnum> val) {
        rolesAtBase = val;
    }
    public List<RolesAtBaseEnum> getRolesAtBase() {
        return rolesAtBase;
    }
    private List<RolesAtHqEnum> rolesAtHq;
    public void setRolesAtHq(List<RolesAtHqEnum> val) {
        rolesAtHq = val;
    }
    public List<RolesAtHqEnum> getRolesAtHq() {
        return rolesAtHq;
    }
    private List<RolesAtOtherEnum> rolesAtOther;
    public void setRolesAtOther(List<RolesAtOtherEnum> val) {
        rolesAtOther = val;
    }
    public List<RolesAtOtherEnum> getRolesAtOther() {
        return rolesAtOther;
    }
    private Integer titleId;
    public void setTitleId(Integer val) {
        titleId = val;
    }
    public Integer getTitleId() {
        return titleId;
    }
    static CorporationTitles fromJson(Json json) {
        if (json == null) {
            return null;
        }
        CorporationTitles self = new CorporationTitles();
        Map<String, Json> js = json.asJsonMap();
        {
            List<Json> jl = js.get("grantable_roles").asJsonList();
            List<GrantableRolesEnum> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.set(i, GrantableRolesEnum.fromString(jl.get(i).asString()));
            }
            self.grantableRoles = rt;
        }
        {
            List<Json> jl = js.get("grantable_roles_at_base").asJsonList();
            List<GrantableRolesAtBaseEnum> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.set(i, GrantableRolesAtBaseEnum.fromString(jl.get(i).asString()));
            }
            self.grantableRolesAtBase = rt;
        }
        {
            List<Json> jl = js.get("grantable_roles_at_hq").asJsonList();
            List<GrantableRolesAtHqEnum> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.set(i, GrantableRolesAtHqEnum.fromString(jl.get(i).asString()));
            }
            self.grantableRolesAtHq = rt;
        }
        {
            List<Json> jl = js.get("grantable_roles_at_other").asJsonList();
            List<GrantableRolesAtOtherEnum> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.set(i, GrantableRolesAtOtherEnum.fromString(jl.get(i).asString()));
            }
            self.grantableRolesAtOther = rt;
        }
        self.name = ApiClientBase.optGetString(js.get("name"));
        {
            List<Json> jl = js.get("roles").asJsonList();
            List<RolesEnum> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.set(i, RolesEnum.fromString(jl.get(i).asString()));
            }
            self.roles = rt;
        }
        {
            List<Json> jl = js.get("roles_at_base").asJsonList();
            List<RolesAtBaseEnum> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.set(i, RolesAtBaseEnum.fromString(jl.get(i).asString()));
            }
            self.rolesAtBase = rt;
        }
        {
            List<Json> jl = js.get("roles_at_hq").asJsonList();
            List<RolesAtHqEnum> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.set(i, RolesAtHqEnum.fromString(jl.get(i).asString()));
            }
            self.rolesAtHq = rt;
        }
        {
            List<Json> jl = js.get("roles_at_other").asJsonList();
            List<RolesAtOtherEnum> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.set(i, RolesAtOtherEnum.fromString(jl.get(i).asString()));
            }
            self.rolesAtOther = rt;
        }
        self.titleId = ApiClientBase.optGetInteger(js.get("title_id"));
        return self;
    }
    public static enum GrantableRolesEnum {
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
        private GrantableRolesEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        public static GrantableRolesEnum fromString(String str) {
            for (GrantableRolesEnum self : GrantableRolesEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
    public static enum GrantableRolesAtBaseEnum {
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
        private GrantableRolesAtBaseEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        public static GrantableRolesAtBaseEnum fromString(String str) {
            for (GrantableRolesAtBaseEnum self : GrantableRolesAtBaseEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
    public static enum GrantableRolesAtHqEnum {
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
        private GrantableRolesAtHqEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        public static GrantableRolesAtHqEnum fromString(String str) {
            for (GrantableRolesAtHqEnum self : GrantableRolesAtHqEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
    public static enum GrantableRolesAtOtherEnum {
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
        private GrantableRolesAtOtherEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        public static GrantableRolesAtOtherEnum fromString(String str) {
            for (GrantableRolesAtOtherEnum self : GrantableRolesAtOtherEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
    public static enum RolesEnum {
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
        private RolesEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        public static RolesEnum fromString(String str) {
            for (RolesEnum self : RolesEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
    public static enum RolesAtBaseEnum {
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
        private RolesAtBaseEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        public static RolesAtBaseEnum fromString(String str) {
            for (RolesAtBaseEnum self : RolesAtBaseEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
    public static enum RolesAtHqEnum {
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
        private RolesAtHqEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        public static RolesAtHqEnum fromString(String str) {
            for (RolesAtHqEnum self : RolesAtHqEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
    public static enum RolesAtOtherEnum {
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
        private RolesAtOtherEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        public static RolesAtOtherEnum fromString(String str) {
            for (RolesAtOtherEnum self : RolesAtOtherEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
}
