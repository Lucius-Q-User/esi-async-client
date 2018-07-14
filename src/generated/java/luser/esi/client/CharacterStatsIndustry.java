package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.carrotsearch.hppc.IntArrayList;
import com.carrotsearch.hppc.LongArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CharacterStatsIndustry implements ApiParameterObject {
    private Long hackingSuccesses;
    /**
     * hacking_successes integer
     */
    public void setHackingSuccesses(Long val) {
        hackingSuccesses = val;
    }
    /**
     * hacking_successes integer
     */
    @JsonProperty("hacking_successes")
    public Long getHackingSuccesses() {
        return hackingSuccesses;
    }
    private Long jobsCancelled;
    /**
     * jobs_cancelled integer
     */
    public void setJobsCancelled(Long val) {
        jobsCancelled = val;
    }
    /**
     * jobs_cancelled integer
     */
    @JsonProperty("jobs_cancelled")
    public Long getJobsCancelled() {
        return jobsCancelled;
    }
    private Long jobsCompletedCopyBlueprint;
    /**
     * jobs_completed_copy_blueprint integer
     */
    public void setJobsCompletedCopyBlueprint(Long val) {
        jobsCompletedCopyBlueprint = val;
    }
    /**
     * jobs_completed_copy_blueprint integer
     */
    @JsonProperty("jobs_completed_copy_blueprint")
    public Long getJobsCompletedCopyBlueprint() {
        return jobsCompletedCopyBlueprint;
    }
    private Long jobsCompletedInvention;
    /**
     * jobs_completed_invention integer
     */
    public void setJobsCompletedInvention(Long val) {
        jobsCompletedInvention = val;
    }
    /**
     * jobs_completed_invention integer
     */
    @JsonProperty("jobs_completed_invention")
    public Long getJobsCompletedInvention() {
        return jobsCompletedInvention;
    }
    private Long jobsCompletedManufacture;
    /**
     * jobs_completed_manufacture integer
     */
    public void setJobsCompletedManufacture(Long val) {
        jobsCompletedManufacture = val;
    }
    /**
     * jobs_completed_manufacture integer
     */
    @JsonProperty("jobs_completed_manufacture")
    public Long getJobsCompletedManufacture() {
        return jobsCompletedManufacture;
    }
    private Long jobsCompletedManufactureAsteroid;
    /**
     * jobs_completed_manufacture_asteroid integer
     */
    public void setJobsCompletedManufactureAsteroid(Long val) {
        jobsCompletedManufactureAsteroid = val;
    }
    /**
     * jobs_completed_manufacture_asteroid integer
     */
    @JsonProperty("jobs_completed_manufacture_asteroid")
    public Long getJobsCompletedManufactureAsteroid() {
        return jobsCompletedManufactureAsteroid;
    }
    private Long jobsCompletedManufactureAsteroidQuantity;
    /**
     * jobs_completed_manufacture_asteroid_quantity integer
     */
    public void setJobsCompletedManufactureAsteroidQuantity(Long val) {
        jobsCompletedManufactureAsteroidQuantity = val;
    }
    /**
     * jobs_completed_manufacture_asteroid_quantity integer
     */
    @JsonProperty("jobs_completed_manufacture_asteroid_quantity")
    public Long getJobsCompletedManufactureAsteroidQuantity() {
        return jobsCompletedManufactureAsteroidQuantity;
    }
    private Long jobsCompletedManufactureCharge;
    /**
     * jobs_completed_manufacture_charge integer
     */
    public void setJobsCompletedManufactureCharge(Long val) {
        jobsCompletedManufactureCharge = val;
    }
    /**
     * jobs_completed_manufacture_charge integer
     */
    @JsonProperty("jobs_completed_manufacture_charge")
    public Long getJobsCompletedManufactureCharge() {
        return jobsCompletedManufactureCharge;
    }
    private Long jobsCompletedManufactureChargeQuantity;
    /**
     * jobs_completed_manufacture_charge_quantity integer
     */
    public void setJobsCompletedManufactureChargeQuantity(Long val) {
        jobsCompletedManufactureChargeQuantity = val;
    }
    /**
     * jobs_completed_manufacture_charge_quantity integer
     */
    @JsonProperty("jobs_completed_manufacture_charge_quantity")
    public Long getJobsCompletedManufactureChargeQuantity() {
        return jobsCompletedManufactureChargeQuantity;
    }
    private Long jobsCompletedManufactureCommodity;
    /**
     * jobs_completed_manufacture_commodity integer
     */
    public void setJobsCompletedManufactureCommodity(Long val) {
        jobsCompletedManufactureCommodity = val;
    }
    /**
     * jobs_completed_manufacture_commodity integer
     */
    @JsonProperty("jobs_completed_manufacture_commodity")
    public Long getJobsCompletedManufactureCommodity() {
        return jobsCompletedManufactureCommodity;
    }
    private Long jobsCompletedManufactureCommodityQuantity;
    /**
     * jobs_completed_manufacture_commodity_quantity integer
     */
    public void setJobsCompletedManufactureCommodityQuantity(Long val) {
        jobsCompletedManufactureCommodityQuantity = val;
    }
    /**
     * jobs_completed_manufacture_commodity_quantity integer
     */
    @JsonProperty("jobs_completed_manufacture_commodity_quantity")
    public Long getJobsCompletedManufactureCommodityQuantity() {
        return jobsCompletedManufactureCommodityQuantity;
    }
    private Long jobsCompletedManufactureDeployable;
    /**
     * jobs_completed_manufacture_deployable integer
     */
    public void setJobsCompletedManufactureDeployable(Long val) {
        jobsCompletedManufactureDeployable = val;
    }
    /**
     * jobs_completed_manufacture_deployable integer
     */
    @JsonProperty("jobs_completed_manufacture_deployable")
    public Long getJobsCompletedManufactureDeployable() {
        return jobsCompletedManufactureDeployable;
    }
    private Long jobsCompletedManufactureDeployableQuantity;
    /**
     * jobs_completed_manufacture_deployable_quantity integer
     */
    public void setJobsCompletedManufactureDeployableQuantity(Long val) {
        jobsCompletedManufactureDeployableQuantity = val;
    }
    /**
     * jobs_completed_manufacture_deployable_quantity integer
     */
    @JsonProperty("jobs_completed_manufacture_deployable_quantity")
    public Long getJobsCompletedManufactureDeployableQuantity() {
        return jobsCompletedManufactureDeployableQuantity;
    }
    private Long jobsCompletedManufactureDrone;
    /**
     * jobs_completed_manufacture_drone integer
     */
    public void setJobsCompletedManufactureDrone(Long val) {
        jobsCompletedManufactureDrone = val;
    }
    /**
     * jobs_completed_manufacture_drone integer
     */
    @JsonProperty("jobs_completed_manufacture_drone")
    public Long getJobsCompletedManufactureDrone() {
        return jobsCompletedManufactureDrone;
    }
    private Long jobsCompletedManufactureDroneQuantity;
    /**
     * jobs_completed_manufacture_drone_quantity integer
     */
    public void setJobsCompletedManufactureDroneQuantity(Long val) {
        jobsCompletedManufactureDroneQuantity = val;
    }
    /**
     * jobs_completed_manufacture_drone_quantity integer
     */
    @JsonProperty("jobs_completed_manufacture_drone_quantity")
    public Long getJobsCompletedManufactureDroneQuantity() {
        return jobsCompletedManufactureDroneQuantity;
    }
    private Long jobsCompletedManufactureImplant;
    /**
     * jobs_completed_manufacture_implant integer
     */
    public void setJobsCompletedManufactureImplant(Long val) {
        jobsCompletedManufactureImplant = val;
    }
    /**
     * jobs_completed_manufacture_implant integer
     */
    @JsonProperty("jobs_completed_manufacture_implant")
    public Long getJobsCompletedManufactureImplant() {
        return jobsCompletedManufactureImplant;
    }
    private Long jobsCompletedManufactureImplantQuantity;
    /**
     * jobs_completed_manufacture_implant_quantity integer
     */
    public void setJobsCompletedManufactureImplantQuantity(Long val) {
        jobsCompletedManufactureImplantQuantity = val;
    }
    /**
     * jobs_completed_manufacture_implant_quantity integer
     */
    @JsonProperty("jobs_completed_manufacture_implant_quantity")
    public Long getJobsCompletedManufactureImplantQuantity() {
        return jobsCompletedManufactureImplantQuantity;
    }
    private Long jobsCompletedManufactureModule;
    /**
     * jobs_completed_manufacture_module integer
     */
    public void setJobsCompletedManufactureModule(Long val) {
        jobsCompletedManufactureModule = val;
    }
    /**
     * jobs_completed_manufacture_module integer
     */
    @JsonProperty("jobs_completed_manufacture_module")
    public Long getJobsCompletedManufactureModule() {
        return jobsCompletedManufactureModule;
    }
    private Long jobsCompletedManufactureModuleQuantity;
    /**
     * jobs_completed_manufacture_module_quantity integer
     */
    public void setJobsCompletedManufactureModuleQuantity(Long val) {
        jobsCompletedManufactureModuleQuantity = val;
    }
    /**
     * jobs_completed_manufacture_module_quantity integer
     */
    @JsonProperty("jobs_completed_manufacture_module_quantity")
    public Long getJobsCompletedManufactureModuleQuantity() {
        return jobsCompletedManufactureModuleQuantity;
    }
    private Long jobsCompletedManufactureOther;
    /**
     * jobs_completed_manufacture_other integer
     */
    public void setJobsCompletedManufactureOther(Long val) {
        jobsCompletedManufactureOther = val;
    }
    /**
     * jobs_completed_manufacture_other integer
     */
    @JsonProperty("jobs_completed_manufacture_other")
    public Long getJobsCompletedManufactureOther() {
        return jobsCompletedManufactureOther;
    }
    private Long jobsCompletedManufactureOtherQuantity;
    /**
     * jobs_completed_manufacture_other_quantity integer
     */
    public void setJobsCompletedManufactureOtherQuantity(Long val) {
        jobsCompletedManufactureOtherQuantity = val;
    }
    /**
     * jobs_completed_manufacture_other_quantity integer
     */
    @JsonProperty("jobs_completed_manufacture_other_quantity")
    public Long getJobsCompletedManufactureOtherQuantity() {
        return jobsCompletedManufactureOtherQuantity;
    }
    private Long jobsCompletedManufactureShip;
    /**
     * jobs_completed_manufacture_ship integer
     */
    public void setJobsCompletedManufactureShip(Long val) {
        jobsCompletedManufactureShip = val;
    }
    /**
     * jobs_completed_manufacture_ship integer
     */
    @JsonProperty("jobs_completed_manufacture_ship")
    public Long getJobsCompletedManufactureShip() {
        return jobsCompletedManufactureShip;
    }
    private Long jobsCompletedManufactureShipQuantity;
    /**
     * jobs_completed_manufacture_ship_quantity integer
     */
    public void setJobsCompletedManufactureShipQuantity(Long val) {
        jobsCompletedManufactureShipQuantity = val;
    }
    /**
     * jobs_completed_manufacture_ship_quantity integer
     */
    @JsonProperty("jobs_completed_manufacture_ship_quantity")
    public Long getJobsCompletedManufactureShipQuantity() {
        return jobsCompletedManufactureShipQuantity;
    }
    private Long jobsCompletedManufactureStructure;
    /**
     * jobs_completed_manufacture_structure integer
     */
    public void setJobsCompletedManufactureStructure(Long val) {
        jobsCompletedManufactureStructure = val;
    }
    /**
     * jobs_completed_manufacture_structure integer
     */
    @JsonProperty("jobs_completed_manufacture_structure")
    public Long getJobsCompletedManufactureStructure() {
        return jobsCompletedManufactureStructure;
    }
    private Long jobsCompletedManufactureStructureQuantity;
    /**
     * jobs_completed_manufacture_structure_quantity integer
     */
    public void setJobsCompletedManufactureStructureQuantity(Long val) {
        jobsCompletedManufactureStructureQuantity = val;
    }
    /**
     * jobs_completed_manufacture_structure_quantity integer
     */
    @JsonProperty("jobs_completed_manufacture_structure_quantity")
    public Long getJobsCompletedManufactureStructureQuantity() {
        return jobsCompletedManufactureStructureQuantity;
    }
    private Long jobsCompletedManufactureSubsystem;
    /**
     * jobs_completed_manufacture_subsystem integer
     */
    public void setJobsCompletedManufactureSubsystem(Long val) {
        jobsCompletedManufactureSubsystem = val;
    }
    /**
     * jobs_completed_manufacture_subsystem integer
     */
    @JsonProperty("jobs_completed_manufacture_subsystem")
    public Long getJobsCompletedManufactureSubsystem() {
        return jobsCompletedManufactureSubsystem;
    }
    private Long jobsCompletedManufactureSubsystemQuantity;
    /**
     * jobs_completed_manufacture_subsystem_quantity integer
     */
    public void setJobsCompletedManufactureSubsystemQuantity(Long val) {
        jobsCompletedManufactureSubsystemQuantity = val;
    }
    /**
     * jobs_completed_manufacture_subsystem_quantity integer
     */
    @JsonProperty("jobs_completed_manufacture_subsystem_quantity")
    public Long getJobsCompletedManufactureSubsystemQuantity() {
        return jobsCompletedManufactureSubsystemQuantity;
    }
    private Long jobsCompletedMaterialProductivity;
    /**
     * jobs_completed_material_productivity integer
     */
    public void setJobsCompletedMaterialProductivity(Long val) {
        jobsCompletedMaterialProductivity = val;
    }
    /**
     * jobs_completed_material_productivity integer
     */
    @JsonProperty("jobs_completed_material_productivity")
    public Long getJobsCompletedMaterialProductivity() {
        return jobsCompletedMaterialProductivity;
    }
    private Long jobsCompletedTimeProductivity;
    /**
     * jobs_completed_time_productivity integer
     */
    public void setJobsCompletedTimeProductivity(Long val) {
        jobsCompletedTimeProductivity = val;
    }
    /**
     * jobs_completed_time_productivity integer
     */
    @JsonProperty("jobs_completed_time_productivity")
    public Long getJobsCompletedTimeProductivity() {
        return jobsCompletedTimeProductivity;
    }
    private Long jobsStartedCopyBlueprint;
    /**
     * jobs_started_copy_blueprint integer
     */
    public void setJobsStartedCopyBlueprint(Long val) {
        jobsStartedCopyBlueprint = val;
    }
    /**
     * jobs_started_copy_blueprint integer
     */
    @JsonProperty("jobs_started_copy_blueprint")
    public Long getJobsStartedCopyBlueprint() {
        return jobsStartedCopyBlueprint;
    }
    private Long jobsStartedInvention;
    /**
     * jobs_started_invention integer
     */
    public void setJobsStartedInvention(Long val) {
        jobsStartedInvention = val;
    }
    /**
     * jobs_started_invention integer
     */
    @JsonProperty("jobs_started_invention")
    public Long getJobsStartedInvention() {
        return jobsStartedInvention;
    }
    private Long jobsStartedManufacture;
    /**
     * jobs_started_manufacture integer
     */
    public void setJobsStartedManufacture(Long val) {
        jobsStartedManufacture = val;
    }
    /**
     * jobs_started_manufacture integer
     */
    @JsonProperty("jobs_started_manufacture")
    public Long getJobsStartedManufacture() {
        return jobsStartedManufacture;
    }
    private Long jobsStartedMaterialProductivity;
    /**
     * jobs_started_material_productivity integer
     */
    public void setJobsStartedMaterialProductivity(Long val) {
        jobsStartedMaterialProductivity = val;
    }
    /**
     * jobs_started_material_productivity integer
     */
    @JsonProperty("jobs_started_material_productivity")
    public Long getJobsStartedMaterialProductivity() {
        return jobsStartedMaterialProductivity;
    }
    private Long jobsStartedTimeProductivity;
    /**
     * jobs_started_time_productivity integer
     */
    public void setJobsStartedTimeProductivity(Long val) {
        jobsStartedTimeProductivity = val;
    }
    /**
     * jobs_started_time_productivity integer
     */
    @JsonProperty("jobs_started_time_productivity")
    public Long getJobsStartedTimeProductivity() {
        return jobsStartedTimeProductivity;
    }
    private Long reprocessItem;
    /**
     * reprocess_item integer
     */
    public void setReprocessItem(Long val) {
        reprocessItem = val;
    }
    /**
     * reprocess_item integer
     */
    @JsonProperty("reprocess_item")
    public Long getReprocessItem() {
        return reprocessItem;
    }
    private Long reprocessItemQuantity;
    /**
     * reprocess_item_quantity integer
     */
    public void setReprocessItemQuantity(Long val) {
        reprocessItemQuantity = val;
    }
    /**
     * reprocess_item_quantity integer
     */
    @JsonProperty("reprocess_item_quantity")
    public Long getReprocessItemQuantity() {
        return reprocessItemQuantity;
    }
}
