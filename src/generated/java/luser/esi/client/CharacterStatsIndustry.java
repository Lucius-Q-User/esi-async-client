package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CharacterStatsIndustry implements ApiParameterObject {
    private Long hackingSuccesses;
    public void setHackingSuccesses(Long val) {
        hackingSuccesses = val;
    }
    @JsonProperty("hacking_successes")
    public Long getHackingSuccesses() {
        return hackingSuccesses;
    }
    private Long jobsCancelled;
    public void setJobsCancelled(Long val) {
        jobsCancelled = val;
    }
    @JsonProperty("jobs_cancelled")
    public Long getJobsCancelled() {
        return jobsCancelled;
    }
    private Long jobsCompletedCopyBlueprint;
    public void setJobsCompletedCopyBlueprint(Long val) {
        jobsCompletedCopyBlueprint = val;
    }
    @JsonProperty("jobs_completed_copy_blueprint")
    public Long getJobsCompletedCopyBlueprint() {
        return jobsCompletedCopyBlueprint;
    }
    private Long jobsCompletedInvention;
    public void setJobsCompletedInvention(Long val) {
        jobsCompletedInvention = val;
    }
    @JsonProperty("jobs_completed_invention")
    public Long getJobsCompletedInvention() {
        return jobsCompletedInvention;
    }
    private Long jobsCompletedManufacture;
    public void setJobsCompletedManufacture(Long val) {
        jobsCompletedManufacture = val;
    }
    @JsonProperty("jobs_completed_manufacture")
    public Long getJobsCompletedManufacture() {
        return jobsCompletedManufacture;
    }
    private Long jobsCompletedManufactureAsteroid;
    public void setJobsCompletedManufactureAsteroid(Long val) {
        jobsCompletedManufactureAsteroid = val;
    }
    @JsonProperty("jobs_completed_manufacture_asteroid")
    public Long getJobsCompletedManufactureAsteroid() {
        return jobsCompletedManufactureAsteroid;
    }
    private Long jobsCompletedManufactureAsteroidQuantity;
    public void setJobsCompletedManufactureAsteroidQuantity(Long val) {
        jobsCompletedManufactureAsteroidQuantity = val;
    }
    @JsonProperty("jobs_completed_manufacture_asteroid_quantity")
    public Long getJobsCompletedManufactureAsteroidQuantity() {
        return jobsCompletedManufactureAsteroidQuantity;
    }
    private Long jobsCompletedManufactureCharge;
    public void setJobsCompletedManufactureCharge(Long val) {
        jobsCompletedManufactureCharge = val;
    }
    @JsonProperty("jobs_completed_manufacture_charge")
    public Long getJobsCompletedManufactureCharge() {
        return jobsCompletedManufactureCharge;
    }
    private Long jobsCompletedManufactureChargeQuantity;
    public void setJobsCompletedManufactureChargeQuantity(Long val) {
        jobsCompletedManufactureChargeQuantity = val;
    }
    @JsonProperty("jobs_completed_manufacture_charge_quantity")
    public Long getJobsCompletedManufactureChargeQuantity() {
        return jobsCompletedManufactureChargeQuantity;
    }
    private Long jobsCompletedManufactureCommodity;
    public void setJobsCompletedManufactureCommodity(Long val) {
        jobsCompletedManufactureCommodity = val;
    }
    @JsonProperty("jobs_completed_manufacture_commodity")
    public Long getJobsCompletedManufactureCommodity() {
        return jobsCompletedManufactureCommodity;
    }
    private Long jobsCompletedManufactureCommodityQuantity;
    public void setJobsCompletedManufactureCommodityQuantity(Long val) {
        jobsCompletedManufactureCommodityQuantity = val;
    }
    @JsonProperty("jobs_completed_manufacture_commodity_quantity")
    public Long getJobsCompletedManufactureCommodityQuantity() {
        return jobsCompletedManufactureCommodityQuantity;
    }
    private Long jobsCompletedManufactureDeployable;
    public void setJobsCompletedManufactureDeployable(Long val) {
        jobsCompletedManufactureDeployable = val;
    }
    @JsonProperty("jobs_completed_manufacture_deployable")
    public Long getJobsCompletedManufactureDeployable() {
        return jobsCompletedManufactureDeployable;
    }
    private Long jobsCompletedManufactureDeployableQuantity;
    public void setJobsCompletedManufactureDeployableQuantity(Long val) {
        jobsCompletedManufactureDeployableQuantity = val;
    }
    @JsonProperty("jobs_completed_manufacture_deployable_quantity")
    public Long getJobsCompletedManufactureDeployableQuantity() {
        return jobsCompletedManufactureDeployableQuantity;
    }
    private Long jobsCompletedManufactureDrone;
    public void setJobsCompletedManufactureDrone(Long val) {
        jobsCompletedManufactureDrone = val;
    }
    @JsonProperty("jobs_completed_manufacture_drone")
    public Long getJobsCompletedManufactureDrone() {
        return jobsCompletedManufactureDrone;
    }
    private Long jobsCompletedManufactureDroneQuantity;
    public void setJobsCompletedManufactureDroneQuantity(Long val) {
        jobsCompletedManufactureDroneQuantity = val;
    }
    @JsonProperty("jobs_completed_manufacture_drone_quantity")
    public Long getJobsCompletedManufactureDroneQuantity() {
        return jobsCompletedManufactureDroneQuantity;
    }
    private Long jobsCompletedManufactureImplant;
    public void setJobsCompletedManufactureImplant(Long val) {
        jobsCompletedManufactureImplant = val;
    }
    @JsonProperty("jobs_completed_manufacture_implant")
    public Long getJobsCompletedManufactureImplant() {
        return jobsCompletedManufactureImplant;
    }
    private Long jobsCompletedManufactureImplantQuantity;
    public void setJobsCompletedManufactureImplantQuantity(Long val) {
        jobsCompletedManufactureImplantQuantity = val;
    }
    @JsonProperty("jobs_completed_manufacture_implant_quantity")
    public Long getJobsCompletedManufactureImplantQuantity() {
        return jobsCompletedManufactureImplantQuantity;
    }
    private Long jobsCompletedManufactureModule;
    public void setJobsCompletedManufactureModule(Long val) {
        jobsCompletedManufactureModule = val;
    }
    @JsonProperty("jobs_completed_manufacture_module")
    public Long getJobsCompletedManufactureModule() {
        return jobsCompletedManufactureModule;
    }
    private Long jobsCompletedManufactureModuleQuantity;
    public void setJobsCompletedManufactureModuleQuantity(Long val) {
        jobsCompletedManufactureModuleQuantity = val;
    }
    @JsonProperty("jobs_completed_manufacture_module_quantity")
    public Long getJobsCompletedManufactureModuleQuantity() {
        return jobsCompletedManufactureModuleQuantity;
    }
    private Long jobsCompletedManufactureOther;
    public void setJobsCompletedManufactureOther(Long val) {
        jobsCompletedManufactureOther = val;
    }
    @JsonProperty("jobs_completed_manufacture_other")
    public Long getJobsCompletedManufactureOther() {
        return jobsCompletedManufactureOther;
    }
    private Long jobsCompletedManufactureOtherQuantity;
    public void setJobsCompletedManufactureOtherQuantity(Long val) {
        jobsCompletedManufactureOtherQuantity = val;
    }
    @JsonProperty("jobs_completed_manufacture_other_quantity")
    public Long getJobsCompletedManufactureOtherQuantity() {
        return jobsCompletedManufactureOtherQuantity;
    }
    private Long jobsCompletedManufactureShip;
    public void setJobsCompletedManufactureShip(Long val) {
        jobsCompletedManufactureShip = val;
    }
    @JsonProperty("jobs_completed_manufacture_ship")
    public Long getJobsCompletedManufactureShip() {
        return jobsCompletedManufactureShip;
    }
    private Long jobsCompletedManufactureShipQuantity;
    public void setJobsCompletedManufactureShipQuantity(Long val) {
        jobsCompletedManufactureShipQuantity = val;
    }
    @JsonProperty("jobs_completed_manufacture_ship_quantity")
    public Long getJobsCompletedManufactureShipQuantity() {
        return jobsCompletedManufactureShipQuantity;
    }
    private Long jobsCompletedManufactureStructure;
    public void setJobsCompletedManufactureStructure(Long val) {
        jobsCompletedManufactureStructure = val;
    }
    @JsonProperty("jobs_completed_manufacture_structure")
    public Long getJobsCompletedManufactureStructure() {
        return jobsCompletedManufactureStructure;
    }
    private Long jobsCompletedManufactureStructureQuantity;
    public void setJobsCompletedManufactureStructureQuantity(Long val) {
        jobsCompletedManufactureStructureQuantity = val;
    }
    @JsonProperty("jobs_completed_manufacture_structure_quantity")
    public Long getJobsCompletedManufactureStructureQuantity() {
        return jobsCompletedManufactureStructureQuantity;
    }
    private Long jobsCompletedManufactureSubsystem;
    public void setJobsCompletedManufactureSubsystem(Long val) {
        jobsCompletedManufactureSubsystem = val;
    }
    @JsonProperty("jobs_completed_manufacture_subsystem")
    public Long getJobsCompletedManufactureSubsystem() {
        return jobsCompletedManufactureSubsystem;
    }
    private Long jobsCompletedManufactureSubsystemQuantity;
    public void setJobsCompletedManufactureSubsystemQuantity(Long val) {
        jobsCompletedManufactureSubsystemQuantity = val;
    }
    @JsonProperty("jobs_completed_manufacture_subsystem_quantity")
    public Long getJobsCompletedManufactureSubsystemQuantity() {
        return jobsCompletedManufactureSubsystemQuantity;
    }
    private Long jobsCompletedMaterialProductivity;
    public void setJobsCompletedMaterialProductivity(Long val) {
        jobsCompletedMaterialProductivity = val;
    }
    @JsonProperty("jobs_completed_material_productivity")
    public Long getJobsCompletedMaterialProductivity() {
        return jobsCompletedMaterialProductivity;
    }
    private Long jobsCompletedTimeProductivity;
    public void setJobsCompletedTimeProductivity(Long val) {
        jobsCompletedTimeProductivity = val;
    }
    @JsonProperty("jobs_completed_time_productivity")
    public Long getJobsCompletedTimeProductivity() {
        return jobsCompletedTimeProductivity;
    }
    private Long jobsStartedCopyBlueprint;
    public void setJobsStartedCopyBlueprint(Long val) {
        jobsStartedCopyBlueprint = val;
    }
    @JsonProperty("jobs_started_copy_blueprint")
    public Long getJobsStartedCopyBlueprint() {
        return jobsStartedCopyBlueprint;
    }
    private Long jobsStartedInvention;
    public void setJobsStartedInvention(Long val) {
        jobsStartedInvention = val;
    }
    @JsonProperty("jobs_started_invention")
    public Long getJobsStartedInvention() {
        return jobsStartedInvention;
    }
    private Long jobsStartedManufacture;
    public void setJobsStartedManufacture(Long val) {
        jobsStartedManufacture = val;
    }
    @JsonProperty("jobs_started_manufacture")
    public Long getJobsStartedManufacture() {
        return jobsStartedManufacture;
    }
    private Long jobsStartedMaterialProductivity;
    public void setJobsStartedMaterialProductivity(Long val) {
        jobsStartedMaterialProductivity = val;
    }
    @JsonProperty("jobs_started_material_productivity")
    public Long getJobsStartedMaterialProductivity() {
        return jobsStartedMaterialProductivity;
    }
    private Long jobsStartedTimeProductivity;
    public void setJobsStartedTimeProductivity(Long val) {
        jobsStartedTimeProductivity = val;
    }
    @JsonProperty("jobs_started_time_productivity")
    public Long getJobsStartedTimeProductivity() {
        return jobsStartedTimeProductivity;
    }
    private Long reprocessItem;
    public void setReprocessItem(Long val) {
        reprocessItem = val;
    }
    @JsonProperty("reprocess_item")
    public Long getReprocessItem() {
        return reprocessItem;
    }
    private Long reprocessItemQuantity;
    public void setReprocessItemQuantity(Long val) {
        reprocessItemQuantity = val;
    }
    @JsonProperty("reprocess_item_quantity")
    public Long getReprocessItemQuantity() {
        return reprocessItemQuantity;
    }
}
