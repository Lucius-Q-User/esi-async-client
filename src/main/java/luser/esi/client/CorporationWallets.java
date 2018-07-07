package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class CorporationWallets {
    private double balance;
    public void setBalance(double val) {
        balance = val;
    }
    public double getBalance() {
        return balance;
    }
    private int division;
    public void setDivision(int val) {
        division = val;
    }
    public int getDivision() {
        return division;
    }
    static CorporationWallets fromJson(Json json) {
        if (json == null) {
            return null;
        }
        CorporationWallets self = new CorporationWallets();
        Map<String, Json> js = json.asJsonMap();
        self.balance = ApiClientBase.optGetDouble(js.get("balance"));
        self.division = ApiClientBase.optGetInteger(js.get("division"));
        return self;
    }
}
