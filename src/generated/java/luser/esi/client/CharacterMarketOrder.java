package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.carrotsearch.hppc.IntArrayList;
import com.carrotsearch.hppc.LongArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CharacterMarketOrder implements ApiParameterObject {
    private int duration;
    /**
     * Number of days for which order is valid (starting from the issued date). An order expires at time issued + duration
     */
    public void setDuration(int val) {
        duration = val;
    }
    /**
     * Number of days for which order is valid (starting from the issued date). An order expires at time issued + duration
     */
    @JsonProperty("duration")
    public int getDuration() {
        return duration;
    }
    private Double escrow;
    /**
     * For buy orders, the amount of ISK in escrow
     */
    public void setEscrow(Double val) {
        escrow = val;
    }
    /**
     * For buy orders, the amount of ISK in escrow
     */
    @JsonProperty("escrow")
    public Double getEscrow() {
        return escrow;
    }
    private Boolean isBuyOrder;
    /**
     * True if the order is a bid (buy) order
     */
    public void setIsBuyOrder(Boolean val) {
        isBuyOrder = val;
    }
    /**
     * True if the order is a bid (buy) order
     */
    @JsonProperty("is_buy_order")
    public Boolean getIsBuyOrder() {
        return isBuyOrder;
    }
    private boolean isCorporation;
    /**
     * Signifies whether the buy/sell order was placed on behalf of a corporation.
     */
    public void setIsCorporation(boolean val) {
        isCorporation = val;
    }
    /**
     * Signifies whether the buy/sell order was placed on behalf of a corporation.
     */
    @JsonProperty("is_corporation")
    public boolean getIsCorporation() {
        return isCorporation;
    }
    private Instant issued;
    /**
     * Date and time when this order was issued
     */
    public void setIssued(Instant val) {
        issued = val;
    }
    /**
     * Date and time when this order was issued
     */
    @JsonProperty("issued")
    public Instant getIssued() {
        return issued;
    }
    private long locationId;
    /**
     * ID of the location where order was placed
     */
    public void setLocationId(long val) {
        locationId = val;
    }
    /**
     * ID of the location where order was placed
     */
    @JsonProperty("location_id")
    public long getLocationId() {
        return locationId;
    }
    private Integer minVolume;
    /**
     * For buy orders, the minimum quantity that will be accepted in a matching sell order
     */
    public void setMinVolume(Integer val) {
        minVolume = val;
    }
    /**
     * For buy orders, the minimum quantity that will be accepted in a matching sell order
     */
    @JsonProperty("min_volume")
    public Integer getMinVolume() {
        return minVolume;
    }
    private long orderId;
    /**
     * Unique order ID
     */
    public void setOrderId(long val) {
        orderId = val;
    }
    /**
     * Unique order ID
     */
    @JsonProperty("order_id")
    public long getOrderId() {
        return orderId;
    }
    private double price;
    /**
     * Cost per unit for this order
     */
    public void setPrice(double val) {
        price = val;
    }
    /**
     * Cost per unit for this order
     */
    @JsonProperty("price")
    public double getPrice() {
        return price;
    }
    private RangeEnum range;
    /**
     * Valid order range, numbers are ranges in jumps
     */
    public void setRange(RangeEnum val) {
        range = val;
    }
    /**
     * Valid order range, numbers are ranges in jumps
     */
    @JsonProperty("range")
    public RangeEnum getRange() {
        return range;
    }
    private int regionId;
    /**
     * ID of the region where order was placed
     */
    public void setRegionId(int val) {
        regionId = val;
    }
    /**
     * ID of the region where order was placed
     */
    @JsonProperty("region_id")
    public int getRegionId() {
        return regionId;
    }
    private int typeId;
    /**
     * The type ID of the item transacted in this order
     */
    public void setTypeId(int val) {
        typeId = val;
    }
    /**
     * The type ID of the item transacted in this order
     */
    @JsonProperty("type_id")
    public int getTypeId() {
        return typeId;
    }
    private int volumeRemain;
    /**
     * Quantity of items still required or offered
     */
    public void setVolumeRemain(int val) {
        volumeRemain = val;
    }
    /**
     * Quantity of items still required or offered
     */
    @JsonProperty("volume_remain")
    public int getVolumeRemain() {
        return volumeRemain;
    }
    private int volumeTotal;
    /**
     * Quantity of items required or offered at time order was placed
     */
    public void setVolumeTotal(int val) {
        volumeTotal = val;
    }
    /**
     * Quantity of items required or offered at time order was placed
     */
    @JsonProperty("volume_total")
    public int getVolumeTotal() {
        return volumeTotal;
    }
    public static enum RangeEnum {
        _1("1"),
        _10("10"),
        _2("2"),
        _20("20"),
        _3("3"),
        _30("30"),
        _4("4"),
        _40("40"),
        _5("5"),
        REGION("region"),
        SOLARSYSTEM("solarsystem"),
        STATION("station");
        private final String stringValue;
        private RangeEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
        @JsonCreator
        public static RangeEnum fromString(String str) {
            for (RangeEnum self : RangeEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
}
