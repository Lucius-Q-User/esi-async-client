package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class CharacterStatsTravel {
    private Long accelerationGateActivations;
    public void setAccelerationGateActivations(Long val) {
        accelerationGateActivations = val;
    }
    public Long getAccelerationGateActivations() {
        return accelerationGateActivations;
    }
    private Long alignTo;
    public void setAlignTo(Long val) {
        alignTo = val;
    }
    public Long getAlignTo() {
        return alignTo;
    }
    private Long distanceWarpedHighSec;
    public void setDistanceWarpedHighSec(Long val) {
        distanceWarpedHighSec = val;
    }
    public Long getDistanceWarpedHighSec() {
        return distanceWarpedHighSec;
    }
    private Long distanceWarpedLowSec;
    public void setDistanceWarpedLowSec(Long val) {
        distanceWarpedLowSec = val;
    }
    public Long getDistanceWarpedLowSec() {
        return distanceWarpedLowSec;
    }
    private Long distanceWarpedNullSec;
    public void setDistanceWarpedNullSec(Long val) {
        distanceWarpedNullSec = val;
    }
    public Long getDistanceWarpedNullSec() {
        return distanceWarpedNullSec;
    }
    private Long distanceWarpedWormhole;
    public void setDistanceWarpedWormhole(Long val) {
        distanceWarpedWormhole = val;
    }
    public Long getDistanceWarpedWormhole() {
        return distanceWarpedWormhole;
    }
    private Long docksHighSec;
    public void setDocksHighSec(Long val) {
        docksHighSec = val;
    }
    public Long getDocksHighSec() {
        return docksHighSec;
    }
    private Long docksLowSec;
    public void setDocksLowSec(Long val) {
        docksLowSec = val;
    }
    public Long getDocksLowSec() {
        return docksLowSec;
    }
    private Long docksNullSec;
    public void setDocksNullSec(Long val) {
        docksNullSec = val;
    }
    public Long getDocksNullSec() {
        return docksNullSec;
    }
    private Long jumpsStargateHighSec;
    public void setJumpsStargateHighSec(Long val) {
        jumpsStargateHighSec = val;
    }
    public Long getJumpsStargateHighSec() {
        return jumpsStargateHighSec;
    }
    private Long jumpsStargateLowSec;
    public void setJumpsStargateLowSec(Long val) {
        jumpsStargateLowSec = val;
    }
    public Long getJumpsStargateLowSec() {
        return jumpsStargateLowSec;
    }
    private Long jumpsStargateNullSec;
    public void setJumpsStargateNullSec(Long val) {
        jumpsStargateNullSec = val;
    }
    public Long getJumpsStargateNullSec() {
        return jumpsStargateNullSec;
    }
    private Long jumpsWormhole;
    public void setJumpsWormhole(Long val) {
        jumpsWormhole = val;
    }
    public Long getJumpsWormhole() {
        return jumpsWormhole;
    }
    private Long warpsHighSec;
    public void setWarpsHighSec(Long val) {
        warpsHighSec = val;
    }
    public Long getWarpsHighSec() {
        return warpsHighSec;
    }
    private Long warpsLowSec;
    public void setWarpsLowSec(Long val) {
        warpsLowSec = val;
    }
    public Long getWarpsLowSec() {
        return warpsLowSec;
    }
    private Long warpsNullSec;
    public void setWarpsNullSec(Long val) {
        warpsNullSec = val;
    }
    public Long getWarpsNullSec() {
        return warpsNullSec;
    }
    private Long warpsToBookmark;
    public void setWarpsToBookmark(Long val) {
        warpsToBookmark = val;
    }
    public Long getWarpsToBookmark() {
        return warpsToBookmark;
    }
    private Long warpsToCelestial;
    public void setWarpsToCelestial(Long val) {
        warpsToCelestial = val;
    }
    public Long getWarpsToCelestial() {
        return warpsToCelestial;
    }
    private Long warpsToFleetMember;
    public void setWarpsToFleetMember(Long val) {
        warpsToFleetMember = val;
    }
    public Long getWarpsToFleetMember() {
        return warpsToFleetMember;
    }
    private Long warpsToScanResult;
    public void setWarpsToScanResult(Long val) {
        warpsToScanResult = val;
    }
    public Long getWarpsToScanResult() {
        return warpsToScanResult;
    }
    private Long warpsWormhole;
    public void setWarpsWormhole(Long val) {
        warpsWormhole = val;
    }
    public Long getWarpsWormhole() {
        return warpsWormhole;
    }
    static CharacterStatsTravel fromJson(Json json) {
        if (json == null) {
            return null;
        }
        CharacterStatsTravel self = new CharacterStatsTravel();
        Map<String, Json> js = json.asJsonMap();
        self.accelerationGateActivations = ApiClientBase.optGetLong(js.get("acceleration_gate_activations"));
        self.alignTo = ApiClientBase.optGetLong(js.get("align_to"));
        self.distanceWarpedHighSec = ApiClientBase.optGetLong(js.get("distance_warped_high_sec"));
        self.distanceWarpedLowSec = ApiClientBase.optGetLong(js.get("distance_warped_low_sec"));
        self.distanceWarpedNullSec = ApiClientBase.optGetLong(js.get("distance_warped_null_sec"));
        self.distanceWarpedWormhole = ApiClientBase.optGetLong(js.get("distance_warped_wormhole"));
        self.docksHighSec = ApiClientBase.optGetLong(js.get("docks_high_sec"));
        self.docksLowSec = ApiClientBase.optGetLong(js.get("docks_low_sec"));
        self.docksNullSec = ApiClientBase.optGetLong(js.get("docks_null_sec"));
        self.jumpsStargateHighSec = ApiClientBase.optGetLong(js.get("jumps_stargate_high_sec"));
        self.jumpsStargateLowSec = ApiClientBase.optGetLong(js.get("jumps_stargate_low_sec"));
        self.jumpsStargateNullSec = ApiClientBase.optGetLong(js.get("jumps_stargate_null_sec"));
        self.jumpsWormhole = ApiClientBase.optGetLong(js.get("jumps_wormhole"));
        self.warpsHighSec = ApiClientBase.optGetLong(js.get("warps_high_sec"));
        self.warpsLowSec = ApiClientBase.optGetLong(js.get("warps_low_sec"));
        self.warpsNullSec = ApiClientBase.optGetLong(js.get("warps_null_sec"));
        self.warpsToBookmark = ApiClientBase.optGetLong(js.get("warps_to_bookmark"));
        self.warpsToCelestial = ApiClientBase.optGetLong(js.get("warps_to_celestial"));
        self.warpsToFleetMember = ApiClientBase.optGetLong(js.get("warps_to_fleet_member"));
        self.warpsToScanResult = ApiClientBase.optGetLong(js.get("warps_to_scan_result"));
        self.warpsWormhole = ApiClientBase.optGetLong(js.get("warps_wormhole"));
        return self;
    }
}
