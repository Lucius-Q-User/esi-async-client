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
    public void setHangar(List<DivisionInfo> val) {
        hangar = val;
    }
    @JsonProperty("hangar")
    public List<DivisionInfo> getHangar() {
        return hangar;
    }
    private List<DivisionInfo> wallet;
    public void setWallet(List<DivisionInfo> val) {
        wallet = val;
    }
    @JsonProperty("wallet")
    public List<DivisionInfo> getWallet() {
        return wallet;
    }
}
