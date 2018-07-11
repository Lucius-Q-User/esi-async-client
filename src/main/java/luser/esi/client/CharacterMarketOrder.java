package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CharacterMarketOrder implements ApiParameterObject {
    private int duration;
    public void setDuration(int val) {
        duration = val;
    }
    @JsonProperty("duration")
    public int getDuration() {
        return duration;
    }
    private Double escrow;
    public void setEscrow(Double val) {
        escrow = val;
    }
    @JsonProperty("escrow")
    public Double getEscrow() {
        return escrow;
    }
    private Boolean isBuyOrder;
    public void setIsBuyOrder(Boolean val) {
        isBuyOrder = val;
    }
    @JsonProperty("is_buy_order")
    public Boolean getIsBuyOrder() {
        return isBuyOrder;
    }
    private boolean isCorporation;
    public void setIsCorporation(boolean val) {
        isCorporation = val;
    }
    @JsonProperty("is_corporation")
    public boolean getIsCorporation() {
        return isCorporation;
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
    private Integer minVolume;
    public void setMinVolume(Integer val) {
        minVolume = val;
    }
    @JsonProperty("min_volume")
    public Integer getMinVolume() {
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
    private int regionId;
    public void setRegionId(int val) {
        regionId = val;
    }
    @JsonProperty("region_id")
    public int getRegionId() {
        return regionId;
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
