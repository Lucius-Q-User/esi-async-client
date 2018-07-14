package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

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
