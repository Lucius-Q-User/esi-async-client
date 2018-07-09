package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class IndustryJobInfo {
    private int activityId;
    public void setActivityId(int val) {
        activityId = val;
    }
    public int getActivityId() {
        return activityId;
    }
    private long blueprintId;
    public void setBlueprintId(long val) {
        blueprintId = val;
    }
    public long getBlueprintId() {
        return blueprintId;
    }
    private long blueprintLocationId;
    public void setBlueprintLocationId(long val) {
        blueprintLocationId = val;
    }
    public long getBlueprintLocationId() {
        return blueprintLocationId;
    }
    private int blueprintTypeId;
    public void setBlueprintTypeId(int val) {
        blueprintTypeId = val;
    }
    public int getBlueprintTypeId() {
        return blueprintTypeId;
    }
    private Integer completedCharacterId;
    public void setCompletedCharacterId(Integer val) {
        completedCharacterId = val;
    }
    public Integer getCompletedCharacterId() {
        return completedCharacterId;
    }
    private Instant completedDate;
    public void setCompletedDate(Instant val) {
        completedDate = val;
    }
    public Instant getCompletedDate() {
        return completedDate;
    }
    private Double cost;
    public void setCost(Double val) {
        cost = val;
    }
    public Double getCost() {
        return cost;
    }
    private int duration;
    public void setDuration(int val) {
        duration = val;
    }
    public int getDuration() {
        return duration;
    }
    private Instant endDate;
    public void setEndDate(Instant val) {
        endDate = val;
    }
    public Instant getEndDate() {
        return endDate;
    }
    private long facilityId;
    public void setFacilityId(long val) {
        facilityId = val;
    }
    public long getFacilityId() {
        return facilityId;
    }
    private int installerId;
    public void setInstallerId(int val) {
        installerId = val;
    }
    public int getInstallerId() {
        return installerId;
    }
    private int jobId;
    public void setJobId(int val) {
        jobId = val;
    }
    public int getJobId() {
        return jobId;
    }
    private Integer licensedRuns;
    public void setLicensedRuns(Integer val) {
        licensedRuns = val;
    }
    public Integer getLicensedRuns() {
        return licensedRuns;
    }
    private long outputLocationId;
    public void setOutputLocationId(long val) {
        outputLocationId = val;
    }
    public long getOutputLocationId() {
        return outputLocationId;
    }
    private Instant pauseDate;
    public void setPauseDate(Instant val) {
        pauseDate = val;
    }
    public Instant getPauseDate() {
        return pauseDate;
    }
    private Float probability;
    public void setProbability(Float val) {
        probability = val;
    }
    public Float getProbability() {
        return probability;
    }
    private Integer productTypeId;
    public void setProductTypeId(Integer val) {
        productTypeId = val;
    }
    public Integer getProductTypeId() {
        return productTypeId;
    }
    private int runs;
    public void setRuns(int val) {
        runs = val;
    }
    public int getRuns() {
        return runs;
    }
    private Instant startDate;
    public void setStartDate(Instant val) {
        startDate = val;
    }
    public Instant getStartDate() {
        return startDate;
    }
    private long stationId;
    public void setStationId(long val) {
        stationId = val;
    }
    public long getStationId() {
        return stationId;
    }
    private StatusEnum status;
    public void setStatus(StatusEnum val) {
        status = val;
    }
    public StatusEnum getStatus() {
        return status;
    }
    private Integer successfulRuns;
    public void setSuccessfulRuns(Integer val) {
        successfulRuns = val;
    }
    public Integer getSuccessfulRuns() {
        return successfulRuns;
    }
    static IndustryJobInfo fromJson(Json json) {
        if (json == null) {
            return null;
        }
        IndustryJobInfo self = new IndustryJobInfo();
        Map<String, Json> js = json.asJsonMap();
        self.activityId = ApiClientBase.optGetInteger(js.get("activity_id"));
        self.blueprintId = ApiClientBase.optGetLong(js.get("blueprint_id"));
        self.blueprintLocationId = ApiClientBase.optGetLong(js.get("blueprint_location_id"));
        self.blueprintTypeId = ApiClientBase.optGetInteger(js.get("blueprint_type_id"));
        self.completedCharacterId = ApiClientBase.optGetInteger(js.get("completed_character_id"));
        self.completedDate = ApiClientBase.optGetInstant(js.get("completed_date"));
        self.cost = ApiClientBase.optGetDouble(js.get("cost"));
        self.duration = ApiClientBase.optGetInteger(js.get("duration"));
        self.endDate = ApiClientBase.optGetInstant(js.get("end_date"));
        self.facilityId = ApiClientBase.optGetLong(js.get("facility_id"));
        self.installerId = ApiClientBase.optGetInteger(js.get("installer_id"));
        self.jobId = ApiClientBase.optGetInteger(js.get("job_id"));
        self.licensedRuns = ApiClientBase.optGetInteger(js.get("licensed_runs"));
        self.outputLocationId = ApiClientBase.optGetLong(js.get("output_location_id"));
        self.pauseDate = ApiClientBase.optGetInstant(js.get("pause_date"));
        self.probability = ApiClientBase.optGetFloat(js.get("probability"));
        self.productTypeId = ApiClientBase.optGetInteger(js.get("product_type_id"));
        self.runs = ApiClientBase.optGetInteger(js.get("runs"));
        self.startDate = ApiClientBase.optGetInstant(js.get("start_date"));
        self.stationId = ApiClientBase.optGetLong(js.get("station_id"));
        self.status = StatusEnum.fromString(ApiClientBase.optGetString(js.get("status")));
        self.successfulRuns = ApiClientBase.optGetInteger(js.get("successful_runs"));
        return self;
    }
    public static enum StatusEnum {
        ACTIVE("active"),
        CANCELLED("cancelled"),
        DELIVERED("delivered"),
        PAUSED("paused"),
        READY("ready"),
        REVERTED("reverted");
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
}
