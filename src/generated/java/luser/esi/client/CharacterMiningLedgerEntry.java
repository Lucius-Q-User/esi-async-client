package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CharacterMiningLedgerEntry {
    private String date;
    /**
     * date string
     */
    public void setDate(String val) {
        date = val;
    }
    /**
     * date string
     */
    @JsonProperty("date")
    public String getDate() {
        return date;
    }
    private long quantity;
    /**
     * quantity integer
     */
    public void setQuantity(long val) {
        quantity = val;
    }
    /**
     * quantity integer
     */
    @JsonProperty("quantity")
    public long getQuantity() {
        return quantity;
    }
    private int solarSystemId;
    /**
     * solar_system_id integer
     */
    public void setSolarSystemId(int val) {
        solarSystemId = val;
    }
    /**
     * solar_system_id integer
     */
    @JsonProperty("solar_system_id")
    public int getSolarSystemId() {
        return solarSystemId;
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
}
