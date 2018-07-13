package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class WalletTransaction implements ApiParameterObject {
    private int clientId;
    public void setClientId(int val) {
        clientId = val;
    }
    @JsonProperty("client_id")
    public int getClientId() {
        return clientId;
    }
    private Instant date;
    public void setDate(Instant val) {
        date = val;
    }
    @JsonProperty("date")
    public Instant getDate() {
        return date;
    }
    private boolean isBuy;
    public void setIsBuy(boolean val) {
        isBuy = val;
    }
    @JsonProperty("is_buy")
    public boolean getIsBuy() {
        return isBuy;
    }
    private boolean isPersonal;
    public void setIsPersonal(boolean val) {
        isPersonal = val;
    }
    @JsonProperty("is_personal")
    public boolean getIsPersonal() {
        return isPersonal;
    }
    private long journalRefId;
    public void setJournalRefId(long val) {
        journalRefId = val;
    }
    @JsonProperty("journal_ref_id")
    public long getJournalRefId() {
        return journalRefId;
    }
    private long locationId;
    public void setLocationId(long val) {
        locationId = val;
    }
    @JsonProperty("location_id")
    public long getLocationId() {
        return locationId;
    }
    private int quantity;
    public void setQuantity(int val) {
        quantity = val;
    }
    @JsonProperty("quantity")
    public int getQuantity() {
        return quantity;
    }
    private long transactionId;
    public void setTransactionId(long val) {
        transactionId = val;
    }
    @JsonProperty("transaction_id")
    public long getTransactionId() {
        return transactionId;
    }
    private int typeId;
    public void setTypeId(int val) {
        typeId = val;
    }
    @JsonProperty("type_id")
    public int getTypeId() {
        return typeId;
    }
    private double unitPrice;
    public void setUnitPrice(double val) {
        unitPrice = val;
    }
    @JsonProperty("unit_price")
    public double getUnitPrice() {
        return unitPrice;
    }
}
