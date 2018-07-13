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
    /**
     * Job activity ID
     */
    public void setActivityId(int val) {
        activityId = val;
    }
    /**
     * Job activity ID
     */
    @JsonProperty("activity_id")
    public int getActivityId() {
        return activityId;
    }
    private long blueprintId;
    /**
     * blueprint_id integer
     */
    public void setBlueprintId(long val) {
        blueprintId = val;
    }
    /**
     * blueprint_id integer
     */
    @JsonProperty("blueprint_id")
    public long getBlueprintId() {
        return blueprintId;
    }
    private long blueprintLocationId;
    /**
     * Location ID of the location from which the blueprint was installed. Normally a station ID, but can also be an asset (e.g. container) or corporation facility
     */
    public void setBlueprintLocationId(long val) {
        blueprintLocationId = val;
    }
    /**
     * Location ID of the location from which the blueprint was installed. Normally a station ID, but can also be an asset (e.g. container) or corporation facility
     */
    @JsonProperty("blueprint_location_id")
    public long getBlueprintLocationId() {
        return blueprintLocationId;
    }
    private int blueprintTypeId;
    /**
     * blueprint_type_id integer
     */
    public void setBlueprintTypeId(int val) {
        blueprintTypeId = val;
    }
    /**
     * blueprint_type_id integer
     */
    @JsonProperty("blueprint_type_id")
    public int getBlueprintTypeId() {
        return blueprintTypeId;
    }
    private Integer completedCharacterId;
    /**
     * ID of the character which completed this job
     */
    public void setCompletedCharacterId(Integer val) {
        completedCharacterId = val;
    }
    /**
     * ID of the character which completed this job
     */
    @JsonProperty("completed_character_id")
    public Integer getCompletedCharacterId() {
        return completedCharacterId;
    }
    private Instant completedDate;
    /**
     * Date and time when this job was completed
     */
    public void setCompletedDate(Instant val) {
        completedDate = val;
    }
    /**
     * Date and time when this job was completed
     */
    @JsonProperty("completed_date")
    public Instant getCompletedDate() {
        return completedDate;
    }
    private Double cost;
    /**
     * The sume of job installation fee and industry facility tax
     */
    public void setCost(Double val) {
        cost = val;
    }
    /**
     * The sume of job installation fee and industry facility tax
     */
    @JsonProperty("cost")
    public Double getCost() {
        return cost;
    }
    private int duration;
    /**
     * Job duration in seconds
     */
    public void setDuration(int val) {
        duration = val;
    }
    /**
     * Job duration in seconds
     */
    @JsonProperty("duration")
    public int getDuration() {
        return duration;
    }
    private Instant endDate;
    /**
     * Date and time when this job finished
     */
    public void setEndDate(Instant val) {
        endDate = val;
    }
    /**
     * Date and time when this job finished
     */
    @JsonProperty("end_date")
    public Instant getEndDate() {
        return endDate;
    }
    private long facilityId;
    /**
     * ID of the facility where this job is running
     */
    public void setFacilityId(long val) {
        facilityId = val;
    }
    /**
     * ID of the facility where this job is running
     */
    @JsonProperty("facility_id")
    public long getFacilityId() {
        return facilityId;
    }
    private int installerId;
    /**
     * ID of the character which installed this job
     */
    public void setInstallerId(int val) {
        installerId = val;
    }
    /**
     * ID of the character which installed this job
     */
    @JsonProperty("installer_id")
    public int getInstallerId() {
        return installerId;
    }
    private int jobId;
    /**
     * Unique job ID
     */
    public void setJobId(int val) {
        jobId = val;
    }
    /**
     * Unique job ID
     */
    @JsonProperty("job_id")
    public int getJobId() {
        return jobId;
    }
    private Integer licensedRuns;
    /**
     * Number of runs blueprint is licensed for
     */
    public void setLicensedRuns(Integer val) {
        licensedRuns = val;
    }
    /**
     * Number of runs blueprint is licensed for
     */
    @JsonProperty("licensed_runs")
    public Integer getLicensedRuns() {
        return licensedRuns;
    }
    private long outputLocationId;
    /**
     * Location ID of the location to which the output of the job will be delivered. Normally a station ID, but can also be a corporation facility
     */
    public void setOutputLocationId(long val) {
        outputLocationId = val;
    }
    /**
     * Location ID of the location to which the output of the job will be delivered. Normally a station ID, but can also be a corporation facility
     */
    @JsonProperty("output_location_id")
    public long getOutputLocationId() {
        return outputLocationId;
    }
    private Instant pauseDate;
    /**
     * Date and time when this job was paused (i.e. time when the facility where this job was installed went offline)
     */
    public void setPauseDate(Instant val) {
        pauseDate = val;
    }
    /**
     * Date and time when this job was paused (i.e. time when the facility where this job was installed went offline)
     */
    @JsonProperty("pause_date")
    public Instant getPauseDate() {
        return pauseDate;
    }
    private Float probability;
    /**
     * Chance of success for invention
     */
    public void setProbability(Float val) {
        probability = val;
    }
    /**
     * Chance of success for invention
     */
    @JsonProperty("probability")
    public Float getProbability() {
        return probability;
    }
    private Integer productTypeId;
    /**
     * Type ID of product (manufactured, copied or invented)
     */
    public void setProductTypeId(Integer val) {
        productTypeId = val;
    }
    /**
     * Type ID of product (manufactured, copied or invented)
     */
    @JsonProperty("product_type_id")
    public Integer getProductTypeId() {
        return productTypeId;
    }
    private int runs;
    /**
     * Number of runs for a manufacturing job, or number of copies to make for a blueprint copy
     */
    public void setRuns(int val) {
        runs = val;
    }
    /**
     * Number of runs for a manufacturing job, or number of copies to make for a blueprint copy
     */
    @JsonProperty("runs")
    public int getRuns() {
        return runs;
    }
    private Instant startDate;
    /**
     * Date and time when this job started
     */
    public void setStartDate(Instant val) {
        startDate = val;
    }
    /**
     * Date and time when this job started
     */
    @JsonProperty("start_date")
    public Instant getStartDate() {
        return startDate;
    }
    private long stationId;
    /**
     * ID of the station where industry facility is located
     */
    public void setStationId(long val) {
        stationId = val;
    }
    /**
     * ID of the station where industry facility is located
     */
    @JsonProperty("station_id")
    public long getStationId() {
        return stationId;
    }
    private StatusEnum status;
    /**
     * status string
     */
    public void setStatus(StatusEnum val) {
        status = val;
    }
    /**
     * status string
     */
    @JsonProperty("status")
    public StatusEnum getStatus() {
        return status;
    }
    private Integer successfulRuns;
    /**
     * Number of successful runs for this job. Equal to runs unless this is an invention job
     */
    public void setSuccessfulRuns(Integer val) {
        successfulRuns = val;
    }
    /**
     * Number of successful runs for this job. Equal to runs unless this is an invention job
     */
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
