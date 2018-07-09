package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class ContractInfo {
    private int acceptorId;
    public void setAcceptorId(int val) {
        acceptorId = val;
    }
    public int getAcceptorId() {
        return acceptorId;
    }
    private int assigneeId;
    public void setAssigneeId(int val) {
        assigneeId = val;
    }
    public int getAssigneeId() {
        return assigneeId;
    }
    private AvailabilityEnum availability;
    public void setAvailability(AvailabilityEnum val) {
        availability = val;
    }
    public AvailabilityEnum getAvailability() {
        return availability;
    }
    private Double buyout;
    public void setBuyout(Double val) {
        buyout = val;
    }
    public Double getBuyout() {
        return buyout;
    }
    private Double collateral;
    public void setCollateral(Double val) {
        collateral = val;
    }
    public Double getCollateral() {
        return collateral;
    }
    private int contractId;
    public void setContractId(int val) {
        contractId = val;
    }
    public int getContractId() {
        return contractId;
    }
    private Instant dateAccepted;
    public void setDateAccepted(Instant val) {
        dateAccepted = val;
    }
    public Instant getDateAccepted() {
        return dateAccepted;
    }
    private Instant dateCompleted;
    public void setDateCompleted(Instant val) {
        dateCompleted = val;
    }
    public Instant getDateCompleted() {
        return dateCompleted;
    }
    private Instant dateExpired;
    public void setDateExpired(Instant val) {
        dateExpired = val;
    }
    public Instant getDateExpired() {
        return dateExpired;
    }
    private Instant dateIssued;
    public void setDateIssued(Instant val) {
        dateIssued = val;
    }
    public Instant getDateIssued() {
        return dateIssued;
    }
    private Integer daysToComplete;
    public void setDaysToComplete(Integer val) {
        daysToComplete = val;
    }
    public Integer getDaysToComplete() {
        return daysToComplete;
    }
    private Long endLocationId;
    public void setEndLocationId(Long val) {
        endLocationId = val;
    }
    public Long getEndLocationId() {
        return endLocationId;
    }
    private boolean forCorporation;
    public void setForCorporation(boolean val) {
        forCorporation = val;
    }
    public boolean getForCorporation() {
        return forCorporation;
    }
    private int issuerCorporationId;
    public void setIssuerCorporationId(int val) {
        issuerCorporationId = val;
    }
    public int getIssuerCorporationId() {
        return issuerCorporationId;
    }
    private int issuerId;
    public void setIssuerId(int val) {
        issuerId = val;
    }
    public int getIssuerId() {
        return issuerId;
    }
    private Double price;
    public void setPrice(Double val) {
        price = val;
    }
    public Double getPrice() {
        return price;
    }
    private Double reward;
    public void setReward(Double val) {
        reward = val;
    }
    public Double getReward() {
        return reward;
    }
    private Long startLocationId;
    public void setStartLocationId(Long val) {
        startLocationId = val;
    }
    public Long getStartLocationId() {
        return startLocationId;
    }
    private StatusEnum status;
    public void setStatus(StatusEnum val) {
        status = val;
    }
    public StatusEnum getStatus() {
        return status;
    }
    private String title;
    public void setTitle(String val) {
        title = val;
    }
    public String getTitle() {
        return title;
    }
    private TypeEnum type;
    public void setType(TypeEnum val) {
        type = val;
    }
    public TypeEnum getType() {
        return type;
    }
    private Double volume;
    public void setVolume(Double val) {
        volume = val;
    }
    public Double getVolume() {
        return volume;
    }
    static ContractInfo fromJson(Json json) {
        if (json == null) {
            return null;
        }
        ContractInfo self = new ContractInfo();
        Map<String, Json> js = json.asJsonMap();
        self.acceptorId = ApiClientBase.optGetInteger(js.get("acceptor_id"));
        self.assigneeId = ApiClientBase.optGetInteger(js.get("assignee_id"));
        self.availability = AvailabilityEnum.fromString(ApiClientBase.optGetString(js.get("availability")));
        self.buyout = ApiClientBase.optGetDouble(js.get("buyout"));
        self.collateral = ApiClientBase.optGetDouble(js.get("collateral"));
        self.contractId = ApiClientBase.optGetInteger(js.get("contract_id"));
        self.dateAccepted = ApiClientBase.optGetInstant(js.get("date_accepted"));
        self.dateCompleted = ApiClientBase.optGetInstant(js.get("date_completed"));
        self.dateExpired = ApiClientBase.optGetInstant(js.get("date_expired"));
        self.dateIssued = ApiClientBase.optGetInstant(js.get("date_issued"));
        self.daysToComplete = ApiClientBase.optGetInteger(js.get("days_to_complete"));
        self.endLocationId = ApiClientBase.optGetLong(js.get("end_location_id"));
        self.forCorporation = ApiClientBase.optGetBoolean(js.get("for_corporation"));
        self.issuerCorporationId = ApiClientBase.optGetInteger(js.get("issuer_corporation_id"));
        self.issuerId = ApiClientBase.optGetInteger(js.get("issuer_id"));
        self.price = ApiClientBase.optGetDouble(js.get("price"));
        self.reward = ApiClientBase.optGetDouble(js.get("reward"));
        self.startLocationId = ApiClientBase.optGetLong(js.get("start_location_id"));
        self.status = StatusEnum.fromString(ApiClientBase.optGetString(js.get("status")));
        self.title = ApiClientBase.optGetString(js.get("title"));
        self.type = TypeEnum.fromString(ApiClientBase.optGetString(js.get("type")));
        self.volume = ApiClientBase.optGetDouble(js.get("volume"));
        return self;
    }
    public static enum AvailabilityEnum {
        PUBLIC("public"),
        PERSONAL("personal"),
        CORPORATION("corporation"),
        ALLIANCE("alliance");
        public final String stringValue;
        private AvailabilityEnum(String stringValue) {
            this.stringValue = stringValue;
        }
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
        public final String stringValue;
        private StatusEnum(String stringValue) {
            this.stringValue = stringValue;
        }
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
        public final String stringValue;
        private TypeEnum(String stringValue) {
            this.stringValue = stringValue;
        }
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
