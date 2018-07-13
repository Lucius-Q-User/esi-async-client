package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class AuctionBid implements ApiParameterObject {
    private float amount;
    public void setAmount(float val) {
        amount = val;
    }
    @JsonProperty("amount")
    public float getAmount() {
        return amount;
    }
    private int bidId;
    public void setBidId(int val) {
        bidId = val;
    }
    @JsonProperty("bid_id")
    public int getBidId() {
        return bidId;
    }
    private int bidderId;
    public void setBidderId(int val) {
        bidderId = val;
    }
    @JsonProperty("bidder_id")
    public int getBidderId() {
        return bidderId;
    }
    private Instant dateBid;
    public void setDateBid(Instant val) {
        dateBid = val;
    }
    @JsonProperty("date_bid")
    public Instant getDateBid() {
        return dateBid;
    }
}
