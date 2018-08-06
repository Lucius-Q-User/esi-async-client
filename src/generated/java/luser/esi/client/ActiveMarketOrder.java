package luser.esi.client;

import java.time.Instant;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ActiveMarketOrder {
    private int duration;
    /**
     * duration integer
     */
    public void setDuration(int val) {
        duration = val;
    }
    /**
     * duration integer
     */
    @JsonProperty("duration")
    public int getDuration() {
        return duration;
    }
    private boolean isBuyOrder;
    /**
     * is_buy_order boolean
     */
    public void setIsBuyOrder(boolean val) {
        isBuyOrder = val;
    }
    /**
     * is_buy_order boolean
     */
    @JsonProperty("is_buy_order")
    public boolean getIsBuyOrder() {
        return isBuyOrder;
    }
    private Instant issued;
    /**
     * issued string
     */
    public void setIssued(Instant val) {
        issued = val;
    }
    /**
     * issued string
     */
    @JsonProperty("issued")
    public Instant getIssued() {
        return issued;
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
    private int minVolume;
    /**
     * min_volume integer
     */
    public void setMinVolume(int val) {
        minVolume = val;
    }
    /**
     * min_volume integer
     */
    @JsonProperty("min_volume")
    public int getMinVolume() {
        return minVolume;
    }
    private long orderId;
    /**
     * order_id integer
     */
    public void setOrderId(long val) {
        orderId = val;
    }
    /**
     * order_id integer
     */
    @JsonProperty("order_id")
    public long getOrderId() {
        return orderId;
    }
    private double price;
    /**
     * price number
     */
    public void setPrice(double val) {
        price = val;
    }
    /**
     * price number
     */
    @JsonProperty("price")
    public double getPrice() {
        return price;
    }
    private OrderRangeEnum range;
    /**
     * range string
     */
    public void setRange(OrderRangeEnum val) {
        range = val;
    }
    /**
     * range string
     */
    @JsonProperty("range")
    public OrderRangeEnum getRange() {
        return range;
    }
    private int systemId;
    /**
     * The solar system this order was placed
     */
    public void setSystemId(int val) {
        systemId = val;
    }
    /**
     * The solar system this order was placed
     */
    @JsonProperty("system_id")
    public int getSystemId() {
        return systemId;
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
    private int volumeRemain;
    /**
     * volume_remain integer
     */
    public void setVolumeRemain(int val) {
        volumeRemain = val;
    }
    /**
     * volume_remain integer
     */
    @JsonProperty("volume_remain")
    public int getVolumeRemain() {
        return volumeRemain;
    }
    private int volumeTotal;
    /**
     * volume_total integer
     */
    public void setVolumeTotal(int val) {
        volumeTotal = val;
    }
    /**
     * volume_total integer
     */
    @JsonProperty("volume_total")
    public int getVolumeTotal() {
        return volumeTotal;
    }
}
