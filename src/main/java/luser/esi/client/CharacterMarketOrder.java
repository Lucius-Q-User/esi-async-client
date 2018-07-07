package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class CharacterMarketOrder {
    private int duration;
    public void setDuration(int val) {
        duration = val;
    }
    public int getDuration() {
        return duration;
    }
    private Double escrow;
    public void setEscrow(Double val) {
        escrow = val;
    }
    public Double getEscrow() {
        return escrow;
    }
    private Boolean isBuyOrder;
    public void setIsBuyOrder(Boolean val) {
        isBuyOrder = val;
    }
    public Boolean getIsBuyOrder() {
        return isBuyOrder;
    }
    private boolean isCorporation;
    public void setIsCorporation(boolean val) {
        isCorporation = val;
    }
    public boolean getIsCorporation() {
        return isCorporation;
    }
    private String issued;
    public void setIssued(String val) {
        issued = val;
    }
    public String getIssued() {
        return issued;
    }
    private long locationId;
    public void setLocationId(long val) {
        locationId = val;
    }
    public long getLocationId() {
        return locationId;
    }
    private Integer minVolume;
    public void setMinVolume(Integer val) {
        minVolume = val;
    }
    public Integer getMinVolume() {
        return minVolume;
    }
    private long orderId;
    public void setOrderId(long val) {
        orderId = val;
    }
    public long getOrderId() {
        return orderId;
    }
    private double price;
    public void setPrice(double val) {
        price = val;
    }
    public double getPrice() {
        return price;
    }
    private RangeEnum range;
    public void setRange(RangeEnum val) {
        range = val;
    }
    public RangeEnum getRange() {
        return range;
    }
    private int regionId;
    public void setRegionId(int val) {
        regionId = val;
    }
    public int getRegionId() {
        return regionId;
    }
    private int typeId;
    public void setTypeId(int val) {
        typeId = val;
    }
    public int getTypeId() {
        return typeId;
    }
    private int volumeRemain;
    public void setVolumeRemain(int val) {
        volumeRemain = val;
    }
    public int getVolumeRemain() {
        return volumeRemain;
    }
    private int volumeTotal;
    public void setVolumeTotal(int val) {
        volumeTotal = val;
    }
    public int getVolumeTotal() {
        return volumeTotal;
    }
    static CharacterMarketOrder fromJson(Json json) {
        if (json == null) {
            return null;
        }
        CharacterMarketOrder self = new CharacterMarketOrder();
        Map<String, Json> js = json.asJsonMap();
        self.duration = ApiClientBase.optGetInteger(js.get("duration"));
        self.escrow = ApiClientBase.optGetDouble(js.get("escrow"));
        self.isBuyOrder = ApiClientBase.optGetBoolean(js.get("is_buy_order"));
        self.isCorporation = ApiClientBase.optGetBoolean(js.get("is_corporation"));
        self.issued = ApiClientBase.optGetString(js.get("issued"));
        self.locationId = ApiClientBase.optGetLong(js.get("location_id"));
        self.minVolume = ApiClientBase.optGetInteger(js.get("min_volume"));
        self.orderId = ApiClientBase.optGetLong(js.get("order_id"));
        self.price = ApiClientBase.optGetDouble(js.get("price"));
        self.range = RangeEnum.fromString(ApiClientBase.optGetString(js.get("range")));
        self.regionId = ApiClientBase.optGetInteger(js.get("region_id"));
        self.typeId = ApiClientBase.optGetInteger(js.get("type_id"));
        self.volumeRemain = ApiClientBase.optGetInteger(js.get("volume_remain"));
        self.volumeTotal = ApiClientBase.optGetInteger(js.get("volume_total"));
        return self;
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
        public final String stringValue;
        private RangeEnum(String stringValue) {
            this.stringValue = stringValue;
        }
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
