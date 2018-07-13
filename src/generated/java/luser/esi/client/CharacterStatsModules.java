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
    public void setActivationsArmorHardener(Long val) {
        activationsArmorHardener = val;
    }
    @JsonProperty("activations_armor_hardener")
    public Long getActivationsArmorHardener() {
        return activationsArmorHardener;
    }
    private Long activationsArmorRepairUnit;
    public void setActivationsArmorRepairUnit(Long val) {
        activationsArmorRepairUnit = val;
    }
    @JsonProperty("activations_armor_repair_unit")
    public Long getActivationsArmorRepairUnit() {
        return activationsArmorRepairUnit;
    }
    private Long activationsArmorResistanceShiftHardener;
    public void setActivationsArmorResistanceShiftHardener(Long val) {
        activationsArmorResistanceShiftHardener = val;
    }
    @JsonProperty("activations_armor_resistance_shift_hardener")
    public Long getActivationsArmorResistanceShiftHardener() {
        return activationsArmorResistanceShiftHardener;
    }
    private Long activationsAutomatedTargetingSystem;
    public void setActivationsAutomatedTargetingSystem(Long val) {
        activationsAutomatedTargetingSystem = val;
    }
    @JsonProperty("activations_automated_targeting_system")
    public Long getActivationsAutomatedTargetingSystem() {
        return activationsAutomatedTargetingSystem;
    }
    private Long activationsBastion;
    public void setActivationsBastion(Long val) {
        activationsBastion = val;
    }
    @JsonProperty("activations_bastion")
    public Long getActivationsBastion() {
        return activationsBastion;
    }
    private Long activationsBombLauncher;
    public void setActivationsBombLauncher(Long val) {
        activationsBombLauncher = val;
    }
    @JsonProperty("activations_bomb_launcher")
    public Long getActivationsBombLauncher() {
        return activationsBombLauncher;
    }
    private Long activationsCapacitorBooster;
    public void setActivationsCapacitorBooster(Long val) {
        activationsCapacitorBooster = val;
    }
    @JsonProperty("activations_capacitor_booster")
    public Long getActivationsCapacitorBooster() {
        return activationsCapacitorBooster;
    }
    private Long activationsCargoScanner;
    public void setActivationsCargoScanner(Long val) {
        activationsCargoScanner = val;
    }
    @JsonProperty("activations_cargo_scanner")
    public Long getActivationsCargoScanner() {
        return activationsCargoScanner;
    }
    private Long activationsCloakingDevice;
    public void setActivationsCloakingDevice(Long val) {
        activationsCloakingDevice = val;
    }
    @JsonProperty("activations_cloaking_device")
    public Long getActivationsCloakingDevice() {
        return activationsCloakingDevice;
    }
    private Long activationsCloneVatBay;
    public void setActivationsCloneVatBay(Long val) {
        activationsCloneVatBay = val;
    }
    @JsonProperty("activations_clone_vat_bay")
    public Long getActivationsCloneVatBay() {
        return activationsCloneVatBay;
    }
    private Long activationsCynosuralField;
    public void setActivationsCynosuralField(Long val) {
        activationsCynosuralField = val;
    }
    @JsonProperty("activations_cynosural_field")
    public Long getActivationsCynosuralField() {
        return activationsCynosuralField;
    }
    private Long activationsDamageControl;
    public void setActivationsDamageControl(Long val) {
        activationsDamageControl = val;
    }
    @JsonProperty("activations_damage_control")
    public Long getActivationsDamageControl() {
        return activationsDamageControl;
    }
    private Long activationsDataMiners;
    public void setActivationsDataMiners(Long val) {
        activationsDataMiners = val;
    }
    @JsonProperty("activations_data_miners")
    public Long getActivationsDataMiners() {
        return activationsDataMiners;
    }
    private Long activationsDroneControlUnit;
    public void setActivationsDroneControlUnit(Long val) {
        activationsDroneControlUnit = val;
    }
    @JsonProperty("activations_drone_control_unit")
    public Long getActivationsDroneControlUnit() {
        return activationsDroneControlUnit;
    }
    private Long activationsDroneTrackingModules;
    public void setActivationsDroneTrackingModules(Long val) {
        activationsDroneTrackingModules = val;
    }
    @JsonProperty("activations_drone_tracking_modules")
    public Long getActivationsDroneTrackingModules() {
        return activationsDroneTrackingModules;
    }
    private Long activationsEccm;
    public void setActivationsEccm(Long val) {
        activationsEccm = val;
    }
    @JsonProperty("activations_eccm")
    public Long getActivationsEccm() {
        return activationsEccm;
    }
    private Long activationsEcm;
    public void setActivationsEcm(Long val) {
        activationsEcm = val;
    }
    @JsonProperty("activations_ecm")
    public Long getActivationsEcm() {
        return activationsEcm;
    }
    private Long activationsEcmBurst;
    public void setActivationsEcmBurst(Long val) {
        activationsEcmBurst = val;
    }
    @JsonProperty("activations_ecm_burst")
    public Long getActivationsEcmBurst() {
        return activationsEcmBurst;
    }
    private Long activationsEnergyDestabilizer;
    public void setActivationsEnergyDestabilizer(Long val) {
        activationsEnergyDestabilizer = val;
    }
    @JsonProperty("activations_energy_destabilizer")
    public Long getActivationsEnergyDestabilizer() {
        return activationsEnergyDestabilizer;
    }
    private Long activationsEnergyVampire;
    public void setActivationsEnergyVampire(Long val) {
        activationsEnergyVampire = val;
    }
    @JsonProperty("activations_energy_vampire")
    public Long getActivationsEnergyVampire() {
        return activationsEnergyVampire;
    }
    private Long activationsEnergyWeapon;
    public void setActivationsEnergyWeapon(Long val) {
        activationsEnergyWeapon = val;
    }
    @JsonProperty("activations_energy_weapon")
    public Long getActivationsEnergyWeapon() {
        return activationsEnergyWeapon;
    }
    private Long activationsFestivalLauncher;
    public void setActivationsFestivalLauncher(Long val) {
        activationsFestivalLauncher = val;
    }
    @JsonProperty("activations_festival_launcher")
    public Long getActivationsFestivalLauncher() {
        return activationsFestivalLauncher;
    }
    private Long activationsFrequencyMiningLaser;
    public void setActivationsFrequencyMiningLaser(Long val) {
        activationsFrequencyMiningLaser = val;
    }
    @JsonProperty("activations_frequency_mining_laser")
    public Long getActivationsFrequencyMiningLaser() {
        return activationsFrequencyMiningLaser;
    }
    private Long activationsFueledArmorRepairer;
    public void setActivationsFueledArmorRepairer(Long val) {
        activationsFueledArmorRepairer = val;
    }
    @JsonProperty("activations_fueled_armor_repairer")
    public Long getActivationsFueledArmorRepairer() {
        return activationsFueledArmorRepairer;
    }
    private Long activationsFueledShieldBooster;
    public void setActivationsFueledShieldBooster(Long val) {
        activationsFueledShieldBooster = val;
    }
    @JsonProperty("activations_fueled_shield_booster")
    public Long getActivationsFueledShieldBooster() {
        return activationsFueledShieldBooster;
    }
    private Long activationsGangCoordinator;
    public void setActivationsGangCoordinator(Long val) {
        activationsGangCoordinator = val;
    }
    @JsonProperty("activations_gang_coordinator")
    public Long getActivationsGangCoordinator() {
        return activationsGangCoordinator;
    }
    private Long activationsGasCloudHarvester;
    public void setActivationsGasCloudHarvester(Long val) {
        activationsGasCloudHarvester = val;
    }
    @JsonProperty("activations_gas_cloud_harvester")
    public Long getActivationsGasCloudHarvester() {
        return activationsGasCloudHarvester;
    }
    private Long activationsHullRepairUnit;
    public void setActivationsHullRepairUnit(Long val) {
        activationsHullRepairUnit = val;
    }
    @JsonProperty("activations_hull_repair_unit")
    public Long getActivationsHullRepairUnit() {
        return activationsHullRepairUnit;
    }
    private Long activationsHybridWeapon;
    public void setActivationsHybridWeapon(Long val) {
        activationsHybridWeapon = val;
    }
    @JsonProperty("activations_hybrid_weapon")
    public Long getActivationsHybridWeapon() {
        return activationsHybridWeapon;
    }
    private Long activationsIndustrialCore;
    public void setActivationsIndustrialCore(Long val) {
        activationsIndustrialCore = val;
    }
    @JsonProperty("activations_industrial_core")
    public Long getActivationsIndustrialCore() {
        return activationsIndustrialCore;
    }
    private Long activationsInterdictionSphereLauncher;
    public void setActivationsInterdictionSphereLauncher(Long val) {
        activationsInterdictionSphereLauncher = val;
    }
    @JsonProperty("activations_interdiction_sphere_launcher")
    public Long getActivationsInterdictionSphereLauncher() {
        return activationsInterdictionSphereLauncher;
    }
    private Long activationsMicroJumpDrive;
    public void setActivationsMicroJumpDrive(Long val) {
        activationsMicroJumpDrive = val;
    }
    @JsonProperty("activations_micro_jump_drive")
    public Long getActivationsMicroJumpDrive() {
        return activationsMicroJumpDrive;
    }
    private Long activationsMiningLaser;
    public void setActivationsMiningLaser(Long val) {
        activationsMiningLaser = val;
    }
    @JsonProperty("activations_mining_laser")
    public Long getActivationsMiningLaser() {
        return activationsMiningLaser;
    }
    private Long activationsMissileLauncher;
    public void setActivationsMissileLauncher(Long val) {
        activationsMissileLauncher = val;
    }
    @JsonProperty("activations_missile_launcher")
    public Long getActivationsMissileLauncher() {
        return activationsMissileLauncher;
    }
    private Long activationsPassiveTargetingSystem;
    public void setActivationsPassiveTargetingSystem(Long val) {
        activationsPassiveTargetingSystem = val;
    }
    @JsonProperty("activations_passive_targeting_system")
    public Long getActivationsPassiveTargetingSystem() {
        return activationsPassiveTargetingSystem;
    }
    private Long activationsProbeLauncher;
    public void setActivationsProbeLauncher(Long val) {
        activationsProbeLauncher = val;
    }
    @JsonProperty("activations_probe_launcher")
    public Long getActivationsProbeLauncher() {
        return activationsProbeLauncher;
    }
    private Long activationsProjectedEccm;
    public void setActivationsProjectedEccm(Long val) {
        activationsProjectedEccm = val;
    }
    @JsonProperty("activations_projected_eccm")
    public Long getActivationsProjectedEccm() {
        return activationsProjectedEccm;
    }
    private Long activationsProjectileWeapon;
    public void setActivationsProjectileWeapon(Long val) {
        activationsProjectileWeapon = val;
    }
    @JsonProperty("activations_projectile_weapon")
    public Long getActivationsProjectileWeapon() {
        return activationsProjectileWeapon;
    }
    private Long activationsPropulsionModule;
    public void setActivationsPropulsionModule(Long val) {
        activationsPropulsionModule = val;
    }
    @JsonProperty("activations_propulsion_module")
    public Long getActivationsPropulsionModule() {
        return activationsPropulsionModule;
    }
    private Long activationsRemoteArmorRepairer;
    public void setActivationsRemoteArmorRepairer(Long val) {
        activationsRemoteArmorRepairer = val;
    }
    @JsonProperty("activations_remote_armor_repairer")
    public Long getActivationsRemoteArmorRepairer() {
        return activationsRemoteArmorRepairer;
    }
    private Long activationsRemoteCapacitorTransmitter;
    public void setActivationsRemoteCapacitorTransmitter(Long val) {
        activationsRemoteCapacitorTransmitter = val;
    }
    @JsonProperty("activations_remote_capacitor_transmitter")
    public Long getActivationsRemoteCapacitorTransmitter() {
        return activationsRemoteCapacitorTransmitter;
    }
    private Long activationsRemoteEcmBurst;
    public void setActivationsRemoteEcmBurst(Long val) {
        activationsRemoteEcmBurst = val;
    }
    @JsonProperty("activations_remote_ecm_burst")
    public Long getActivationsRemoteEcmBurst() {
        return activationsRemoteEcmBurst;
    }
    private Long activationsRemoteHullRepairer;
    public void setActivationsRemoteHullRepairer(Long val) {
        activationsRemoteHullRepairer = val;
    }
    @JsonProperty("activations_remote_hull_repairer")
    public Long getActivationsRemoteHullRepairer() {
        return activationsRemoteHullRepairer;
    }
    private Long activationsRemoteSensorBooster;
    public void setActivationsRemoteSensorBooster(Long val) {
        activationsRemoteSensorBooster = val;
    }
    @JsonProperty("activations_remote_sensor_booster")
    public Long getActivationsRemoteSensorBooster() {
        return activationsRemoteSensorBooster;
    }
    private Long activationsRemoteSensorDamper;
    public void setActivationsRemoteSensorDamper(Long val) {
        activationsRemoteSensorDamper = val;
    }
    @JsonProperty("activations_remote_sensor_damper")
    public Long getActivationsRemoteSensorDamper() {
        return activationsRemoteSensorDamper;
    }
    private Long activationsRemoteShieldBooster;
    public void setActivationsRemoteShieldBooster(Long val) {
        activationsRemoteShieldBooster = val;
    }
    @JsonProperty("activations_remote_shield_booster")
    public Long getActivationsRemoteShieldBooster() {
        return activationsRemoteShieldBooster;
    }
    private Long activationsRemoteTrackingComputer;
    public void setActivationsRemoteTrackingComputer(Long val) {
        activationsRemoteTrackingComputer = val;
    }
    @JsonProperty("activations_remote_tracking_computer")
    public Long getActivationsRemoteTrackingComputer() {
        return activationsRemoteTrackingComputer;
    }
    private Long activationsSalvager;
    public void setActivationsSalvager(Long val) {
        activationsSalvager = val;
    }
    @JsonProperty("activations_salvager")
    public Long getActivationsSalvager() {
        return activationsSalvager;
    }
    private Long activationsSensorBooster;
    public void setActivationsSensorBooster(Long val) {
        activationsSensorBooster = val;
    }
    @JsonProperty("activations_sensor_booster")
    public Long getActivationsSensorBooster() {
        return activationsSensorBooster;
    }
    private Long activationsShieldBooster;
    public void setActivationsShieldBooster(Long val) {
        activationsShieldBooster = val;
    }
    @JsonProperty("activations_shield_booster")
    public Long getActivationsShieldBooster() {
        return activationsShieldBooster;
    }
    private Long activationsShieldHardener;
    public void setActivationsShieldHardener(Long val) {
        activationsShieldHardener = val;
    }
    @JsonProperty("activations_shield_hardener")
    public Long getActivationsShieldHardener() {
        return activationsShieldHardener;
    }
    private Long activationsShipScanner;
    public void setActivationsShipScanner(Long val) {
        activationsShipScanner = val;
    }
    @JsonProperty("activations_ship_scanner")
    public Long getActivationsShipScanner() {
        return activationsShipScanner;
    }
    private Long activationsSiege;
    public void setActivationsSiege(Long val) {
        activationsSiege = val;
    }
    @JsonProperty("activations_siege")
    public Long getActivationsSiege() {
        return activationsSiege;
    }
    private Long activationsSmartBomb;
    public void setActivationsSmartBomb(Long val) {
        activationsSmartBomb = val;
    }
    @JsonProperty("activations_smart_bomb")
    public Long getActivationsSmartBomb() {
        return activationsSmartBomb;
    }
    private Long activationsStasisWeb;
    public void setActivationsStasisWeb(Long val) {
        activationsStasisWeb = val;
    }
    @JsonProperty("activations_stasis_web")
    public Long getActivationsStasisWeb() {
        return activationsStasisWeb;
    }
    private Long activationsStripMiner;
    public void setActivationsStripMiner(Long val) {
        activationsStripMiner = val;
    }
    @JsonProperty("activations_strip_miner")
    public Long getActivationsStripMiner() {
        return activationsStripMiner;
    }
    private Long activationsSuperWeapon;
    public void setActivationsSuperWeapon(Long val) {
        activationsSuperWeapon = val;
    }
    @JsonProperty("activations_super_weapon")
    public Long getActivationsSuperWeapon() {
        return activationsSuperWeapon;
    }
    private Long activationsSurveyScanner;
    public void setActivationsSurveyScanner(Long val) {
        activationsSurveyScanner = val;
    }
    @JsonProperty("activations_survey_scanner")
    public Long getActivationsSurveyScanner() {
        return activationsSurveyScanner;
    }
    private Long activationsTargetBreaker;
    public void setActivationsTargetBreaker(Long val) {
        activationsTargetBreaker = val;
    }
    @JsonProperty("activations_target_breaker")
    public Long getActivationsTargetBreaker() {
        return activationsTargetBreaker;
    }
    private Long activationsTargetPainter;
    public void setActivationsTargetPainter(Long val) {
        activationsTargetPainter = val;
    }
    @JsonProperty("activations_target_painter")
    public Long getActivationsTargetPainter() {
        return activationsTargetPainter;
    }
    private Long activationsTrackingComputer;
    public void setActivationsTrackingComputer(Long val) {
        activationsTrackingComputer = val;
    }
    @JsonProperty("activations_tracking_computer")
    public Long getActivationsTrackingComputer() {
        return activationsTrackingComputer;
    }
    private Long activationsTrackingDisruptor;
    public void setActivationsTrackingDisruptor(Long val) {
        activationsTrackingDisruptor = val;
    }
    @JsonProperty("activations_tracking_disruptor")
    public Long getActivationsTrackingDisruptor() {
        return activationsTrackingDisruptor;
    }
    private Long activationsTractorBeam;
    public void setActivationsTractorBeam(Long val) {
        activationsTractorBeam = val;
    }
    @JsonProperty("activations_tractor_beam")
    public Long getActivationsTractorBeam() {
        return activationsTractorBeam;
    }
    private Long activationsTriage;
    public void setActivationsTriage(Long val) {
        activationsTriage = val;
    }
    @JsonProperty("activations_triage")
    public Long getActivationsTriage() {
        return activationsTriage;
    }
    private Long activationsWarpDisruptFieldGenerator;
    public void setActivationsWarpDisruptFieldGenerator(Long val) {
        activationsWarpDisruptFieldGenerator = val;
    }
    @JsonProperty("activations_warp_disrupt_field_generator")
    public Long getActivationsWarpDisruptFieldGenerator() {
        return activationsWarpDisruptFieldGenerator;
    }
    private Long activationsWarpScrambler;
    public void setActivationsWarpScrambler(Long val) {
        activationsWarpScrambler = val;
    }
    @JsonProperty("activations_warp_scrambler")
    public Long getActivationsWarpScrambler() {
        return activationsWarpScrambler;
    }
    private Long linkWeapons;
    public void setLinkWeapons(Long val) {
        linkWeapons = val;
    }
    @JsonProperty("link_weapons")
    public Long getLinkWeapons() {
        return linkWeapons;
    }
    private Long overload;
    public void setOverload(Long val) {
        overload = val;
    }
    @JsonProperty("overload")
    public Long getOverload() {
        return overload;
    }
    private Long repairs;
    public void setRepairs(Long val) {
        repairs = val;
    }
    @JsonProperty("repairs")
    public Long getRepairs() {
        return repairs;
    }
}
