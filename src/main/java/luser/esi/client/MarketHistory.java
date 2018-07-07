package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class MarketHistory {
    private double average;
    public void setAverage(double val) {
        average = val;
    }
    public double getAverage() {
        return average;
    }
    private String date;
    public void setDate(String val) {
        date = val;
    }
    public String getDate() {
        return date;
    }
    private double highest;
    public void setHighest(double val) {
        highest = val;
    }
    public double getHighest() {
        return highest;
    }
    private double lowest;
    public void setLowest(double val) {
        lowest = val;
    }
    public double getLowest() {
        return lowest;
    }
    private long orderCount;
    public void setOrderCount(long val) {
        orderCount = val;
    }
    public long getOrderCount() {
        return orderCount;
    }
    private long volume;
    public void setVolume(long val) {
        volume = val;
    }
    public long getVolume() {
        return volume;
    }
    static MarketHistory fromJson(Json json) {
        if (json == null) {
            return null;
        }
        MarketHistory self = new MarketHistory();
        Map<String, Json> js = json.asJsonMap();
        self.average = ApiClientBase.optGetDouble(js.get("average"));
        self.date = ApiClientBase.optGetString(js.get("date"));
        self.highest = ApiClientBase.optGetDouble(js.get("highest"));
        self.lowest = ApiClientBase.optGetDouble(js.get("lowest"));
        self.orderCount = ApiClientBase.optGetLong(js.get("order_count"));
        self.volume = ApiClientBase.optGetLong(js.get("volume"));
        return self;
    }
}
