package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class ContractInfo implements ApiParameterObject {
    private int acceptorId;
    public void setAcceptorId(int val) {
        acceptorId = val;
    }
    @JsonProperty("acceptor_id")
    public int getAcceptorId() {
        return acceptorId;
    }
    private int assigneeId;
    public void setAssigneeId(int val) {
        assigneeId = val;
    }
    @JsonProperty("assignee_id")
    public int getAssigneeId() {
        return assigneeId;
    }
    private AvailabilityEnum availability;
    public void setAvailability(AvailabilityEnum val) {
        availability = val;
    }
    @JsonProperty("availability")
    public AvailabilityEnum getAvailability() {
        return availability;
    }
    private Double buyout;
    public void setBuyout(Double val) {
        buyout = val;
    }
    @JsonProperty("buyout")
    public Double getBuyout() {
        return buyout;
    }
    private Double collateral;
    public void setCollateral(Double val) {
        collateral = val;
    }
    @JsonProperty("collateral")
    public Double getCollateral() {
        return collateral;
    }
    private int contractId;
    public void setContractId(int val) {
        contractId = val;
    }
    @JsonProperty("contract_id")
    public int getContractId() {
        return contractId;
    }
    private Instant dateAccepted;
    public void setDateAccepted(Instant val) {
        dateAccepted = val;
    }
    @JsonProperty("date_accepted")
    public Instant getDateAccepted() {
        return dateAccepted;
    }
    private Instant dateCompleted;
    public void setDateCompleted(Instant val) {
        dateCompleted = val;
    }
    @JsonProperty("date_completed")
    public Instant getDateCompleted() {
        return dateCompleted;
    }
    private Instant dateExpired;
    public void setDateExpired(Instant val) {
        dateExpired = val;
    }
    @JsonProperty("date_expired")
    public Instant getDateExpired() {
        return dateExpired;
    }
    private Instant dateIssued;
    public void setDateIssued(Instant val) {
        dateIssued = val;
    }
    @JsonProperty("date_issued")
    public Instant getDateIssued() {
        return dateIssued;
    }
    private Integer daysToComplete;
    public void setDaysToComplete(Integer val) {
        daysToComplete = val;
    }
    @JsonProperty("days_to_complete")
    public Integer getDaysToComplete() {
        return daysToComplete;
    }
    private Long endLocationId;
    public void setEndLocationId(Long val) {
        endLocationId = val;
    }
    @JsonProperty("end_location_id")
    public Long getEndLocationId() {
        return endLocationId;
    }
    private boolean forCorporation;
    public void setForCorporation(boolean val) {
        forCorporation = val;
    }
    @JsonProperty("for_corporation")
    public boolean getForCorporation() {
        return forCorporation;
    }
    private int issuerCorporationId;
    public void setIssuerCorporationId(int val) {
        issuerCorporationId = val;
    }
    @JsonProperty("issuer_corporation_id")
    public int getIssuerCorporationId() {
        return issuerCorporationId;
    }
    private int issuerId;
    public void setIssuerId(int val) {
        issuerId = val;
    }
    @JsonProperty("issuer_id")
    public int getIssuerId() {
        return issuerId;
    }
    private Double price;
    public void setPrice(Double val) {
        price = val;
    }
    @JsonProperty("price")
    public Double getPrice() {
        return price;
    }
    private Double reward;
    public void setReward(Double val) {
        reward = val;
    }
    @JsonProperty("reward")
    public Double getReward() {
        return reward;
    }
    private Long startLocationId;
    public void setStartLocationId(Long val) {
        startLocationId = val;
    }
    @JsonProperty("start_location_id")
    public Long getStartLocationId() {
        return startLocationId;
    }
    private StatusEnum status;
    public void setStatus(StatusEnum val) {
        status = val;
    }
    @JsonProperty("status")
    public StatusEnum getStatus() {
        return status;
    }
    private String title;
    public void setTitle(String val) {
        title = val;
    }
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }
    private TypeEnum type;
    public void setType(TypeEnum val) {
        type = val;
    }
    @JsonProperty("type")
    public TypeEnum getType() {
        return type;
    }
    private Double volume;
    public void setVolume(Double val) {
        volume = val;
    }
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
