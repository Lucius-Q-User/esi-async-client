package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CharacterStatsModules implements ApiParameterObject {
    private Long activationsArmorHardener;
    /**
     * activations_armor_hardener integer
     */
    public void setActivationsArmorHardener(Long val) {
        activationsArmorHardener = val;
    }
    /**
     * activations_armor_hardener integer
     */
    @JsonProperty("activations_armor_hardener")
    public Long getActivationsArmorHardener() {
        return activationsArmorHardener;
    }
    private Long activationsArmorRepairUnit;
    /**
     * activations_armor_repair_unit integer
     */
    public void setActivationsArmorRepairUnit(Long val) {
        activationsArmorRepairUnit = val;
    }
    /**
     * activations_armor_repair_unit integer
     */
    @JsonProperty("activations_armor_repair_unit")
    public Long getActivationsArmorRepairUnit() {
        return activationsArmorRepairUnit;
    }
    private Long activationsArmorResistanceShiftHardener;
    /**
     * activations_armor_resistance_shift_hardener integer
     */
    public void setActivationsArmorResistanceShiftHardener(Long val) {
        activationsArmorResistanceShiftHardener = val;
    }
    /**
     * activations_armor_resistance_shift_hardener integer
     */
    @JsonProperty("activations_armor_resistance_shift_hardener")
    public Long getActivationsArmorResistanceShiftHardener() {
        return activationsArmorResistanceShiftHardener;
    }
    private Long activationsAutomatedTargetingSystem;
    /**
     * activations_automated_targeting_system integer
     */
    public void setActivationsAutomatedTargetingSystem(Long val) {
        activationsAutomatedTargetingSystem = val;
    }
    /**
     * activations_automated_targeting_system integer
     */
    @JsonProperty("activations_automated_targeting_system")
    public Long getActivationsAutomatedTargetingSystem() {
        return activationsAutomatedTargetingSystem;
    }
    private Long activationsBastion;
    /**
     * activations_bastion integer
     */
    public void setActivationsBastion(Long val) {
        activationsBastion = val;
    }
    /**
     * activations_bastion integer
     */
    @JsonProperty("activations_bastion")
    public Long getActivationsBastion() {
        return activationsBastion;
    }
    private Long activationsBombLauncher;
    /**
     * activations_bomb_launcher integer
     */
    public void setActivationsBombLauncher(Long val) {
        activationsBombLauncher = val;
    }
    /**
     * activations_bomb_launcher integer
     */
    @JsonProperty("activations_bomb_launcher")
    public Long getActivationsBombLauncher() {
        return activationsBombLauncher;
    }
    private Long activationsCapacitorBooster;
    /**
     * activations_capacitor_booster integer
     */
    public void setActivationsCapacitorBooster(Long val) {
        activationsCapacitorBooster = val;
    }
    /**
     * activations_capacitor_booster integer
     */
    @JsonProperty("activations_capacitor_booster")
    public Long getActivationsCapacitorBooster() {
        return activationsCapacitorBooster;
    }
    private Long activationsCargoScanner;
    /**
     * activations_cargo_scanner integer
     */
    public void setActivationsCargoScanner(Long val) {
        activationsCargoScanner = val;
    }
    /**
     * activations_cargo_scanner integer
     */
    @JsonProperty("activations_cargo_scanner")
    public Long getActivationsCargoScanner() {
        return activationsCargoScanner;
    }
    private Long activationsCloakingDevice;
    /**
     * activations_cloaking_device integer
     */
    public void setActivationsCloakingDevice(Long val) {
        activationsCloakingDevice = val;
    }
    /**
     * activations_cloaking_device integer
     */
    @JsonProperty("activations_cloaking_device")
    public Long getActivationsCloakingDevice() {
        return activationsCloakingDevice;
    }
    private Long activationsCloneVatBay;
    /**
     * activations_clone_vat_bay integer
     */
    public void setActivationsCloneVatBay(Long val) {
        activationsCloneVatBay = val;
    }
    /**
     * activations_clone_vat_bay integer
     */
    @JsonProperty("activations_clone_vat_bay")
    public Long getActivationsCloneVatBay() {
        return activationsCloneVatBay;
    }
    private Long activationsCynosuralField;
    /**
     * activations_cynosural_field integer
     */
    public void setActivationsCynosuralField(Long val) {
        activationsCynosuralField = val;
    }
    /**
     * activations_cynosural_field integer
     */
    @JsonProperty("activations_cynosural_field")
    public Long getActivationsCynosuralField() {
        return activationsCynosuralField;
    }
    private Long activationsDamageControl;
    /**
     * activations_damage_control integer
     */
    public void setActivationsDamageControl(Long val) {
        activationsDamageControl = val;
    }
    /**
     * activations_damage_control integer
     */
    @JsonProperty("activations_damage_control")
    public Long getActivationsDamageControl() {
        return activationsDamageControl;
    }
    private Long activationsDataMiners;
    /**
     * activations_data_miners integer
     */
    public void setActivationsDataMiners(Long val) {
        activationsDataMiners = val;
    }
    /**
     * activations_data_miners integer
     */
    @JsonProperty("activations_data_miners")
    public Long getActivationsDataMiners() {
        return activationsDataMiners;
    }
    private Long activationsDroneControlUnit;
    /**
     * activations_drone_control_unit integer
     */
    public void setActivationsDroneControlUnit(Long val) {
        activationsDroneControlUnit = val;
    }
    /**
     * activations_drone_control_unit integer
     */
    @JsonProperty("activations_drone_control_unit")
    public Long getActivationsDroneControlUnit() {
        return activationsDroneControlUnit;
    }
    private Long activationsDroneTrackingModules;
    /**
     * activations_drone_tracking_modules integer
     */
    public void setActivationsDroneTrackingModules(Long val) {
        activationsDroneTrackingModules = val;
    }
    /**
     * activations_drone_tracking_modules integer
     */
    @JsonProperty("activations_drone_tracking_modules")
    public Long getActivationsDroneTrackingModules() {
        return activationsDroneTrackingModules;
    }
    private Long activationsEccm;
    /**
     * activations_eccm integer
     */
    public void setActivationsEccm(Long val) {
        activationsEccm = val;
    }
    /**
     * activations_eccm integer
     */
    @JsonProperty("activations_eccm")
    public Long getActivationsEccm() {
        return activationsEccm;
    }
    private Long activationsEcm;
    /**
     * activations_ecm integer
     */
    public void setActivationsEcm(Long val) {
        activationsEcm = val;
    }
    /**
     * activations_ecm integer
     */
    @JsonProperty("activations_ecm")
    public Long getActivationsEcm() {
        return activationsEcm;
    }
    private Long activationsEcmBurst;
    /**
     * activations_ecm_burst integer
     */
    public void setActivationsEcmBurst(Long val) {
        activationsEcmBurst = val;
    }
    /**
     * activations_ecm_burst integer
     */
    @JsonProperty("activations_ecm_burst")
    public Long getActivationsEcmBurst() {
        return activationsEcmBurst;
    }
    private Long activationsEnergyDestabilizer;
    /**
     * activations_energy_destabilizer integer
     */
    public void setActivationsEnergyDestabilizer(Long val) {
        activationsEnergyDestabilizer = val;
    }
    /**
     * activations_energy_destabilizer integer
     */
    @JsonProperty("activations_energy_destabilizer")
    public Long getActivationsEnergyDestabilizer() {
        return activationsEnergyDestabilizer;
    }
    private Long activationsEnergyVampire;
    /**
     * activations_energy_vampire integer
     */
    public void setActivationsEnergyVampire(Long val) {
        activationsEnergyVampire = val;
    }
    /**
     * activations_energy_vampire integer
     */
    @JsonProperty("activations_energy_vampire")
    public Long getActivationsEnergyVampire() {
        return activationsEnergyVampire;
    }
    private Long activationsEnergyWeapon;
    /**
     * activations_energy_weapon integer
     */
    public void setActivationsEnergyWeapon(Long val) {
        activationsEnergyWeapon = val;
    }
    /**
     * activations_energy_weapon integer
     */
    @JsonProperty("activations_energy_weapon")
    public Long getActivationsEnergyWeapon() {
        return activationsEnergyWeapon;
    }
    private Long activationsFestivalLauncher;
    /**
     * activations_festival_launcher integer
     */
    public void setActivationsFestivalLauncher(Long val) {
        activationsFestivalLauncher = val;
    }
    /**
     * activations_festival_launcher integer
     */
    @JsonProperty("activations_festival_launcher")
    public Long getActivationsFestivalLauncher() {
        return activationsFestivalLauncher;
    }
    private Long activationsFrequencyMiningLaser;
    /**
     * activations_frequency_mining_laser integer
     */
    public void setActivationsFrequencyMiningLaser(Long val) {
        activationsFrequencyMiningLaser = val;
    }
    /**
     * activations_frequency_mining_laser integer
     */
    @JsonProperty("activations_frequency_mining_laser")
    public Long getActivationsFrequencyMiningLaser() {
        return activationsFrequencyMiningLaser;
    }
    private Long activationsFueledArmorRepairer;
    /**
     * activations_fueled_armor_repairer integer
     */
    public void setActivationsFueledArmorRepairer(Long val) {
        activationsFueledArmorRepairer = val;
    }
    /**
     * activations_fueled_armor_repairer integer
     */
    @JsonProperty("activations_fueled_armor_repairer")
    public Long getActivationsFueledArmorRepairer() {
        return activationsFueledArmorRepairer;
    }
    private Long activationsFueledShieldBooster;
    /**
     * activations_fueled_shield_booster integer
     */
    public void setActivationsFueledShieldBooster(Long val) {
        activationsFueledShieldBooster = val;
    }
    /**
     * activations_fueled_shield_booster integer
     */
    @JsonProperty("activations_fueled_shield_booster")
    public Long getActivationsFueledShieldBooster() {
        return activationsFueledShieldBooster;
    }
    private Long activationsGangCoordinator;
    /**
     * activations_gang_coordinator integer
     */
    public void setActivationsGangCoordinator(Long val) {
        activationsGangCoordinator = val;
    }
    /**
     * activations_gang_coordinator integer
     */
    @JsonProperty("activations_gang_coordinator")
    public Long getActivationsGangCoordinator() {
        return activationsGangCoordinator;
    }
    private Long activationsGasCloudHarvester;
    /**
     * activations_gas_cloud_harvester integer
     */
    public void setActivationsGasCloudHarvester(Long val) {
        activationsGasCloudHarvester = val;
    }
    /**
     * activations_gas_cloud_harvester integer
     */
    @JsonProperty("activations_gas_cloud_harvester")
    public Long getActivationsGasCloudHarvester() {
        return activationsGasCloudHarvester;
    }
    private Long activationsHullRepairUnit;
    /**
     * activations_hull_repair_unit integer
     */
    public void setActivationsHullRepairUnit(Long val) {
        activationsHullRepairUnit = val;
    }
    /**
     * activations_hull_repair_unit integer
     */
    @JsonProperty("activations_hull_repair_unit")
    public Long getActivationsHullRepairUnit() {
        return activationsHullRepairUnit;
    }
    private Long activationsHybridWeapon;
    /**
     * activations_hybrid_weapon integer
     */
    public void setActivationsHybridWeapon(Long val) {
        activationsHybridWeapon = val;
    }
    /**
     * activations_hybrid_weapon integer
     */
    @JsonProperty("activations_hybrid_weapon")
    public Long getActivationsHybridWeapon() {
        return activationsHybridWeapon;
    }
    private Long activationsIndustrialCore;
    /**
     * activations_industrial_core integer
     */
    public void setActivationsIndustrialCore(Long val) {
        activationsIndustrialCore = val;
    }
    /**
     * activations_industrial_core integer
     */
    @JsonProperty("activations_industrial_core")
    public Long getActivationsIndustrialCore() {
        return activationsIndustrialCore;
    }
    private Long activationsInterdictionSphereLauncher;
    /**
     * activations_interdiction_sphere_launcher integer
     */
    public void setActivationsInterdictionSphereLauncher(Long val) {
        activationsInterdictionSphereLauncher = val;
    }
    /**
     * activations_interdiction_sphere_launcher integer
     */
    @JsonProperty("activations_interdiction_sphere_launcher")
    public Long getActivationsInterdictionSphereLauncher() {
        return activationsInterdictionSphereLauncher;
    }
    private Long activationsMicroJumpDrive;
    /**
     * activations_micro_jump_drive integer
     */
    public void setActivationsMicroJumpDrive(Long val) {
        activationsMicroJumpDrive = val;
    }
    /**
     * activations_micro_jump_drive integer
     */
    @JsonProperty("activations_micro_jump_drive")
    public Long getActivationsMicroJumpDrive() {
        return activationsMicroJumpDrive;
    }
    private Long activationsMiningLaser;
    /**
     * activations_mining_laser integer
     */
    public void setActivationsMiningLaser(Long val) {
        activationsMiningLaser = val;
    }
    /**
     * activations_mining_laser integer
     */
    @JsonProperty("activations_mining_laser")
    public Long getActivationsMiningLaser() {
        return activationsMiningLaser;
    }
    private Long activationsMissileLauncher;
    /**
     * activations_missile_launcher integer
     */
    public void setActivationsMissileLauncher(Long val) {
        activationsMissileLauncher = val;
    }
    /**
     * activations_missile_launcher integer
     */
    @JsonProperty("activations_missile_launcher")
    public Long getActivationsMissileLauncher() {
        return activationsMissileLauncher;
    }
    private Long activationsPassiveTargetingSystem;
    /**
     * activations_passive_targeting_system integer
     */
    public void setActivationsPassiveTargetingSystem(Long val) {
        activationsPassiveTargetingSystem = val;
    }
    /**
     * activations_passive_targeting_system integer
     */
    @JsonProperty("activations_passive_targeting_system")
    public Long getActivationsPassiveTargetingSystem() {
        return activationsPassiveTargetingSystem;
    }
    private Long activationsProbeLauncher;
    /**
     * activations_probe_launcher integer
     */
    public void setActivationsProbeLauncher(Long val) {
        activationsProbeLauncher = val;
    }
    /**
     * activations_probe_launcher integer
     */
    @JsonProperty("activations_probe_launcher")
    public Long getActivationsProbeLauncher() {
        return activationsProbeLauncher;
    }
    private Long activationsProjectedEccm;
    /**
     * activations_projected_eccm integer
     */
    public void setActivationsProjectedEccm(Long val) {
        activationsProjectedEccm = val;
    }
    /**
     * activations_projected_eccm integer
     */
    @JsonProperty("activations_projected_eccm")
    public Long getActivationsProjectedEccm() {
        return activationsProjectedEccm;
    }
    private Long activationsProjectileWeapon;
    /**
     * activations_projectile_weapon integer
     */
    public void setActivationsProjectileWeapon(Long val) {
        activationsProjectileWeapon = val;
    }
    /**
     * activations_projectile_weapon integer
     */
    @JsonProperty("activations_projectile_weapon")
    public Long getActivationsProjectileWeapon() {
        return activationsProjectileWeapon;
    }
    private Long activationsPropulsionModule;
    /**
     * activations_propulsion_module integer
     */
    public void setActivationsPropulsionModule(Long val) {
        activationsPropulsionModule = val;
    }
    /**
     * activations_propulsion_module integer
     */
    @JsonProperty("activations_propulsion_module")
    public Long getActivationsPropulsionModule() {
        return activationsPropulsionModule;
    }
    private Long activationsRemoteArmorRepairer;
    /**
     * activations_remote_armor_repairer integer
     */
    public void setActivationsRemoteArmorRepairer(Long val) {
        activationsRemoteArmorRepairer = val;
    }
    /**
     * activations_remote_armor_repairer integer
     */
    @JsonProperty("activations_remote_armor_repairer")
    public Long getActivationsRemoteArmorRepairer() {
        return activationsRemoteArmorRepairer;
    }
    private Long activationsRemoteCapacitorTransmitter;
    /**
     * activations_remote_capacitor_transmitter integer
     */
    public void setActivationsRemoteCapacitorTransmitter(Long val) {
        activationsRemoteCapacitorTransmitter = val;
    }
    /**
     * activations_remote_capacitor_transmitter integer
     */
    @JsonProperty("activations_remote_capacitor_transmitter")
    public Long getActivationsRemoteCapacitorTransmitter() {
        return activationsRemoteCapacitorTransmitter;
    }
    private Long activationsRemoteEcmBurst;
    /**
     * activations_remote_ecm_burst integer
     */
    public void setActivationsRemoteEcmBurst(Long val) {
        activationsRemoteEcmBurst = val;
    }
    /**
     * activations_remote_ecm_burst integer
     */
    @JsonProperty("activations_remote_ecm_burst")
    public Long getActivationsRemoteEcmBurst() {
        return activationsRemoteEcmBurst;
    }
    private Long activationsRemoteHullRepairer;
    /**
     * activations_remote_hull_repairer integer
     */
    public void setActivationsRemoteHullRepairer(Long val) {
        activationsRemoteHullRepairer = val;
    }
    /**
     * activations_remote_hull_repairer integer
     */
    @JsonProperty("activations_remote_hull_repairer")
    public Long getActivationsRemoteHullRepairer() {
        return activationsRemoteHullRepairer;
    }
    private Long activationsRemoteSensorBooster;
    /**
     * activations_remote_sensor_booster integer
     */
    public void setActivationsRemoteSensorBooster(Long val) {
        activationsRemoteSensorBooster = val;
    }
    /**
     * activations_remote_sensor_booster integer
     */
    @JsonProperty("activations_remote_sensor_booster")
    public Long getActivationsRemoteSensorBooster() {
        return activationsRemoteSensorBooster;
    }
    private Long activationsRemoteSensorDamper;
    /**
     * activations_remote_sensor_damper integer
     */
    public void setActivationsRemoteSensorDamper(Long val) {
        activationsRemoteSensorDamper = val;
    }
    /**
     * activations_remote_sensor_damper integer
     */
    @JsonProperty("activations_remote_sensor_damper")
    public Long getActivationsRemoteSensorDamper() {
        return activationsRemoteSensorDamper;
    }
    private Long activationsRemoteShieldBooster;
    /**
     * activations_remote_shield_booster integer
     */
    public void setActivationsRemoteShieldBooster(Long val) {
        activationsRemoteShieldBooster = val;
    }
    /**
     * activations_remote_shield_booster integer
     */
    @JsonProperty("activations_remote_shield_booster")
    public Long getActivationsRemoteShieldBooster() {
        return activationsRemoteShieldBooster;
    }
    private Long activationsRemoteTrackingComputer;
    /**
     * activations_remote_tracking_computer integer
     */
    public void setActivationsRemoteTrackingComputer(Long val) {
        activationsRemoteTrackingComputer = val;
    }
    /**
     * activations_remote_tracking_computer integer
     */
    @JsonProperty("activations_remote_tracking_computer")
    public Long getActivationsRemoteTrackingComputer() {
        return activationsRemoteTrackingComputer;
    }
    private Long activationsSalvager;
    /**
     * activations_salvager integer
     */
    public void setActivationsSalvager(Long val) {
        activationsSalvager = val;
    }
    /**
     * activations_salvager integer
     */
    @JsonProperty("activations_salvager")
    public Long getActivationsSalvager() {
        return activationsSalvager;
    }
    private Long activationsSensorBooster;
    /**
     * activations_sensor_booster integer
     */
    public void setActivationsSensorBooster(Long val) {
        activationsSensorBooster = val;
    }
    /**
     * activations_sensor_booster integer
     */
    @JsonProperty("activations_sensor_booster")
    public Long getActivationsSensorBooster() {
        return activationsSensorBooster;
    }
    private Long activationsShieldBooster;
    /**
     * activations_shield_booster integer
     */
    public void setActivationsShieldBooster(Long val) {
        activationsShieldBooster = val;
    }
    /**
     * activations_shield_booster integer
     */
    @JsonProperty("activations_shield_booster")
    public Long getActivationsShieldBooster() {
        return activationsShieldBooster;
    }
    private Long activationsShieldHardener;
    /**
     * activations_shield_hardener integer
     */
    public void setActivationsShieldHardener(Long val) {
        activationsShieldHardener = val;
    }
    /**
     * activations_shield_hardener integer
     */
    @JsonProperty("activations_shield_hardener")
    public Long getActivationsShieldHardener() {
        return activationsShieldHardener;
    }
    private Long activationsShipScanner;
    /**
     * activations_ship_scanner integer
     */
    public void setActivationsShipScanner(Long val) {
        activationsShipScanner = val;
    }
    /**
     * activations_ship_scanner integer
     */
    @JsonProperty("activations_ship_scanner")
    public Long getActivationsShipScanner() {
        return activationsShipScanner;
    }
    private Long activationsSiege;
    /**
     * activations_siege integer
     */
    public void setActivationsSiege(Long val) {
        activationsSiege = val;
    }
    /**
     * activations_siege integer
     */
    @JsonProperty("activations_siege")
    public Long getActivationsSiege() {
        return activationsSiege;
    }
    private Long activationsSmartBomb;
    /**
     * activations_smart_bomb integer
     */
    public void setActivationsSmartBomb(Long val) {
        activationsSmartBomb = val;
    }
    /**
     * activations_smart_bomb integer
     */
    @JsonProperty("activations_smart_bomb")
    public Long getActivationsSmartBomb() {
        return activationsSmartBomb;
    }
    private Long activationsStasisWeb;
    /**
     * activations_stasis_web integer
     */
    public void setActivationsStasisWeb(Long val) {
        activationsStasisWeb = val;
    }
    /**
     * activations_stasis_web integer
     */
    @JsonProperty("activations_stasis_web")
    public Long getActivationsStasisWeb() {
        return activationsStasisWeb;
    }
    private Long activationsStripMiner;
    /**
     * activations_strip_miner integer
     */
    public void setActivationsStripMiner(Long val) {
        activationsStripMiner = val;
    }
    /**
     * activations_strip_miner integer
     */
    @JsonProperty("activations_strip_miner")
    public Long getActivationsStripMiner() {
        return activationsStripMiner;
    }
    private Long activationsSuperWeapon;
    /**
     * activations_super_weapon integer
     */
    public void setActivationsSuperWeapon(Long val) {
        activationsSuperWeapon = val;
    }
    /**
     * activations_super_weapon integer
     */
    @JsonProperty("activations_super_weapon")
    public Long getActivationsSuperWeapon() {
        return activationsSuperWeapon;
    }
    private Long activationsSurveyScanner;
    /**
     * activations_survey_scanner integer
     */
    public void setActivationsSurveyScanner(Long val) {
        activationsSurveyScanner = val;
    }
    /**
     * activations_survey_scanner integer
     */
    @JsonProperty("activations_survey_scanner")
    public Long getActivationsSurveyScanner() {
        return activationsSurveyScanner;
    }
    private Long activationsTargetBreaker;
    /**
     * activations_target_breaker integer
     */
    public void setActivationsTargetBreaker(Long val) {
        activationsTargetBreaker = val;
    }
    /**
     * activations_target_breaker integer
     */
    @JsonProperty("activations_target_breaker")
    public Long getActivationsTargetBreaker() {
        return activationsTargetBreaker;
    }
    private Long activationsTargetPainter;
    /**
     * activations_target_painter integer
     */
    public void setActivationsTargetPainter(Long val) {
        activationsTargetPainter = val;
    }
    /**
     * activations_target_painter integer
     */
    @JsonProperty("activations_target_painter")
    public Long getActivationsTargetPainter() {
        return activationsTargetPainter;
    }
    private Long activationsTrackingComputer;
    /**
     * activations_tracking_computer integer
     */
    public void setActivationsTrackingComputer(Long val) {
        activationsTrackingComputer = val;
    }
    /**
     * activations_tracking_computer integer
     */
    @JsonProperty("activations_tracking_computer")
    public Long getActivationsTrackingComputer() {
        return activationsTrackingComputer;
    }
    private Long activationsTrackingDisruptor;
    /**
     * activations_tracking_disruptor integer
     */
    public void setActivationsTrackingDisruptor(Long val) {
        activationsTrackingDisruptor = val;
    }
    /**
     * activations_tracking_disruptor integer
     */
    @JsonProperty("activations_tracking_disruptor")
    public Long getActivationsTrackingDisruptor() {
        return activationsTrackingDisruptor;
    }
    private Long activationsTractorBeam;
    /**
     * activations_tractor_beam integer
     */
    public void setActivationsTractorBeam(Long val) {
        activationsTractorBeam = val;
    }
    /**
     * activations_tractor_beam integer
     */
    @JsonProperty("activations_tractor_beam")
    public Long getActivationsTractorBeam() {
        return activationsTractorBeam;
    }
    private Long activationsTriage;
    /**
     * activations_triage integer
     */
    public void setActivationsTriage(Long val) {
        activationsTriage = val;
    }
    /**
     * activations_triage integer
     */
    @JsonProperty("activations_triage")
    public Long getActivationsTriage() {
        return activationsTriage;
    }
    private Long activationsWarpDisruptFieldGenerator;
    /**
     * activations_warp_disrupt_field_generator integer
     */
    public void setActivationsWarpDisruptFieldGenerator(Long val) {
        activationsWarpDisruptFieldGenerator = val;
    }
    /**
     * activations_warp_disrupt_field_generator integer
     */
    @JsonProperty("activations_warp_disrupt_field_generator")
    public Long getActivationsWarpDisruptFieldGenerator() {
        return activationsWarpDisruptFieldGenerator;
    }
    private Long activationsWarpScrambler;
    /**
     * activations_warp_scrambler integer
     */
    public void setActivationsWarpScrambler(Long val) {
        activationsWarpScrambler = val;
    }
    /**
     * activations_warp_scrambler integer
     */
    @JsonProperty("activations_warp_scrambler")
    public Long getActivationsWarpScrambler() {
        return activationsWarpScrambler;
    }
    private Long linkWeapons;
    /**
     * link_weapons integer
     */
    public void setLinkWeapons(Long val) {
        linkWeapons = val;
    }
    /**
     * link_weapons integer
     */
    @JsonProperty("link_weapons")
    public Long getLinkWeapons() {
        return linkWeapons;
    }
    private Long overload;
    /**
     * overload integer
     */
    public void setOverload(Long val) {
        overload = val;
    }
    /**
     * overload integer
     */
    @JsonProperty("overload")
    public Long getOverload() {
        return overload;
    }
    private Long repairs;
    /**
     * repairs integer
     */
    public void setRepairs(Long val) {
        repairs = val;
    }
    /**
     * repairs integer
     */
    @JsonProperty("repairs")
    public Long getRepairs() {
        return repairs;
    }
}
