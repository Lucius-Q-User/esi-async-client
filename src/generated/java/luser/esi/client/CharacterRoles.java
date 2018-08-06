package luser.esi.client;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CharacterRoles {
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
}
