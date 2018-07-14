package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MarketHistory implements ApiParameterObject {
    private double average;
    /**
     * average number
     */
    public void setAverage(double val) {
        average = val;
    }
    /**
     * average number
     */
    @JsonProperty("average")
    public double getAverage() {
        return average;
    }
    private String date;
    /**
     * The date of this historical statistic entry
     */
    public void setDate(String val) {
        date = val;
    }
    /**
     * The date of this historical statistic entry
     */
    @JsonProperty("date")
    public String getDate() {
        return date;
    }
    private double highest;
    /**
     * highest number
     */
    public void setHighest(double val) {
        highest = val;
    }
    /**
     * highest number
     */
    @JsonProperty("highest")
    public double getHighest() {
        return highest;
    }
    private double lowest;
    /**
     * lowest number
     */
    public void setLowest(double val) {
        lowest = val;
    }
    /**
     * lowest number
     */
    @JsonProperty("lowest")
    public double getLowest() {
        return lowest;
    }
    private long orderCount;
    /**
     * Total number of orders happened that day
     */
    public void setOrderCount(long val) {
        orderCount = val;
    }
    /**
     * Total number of orders happened that day
     */
    @JsonProperty("order_count")
    public long getOrderCount() {
        return orderCount;
    }
    private long volume;
    /**
     * Total
     */
    public void setVolume(long val) {
        volume = val;
    }
    /**
     * Total
     */
    @JsonProperty("volume")
    public long getVolume() {
        return volume;
    }
}
