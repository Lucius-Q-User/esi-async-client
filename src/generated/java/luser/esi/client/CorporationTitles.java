package luser.esi.client;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CorporationTitles {
    private List<CorporationRolesEnum> grantableRoles;
    /**
     * grantable_roles array
     */
    public void setGrantableRoles(List<CorporationRolesEnum> val) {
        grantableRoles = val;
    }
    /**
     * grantable_roles array
     */
    @JsonProperty("grantable_roles")
    public List<CorporationRolesEnum> getGrantableRoles() {
        return grantableRoles;
    }
    private List<CorporationRolesEnum> grantableRolesAtBase;
    /**
     * grantable_roles_at_base array
     */
    public void setGrantableRolesAtBase(List<CorporationRolesEnum> val) {
        grantableRolesAtBase = val;
    }
    /**
     * grantable_roles_at_base array
     */
    @JsonProperty("grantable_roles_at_base")
    public List<CorporationRolesEnum> getGrantableRolesAtBase() {
        return grantableRolesAtBase;
    }
    private List<CorporationRolesEnum> grantableRolesAtHq;
    /**
     * grantable_roles_at_hq array
     */
    public void setGrantableRolesAtHq(List<CorporationRolesEnum> val) {
        grantableRolesAtHq = val;
    }
    /**
     * grantable_roles_at_hq array
     */
    @JsonProperty("grantable_roles_at_hq")
    public List<CorporationRolesEnum> getGrantableRolesAtHq() {
        return grantableRolesAtHq;
    }
    private List<CorporationRolesEnum> grantableRolesAtOther;
    /**
     * grantable_roles_at_other array
     */
    public void setGrantableRolesAtOther(List<CorporationRolesEnum> val) {
        grantableRolesAtOther = val;
    }
    /**
     * grantable_roles_at_other array
     */
    @JsonProperty("grantable_roles_at_other")
    public List<CorporationRolesEnum> getGrantableRolesAtOther() {
        return grantableRolesAtOther;
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
    private List<CorporationRolesEnum> roles;
    /**
     * roles array
     */
    public void setRoles(List<CorporationRolesEnum> val) {
        roles = val;
    }
    /**
     * roles array
     */
    @JsonProperty("roles")
    public List<CorporationRolesEnum> getRoles() {
        return roles;
    }
    private List<CorporationRolesEnum> rolesAtBase;
    /**
     * roles_at_base array
     */
    public void setRolesAtBase(List<CorporationRolesEnum> val) {
        rolesAtBase = val;
    }
    /**
     * roles_at_base array
     */
    @JsonProperty("roles_at_base")
    public List<CorporationRolesEnum> getRolesAtBase() {
        return rolesAtBase;
    }
    private List<CorporationRolesEnum> rolesAtHq;
    /**
     * roles_at_hq array
     */
    public void setRolesAtHq(List<CorporationRolesEnum> val) {
        rolesAtHq = val;
    }
    /**
     * roles_at_hq array
     */
    @JsonProperty("roles_at_hq")
    public List<CorporationRolesEnum> getRolesAtHq() {
        return rolesAtHq;
    }
    private List<CorporationRolesEnum> rolesAtOther;
    /**
     * roles_at_other array
     */
    public void setRolesAtOther(List<CorporationRolesEnum> val) {
        rolesAtOther = val;
    }
    /**
     * roles_at_other array
     */
    @JsonProperty("roles_at_other")
    public List<CorporationRolesEnum> getRolesAtOther() {
        return rolesAtOther;
    }
    private Integer titleId;
    /**
     * title_id integer
     */
    public void setTitleId(Integer val) {
        titleId = val;
    }
    /**
     * title_id integer
     */
    @JsonProperty("title_id")
    public Integer getTitleId() {
        return titleId;
    }
}
