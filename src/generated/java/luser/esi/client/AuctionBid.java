package luser.esi.client;

import java.time.Instant;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AuctionBid {
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
    private int bidderId;
    /**
     * Character ID of the bidder
     */
    public void setBidderId(int val) {
        bidderId = val;
    }
    /**
     * Character ID of the bidder
     */
    @JsonProperty("bidder_id")
    public int getBidderId() {
        return bidderId;
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
