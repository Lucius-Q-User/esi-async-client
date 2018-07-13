package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CharacterStatsTravel implements ApiParameterObject {
    private Long accelerationGateActivations;
    public void setAccelerationGateActivations(Long val) {
        accelerationGateActivations = val;
    }
    @JsonProperty("acceleration_gate_activations")
    public Long getAccelerationGateActivations() {
        return accelerationGateActivations;
    }
    private Long alignTo;
    public void setAlignTo(Long val) {
        alignTo = val;
    }
    @JsonProperty("align_to")
    public Long getAlignTo() {
        return alignTo;
    }
    private Long distanceWarpedHighSec;
    public void setDistanceWarpedHighSec(Long val) {
        distanceWarpedHighSec = val;
    }
    @JsonProperty("distance_warped_high_sec")
    public Long getDistanceWarpedHighSec() {
        return distanceWarpedHighSec;
    }
    private Long distanceWarpedLowSec;
    public void setDistanceWarpedLowSec(Long val) {
        distanceWarpedLowSec = val;
    }
    @JsonProperty("distance_warped_low_sec")
    public Long getDistanceWarpedLowSec() {
        return distanceWarpedLowSec;
    }
    private Long distanceWarpedNullSec;
    public void setDistanceWarpedNullSec(Long val) {
        distanceWarpedNullSec = val;
    }
    @JsonProperty("distance_warped_null_sec")
    public Long getDistanceWarpedNullSec() {
        return distanceWarpedNullSec;
    }
    private Long distanceWarpedWormhole;
    public void setDistanceWarpedWormhole(Long val) {
        distanceWarpedWormhole = val;
    }
    @JsonProperty("distance_warped_wormhole")
    public Long getDistanceWarpedWormhole() {
        return distanceWarpedWormhole;
    }
    private Long docksHighSec;
    public void setDocksHighSec(Long val) {
        docksHighSec = val;
    }
    @JsonProperty("docks_high_sec")
    public Long getDocksHighSec() {
        return docksHighSec;
    }
    private Long docksLowSec;
    public void setDocksLowSec(Long val) {
        docksLowSec = val;
    }
    @JsonProperty("docks_low_sec")
    public Long getDocksLowSec() {
        return docksLowSec;
    }
    private Long docksNullSec;
    public void setDocksNullSec(Long val) {
        docksNullSec = val;
    }
    @JsonProperty("docks_null_sec")
    public Long getDocksNullSec() {
        return docksNullSec;
    }
    private Long jumpsStargateHighSec;
    public void setJumpsStargateHighSec(Long val) {
        jumpsStargateHighSec = val;
    }
    @JsonProperty("jumps_stargate_high_sec")
    public Long getJumpsStargateHighSec() {
        return jumpsStargateHighSec;
    }
    private Long jumpsStargateLowSec;
    public void setJumpsStargateLowSec(Long val) {
        jumpsStargateLowSec = val;
    }
    @JsonProperty("jumps_stargate_low_sec")
    public Long getJumpsStargateLowSec() {
        return jumpsStargateLowSec;
    }
    private Long jumpsStargateNullSec;
    public void setJumpsStargateNullSec(Long val) {
        jumpsStargateNullSec = val;
    }
    @JsonProperty("jumps_stargate_null_sec")
    public Long getJumpsStargateNullSec() {
        return jumpsStargateNullSec;
    }
    private Long jumpsWormhole;
    public void setJumpsWormhole(Long val) {
        jumpsWormhole = val;
    }
    @JsonProperty("jumps_wormhole")
    public Long getJumpsWormhole() {
        return jumpsWormhole;
    }
    private Long warpsHighSec;
    public void setWarpsHighSec(Long val) {
        warpsHighSec = val;
    }
    @JsonProperty("warps_high_sec")
    public Long getWarpsHighSec() {
        return warpsHighSec;
    }
    private Long warpsLowSec;
    public void setWarpsLowSec(Long val) {
        warpsLowSec = val;
    }
    @JsonProperty("warps_low_sec")
    public Long getWarpsLowSec() {
        return warpsLowSec;
    }
    private Long warpsNullSec;
    public void setWarpsNullSec(Long val) {
        warpsNullSec = val;
    }
    @JsonProperty("warps_null_sec")
    public Long getWarpsNullSec() {
        return warpsNullSec;
    }
    private Long warpsToBookmark;
    public void setWarpsToBookmark(Long val) {
        warpsToBookmark = val;
    }
    @JsonProperty("warps_to_bookmark")
    public Long getWarpsToBookmark() {
        return warpsToBookmark;
    }
    private Long warpsToCelestial;
    public void setWarpsToCelestial(Long val) {
        warpsToCelestial = val;
    }
    @JsonProperty("warps_to_celestial")
    public Long getWarpsToCelestial() {
        return warpsToCelestial;
    }
    private Long warpsToFleetMember;
    public void setWarpsToFleetMember(Long val) {
        warpsToFleetMember = val;
    }
    @JsonProperty("warps_to_fleet_member")
    public Long getWarpsToFleetMember() {
        return warpsToFleetMember;
    }
    private Long warpsToScanResult;
    public void setWarpsToScanResult(Long val) {
        warpsToScanResult = val;
    }
    @JsonProperty("warps_to_scan_result")
    public Long getWarpsToScanResult() {
        return warpsToScanResult;
    }
    private Long warpsWormhole;
    public void setWarpsWormhole(Long val) {
        warpsWormhole = val;
    }
    @JsonProperty("warps_wormhole")
    public Long getWarpsWormhole() {
        return warpsWormhole;
    }
}
