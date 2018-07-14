package luser.esi.client;

import java.time.Instant;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public class ContractInfo implements ApiParameterObject {
    private int acceptorId;
    /**
     * Who will accept the contract
     */
    public void setAcceptorId(int val) {
        acceptorId = val;
    }
    /**
     * Who will accept the contract
     */
    @JsonProperty("acceptor_id")
    public int getAcceptorId() {
        return acceptorId;
    }
    private int assigneeId;
    /**
     * ID to whom the contract is assigned, can be corporation or character ID
     */
    public void setAssigneeId(int val) {
        assigneeId = val;
    }
    /**
     * ID to whom the contract is assigned, can be corporation or character ID
     */
    @JsonProperty("assignee_id")
    public int getAssigneeId() {
        return assigneeId;
    }
    private AvailabilityEnum availability;
    /**
     * To whom the contract is available
     */
    public void setAvailability(AvailabilityEnum val) {
        availability = val;
    }
    /**
     * To whom the contract is available
     */
    @JsonProperty("availability")
    public AvailabilityEnum getAvailability() {
        return availability;
    }
    private Double buyout;
    /**
     * Buyout price (for Auctions only)
     */
    public void setBuyout(Double val) {
        buyout = val;
    }
    /**
     * Buyout price (for Auctions only)
     */
    @JsonProperty("buyout")
    public Double getBuyout() {
        return buyout;
    }
    private Double collateral;
    /**
     * Collateral price (for Couriers only)
     */
    public void setCollateral(Double val) {
        collateral = val;
    }
    /**
     * Collateral price (for Couriers only)
     */
    @JsonProperty("collateral")
    public Double getCollateral() {
        return collateral;
    }
    private int contractId;
    /**
     * contract_id integer
     */
    public void setContractId(int val) {
        contractId = val;
    }
    /**
     * contract_id integer
     */
    @JsonProperty("contract_id")
    public int getContractId() {
        return contractId;
    }
    private Instant dateAccepted;
    /**
     * Date of confirmation of contract
     */
    public void setDateAccepted(Instant val) {
        dateAccepted = val;
    }
    /**
     * Date of confirmation of contract
     */
    @JsonProperty("date_accepted")
    public Instant getDateAccepted() {
        return dateAccepted;
    }
    private Instant dateCompleted;
    /**
     * Date of completed of contract
     */
    public void setDateCompleted(Instant val) {
        dateCompleted = val;
    }
    /**
     * Date of completed of contract
     */
    @JsonProperty("date_completed")
    public Instant getDateCompleted() {
        return dateCompleted;
    }
    private Instant dateExpired;
    /**
     * Expiration date of the contract
     */
    public void setDateExpired(Instant val) {
        dateExpired = val;
    }
    /**
     * Expiration date of the contract
     */
    @JsonProperty("date_expired")
    public Instant getDateExpired() {
        return dateExpired;
    }
    private Instant dateIssued;
    /**
     * Сreation date of the contract
     */
    public void setDateIssued(Instant val) {
        dateIssued = val;
    }
    /**
     * Сreation date of the contract
     */
    @JsonProperty("date_issued")
    public Instant getDateIssued() {
        return dateIssued;
    }
    private Integer daysToComplete;
    /**
     * Number of days to perform the contract
     */
    public void setDaysToComplete(Integer val) {
        daysToComplete = val;
    }
    /**
     * Number of days to perform the contract
     */
    @JsonProperty("days_to_complete")
    public Integer getDaysToComplete() {
        return daysToComplete;
    }
    private Long endLocationId;
    /**
     * End location ID (for Couriers contract)
     */
    public void setEndLocationId(Long val) {
        endLocationId = val;
    }
    /**
     * End location ID (for Couriers contract)
     */
    @JsonProperty("end_location_id")
    public Long getEndLocationId() {
        return endLocationId;
    }
    private boolean forCorporation;
    /**
     * true if the contract was issued on behalf of the issuer's corporation
     */
    public void setForCorporation(boolean val) {
        forCorporation = val;
    }
    /**
     * true if the contract was issued on behalf of the issuer's corporation
     */
    @JsonProperty("for_corporation")
    public boolean getForCorporation() {
        return forCorporation;
    }
    private int issuerCorporationId;
    /**
     * Character's corporation ID for the issuer
     */
    public void setIssuerCorporationId(int val) {
        issuerCorporationId = val;
    }
    /**
     * Character's corporation ID for the issuer
     */
    @JsonProperty("issuer_corporation_id")
    public int getIssuerCorporationId() {
        return issuerCorporationId;
    }
    private int issuerId;
    /**
     * Character ID for the issuer
     */
    public void setIssuerId(int val) {
        issuerId = val;
    }
    /**
     * Character ID for the issuer
     */
    @JsonProperty("issuer_id")
    public int getIssuerId() {
        return issuerId;
    }
    private Double price;
    /**
     * Price of contract (for ItemsExchange and Auctions)
     */
    public void setPrice(Double val) {
        price = val;
    }
    /**
     * Price of contract (for ItemsExchange and Auctions)
     */
    @JsonProperty("price")
    public Double getPrice() {
        return price;
    }
    private Double reward;
    /**
     * Remuneration for contract (for Couriers only)
     */
    public void setReward(Double val) {
        reward = val;
    }
    /**
     * Remuneration for contract (for Couriers only)
     */
    @JsonProperty("reward")
    public Double getReward() {
        return reward;
    }
    private Long startLocationId;
    /**
     * Start location ID (for Couriers contract)
     */
    public void setStartLocationId(Long val) {
        startLocationId = val;
    }
    /**
     * Start location ID (for Couriers contract)
     */
    @JsonProperty("start_location_id")
    public Long getStartLocationId() {
        return startLocationId;
    }
    private StatusEnum status;
    /**
     * Status of the the contract
     */
    public void setStatus(StatusEnum val) {
        status = val;
    }
    /**
     * Status of the the contract
     */
    @JsonProperty("status")
    public StatusEnum getStatus() {
        return status;
    }
    private String title;
    /**
     * Title of the contract
     */
    public void setTitle(String val) {
        title = val;
    }
    /**
     * Title of the contract
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }
    private TypeEnum type;
    /**
     * Type of the contract
     */
    public void setType(TypeEnum val) {
        type = val;
    }
    /**
     * Type of the contract
     */
    @JsonProperty("type")
    public TypeEnum getType() {
        return type;
    }
    private Double volume;
    /**
     * Volume of items in the contract
     */
    public void setVolume(Double val) {
        volume = val;
    }
    /**
     * Volume of items in the contract
     */
    @JsonProperty("volume")
    public Double getVolume() {
        return volume;
    }
    public static enum AvailabilityEnum {
        PUBLIC("public"),
        PERSONAL("personal"),
        CORPORATION("corporation"),
        ALLIANCE("alliance");
        private final String stringValue;
        private AvailabilityEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
        @JsonCreator
        public static AvailabilityEnum fromString(String str) {
            for (AvailabilityEnum self : AvailabilityEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
    public static enum StatusEnum {
        OUTSTANDING("outstanding"),
        IN_PROGRESS("in_progress"),
        FINISHED_ISSUER("finished_issuer"),
        FINISHED_CONTRACTOR("finished_contractor"),
        FINISHED("finished"),
        CANCELLED("cancelled"),
        REJECTED("rejected"),
        FAILED("failed"),
        DELETED("deleted"),
        REVERSED("reversed");
        private final String stringValue;
        private StatusEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
        @JsonCreator
        public static StatusEnum fromString(String str) {
            for (StatusEnum self : StatusEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
    public static enum TypeEnum {
        UNKNOWN("unknown"),
        ITEM_EXCHANGE("item_exchange"),
        AUCTION("auction"),
        COURIER("courier"),
        LOAN("loan");
        private final String stringValue;
        private TypeEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
        @JsonCreator
        public static TypeEnum fromString(String str) {
            for (TypeEnum self : TypeEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
}
