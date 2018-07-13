package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CorporationWallets implements ApiParameterObject {
    private double balance;
    /**
     * balance number
     */
    public void setBalance(double val) {
        balance = val;
    }
    /**
     * balance number
     */
    @JsonProperty("balance")
    public double getBalance() {
        return balance;
    }
    private int division;
    /**
     * division integer
     */
    public void setDivision(int val) {
        division = val;
    }
    /**
     * division integer
     */
    @JsonProperty("division")
    public int getDivision() {
        return division;
    }
}
