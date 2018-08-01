package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WarAllyInfo {
    private Integer allianceId;
    /**
     * Alliance ID if and only if this ally is an alliance
     */
    public void setAllianceId(Integer val) {
        allianceId = val;
    }
    /**
     * Alliance ID if and only if this ally is an alliance
     */
    @JsonProperty("alliance_id")
    public Integer getAllianceId() {
        return allianceId;
    }
    private Integer corporationId;
    /**
     * Corporation ID if and only if this ally is a corporation
     */
    public void setCorporationId(Integer val) {
        corporationId = val;
    }
    /**
     * Corporation ID if and only if this ally is a corporation
     */
    @JsonProperty("corporation_id")
    public Integer getCorporationId() {
        return corporationId;
    }
}
