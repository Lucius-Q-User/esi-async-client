package luser.esi.client;

import java.time.Instant;
import com.fasterxml.jackson.annotation.JsonProperty;

public class WalletTransaction {
    private int clientId;
    /**
     * client_id integer
     */
    public void setClientId(int val) {
        clientId = val;
    }
    /**
     * client_id integer
     */
    @JsonProperty("client_id")
    public int getClientId() {
        return clientId;
    }
    private Instant date;
    /**
     * Date and time of transaction
     */
    public void setDate(Instant val) {
        date = val;
    }
    /**
     * Date and time of transaction
     */
    @JsonProperty("date")
    public Instant getDate() {
        return date;
    }
    private boolean isBuy;
    /**
     * is_buy boolean
     */
    public void setIsBuy(boolean val) {
        isBuy = val;
    }
    /**
     * is_buy boolean
     */
    @JsonProperty("is_buy")
    public boolean getIsBuy() {
        return isBuy;
    }
    private boolean isPersonal;
    /**
     * is_personal boolean
     */
    public void setIsPersonal(boolean val) {
        isPersonal = val;
    }
    /**
     * is_personal boolean
     */
    @JsonProperty("is_personal")
    public boolean getIsPersonal() {
        return isPersonal;
    }
    private long journalRefId;
    /**
     * journal_ref_id integer
     */
    public void setJournalRefId(long val) {
        journalRefId = val;
    }
    /**
     * journal_ref_id integer
     */
    @JsonProperty("journal_ref_id")
    public long getJournalRefId() {
        return journalRefId;
    }
    private long locationId;
    /**
     * location_id integer
     */
    public void setLocationId(long val) {
        locationId = val;
    }
    /**
     * location_id integer
     */
    @JsonProperty("location_id")
    public long getLocationId() {
        return locationId;
    }
    private int quantity;
    /**
     * quantity integer
     */
    public void setQuantity(int val) {
        quantity = val;
    }
    /**
     * quantity integer
     */
    @JsonProperty("quantity")
    public int getQuantity() {
        return quantity;
    }
    private long transactionId;
    /**
     * Unique transaction ID
     */
    public void setTransactionId(long val) {
        transactionId = val;
    }
    /**
     * Unique transaction ID
     */
    @JsonProperty("transaction_id")
    public long getTransactionId() {
        return transactionId;
    }
    private int typeId;
    /**
     * type_id integer
     */
    public void setTypeId(int val) {
        typeId = val;
    }
    /**
     * type_id integer
     */
    @JsonProperty("type_id")
    public int getTypeId() {
        return typeId;
    }
    private double unitPrice;
    /**
     * Amount paid per unit
     */
    public void setUnitPrice(double val) {
        unitPrice = val;
    }
    /**
     * Amount paid per unit
     */
    @JsonProperty("unit_price")
    public double getUnitPrice() {
        return unitPrice;
    }
}
