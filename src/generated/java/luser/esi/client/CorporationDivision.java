package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CorporationDivision implements ApiParameterObject {
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
