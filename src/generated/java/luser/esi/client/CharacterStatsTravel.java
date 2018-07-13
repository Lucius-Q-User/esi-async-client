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
    /**
     * acceleration_gate_activations integer
     */
    public void setAccelerationGateActivations(Long val) {
        accelerationGateActivations = val;
    }
    /**
     * acceleration_gate_activations integer
     */
    @JsonProperty("acceleration_gate_activations")
    public Long getAccelerationGateActivations() {
        return accelerationGateActivations;
    }
    private Long alignTo;
    /**
     * align_to integer
     */
    public void setAlignTo(Long val) {
        alignTo = val;
    }
    /**
     * align_to integer
     */
    @JsonProperty("align_to")
    public Long getAlignTo() {
        return alignTo;
    }
    private Long distanceWarpedHighSec;
    /**
     * distance_warped_high_sec integer
     */
    public void setDistanceWarpedHighSec(Long val) {
        distanceWarpedHighSec = val;
    }
    /**
     * distance_warped_high_sec integer
     */
    @JsonProperty("distance_warped_high_sec")
    public Long getDistanceWarpedHighSec() {
        return distanceWarpedHighSec;
    }
    private Long distanceWarpedLowSec;
    /**
     * distance_warped_low_sec integer
     */
    public void setDistanceWarpedLowSec(Long val) {
        distanceWarpedLowSec = val;
    }
    /**
     * distance_warped_low_sec integer
     */
    @JsonProperty("distance_warped_low_sec")
    public Long getDistanceWarpedLowSec() {
        return distanceWarpedLowSec;
    }
    private Long distanceWarpedNullSec;
    /**
     * distance_warped_null_sec integer
     */
    public void setDistanceWarpedNullSec(Long val) {
        distanceWarpedNullSec = val;
    }
    /**
     * distance_warped_null_sec integer
     */
    @JsonProperty("distance_warped_null_sec")
    public Long getDistanceWarpedNullSec() {
        return distanceWarpedNullSec;
    }
    private Long distanceWarpedWormhole;
    /**
     * distance_warped_wormhole integer
     */
    public void setDistanceWarpedWormhole(Long val) {
        distanceWarpedWormhole = val;
    }
    /**
     * distance_warped_wormhole integer
     */
    @JsonProperty("distance_warped_wormhole")
    public Long getDistanceWarpedWormhole() {
        return distanceWarpedWormhole;
    }
    private Long docksHighSec;
    /**
     * docks_high_sec integer
     */
    public void setDocksHighSec(Long val) {
        docksHighSec = val;
    }
    /**
     * docks_high_sec integer
     */
    @JsonProperty("docks_high_sec")
    public Long getDocksHighSec() {
        return docksHighSec;
    }
    private Long docksLowSec;
    /**
     * docks_low_sec integer
     */
    public void setDocksLowSec(Long val) {
        docksLowSec = val;
    }
    /**
     * docks_low_sec integer
     */
    @JsonProperty("docks_low_sec")
    public Long getDocksLowSec() {
        return docksLowSec;
    }
    private Long docksNullSec;
    /**
     * docks_null_sec integer
     */
    public void setDocksNullSec(Long val) {
        docksNullSec = val;
    }
    /**
     * docks_null_sec integer
     */
    @JsonProperty("docks_null_sec")
    public Long getDocksNullSec() {
        return docksNullSec;
    }
    private Long jumpsStargateHighSec;
    /**
     * jumps_stargate_high_sec integer
     */
    public void setJumpsStargateHighSec(Long val) {
        jumpsStargateHighSec = val;
    }
    /**
     * jumps_stargate_high_sec integer
     */
    @JsonProperty("jumps_stargate_high_sec")
    public Long getJumpsStargateHighSec() {
        return jumpsStargateHighSec;
    }
    private Long jumpsStargateLowSec;
    /**
     * jumps_stargate_low_sec integer
     */
    public void setJumpsStargateLowSec(Long val) {
        jumpsStargateLowSec = val;
    }
    /**
     * jumps_stargate_low_sec integer
     */
    @JsonProperty("jumps_stargate_low_sec")
    public Long getJumpsStargateLowSec() {
        return jumpsStargateLowSec;
    }
    private Long jumpsStargateNullSec;
    /**
     * jumps_stargate_null_sec integer
     */
    public void setJumpsStargateNullSec(Long val) {
        jumpsStargateNullSec = val;
    }
    /**
     * jumps_stargate_null_sec integer
     */
    @JsonProperty("jumps_stargate_null_sec")
    public Long getJumpsStargateNullSec() {
        return jumpsStargateNullSec;
    }
    private Long jumpsWormhole;
    /**
     * jumps_wormhole integer
     */
    public void setJumpsWormhole(Long val) {
        jumpsWormhole = val;
    }
    /**
     * jumps_wormhole integer
     */
    @JsonProperty("jumps_wormhole")
    public Long getJumpsWormhole() {
        return jumpsWormhole;
    }
    private Long warpsHighSec;
    /**
     * warps_high_sec integer
     */
    public void setWarpsHighSec(Long val) {
        warpsHighSec = val;
    }
    /**
     * warps_high_sec integer
     */
    @JsonProperty("warps_high_sec")
    public Long getWarpsHighSec() {
        return warpsHighSec;
    }
    private Long warpsLowSec;
    /**
     * warps_low_sec integer
     */
    public void setWarpsLowSec(Long val) {
        warpsLowSec = val;
    }
    /**
     * warps_low_sec integer
     */
    @JsonProperty("warps_low_sec")
    public Long getWarpsLowSec() {
        return warpsLowSec;
    }
    private Long warpsNullSec;
    /**
     * warps_null_sec integer
     */
    public void setWarpsNullSec(Long val) {
        warpsNullSec = val;
    }
    /**
     * warps_null_sec integer
     */
    @JsonProperty("warps_null_sec")
    public Long getWarpsNullSec() {
        return warpsNullSec;
    }
    private Long warpsToBookmark;
    /**
     * warps_to_bookmark integer
     */
    public void setWarpsToBookmark(Long val) {
        warpsToBookmark = val;
    }
    /**
     * warps_to_bookmark integer
     */
    @JsonProperty("warps_to_bookmark")
    public Long getWarpsToBookmark() {
        return warpsToBookmark;
    }
    private Long warpsToCelestial;
    /**
     * warps_to_celestial integer
     */
    public void setWarpsToCelestial(Long val) {
        warpsToCelestial = val;
    }
    /**
     * warps_to_celestial integer
     */
    @JsonProperty("warps_to_celestial")
    public Long getWarpsToCelestial() {
        return warpsToCelestial;
    }
    private Long warpsToFleetMember;
    /**
     * warps_to_fleet_member integer
     */
    public void setWarpsToFleetMember(Long val) {
        warpsToFleetMember = val;
    }
    /**
     * warps_to_fleet_member integer
     */
    @JsonProperty("warps_to_fleet_member")
    public Long getWarpsToFleetMember() {
        return warpsToFleetMember;
    }
    private Long warpsToScanResult;
    /**
     * warps_to_scan_result integer
     */
    public void setWarpsToScanResult(Long val) {
        warpsToScanResult = val;
    }
    /**
     * warps_to_scan_result integer
     */
    @JsonProperty("warps_to_scan_result")
    public Long getWarpsToScanResult() {
        return warpsToScanResult;
    }
    private Long warpsWormhole;
    /**
     * warps_wormhole integer
     */
    public void setWarpsWormhole(Long val) {
        warpsWormhole = val;
    }
    /**
     * warps_wormhole integer
     */
    @JsonProperty("warps_wormhole")
    public Long getWarpsWormhole() {
        return warpsWormhole;
    }
}
