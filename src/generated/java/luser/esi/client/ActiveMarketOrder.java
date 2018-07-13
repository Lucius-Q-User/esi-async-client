package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class ActiveMarketOrder implements ApiParameterObject {
    private int duration;
    public void setDuration(int val) {
        duration = val;
    }
    @JsonProperty("duration")
    public int getDuration() {
        return duration;
    }
    private boolean isBuyOrder;
    public void setIsBuyOrder(boolean val) {
        isBuyOrder = val;
    }
    @JsonProperty("is_buy_order")
    public boolean getIsBuyOrder() {
        return isBuyOrder;
    }
    private Instant issued;
    public void setIssued(Instant val) {
        issued = val;
    }
    @JsonProperty("issued")
    public Instant getIssued() {
        return issued;
    }
    private long locationId;
    public void setLocationId(long val) {
        locationId = val;
    }
    @JsonProperty("location_id")
    public long getLocationId() {
        return locationId;
    }
    private int minVolume;
    public void setMinVolume(int val) {
        minVolume = val;
    }
    @JsonProperty("min_volume")
    public int getMinVolume() {
        return minVolume;
    }
    private long orderId;
    public void setOrderId(long val) {
        orderId = val;
    }
    @JsonProperty("order_id")
    public long getOrderId() {
        return orderId;
    }
    private double price;
    public void setPrice(double val) {
        price = val;
    }
    @JsonProperty("price")
    public double getPrice() {
        return price;
    }
    private RangeEnum range;
    public void setRange(RangeEnum val) {
        range = val;
    }
    @JsonProperty("range")
    public RangeEnum getRange() {
        return range;
    }
    private int systemId;
    public void setSystemId(int val) {
        systemId = val;
    }
    @JsonProperty("system_id")
    public int getSystemId() {
        return systemId;
    }
    private int typeId;
    public void setTypeId(int val) {
        typeId = val;
    }
    @JsonProperty("type_id")
    public int getTypeId() {
        return typeId;
    }
    private int volumeRemain;
    public void setVolumeRemain(int val) {
        volumeRemain = val;
    }
    @JsonProperty("volume_remain")
    public int getVolumeRemain() {
        return volumeRemain;
    }
    private int volumeTotal;
    public void setVolumeTotal(int val) {
        volumeTotal = val;
    }
    @JsonProperty("volume_total")
    public int getVolumeTotal() {
        return volumeTotal;
    }
    public static enum RangeEnum {
        STATION("station"),
        REGION("region"),
        SOLARSYSTEM("solarsystem"),
        _1("1"),
        _2("2"),
        _3("3"),
        _4("4"),
        _5("5"),
        _10("10"),
        _20("20"),
        _30("30"),
        _40("40");
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
