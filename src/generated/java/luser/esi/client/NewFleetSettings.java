package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NewFleetSettings implements ApiParameterObject {
    private Boolean isFreeMove;
    /**
     * Should free-move be enabled in the fleet
     */
    public void setIsFreeMove(Boolean val) {
        isFreeMove = val;
    }
    /**
     * Should free-move be enabled in the fleet
     */
    @JsonProperty("is_free_move")
    public Boolean getIsFreeMove() {
        return isFreeMove;
    }
    private String motd;
    /**
     * New fleet MOTD in CCP flavoured HTML
     */
    public void setMotd(String val) {
        motd = val;
    }
    /**
     * New fleet MOTD in CCP flavoured HTML
     */
    @JsonProperty("motd")
    public String getMotd() {
        return motd;
    }
}
