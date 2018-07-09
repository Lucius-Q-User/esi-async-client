package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class AuctionBid {
    private float amount;
    public void setAmount(float val) {
        amount = val;
    }
    public float getAmount() {
        return amount;
    }
    private int bidId;
    public void setBidId(int val) {
        bidId = val;
    }
    public int getBidId() {
        return bidId;
    }
    private int bidderId;
    public void setBidderId(int val) {
        bidderId = val;
    }
    public int getBidderId() {
        return bidderId;
    }
    private Instant dateBid;
    public void setDateBid(Instant val) {
        dateBid = val;
    }
    public Instant getDateBid() {
        return dateBid;
    }
    static AuctionBid fromJson(Json json) {
        if (json == null) {
            return null;
        }
        AuctionBid self = new AuctionBid();
        Map<String, Json> js = json.asJsonMap();
        self.amount = ApiClientBase.optGetFloat(js.get("amount"));
        self.bidId = ApiClientBase.optGetInteger(js.get("bid_id"));
        self.bidderId = ApiClientBase.optGetInteger(js.get("bidder_id"));
        self.dateBid = ApiClientBase.optGetInstant(js.get("date_bid"));
        return self;
    }
}
