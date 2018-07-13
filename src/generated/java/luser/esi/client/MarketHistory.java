package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class MarketHistory implements ApiParameterObject {
    private double average;
    public void setAverage(double val) {
        average = val;
    }
    @JsonProperty("average")
    public double getAverage() {
        return average;
    }
    private String date;
    public void setDate(String val) {
        date = val;
    }
    @JsonProperty("date")
    public String getDate() {
        return date;
    }
    private double highest;
    public void setHighest(double val) {
        highest = val;
    }
    @JsonProperty("highest")
    public double getHighest() {
        return highest;
    }
    private double lowest;
    public void setLowest(double val) {
        lowest = val;
    }
    @JsonProperty("lowest")
    public double getLowest() {
        return lowest;
    }
    private long orderCount;
    public void setOrderCount(long val) {
        orderCount = val;
    }
    @JsonProperty("order_count")
    public long getOrderCount() {
        return orderCount;
    }
    private long volume;
    public void setVolume(long val) {
        volume = val;
    }
    @JsonProperty("volume")
    public long getVolume() {
        return volume;
    }
}
