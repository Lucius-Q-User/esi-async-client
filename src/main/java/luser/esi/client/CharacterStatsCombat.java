package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CharacterStatsCombat implements ApiParameterObject {
    private Long capDrainedbyNpc;
    public void setCapDrainedbyNpc(Long val) {
        capDrainedbyNpc = val;
    }
    @JsonProperty("cap_drainedby_npc")
    public Long getCapDrainedbyNpc() {
        return capDrainedbyNpc;
    }
    private Long capDrainedbyPc;
    public void setCapDrainedbyPc(Long val) {
        capDrainedbyPc = val;
    }
    @JsonProperty("cap_drainedby_pc")
    public Long getCapDrainedbyPc() {
        return capDrainedbyPc;
    }
    private Long capDrainingPc;
    public void setCapDrainingPc(Long val) {
        capDrainingPc = val;
    }
    @JsonProperty("cap_draining_pc")
    public Long getCapDrainingPc() {
        return capDrainingPc;
    }
    private Long criminalFlagSet;
    public void setCriminalFlagSet(Long val) {
        criminalFlagSet = val;
    }
    @JsonProperty("criminal_flag_set")
    public Long getCriminalFlagSet() {
        return criminalFlagSet;
    }
    private Long damageFromNpCsAmount;
    public void setDamageFromNpCsAmount(Long val) {
        damageFromNpCsAmount = val;
    }
    @JsonProperty("damage_from_np_cs_amount")
    public Long getDamageFromNpCsAmount() {
        return damageFromNpCsAmount;
    }
    private Long damageFromNpCsNumShots;
    public void setDamageFromNpCsNumShots(Long val) {
        damageFromNpCsNumShots = val;
    }
    @JsonProperty("damage_from_np_cs_num_shots")
    public Long getDamageFromNpCsNumShots() {
        return damageFromNpCsNumShots;
    }
    private Long damageFromPlayersBombAmount;
    public void setDamageFromPlayersBombAmount(Long val) {
        damageFromPlayersBombAmount = val;
    }
    @JsonProperty("damage_from_players_bomb_amount")
    public Long getDamageFromPlayersBombAmount() {
        return damageFromPlayersBombAmount;
    }
    private Long damageFromPlayersBombNumShots;
    public void setDamageFromPlayersBombNumShots(Long val) {
        damageFromPlayersBombNumShots = val;
    }
    @JsonProperty("damage_from_players_bomb_num_shots")
    public Long getDamageFromPlayersBombNumShots() {
        return damageFromPlayersBombNumShots;
    }
    private Long damageFromPlayersCombatDroneAmount;
    public void setDamageFromPlayersCombatDroneAmount(Long val) {
        damageFromPlayersCombatDroneAmount = val;
    }
    @JsonProperty("damage_from_players_combat_drone_amount")
    public Long getDamageFromPlayersCombatDroneAmount() {
        return damageFromPlayersCombatDroneAmount;
    }
    private Long damageFromPlayersCombatDroneNumShots;
    public void setDamageFromPlayersCombatDroneNumShots(Long val) {
        damageFromPlayersCombatDroneNumShots = val;
    }
    @JsonProperty("damage_from_players_combat_drone_num_shots")
    public Long getDamageFromPlayersCombatDroneNumShots() {
        return damageFromPlayersCombatDroneNumShots;
    }
    private Long damageFromPlayersEnergyAmount;
    public void setDamageFromPlayersEnergyAmount(Long val) {
        damageFromPlayersEnergyAmount = val;
    }
    @JsonProperty("damage_from_players_energy_amount")
    public Long getDamageFromPlayersEnergyAmount() {
        return damageFromPlayersEnergyAmount;
    }
    private Long damageFromPlayersEnergyNumShots;
    public void setDamageFromPlayersEnergyNumShots(Long val) {
        damageFromPlayersEnergyNumShots = val;
    }
    @JsonProperty("damage_from_players_energy_num_shots")
    public Long getDamageFromPlayersEnergyNumShots() {
        return damageFromPlayersEnergyNumShots;
    }
    private Long damageFromPlayersFighterBomberAmount;
    public void setDamageFromPlayersFighterBomberAmount(Long val) {
        damageFromPlayersFighterBomberAmount = val;
    }
    @JsonProperty("damage_from_players_fighter_bomber_amount")
    public Long getDamageFromPlayersFighterBomberAmount() {
        return damageFromPlayersFighterBomberAmount;
    }
    private Long damageFromPlayersFighterBomberNumShots;
    public void setDamageFromPlayersFighterBomberNumShots(Long val) {
        damageFromPlayersFighterBomberNumShots = val;
    }
    @JsonProperty("damage_from_players_fighter_bomber_num_shots")
    public Long getDamageFromPlayersFighterBomberNumShots() {
        return damageFromPlayersFighterBomberNumShots;
    }
    private Long damageFromPlayersFighterDroneAmount;
    public void setDamageFromPlayersFighterDroneAmount(Long val) {
        damageFromPlayersFighterDroneAmount = val;
    }
    @JsonProperty("damage_from_players_fighter_drone_amount")
    public Long getDamageFromPlayersFighterDroneAmount() {
        return damageFromPlayersFighterDroneAmount;
    }
    private Long damageFromPlayersFighterDroneNumShots;
    public void setDamageFromPlayersFighterDroneNumShots(Long val) {
        damageFromPlayersFighterDroneNumShots = val;
    }
    @JsonProperty("damage_from_players_fighter_drone_num_shots")
    public Long getDamageFromPlayersFighterDroneNumShots() {
        return damageFromPlayersFighterDroneNumShots;
    }
    private Long damageFromPlayersHybridAmount;
    public void setDamageFromPlayersHybridAmount(Long val) {
        damageFromPlayersHybridAmount = val;
    }
    @JsonProperty("damage_from_players_hybrid_amount")
    public Long getDamageFromPlayersHybridAmount() {
        return damageFromPlayersHybridAmount;
    }
    private Long damageFromPlayersHybridNumShots;
    public void setDamageFromPlayersHybridNumShots(Long val) {
        damageFromPlayersHybridNumShots = val;
    }
    @JsonProperty("damage_from_players_hybrid_num_shots")
    public Long getDamageFromPlayersHybridNumShots() {
        return damageFromPlayersHybridNumShots;
    }
    private Long damageFromPlayersMissileAmount;
    public void setDamageFromPlayersMissileAmount(Long val) {
        damageFromPlayersMissileAmount = val;
    }
    @JsonProperty("damage_from_players_missile_amount")
    public Long getDamageFromPlayersMissileAmount() {
        return damageFromPlayersMissileAmount;
    }
    private Long damageFromPlayersMissileNumShots;
    public void setDamageFromPlayersMissileNumShots(Long val) {
        damageFromPlayersMissileNumShots = val;
    }
    @JsonProperty("damage_from_players_missile_num_shots")
    public Long getDamageFromPlayersMissileNumShots() {
        return damageFromPlayersMissileNumShots;
    }
    private Long damageFromPlayersProjectileAmount;
    public void setDamageFromPlayersProjectileAmount(Long val) {
        damageFromPlayersProjectileAmount = val;
    }
    @JsonProperty("damage_from_players_projectile_amount")
    public Long getDamageFromPlayersProjectileAmount() {
        return damageFromPlayersProjectileAmount;
    }
    private Long damageFromPlayersProjectileNumShots;
    public void setDamageFromPlayersProjectileNumShots(Long val) {
        damageFromPlayersProjectileNumShots = val;
    }
    @JsonProperty("damage_from_players_projectile_num_shots")
    public Long getDamageFromPlayersProjectileNumShots() {
        return damageFromPlayersProjectileNumShots;
    }
    private Long damageFromPlayersSmartBombAmount;
    public void setDamageFromPlayersSmartBombAmount(Long val) {
        damageFromPlayersSmartBombAmount = val;
    }
    @JsonProperty("damage_from_players_smart_bomb_amount")
    public Long getDamageFromPlayersSmartBombAmount() {
        return damageFromPlayersSmartBombAmount;
    }
    private Long damageFromPlayersSmartBombNumShots;
    public void setDamageFromPlayersSmartBombNumShots(Long val) {
        damageFromPlayersSmartBombNumShots = val;
    }
    @JsonProperty("damage_from_players_smart_bomb_num_shots")
    public Long getDamageFromPlayersSmartBombNumShots() {
        return damageFromPlayersSmartBombNumShots;
    }
    private Long damageFromPlayersSuperAmount;
    public void setDamageFromPlayersSuperAmount(Long val) {
        damageFromPlayersSuperAmount = val;
    }
    @JsonProperty("damage_from_players_super_amount")
    public Long getDamageFromPlayersSuperAmount() {
        return damageFromPlayersSuperAmount;
    }
    private Long damageFromPlayersSuperNumShots;
    public void setDamageFromPlayersSuperNumShots(Long val) {
        damageFromPlayersSuperNumShots = val;
    }
    @JsonProperty("damage_from_players_super_num_shots")
    public Long getDamageFromPlayersSuperNumShots() {
        return damageFromPlayersSuperNumShots;
    }
    private Long damageFromStructuresTotalAmount;
    public void setDamageFromStructuresTotalAmount(Long val) {
        damageFromStructuresTotalAmount = val;
    }
    @JsonProperty("damage_from_structures_total_amount")
    public Long getDamageFromStructuresTotalAmount() {
        return damageFromStructuresTotalAmount;
    }
    private Long damageFromStructuresTotalNumShots;
    public void setDamageFromStructuresTotalNumShots(Long val) {
        damageFromStructuresTotalNumShots = val;
    }
    @JsonProperty("damage_from_structures_total_num_shots")
    public Long getDamageFromStructuresTotalNumShots() {
        return damageFromStructuresTotalNumShots;
    }
    private Long damageToPlayersBombAmount;
    public void setDamageToPlayersBombAmount(Long val) {
        damageToPlayersBombAmount = val;
    }
    @JsonProperty("damage_to_players_bomb_amount")
    public Long getDamageToPlayersBombAmount() {
        return damageToPlayersBombAmount;
    }
    private Long damageToPlayersBombNumShots;
    public void setDamageToPlayersBombNumShots(Long val) {
        damageToPlayersBombNumShots = val;
    }
    @JsonProperty("damage_to_players_bomb_num_shots")
    public Long getDamageToPlayersBombNumShots() {
        return damageToPlayersBombNumShots;
    }
    private Long damageToPlayersCombatDroneAmount;
    public void setDamageToPlayersCombatDroneAmount(Long val) {
        damageToPlayersCombatDroneAmount = val;
    }
    @JsonProperty("damage_to_players_combat_drone_amount")
    public Long getDamageToPlayersCombatDroneAmount() {
        return damageToPlayersCombatDroneAmount;
    }
    private Long damageToPlayersCombatDroneNumShots;
    public void setDamageToPlayersCombatDroneNumShots(Long val) {
        damageToPlayersCombatDroneNumShots = val;
    }
    @JsonProperty("damage_to_players_combat_drone_num_shots")
    public Long getDamageToPlayersCombatDroneNumShots() {
        return damageToPlayersCombatDroneNumShots;
    }
    private Long damageToPlayersEnergyAmount;
    public void setDamageToPlayersEnergyAmount(Long val) {
        damageToPlayersEnergyAmount = val;
    }
    @JsonProperty("damage_to_players_energy_amount")
    public Long getDamageToPlayersEnergyAmount() {
        return damageToPlayersEnergyAmount;
    }
    private Long damageToPlayersEnergyNumShots;
    public void setDamageToPlayersEnergyNumShots(Long val) {
        damageToPlayersEnergyNumShots = val;
    }
    @JsonProperty("damage_to_players_energy_num_shots")
    public Long getDamageToPlayersEnergyNumShots() {
        return damageToPlayersEnergyNumShots;
    }
    private Long damageToPlayersFighterBomberAmount;
    public void setDamageToPlayersFighterBomberAmount(Long val) {
        damageToPlayersFighterBomberAmount = val;
    }
    @JsonProperty("damage_to_players_fighter_bomber_amount")
    public Long getDamageToPlayersFighterBomberAmount() {
        return damageToPlayersFighterBomberAmount;
    }
    private Long damageToPlayersFighterBomberNumShots;
    public void setDamageToPlayersFighterBomberNumShots(Long val) {
        damageToPlayersFighterBomberNumShots = val;
    }
    @JsonProperty("damage_to_players_fighter_bomber_num_shots")
    public Long getDamageToPlayersFighterBomberNumShots() {
        return damageToPlayersFighterBomberNumShots;
    }
    private Long damageToPlayersFighterDroneAmount;
    public void setDamageToPlayersFighterDroneAmount(Long val) {
        damageToPlayersFighterDroneAmount = val;
    }
    @JsonProperty("damage_to_players_fighter_drone_amount")
    public Long getDamageToPlayersFighterDroneAmount() {
        return damageToPlayersFighterDroneAmount;
    }
    private Long damageToPlayersFighterDroneNumShots;
    public void setDamageToPlayersFighterDroneNumShots(Long val) {
        damageToPlayersFighterDroneNumShots = val;
    }
    @JsonProperty("damage_to_players_fighter_drone_num_shots")
    public Long getDamageToPlayersFighterDroneNumShots() {
        return damageToPlayersFighterDroneNumShots;
    }
    private Long damageToPlayersHybridAmount;
    public void setDamageToPlayersHybridAmount(Long val) {
        damageToPlayersHybridAmount = val;
    }
    @JsonProperty("damage_to_players_hybrid_amount")
    public Long getDamageToPlayersHybridAmount() {
        return damageToPlayersHybridAmount;
    }
    private Long damageToPlayersHybridNumShots;
    public void setDamageToPlayersHybridNumShots(Long val) {
        damageToPlayersHybridNumShots = val;
    }
    @JsonProperty("damage_to_players_hybrid_num_shots")
    public Long getDamageToPlayersHybridNumShots() {
        return damageToPlayersHybridNumShots;
    }
    private Long damageToPlayersMissileAmount;
    public void setDamageToPlayersMissileAmount(Long val) {
        damageToPlayersMissileAmount = val;
    }
    @JsonProperty("damage_to_players_missile_amount")
    public Long getDamageToPlayersMissileAmount() {
        return damageToPlayersMissileAmount;
    }
    private Long damageToPlayersMissileNumShots;
    public void setDamageToPlayersMissileNumShots(Long val) {
        damageToPlayersMissileNumShots = val;
    }
    @JsonProperty("damage_to_players_missile_num_shots")
    public Long getDamageToPlayersMissileNumShots() {
        return damageToPlayersMissileNumShots;
    }
    private Long damageToPlayersProjectileAmount;
    public void setDamageToPlayersProjectileAmount(Long val) {
        damageToPlayersProjectileAmount = val;
    }
    @JsonProperty("damage_to_players_projectile_amount")
    public Long getDamageToPlayersProjectileAmount() {
        return damageToPlayersProjectileAmount;
    }
    private Long damageToPlayersProjectileNumShots;
    public void setDamageToPlayersProjectileNumShots(Long val) {
        damageToPlayersProjectileNumShots = val;
    }
    @JsonProperty("damage_to_players_projectile_num_shots")
    public Long getDamageToPlayersProjectileNumShots() {
        return damageToPlayersProjectileNumShots;
    }
    private Long damageToPlayersSmartBombAmount;
    public void setDamageToPlayersSmartBombAmount(Long val) {
        damageToPlayersSmartBombAmount = val;
    }
    @JsonProperty("damage_to_players_smart_bomb_amount")
    public Long getDamageToPlayersSmartBombAmount() {
        return damageToPlayersSmartBombAmount;
    }
    private Long damageToPlayersSmartBombNumShots;
    public void setDamageToPlayersSmartBombNumShots(Long val) {
        damageToPlayersSmartBombNumShots = val;
    }
    @JsonProperty("damage_to_players_smart_bomb_num_shots")
    public Long getDamageToPlayersSmartBombNumShots() {
        return damageToPlayersSmartBombNumShots;
    }
    private Long damageToPlayersSuperAmount;
    public void setDamageToPlayersSuperAmount(Long val) {
        damageToPlayersSuperAmount = val;
    }
    @JsonProperty("damage_to_players_super_amount")
    public Long getDamageToPlayersSuperAmount() {
        return damageToPlayersSuperAmount;
    }
    private Long damageToPlayersSuperNumShots;
    public void setDamageToPlayersSuperNumShots(Long val) {
        damageToPlayersSuperNumShots = val;
    }
    @JsonProperty("damage_to_players_super_num_shots")
    public Long getDamageToPlayersSuperNumShots() {
        return damageToPlayersSuperNumShots;
    }
    private Long damageToStructuresTotalAmount;
    public void setDamageToStructuresTotalAmount(Long val) {
        damageToStructuresTotalAmount = val;
    }
    @JsonProperty("damage_to_structures_total_amount")
    public Long getDamageToStructuresTotalAmount() {
        return damageToStructuresTotalAmount;
    }
    private Long damageToStructuresTotalNumShots;
    public void setDamageToStructuresTotalNumShots(Long val) {
        damageToStructuresTotalNumShots = val;
    }
    @JsonProperty("damage_to_structures_total_num_shots")
    public Long getDamageToStructuresTotalNumShots() {
        return damageToStructuresTotalNumShots;
    }
    private Long deathsHighSec;
    public void setDeathsHighSec(Long val) {
        deathsHighSec = val;
    }
    @JsonProperty("deaths_high_sec")
    public Long getDeathsHighSec() {
        return deathsHighSec;
    }
    private Long deathsLowSec;
    public void setDeathsLowSec(Long val) {
        deathsLowSec = val;
    }
    @JsonProperty("deaths_low_sec")
    public Long getDeathsLowSec() {
        return deathsLowSec;
    }
    private Long deathsNullSec;
    public void setDeathsNullSec(Long val) {
        deathsNullSec = val;
    }
    @JsonProperty("deaths_null_sec")
    public Long getDeathsNullSec() {
        return deathsNullSec;
    }
    private Long deathsPodHighSec;
    public void setDeathsPodHighSec(Long val) {
        deathsPodHighSec = val;
    }
    @JsonProperty("deaths_pod_high_sec")
    public Long getDeathsPodHighSec() {
        return deathsPodHighSec;
    }
    private Long deathsPodLowSec;
    public void setDeathsPodLowSec(Long val) {
        deathsPodLowSec = val;
    }
    @JsonProperty("deaths_pod_low_sec")
    public Long getDeathsPodLowSec() {
        return deathsPodLowSec;
    }
    private Long deathsPodNullSec;
    public void setDeathsPodNullSec(Long val) {
        deathsPodNullSec = val;
    }
    @JsonProperty("deaths_pod_null_sec")
    public Long getDeathsPodNullSec() {
        return deathsPodNullSec;
    }
    private Long deathsPodWormhole;
    public void setDeathsPodWormhole(Long val) {
        deathsPodWormhole = val;
    }
    @JsonProperty("deaths_pod_wormhole")
    public Long getDeathsPodWormhole() {
        return deathsPodWormhole;
    }
    private Long deathsWormhole;
    public void setDeathsWormhole(Long val) {
        deathsWormhole = val;
    }
    @JsonProperty("deaths_wormhole")
    public Long getDeathsWormhole() {
        return deathsWormhole;
    }
    private Long droneEngage;
    public void setDroneEngage(Long val) {
        droneEngage = val;
    }
    @JsonProperty("drone_engage")
    public Long getDroneEngage() {
        return droneEngage;
    }
    private Long dscans;
    public void setDscans(Long val) {
        dscans = val;
    }
    @JsonProperty("dscans")
    public Long getDscans() {
        return dscans;
    }
    private Long duelRequested;
    public void setDuelRequested(Long val) {
        duelRequested = val;
    }
    @JsonProperty("duel_requested")
    public Long getDuelRequested() {
        return duelRequested;
    }
    private Long engagementRegister;
    public void setEngagementRegister(Long val) {
        engagementRegister = val;
    }
    @JsonProperty("engagement_register")
    public Long getEngagementRegister() {
        return engagementRegister;
    }
    private Long killsAssists;
    public void setKillsAssists(Long val) {
        killsAssists = val;
    }
    @JsonProperty("kills_assists")
    public Long getKillsAssists() {
        return killsAssists;
    }
    private Long killsHighSec;
    public void setKillsHighSec(Long val) {
        killsHighSec = val;
    }
    @JsonProperty("kills_high_sec")
    public Long getKillsHighSec() {
        return killsHighSec;
    }
    private Long killsLowSec;
    public void setKillsLowSec(Long val) {
        killsLowSec = val;
    }
    @JsonProperty("kills_low_sec")
    public Long getKillsLowSec() {
        return killsLowSec;
    }
    private Long killsNullSec;
    public void setKillsNullSec(Long val) {
        killsNullSec = val;
    }
    @JsonProperty("kills_null_sec")
    public Long getKillsNullSec() {
        return killsNullSec;
    }
    private Long killsPodHighSec;
    public void setKillsPodHighSec(Long val) {
        killsPodHighSec = val;
    }
    @JsonProperty("kills_pod_high_sec")
    public Long getKillsPodHighSec() {
        return killsPodHighSec;
    }
    private Long killsPodLowSec;
    public void setKillsPodLowSec(Long val) {
        killsPodLowSec = val;
    }
    @JsonProperty("kills_pod_low_sec")
    public Long getKillsPodLowSec() {
        return killsPodLowSec;
    }
    private Long killsPodNullSec;
    public void setKillsPodNullSec(Long val) {
        killsPodNullSec = val;
    }
    @JsonProperty("kills_pod_null_sec")
    public Long getKillsPodNullSec() {
        return killsPodNullSec;
    }
    private Long killsPodWormhole;
    public void setKillsPodWormhole(Long val) {
        killsPodWormhole = val;
    }
    @JsonProperty("kills_pod_wormhole")
    public Long getKillsPodWormhole() {
        return killsPodWormhole;
    }
    private Long killsWormhole;
    public void setKillsWormhole(Long val) {
        killsWormhole = val;
    }
    @JsonProperty("kills_wormhole")
    public Long getKillsWormhole() {
        return killsWormhole;
    }
    private Long npcFlagSet;
    public void setNpcFlagSet(Long val) {
        npcFlagSet = val;
    }
    @JsonProperty("npc_flag_set")
    public Long getNpcFlagSet() {
        return npcFlagSet;
    }
    private Long probeScans;
    public void setProbeScans(Long val) {
        probeScans = val;
    }
    @JsonProperty("probe_scans")
    public Long getProbeScans() {
        return probeScans;
    }
    private Long pvpFlagSet;
    public void setPvpFlagSet(Long val) {
        pvpFlagSet = val;
    }
    @JsonProperty("pvp_flag_set")
    public Long getPvpFlagSet() {
        return pvpFlagSet;
    }
    private Long repairArmorByRemoteAmount;
    public void setRepairArmorByRemoteAmount(Long val) {
        repairArmorByRemoteAmount = val;
    }
    @JsonProperty("repair_armor_by_remote_amount")
    public Long getRepairArmorByRemoteAmount() {
        return repairArmorByRemoteAmount;
    }
    private Long repairArmorRemoteAmount;
    public void setRepairArmorRemoteAmount(Long val) {
        repairArmorRemoteAmount = val;
    }
    @JsonProperty("repair_armor_remote_amount")
    public Long getRepairArmorRemoteAmount() {
        return repairArmorRemoteAmount;
    }
    private Long repairArmorSelfAmount;
    public void setRepairArmorSelfAmount(Long val) {
        repairArmorSelfAmount = val;
    }
    @JsonProperty("repair_armor_self_amount")
    public Long getRepairArmorSelfAmount() {
        return repairArmorSelfAmount;
    }
    private Long repairCapacitorByRemoteAmount;
    public void setRepairCapacitorByRemoteAmount(Long val) {
        repairCapacitorByRemoteAmount = val;
    }
    @JsonProperty("repair_capacitor_by_remote_amount")
    public Long getRepairCapacitorByRemoteAmount() {
        return repairCapacitorByRemoteAmount;
    }
    private Long repairCapacitorRemoteAmount;
    public void setRepairCapacitorRemoteAmount(Long val) {
        repairCapacitorRemoteAmount = val;
    }
    @JsonProperty("repair_capacitor_remote_amount")
    public Long getRepairCapacitorRemoteAmount() {
        return repairCapacitorRemoteAmount;
    }
    private Long repairCapacitorSelfAmount;
    public void setRepairCapacitorSelfAmount(Long val) {
        repairCapacitorSelfAmount = val;
    }
    @JsonProperty("repair_capacitor_self_amount")
    public Long getRepairCapacitorSelfAmount() {
        return repairCapacitorSelfAmount;
    }
    private Long repairHullByRemoteAmount;
    public void setRepairHullByRemoteAmount(Long val) {
        repairHullByRemoteAmount = val;
    }
    @JsonProperty("repair_hull_by_remote_amount")
    public Long getRepairHullByRemoteAmount() {
        return repairHullByRemoteAmount;
    }
    private Long repairHullRemoteAmount;
    public void setRepairHullRemoteAmount(Long val) {
        repairHullRemoteAmount = val;
    }
    @JsonProperty("repair_hull_remote_amount")
    public Long getRepairHullRemoteAmount() {
        return repairHullRemoteAmount;
    }
    private Long repairHullSelfAmount;
    public void setRepairHullSelfAmount(Long val) {
        repairHullSelfAmount = val;
    }
    @JsonProperty("repair_hull_self_amount")
    public Long getRepairHullSelfAmount() {
        return repairHullSelfAmount;
    }
    private Long repairShieldByRemoteAmount;
    public void setRepairShieldByRemoteAmount(Long val) {
        repairShieldByRemoteAmount = val;
    }
    @JsonProperty("repair_shield_by_remote_amount")
    public Long getRepairShieldByRemoteAmount() {
        return repairShieldByRemoteAmount;
    }
    private Long repairShieldRemoteAmount;
    public void setRepairShieldRemoteAmount(Long val) {
        repairShieldRemoteAmount = val;
    }
    @JsonProperty("repair_shield_remote_amount")
    public Long getRepairShieldRemoteAmount() {
        return repairShieldRemoteAmount;
    }
    private Long repairShieldSelfAmount;
    public void setRepairShieldSelfAmount(Long val) {
        repairShieldSelfAmount = val;
    }
    @JsonProperty("repair_shield_self_amount")
    public Long getRepairShieldSelfAmount() {
        return repairShieldSelfAmount;
    }
    private Long selfDestructs;
    public void setSelfDestructs(Long val) {
        selfDestructs = val;
    }
    @JsonProperty("self_destructs")
    public Long getSelfDestructs() {
        return selfDestructs;
    }
    private Long warpScramblePc;
    public void setWarpScramblePc(Long val) {
        warpScramblePc = val;
    }
    @JsonProperty("warp_scramble_pc")
    public Long getWarpScramblePc() {
        return warpScramblePc;
    }
    private Long warpScrambledbyNpc;
    public void setWarpScrambledbyNpc(Long val) {
        warpScrambledbyNpc = val;
    }
    @JsonProperty("warp_scrambledby_npc")
    public Long getWarpScrambledbyNpc() {
        return warpScrambledbyNpc;
    }
    private Long warpScrambledbyPc;
    public void setWarpScrambledbyPc(Long val) {
        warpScrambledbyPc = val;
    }
    @JsonProperty("warp_scrambledby_pc")
    public Long getWarpScrambledbyPc() {
        return warpScrambledbyPc;
    }
    private Long weaponFlagSet;
    public void setWeaponFlagSet(Long val) {
        weaponFlagSet = val;
    }
    @JsonProperty("weapon_flag_set")
    public Long getWeaponFlagSet() {
        return weaponFlagSet;
    }
    private Long webifiedbyNpc;
    public void setWebifiedbyNpc(Long val) {
        webifiedbyNpc = val;
    }
    @JsonProperty("webifiedby_npc")
    public Long getWebifiedbyNpc() {
        return webifiedbyNpc;
    }
    private Long webifiedbyPc;
    public void setWebifiedbyPc(Long val) {
        webifiedbyPc = val;
    }
    @JsonProperty("webifiedby_pc")
    public Long getWebifiedbyPc() {
        return webifiedbyPc;
    }
    private Long webifyingPc;
    public void setWebifyingPc(Long val) {
        webifyingPc = val;
    }
    @JsonProperty("webifying_pc")
    public Long getWebifyingPc() {
        return webifyingPc;
    }
}
