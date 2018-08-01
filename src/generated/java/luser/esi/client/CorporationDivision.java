package luser.esi.client;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CorporationDivision {
    private List<DivisionInfo> hangar;
    /**
     * hangar array
     */
    public void setHangar(List<DivisionInfo> val) {
        hangar = val;
    }
    /**
     * hangar array
     */
    @JsonProperty("hangar")
    public List<DivisionInfo> getHangar() {
        return hangar;
    }
    private List<DivisionInfo> wallet;
    /**
     * wallet array
     */
    public void setWallet(List<DivisionInfo> val) {
        wallet = val;
    }
    /**
     * wallet array
     */
    @JsonProperty("wallet")
    public List<DivisionInfo> getWallet() {
        return wallet;
    }
}
