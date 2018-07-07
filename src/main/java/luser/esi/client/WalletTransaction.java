package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class WalletTransaction {
    private int clientId;
    public void setClientId(int val) {
        clientId = val;
    }
    public int getClientId() {
        return clientId;
    }
    private String date;
    public void setDate(String val) {
        date = val;
    }
    public String getDate() {
        return date;
    }
    private boolean isBuy;
    public void setIsBuy(boolean val) {
        isBuy = val;
    }
    public boolean getIsBuy() {
        return isBuy;
    }
    private boolean isPersonal;
    public void setIsPersonal(boolean val) {
        isPersonal = val;
    }
    public boolean getIsPersonal() {
        return isPersonal;
    }
    private long journalRefId;
    public void setJournalRefId(long val) {
        journalRefId = val;
    }
    public long getJournalRefId() {
        return journalRefId;
    }
    private long locationId;
    public void setLocationId(long val) {
        locationId = val;
    }
    public long getLocationId() {
        return locationId;
    }
    private int quantity;
    public void setQuantity(int val) {
        quantity = val;
    }
    public int getQuantity() {
        return quantity;
    }
    private long transactionId;
    public void setTransactionId(long val) {
        transactionId = val;
    }
    public long getTransactionId() {
        return transactionId;
    }
    private int typeId;
    public void setTypeId(int val) {
        typeId = val;
    }
    public int getTypeId() {
        return typeId;
    }
    private double unitPrice;
    public void setUnitPrice(double val) {
        unitPrice = val;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    static WalletTransaction fromJson(Json json) {
        if (json == null) {
            return null;
        }
        WalletTransaction self = new WalletTransaction();
        Map<String, Json> js = json.asJsonMap();
        self.clientId = ApiClientBase.optGetInteger(js.get("client_id"));
        self.date = ApiClientBase.optGetString(js.get("date"));
        self.isBuy = ApiClientBase.optGetBoolean(js.get("is_buy"));
        self.isPersonal = ApiClientBase.optGetBoolean(js.get("is_personal"));
        self.journalRefId = ApiClientBase.optGetLong(js.get("journal_ref_id"));
        self.locationId = ApiClientBase.optGetLong(js.get("location_id"));
        self.quantity = ApiClientBase.optGetInteger(js.get("quantity"));
        self.transactionId = ApiClientBase.optGetLong(js.get("transaction_id"));
        self.typeId = ApiClientBase.optGetInteger(js.get("type_id"));
        self.unitPrice = ApiClientBase.optGetDouble(js.get("unit_price"));
        return self;
    }
}
