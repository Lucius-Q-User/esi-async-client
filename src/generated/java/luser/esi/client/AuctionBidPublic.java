package luser.esi.client;

import java.time.Instant;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AuctionBidPublic {
    private float amount;
    /**
     * The amount bid, in ISK
     */
    public void setAmount(float val) {
        amount = val;
    }
    /**
     * The amount bid, in ISK
     */
    @JsonProperty("amount")
    public float getAmount() {
        return amount;
    }
    private int bidId;
    /**
     * Unique ID for the bid
     */
    public void setBidId(int val) {
        bidId = val;
    }
    /**
     * Unique ID for the bid
     */
    @JsonProperty("bid_id")
    public int getBidId() {
        return bidId;
    }
    private Instant dateBid;
    /**
     * Datetime when the bid was placed
     */
    public void setDateBid(Instant val) {
        dateBid = val;
    }
    /**
     * Datetime when the bid was placed
     */
    @JsonProperty("date_bid")
    public Instant getDateBid() {
        return dateBid;
    }
}
