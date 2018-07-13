package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class IndustryJobInfo implements ApiParameterObject {
    private int activityId;
    public void setActivityId(int val) {
        activityId = val;
    }
    @JsonProperty("activity_id")
    public int getActivityId() {
        return activityId;
    }
    private long blueprintId;
    public void setBlueprintId(long val) {
        blueprintId = val;
    }
    @JsonProperty("blueprint_id")
    public long getBlueprintId() {
        return blueprintId;
    }
    private long blueprintLocationId;
    public void setBlueprintLocationId(long val) {
        blueprintLocationId = val;
    }
    @JsonProperty("blueprint_location_id")
    public long getBlueprintLocationId() {
        return blueprintLocationId;
    }
    private int blueprintTypeId;
    public void setBlueprintTypeId(int val) {
        blueprintTypeId = val;
    }
    @JsonProperty("blueprint_type_id")
    public int getBlueprintTypeId() {
        return blueprintTypeId;
    }
    private Integer completedCharacterId;
    public void setCompletedCharacterId(Integer val) {
        completedCharacterId = val;
    }
    @JsonProperty("completed_character_id")
    public Integer getCompletedCharacterId() {
        return completedCharacterId;
    }
    private Instant completedDate;
    public void setCompletedDate(Instant val) {
        completedDate = val;
    }
    @JsonProperty("completed_date")
    public Instant getCompletedDate() {
        return completedDate;
    }
    private Double cost;
    public void setCost(Double val) {
        cost = val;
    }
    @JsonProperty("cost")
    public Double getCost() {
        return cost;
    }
    private int duration;
    public void setDuration(int val) {
        duration = val;
    }
    @JsonProperty("duration")
    public int getDuration() {
        return duration;
    }
    private Instant endDate;
    public void setEndDate(Instant val) {
        endDate = val;
    }
    @JsonProperty("end_date")
    public Instant getEndDate() {
        return endDate;
    }
    private long facilityId;
    public void setFacilityId(long val) {
        facilityId = val;
    }
    @JsonProperty("facility_id")
    public long getFacilityId() {
        return facilityId;
    }
    private int installerId;
    public void setInstallerId(int val) {
        installerId = val;
    }
    @JsonProperty("installer_id")
    public int getInstallerId() {
        return installerId;
    }
    private int jobId;
    public void setJobId(int val) {
        jobId = val;
    }
    @JsonProperty("job_id")
    public int getJobId() {
        return jobId;
    }
    private Integer licensedRuns;
    public void setLicensedRuns(Integer val) {
        licensedRuns = val;
    }
    @JsonProperty("licensed_runs")
    public Integer getLicensedRuns() {
        return licensedRuns;
    }
    private long outputLocationId;
    public void setOutputLocationId(long val) {
        outputLocationId = val;
    }
    @JsonProperty("output_location_id")
    public long getOutputLocationId() {
        return outputLocationId;
    }
    private Instant pauseDate;
    public void setPauseDate(Instant val) {
        pauseDate = val;
    }
    @JsonProperty("pause_date")
    public Instant getPauseDate() {
        return pauseDate;
    }
    private Float probability;
    public void setProbability(Float val) {
        probability = val;
    }
    @JsonProperty("probability")
    public Float getProbability() {
        return probability;
    }
    private Integer productTypeId;
    public void setProductTypeId(Integer val) {
        productTypeId = val;
    }
    @JsonProperty("product_type_id")
    public Integer getProductTypeId() {
        return productTypeId;
    }
    private int runs;
    public void setRuns(int val) {
        runs = val;
    }
    @JsonProperty("runs")
    public int getRuns() {
        return runs;
    }
    private Instant startDate;
    public void setStartDate(Instant val) {
        startDate = val;
    }
    @JsonProperty("start_date")
    public Instant getStartDate() {
        return startDate;
    }
    private long stationId;
    public void setStationId(long val) {
        stationId = val;
    }
    @JsonProperty("station_id")
    public long getStationId() {
        return stationId;
    }
    private StatusEnum status;
    public void setStatus(StatusEnum val) {
        status = val;
    }
    @JsonProperty("status")
    public StatusEnum getStatus() {
        return status;
    }
    private Integer successfulRuns;
    public void setSuccessfulRuns(Integer val) {
        successfulRuns = val;
    }
    @JsonProperty("successful_runs")
    public Integer getSuccessfulRuns() {
        return successfulRuns;
    }
    public static enum StatusEnum {
        ACTIVE("active"),
        CANCELLED("cancelled"),
        DELIVERED("delivered"),
        PAUSED("paused"),
        READY("ready"),
        REVERTED("reverted");
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
}
