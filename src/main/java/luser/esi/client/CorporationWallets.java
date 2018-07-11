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
    public void setBalance(double val) {
        balance = val;
    }
    @JsonProperty("balance")
    public double getBalance() {
        return balance;
    }
    private int division;
    public void setDivision(int val) {
        division = val;
    }
    @JsonProperty("division")
    public int getDivision() {
        return division;
    }
}
