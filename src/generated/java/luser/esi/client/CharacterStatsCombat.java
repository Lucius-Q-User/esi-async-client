package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CharacterStatsCombat {
    private Long capDrainedbyNpc;
    /**
     * cap_drainedby_npc integer
     */
    public void setCapDrainedbyNpc(Long val) {
        capDrainedbyNpc = val;
    }
    /**
     * cap_drainedby_npc integer
     */
    @JsonProperty("cap_drainedby_npc")
    public Long getCapDrainedbyNpc() {
        return capDrainedbyNpc;
    }
    private Long capDrainedbyPc;
    /**
     * cap_drainedby_pc integer
     */
    public void setCapDrainedbyPc(Long val) {
        capDrainedbyPc = val;
    }
    /**
     * cap_drainedby_pc integer
     */
    @JsonProperty("cap_drainedby_pc")
    public Long getCapDrainedbyPc() {
        return capDrainedbyPc;
    }
    private Long capDrainingPc;
    /**
     * cap_draining_pc integer
     */
    public void setCapDrainingPc(Long val) {
        capDrainingPc = val;
    }
    /**
     * cap_draining_pc integer
     */
    @JsonProperty("cap_draining_pc")
    public Long getCapDrainingPc() {
        return capDrainingPc;
    }
    private Long criminalFlagSet;
    /**
     * criminal_flag_set integer
     */
    public void setCriminalFlagSet(Long val) {
        criminalFlagSet = val;
    }
    /**
     * criminal_flag_set integer
     */
    @JsonProperty("criminal_flag_set")
    public Long getCriminalFlagSet() {
        return criminalFlagSet;
    }
    private Long damageFromNpCsAmount;
    /**
     * damage_from_np_cs_amount integer
     */
    public void setDamageFromNpCsAmount(Long val) {
        damageFromNpCsAmount = val;
    }
    /**
     * damage_from_np_cs_amount integer
     */
    @JsonProperty("damage_from_np_cs_amount")
    public Long getDamageFromNpCsAmount() {
        return damageFromNpCsAmount;
    }
    private Long damageFromNpCsNumShots;
    /**
     * damage_from_np_cs_num_shots integer
     */
    public void setDamageFromNpCsNumShots(Long val) {
        damageFromNpCsNumShots = val;
    }
    /**
     * damage_from_np_cs_num_shots integer
     */
    @JsonProperty("damage_from_np_cs_num_shots")
    public Long getDamageFromNpCsNumShots() {
        return damageFromNpCsNumShots;
    }
    private Long damageFromPlayersBombAmount;
    /**
     * damage_from_players_bomb_amount integer
     */
    public void setDamageFromPlayersBombAmount(Long val) {
        damageFromPlayersBombAmount = val;
    }
    /**
     * damage_from_players_bomb_amount integer
     */
    @JsonProperty("damage_from_players_bomb_amount")
    public Long getDamageFromPlayersBombAmount() {
        return damageFromPlayersBombAmount;
    }
    private Long damageFromPlayersBombNumShots;
    /**
     * damage_from_players_bomb_num_shots integer
     */
    public void setDamageFromPlayersBombNumShots(Long val) {
        damageFromPlayersBombNumShots = val;
    }
    /**
     * damage_from_players_bomb_num_shots integer
     */
    @JsonProperty("damage_from_players_bomb_num_shots")
    public Long getDamageFromPlayersBombNumShots() {
        return damageFromPlayersBombNumShots;
    }
    private Long damageFromPlayersCombatDroneAmount;
    /**
     * damage_from_players_combat_drone_amount integer
     */
    public void setDamageFromPlayersCombatDroneAmount(Long val) {
        damageFromPlayersCombatDroneAmount = val;
    }
    /**
     * damage_from_players_combat_drone_amount integer
     */
    @JsonProperty("damage_from_players_combat_drone_amount")
    public Long getDamageFromPlayersCombatDroneAmount() {
        return damageFromPlayersCombatDroneAmount;
    }
    private Long damageFromPlayersCombatDroneNumShots;
    /**
     * damage_from_players_combat_drone_num_shots integer
     */
    public void setDamageFromPlayersCombatDroneNumShots(Long val) {
        damageFromPlayersCombatDroneNumShots = val;
    }
    /**
     * damage_from_players_combat_drone_num_shots integer
     */
    @JsonProperty("damage_from_players_combat_drone_num_shots")
    public Long getDamageFromPlayersCombatDroneNumShots() {
        return damageFromPlayersCombatDroneNumShots;
    }
    private Long damageFromPlayersEnergyAmount;
    /**
     * damage_from_players_energy_amount integer
     */
    public void setDamageFromPlayersEnergyAmount(Long val) {
        damageFromPlayersEnergyAmount = val;
    }
    /**
     * damage_from_players_energy_amount integer
     */
    @JsonProperty("damage_from_players_energy_amount")
    public Long getDamageFromPlayersEnergyAmount() {
        return damageFromPlayersEnergyAmount;
    }
    private Long damageFromPlayersEnergyNumShots;
    /**
     * damage_from_players_energy_num_shots integer
     */
    public void setDamageFromPlayersEnergyNumShots(Long val) {
        damageFromPlayersEnergyNumShots = val;
    }
    /**
     * damage_from_players_energy_num_shots integer
     */
    @JsonProperty("damage_from_players_energy_num_shots")
    public Long getDamageFromPlayersEnergyNumShots() {
        return damageFromPlayersEnergyNumShots;
    }
    private Long damageFromPlayersFighterBomberAmount;
    /**
     * damage_from_players_fighter_bomber_amount integer
     */
    public void setDamageFromPlayersFighterBomberAmount(Long val) {
        damageFromPlayersFighterBomberAmount = val;
    }
    /**
     * damage_from_players_fighter_bomber_amount integer
     */
    @JsonProperty("damage_from_players_fighter_bomber_amount")
    public Long getDamageFromPlayersFighterBomberAmount() {
        return damageFromPlayersFighterBomberAmount;
    }
    private Long damageFromPlayersFighterBomberNumShots;
    /**
     * damage_from_players_fighter_bomber_num_shots integer
     */
    public void setDamageFromPlayersFighterBomberNumShots(Long val) {
        damageFromPlayersFighterBomberNumShots = val;
    }
    /**
     * damage_from_players_fighter_bomber_num_shots integer
     */
    @JsonProperty("damage_from_players_fighter_bomber_num_shots")
    public Long getDamageFromPlayersFighterBomberNumShots() {
        return damageFromPlayersFighterBomberNumShots;
    }
    private Long damageFromPlayersFighterDroneAmount;
    /**
     * damage_from_players_fighter_drone_amount integer
     */
    public void setDamageFromPlayersFighterDroneAmount(Long val) {
        damageFromPlayersFighterDroneAmount = val;
    }
    /**
     * damage_from_players_fighter_drone_amount integer
     */
    @JsonProperty("damage_from_players_fighter_drone_amount")
    public Long getDamageFromPlayersFighterDroneAmount() {
        return damageFromPlayersFighterDroneAmount;
    }
    private Long damageFromPlayersFighterDroneNumShots;
    /**
     * damage_from_players_fighter_drone_num_shots integer
     */
    public void setDamageFromPlayersFighterDroneNumShots(Long val) {
        damageFromPlayersFighterDroneNumShots = val;
    }
    /**
     * damage_from_players_fighter_drone_num_shots integer
     */
    @JsonProperty("damage_from_players_fighter_drone_num_shots")
    public Long getDamageFromPlayersFighterDroneNumShots() {
        return damageFromPlayersFighterDroneNumShots;
    }
    private Long damageFromPlayersHybridAmount;
    /**
     * damage_from_players_hybrid_amount integer
     */
    public void setDamageFromPlayersHybridAmount(Long val) {
        damageFromPlayersHybridAmount = val;
    }
    /**
     * damage_from_players_hybrid_amount integer
     */
    @JsonProperty("damage_from_players_hybrid_amount")
    public Long getDamageFromPlayersHybridAmount() {
        return damageFromPlayersHybridAmount;
    }
    private Long damageFromPlayersHybridNumShots;
    /**
     * damage_from_players_hybrid_num_shots integer
     */
    public void setDamageFromPlayersHybridNumShots(Long val) {
        damageFromPlayersHybridNumShots = val;
    }
    /**
     * damage_from_players_hybrid_num_shots integer
     */
    @JsonProperty("damage_from_players_hybrid_num_shots")
    public Long getDamageFromPlayersHybridNumShots() {
        return damageFromPlayersHybridNumShots;
    }
    private Long damageFromPlayersMissileAmount;
    /**
     * damage_from_players_missile_amount integer
     */
    public void setDamageFromPlayersMissileAmount(Long val) {
        damageFromPlayersMissileAmount = val;
    }
    /**
     * damage_from_players_missile_amount integer
     */
    @JsonProperty("damage_from_players_missile_amount")
    public Long getDamageFromPlayersMissileAmount() {
        return damageFromPlayersMissileAmount;
    }
    private Long damageFromPlayersMissileNumShots;
    /**
     * damage_from_players_missile_num_shots integer
     */
    public void setDamageFromPlayersMissileNumShots(Long val) {
        damageFromPlayersMissileNumShots = val;
    }
    /**
     * damage_from_players_missile_num_shots integer
     */
    @JsonProperty("damage_from_players_missile_num_shots")
    public Long getDamageFromPlayersMissileNumShots() {
        return damageFromPlayersMissileNumShots;
    }
    private Long damageFromPlayersProjectileAmount;
    /**
     * damage_from_players_projectile_amount integer
     */
    public void setDamageFromPlayersProjectileAmount(Long val) {
        damageFromPlayersProjectileAmount = val;
    }
    /**
     * damage_from_players_projectile_amount integer
     */
    @JsonProperty("damage_from_players_projectile_amount")
    public Long getDamageFromPlayersProjectileAmount() {
        return damageFromPlayersProjectileAmount;
    }
    private Long damageFromPlayersProjectileNumShots;
    /**
     * damage_from_players_projectile_num_shots integer
     */
    public void setDamageFromPlayersProjectileNumShots(Long val) {
        damageFromPlayersProjectileNumShots = val;
    }
    /**
     * damage_from_players_projectile_num_shots integer
     */
    @JsonProperty("damage_from_players_projectile_num_shots")
    public Long getDamageFromPlayersProjectileNumShots() {
        return damageFromPlayersProjectileNumShots;
    }
    private Long damageFromPlayersSmartBombAmount;
    /**
     * damage_from_players_smart_bomb_amount integer
     */
    public void setDamageFromPlayersSmartBombAmount(Long val) {
        damageFromPlayersSmartBombAmount = val;
    }
    /**
     * damage_from_players_smart_bomb_amount integer
     */
    @JsonProperty("damage_from_players_smart_bomb_amount")
    public Long getDamageFromPlayersSmartBombAmount() {
        return damageFromPlayersSmartBombAmount;
    }
    private Long damageFromPlayersSmartBombNumShots;
    /**
     * damage_from_players_smart_bomb_num_shots integer
     */
    public void setDamageFromPlayersSmartBombNumShots(Long val) {
        damageFromPlayersSmartBombNumShots = val;
    }
    /**
     * damage_from_players_smart_bomb_num_shots integer
     */
    @JsonProperty("damage_from_players_smart_bomb_num_shots")
    public Long getDamageFromPlayersSmartBombNumShots() {
        return damageFromPlayersSmartBombNumShots;
    }
    private Long damageFromPlayersSuperAmount;
    /**
     * damage_from_players_super_amount integer
     */
    public void setDamageFromPlayersSuperAmount(Long val) {
        damageFromPlayersSuperAmount = val;
    }
    /**
     * damage_from_players_super_amount integer
     */
    @JsonProperty("damage_from_players_super_amount")
    public Long getDamageFromPlayersSuperAmount() {
        return damageFromPlayersSuperAmount;
    }
    private Long damageFromPlayersSuperNumShots;
    /**
     * damage_from_players_super_num_shots integer
     */
    public void setDamageFromPlayersSuperNumShots(Long val) {
        damageFromPlayersSuperNumShots = val;
    }
    /**
     * damage_from_players_super_num_shots integer
     */
    @JsonProperty("damage_from_players_super_num_shots")
    public Long getDamageFromPlayersSuperNumShots() {
        return damageFromPlayersSuperNumShots;
    }
    private Long damageFromStructuresTotalAmount;
    /**
     * damage_from_structures_total_amount integer
     */
    public void setDamageFromStructuresTotalAmount(Long val) {
        damageFromStructuresTotalAmount = val;
    }
    /**
     * damage_from_structures_total_amount integer
     */
    @JsonProperty("damage_from_structures_total_amount")
    public Long getDamageFromStructuresTotalAmount() {
        return damageFromStructuresTotalAmount;
    }
    private Long damageFromStructuresTotalNumShots;
    /**
     * damage_from_structures_total_num_shots integer
     */
    public void setDamageFromStructuresTotalNumShots(Long val) {
        damageFromStructuresTotalNumShots = val;
    }
    /**
     * damage_from_structures_total_num_shots integer
     */
    @JsonProperty("damage_from_structures_total_num_shots")
    public Long getDamageFromStructuresTotalNumShots() {
        return damageFromStructuresTotalNumShots;
    }
    private Long damageToPlayersBombAmount;
    /**
     * damage_to_players_bomb_amount integer
     */
    public void setDamageToPlayersBombAmount(Long val) {
        damageToPlayersBombAmount = val;
    }
    /**
     * damage_to_players_bomb_amount integer
     */
    @JsonProperty("damage_to_players_bomb_amount")
    public Long getDamageToPlayersBombAmount() {
        return damageToPlayersBombAmount;
    }
    private Long damageToPlayersBombNumShots;
    /**
     * damage_to_players_bomb_num_shots integer
     */
    public void setDamageToPlayersBombNumShots(Long val) {
        damageToPlayersBombNumShots = val;
    }
    /**
     * damage_to_players_bomb_num_shots integer
     */
    @JsonProperty("damage_to_players_bomb_num_shots")
    public Long getDamageToPlayersBombNumShots() {
        return damageToPlayersBombNumShots;
    }
    private Long damageToPlayersCombatDroneAmount;
    /**
     * damage_to_players_combat_drone_amount integer
     */
    public void setDamageToPlayersCombatDroneAmount(Long val) {
        damageToPlayersCombatDroneAmount = val;
    }
    /**
     * damage_to_players_combat_drone_amount integer
     */
    @JsonProperty("damage_to_players_combat_drone_amount")
    public Long getDamageToPlayersCombatDroneAmount() {
        return damageToPlayersCombatDroneAmount;
    }
    private Long damageToPlayersCombatDroneNumShots;
    /**
     * damage_to_players_combat_drone_num_shots integer
     */
    public void setDamageToPlayersCombatDroneNumShots(Long val) {
        damageToPlayersCombatDroneNumShots = val;
    }
    /**
     * damage_to_players_combat_drone_num_shots integer
     */
    @JsonProperty("damage_to_players_combat_drone_num_shots")
    public Long getDamageToPlayersCombatDroneNumShots() {
        return damageToPlayersCombatDroneNumShots;
    }
    private Long damageToPlayersEnergyAmount;
    /**
     * damage_to_players_energy_amount integer
     */
    public void setDamageToPlayersEnergyAmount(Long val) {
        damageToPlayersEnergyAmount = val;
    }
    /**
     * damage_to_players_energy_amount integer
     */
    @JsonProperty("damage_to_players_energy_amount")
    public Long getDamageToPlayersEnergyAmount() {
        return damageToPlayersEnergyAmount;
    }
    private Long damageToPlayersEnergyNumShots;
    /**
     * damage_to_players_energy_num_shots integer
     */
    public void setDamageToPlayersEnergyNumShots(Long val) {
        damageToPlayersEnergyNumShots = val;
    }
    /**
     * damage_to_players_energy_num_shots integer
     */
    @JsonProperty("damage_to_players_energy_num_shots")
    public Long getDamageToPlayersEnergyNumShots() {
        return damageToPlayersEnergyNumShots;
    }
    private Long damageToPlayersFighterBomberAmount;
    /**
     * damage_to_players_fighter_bomber_amount integer
     */
    public void setDamageToPlayersFighterBomberAmount(Long val) {
        damageToPlayersFighterBomberAmount = val;
    }
    /**
     * damage_to_players_fighter_bomber_amount integer
     */
    @JsonProperty("damage_to_players_fighter_bomber_amount")
    public Long getDamageToPlayersFighterBomberAmount() {
        return damageToPlayersFighterBomberAmount;
    }
    private Long damageToPlayersFighterBomberNumShots;
    /**
     * damage_to_players_fighter_bomber_num_shots integer
     */
    public void setDamageToPlayersFighterBomberNumShots(Long val) {
        damageToPlayersFighterBomberNumShots = val;
    }
    /**
     * damage_to_players_fighter_bomber_num_shots integer
     */
    @JsonProperty("damage_to_players_fighter_bomber_num_shots")
    public Long getDamageToPlayersFighterBomberNumShots() {
        return damageToPlayersFighterBomberNumShots;
    }
    private Long damageToPlayersFighterDroneAmount;
    /**
     * damage_to_players_fighter_drone_amount integer
     */
    public void setDamageToPlayersFighterDroneAmount(Long val) {
        damageToPlayersFighterDroneAmount = val;
    }
    /**
     * damage_to_players_fighter_drone_amount integer
     */
    @JsonProperty("damage_to_players_fighter_drone_amount")
    public Long getDamageToPlayersFighterDroneAmount() {
        return damageToPlayersFighterDroneAmount;
    }
    private Long damageToPlayersFighterDroneNumShots;
    /**
     * damage_to_players_fighter_drone_num_shots integer
     */
    public void setDamageToPlayersFighterDroneNumShots(Long val) {
        damageToPlayersFighterDroneNumShots = val;
    }
    /**
     * damage_to_players_fighter_drone_num_shots integer
     */
    @JsonProperty("damage_to_players_fighter_drone_num_shots")
    public Long getDamageToPlayersFighterDroneNumShots() {
        return damageToPlayersFighterDroneNumShots;
    }
    private Long damageToPlayersHybridAmount;
    /**
     * damage_to_players_hybrid_amount integer
     */
    public void setDamageToPlayersHybridAmount(Long val) {
        damageToPlayersHybridAmount = val;
    }
    /**
     * damage_to_players_hybrid_amount integer
     */
    @JsonProperty("damage_to_players_hybrid_amount")
    public Long getDamageToPlayersHybridAmount() {
        return damageToPlayersHybridAmount;
    }
    private Long damageToPlayersHybridNumShots;
    /**
     * damage_to_players_hybrid_num_shots integer
     */
    public void setDamageToPlayersHybridNumShots(Long val) {
        damageToPlayersHybridNumShots = val;
    }
    /**
     * damage_to_players_hybrid_num_shots integer
     */
    @JsonProperty("damage_to_players_hybrid_num_shots")
    public Long getDamageToPlayersHybridNumShots() {
        return damageToPlayersHybridNumShots;
    }
    private Long damageToPlayersMissileAmount;
    /**
     * damage_to_players_missile_amount integer
     */
    public void setDamageToPlayersMissileAmount(Long val) {
        damageToPlayersMissileAmount = val;
    }
    /**
     * damage_to_players_missile_amount integer
     */
    @JsonProperty("damage_to_players_missile_amount")
    public Long getDamageToPlayersMissileAmount() {
        return damageToPlayersMissileAmount;
    }
    private Long damageToPlayersMissileNumShots;
    /**
     * damage_to_players_missile_num_shots integer
     */
    public void setDamageToPlayersMissileNumShots(Long val) {
        damageToPlayersMissileNumShots = val;
    }
    /**
     * damage_to_players_missile_num_shots integer
     */
    @JsonProperty("damage_to_players_missile_num_shots")
    public Long getDamageToPlayersMissileNumShots() {
        return damageToPlayersMissileNumShots;
    }
    private Long damageToPlayersProjectileAmount;
    /**
     * damage_to_players_projectile_amount integer
     */
    public void setDamageToPlayersProjectileAmount(Long val) {
        damageToPlayersProjectileAmount = val;
    }
    /**
     * damage_to_players_projectile_amount integer
     */
    @JsonProperty("damage_to_players_projectile_amount")
    public Long getDamageToPlayersProjectileAmount() {
        return damageToPlayersProjectileAmount;
    }
    private Long damageToPlayersProjectileNumShots;
    /**
     * damage_to_players_projectile_num_shots integer
     */
    public void setDamageToPlayersProjectileNumShots(Long val) {
        damageToPlayersProjectileNumShots = val;
    }
    /**
     * damage_to_players_projectile_num_shots integer
     */
    @JsonProperty("damage_to_players_projectile_num_shots")
    public Long getDamageToPlayersProjectileNumShots() {
        return damageToPlayersProjectileNumShots;
    }
    private Long damageToPlayersSmartBombAmount;
    /**
     * damage_to_players_smart_bomb_amount integer
     */
    public void setDamageToPlayersSmartBombAmount(Long val) {
        damageToPlayersSmartBombAmount = val;
    }
    /**
     * damage_to_players_smart_bomb_amount integer
     */
    @JsonProperty("damage_to_players_smart_bomb_amount")
    public Long getDamageToPlayersSmartBombAmount() {
        return damageToPlayersSmartBombAmount;
    }
    private Long damageToPlayersSmartBombNumShots;
    /**
     * damage_to_players_smart_bomb_num_shots integer
     */
    public void setDamageToPlayersSmartBombNumShots(Long val) {
        damageToPlayersSmartBombNumShots = val;
    }
    /**
     * damage_to_players_smart_bomb_num_shots integer
     */
    @JsonProperty("damage_to_players_smart_bomb_num_shots")
    public Long getDamageToPlayersSmartBombNumShots() {
        return damageToPlayersSmartBombNumShots;
    }
    private Long damageToPlayersSuperAmount;
    /**
     * damage_to_players_super_amount integer
     */
    public void setDamageToPlayersSuperAmount(Long val) {
        damageToPlayersSuperAmount = val;
    }
    /**
     * damage_to_players_super_amount integer
     */
    @JsonProperty("damage_to_players_super_amount")
    public Long getDamageToPlayersSuperAmount() {
        return damageToPlayersSuperAmount;
    }
    private Long damageToPlayersSuperNumShots;
    /**
     * damage_to_players_super_num_shots integer
     */
    public void setDamageToPlayersSuperNumShots(Long val) {
        damageToPlayersSuperNumShots = val;
    }
    /**
     * damage_to_players_super_num_shots integer
     */
    @JsonProperty("damage_to_players_super_num_shots")
    public Long getDamageToPlayersSuperNumShots() {
        return damageToPlayersSuperNumShots;
    }
    private Long damageToStructuresTotalAmount;
    /**
     * damage_to_structures_total_amount integer
     */
    public void setDamageToStructuresTotalAmount(Long val) {
        damageToStructuresTotalAmount = val;
    }
    /**
     * damage_to_structures_total_amount integer
     */
    @JsonProperty("damage_to_structures_total_amount")
    public Long getDamageToStructuresTotalAmount() {
        return damageToStructuresTotalAmount;
    }
    private Long damageToStructuresTotalNumShots;
    /**
     * damage_to_structures_total_num_shots integer
     */
    public void setDamageToStructuresTotalNumShots(Long val) {
        damageToStructuresTotalNumShots = val;
    }
    /**
     * damage_to_structures_total_num_shots integer
     */
    @JsonProperty("damage_to_structures_total_num_shots")
    public Long getDamageToStructuresTotalNumShots() {
        return damageToStructuresTotalNumShots;
    }
    private Long deathsHighSec;
    /**
     * deaths_high_sec integer
     */
    public void setDeathsHighSec(Long val) {
        deathsHighSec = val;
    }
    /**
     * deaths_high_sec integer
     */
    @JsonProperty("deaths_high_sec")
    public Long getDeathsHighSec() {
        return deathsHighSec;
    }
    private Long deathsLowSec;
    /**
     * deaths_low_sec integer
     */
    public void setDeathsLowSec(Long val) {
        deathsLowSec = val;
    }
    /**
     * deaths_low_sec integer
     */
    @JsonProperty("deaths_low_sec")
    public Long getDeathsLowSec() {
        return deathsLowSec;
    }
    private Long deathsNullSec;
    /**
     * deaths_null_sec integer
     */
    public void setDeathsNullSec(Long val) {
        deathsNullSec = val;
    }
    /**
     * deaths_null_sec integer
     */
    @JsonProperty("deaths_null_sec")
    public Long getDeathsNullSec() {
        return deathsNullSec;
    }
    private Long deathsPodHighSec;
    /**
     * deaths_pod_high_sec integer
     */
    public void setDeathsPodHighSec(Long val) {
        deathsPodHighSec = val;
    }
    /**
     * deaths_pod_high_sec integer
     */
    @JsonProperty("deaths_pod_high_sec")
    public Long getDeathsPodHighSec() {
        return deathsPodHighSec;
    }
    private Long deathsPodLowSec;
    /**
     * deaths_pod_low_sec integer
     */
    public void setDeathsPodLowSec(Long val) {
        deathsPodLowSec = val;
    }
    /**
     * deaths_pod_low_sec integer
     */
    @JsonProperty("deaths_pod_low_sec")
    public Long getDeathsPodLowSec() {
        return deathsPodLowSec;
    }
    private Long deathsPodNullSec;
    /**
     * deaths_pod_null_sec integer
     */
    public void setDeathsPodNullSec(Long val) {
        deathsPodNullSec = val;
    }
    /**
     * deaths_pod_null_sec integer
     */
    @JsonProperty("deaths_pod_null_sec")
    public Long getDeathsPodNullSec() {
        return deathsPodNullSec;
    }
    private Long deathsPodWormhole;
    /**
     * deaths_pod_wormhole integer
     */
    public void setDeathsPodWormhole(Long val) {
        deathsPodWormhole = val;
    }
    /**
     * deaths_pod_wormhole integer
     */
    @JsonProperty("deaths_pod_wormhole")
    public Long getDeathsPodWormhole() {
        return deathsPodWormhole;
    }
    private Long deathsWormhole;
    /**
     * deaths_wormhole integer
     */
    public void setDeathsWormhole(Long val) {
        deathsWormhole = val;
    }
    /**
     * deaths_wormhole integer
     */
    @JsonProperty("deaths_wormhole")
    public Long getDeathsWormhole() {
        return deathsWormhole;
    }
    private Long droneEngage;
    /**
     * drone_engage integer
     */
    public void setDroneEngage(Long val) {
        droneEngage = val;
    }
    /**
     * drone_engage integer
     */
    @JsonProperty("drone_engage")
    public Long getDroneEngage() {
        return droneEngage;
    }
    private Long dscans;
    /**
     * dscans integer
     */
    public void setDscans(Long val) {
        dscans = val;
    }
    /**
     * dscans integer
     */
    @JsonProperty("dscans")
    public Long getDscans() {
        return dscans;
    }
    private Long duelRequested;
    /**
     * duel_requested integer
     */
    public void setDuelRequested(Long val) {
        duelRequested = val;
    }
    /**
     * duel_requested integer
     */
    @JsonProperty("duel_requested")
    public Long getDuelRequested() {
        return duelRequested;
    }
    private Long engagementRegister;
    /**
     * engagement_register integer
     */
    public void setEngagementRegister(Long val) {
        engagementRegister = val;
    }
    /**
     * engagement_register integer
     */
    @JsonProperty("engagement_register")
    public Long getEngagementRegister() {
        return engagementRegister;
    }
    private Long killsAssists;
    /**
     * kills_assists integer
     */
    public void setKillsAssists(Long val) {
        killsAssists = val;
    }
    /**
     * kills_assists integer
     */
    @JsonProperty("kills_assists")
    public Long getKillsAssists() {
        return killsAssists;
    }
    private Long killsHighSec;
    /**
     * kills_high_sec integer
     */
    public void setKillsHighSec(Long val) {
        killsHighSec = val;
    }
    /**
     * kills_high_sec integer
     */
    @JsonProperty("kills_high_sec")
    public Long getKillsHighSec() {
        return killsHighSec;
    }
    private Long killsLowSec;
    /**
     * kills_low_sec integer
     */
    public void setKillsLowSec(Long val) {
        killsLowSec = val;
    }
    /**
     * kills_low_sec integer
     */
    @JsonProperty("kills_low_sec")
    public Long getKillsLowSec() {
        return killsLowSec;
    }
    private Long killsNullSec;
    /**
     * kills_null_sec integer
     */
    public void setKillsNullSec(Long val) {
        killsNullSec = val;
    }
    /**
     * kills_null_sec integer
     */
    @JsonProperty("kills_null_sec")
    public Long getKillsNullSec() {
        return killsNullSec;
    }
    private Long killsPodHighSec;
    /**
     * kills_pod_high_sec integer
     */
    public void setKillsPodHighSec(Long val) {
        killsPodHighSec = val;
    }
    /**
     * kills_pod_high_sec integer
     */
    @JsonProperty("kills_pod_high_sec")
    public Long getKillsPodHighSec() {
        return killsPodHighSec;
    }
    private Long killsPodLowSec;
    /**
     * kills_pod_low_sec integer
     */
    public void setKillsPodLowSec(Long val) {
        killsPodLowSec = val;
    }
    /**
     * kills_pod_low_sec integer
     */
    @JsonProperty("kills_pod_low_sec")
    public Long getKillsPodLowSec() {
        return killsPodLowSec;
    }
    private Long killsPodNullSec;
    /**
     * kills_pod_null_sec integer
     */
    public void setKillsPodNullSec(Long val) {
        killsPodNullSec = val;
    }
    /**
     * kills_pod_null_sec integer
     */
    @JsonProperty("kills_pod_null_sec")
    public Long getKillsPodNullSec() {
        return killsPodNullSec;
    }
    private Long killsPodWormhole;
    /**
     * kills_pod_wormhole integer
     */
    public void setKillsPodWormhole(Long val) {
        killsPodWormhole = val;
    }
    /**
     * kills_pod_wormhole integer
     */
    @JsonProperty("kills_pod_wormhole")
    public Long getKillsPodWormhole() {
        return killsPodWormhole;
    }
    private Long killsWormhole;
    /**
     * kills_wormhole integer
     */
    public void setKillsWormhole(Long val) {
        killsWormhole = val;
    }
    /**
     * kills_wormhole integer
     */
    @JsonProperty("kills_wormhole")
    public Long getKillsWormhole() {
        return killsWormhole;
    }
    private Long npcFlagSet;
    /**
     * npc_flag_set integer
     */
    public void setNpcFlagSet(Long val) {
        npcFlagSet = val;
    }
    /**
     * npc_flag_set integer
     */
    @JsonProperty("npc_flag_set")
    public Long getNpcFlagSet() {
        return npcFlagSet;
    }
    private Long probeScans;
    /**
     * probe_scans integer
     */
    public void setProbeScans(Long val) {
        probeScans = val;
    }
    /**
     * probe_scans integer
     */
    @JsonProperty("probe_scans")
    public Long getProbeScans() {
        return probeScans;
    }
    private Long pvpFlagSet;
    /**
     * pvp_flag_set integer
     */
    public void setPvpFlagSet(Long val) {
        pvpFlagSet = val;
    }
    /**
     * pvp_flag_set integer
     */
    @JsonProperty("pvp_flag_set")
    public Long getPvpFlagSet() {
        return pvpFlagSet;
    }
    private Long repairArmorByRemoteAmount;
    /**
     * repair_armor_by_remote_amount integer
     */
    public void setRepairArmorByRemoteAmount(Long val) {
        repairArmorByRemoteAmount = val;
    }
    /**
     * repair_armor_by_remote_amount integer
     */
    @JsonProperty("repair_armor_by_remote_amount")
    public Long getRepairArmorByRemoteAmount() {
        return repairArmorByRemoteAmount;
    }
    private Long repairArmorRemoteAmount;
    /**
     * repair_armor_remote_amount integer
     */
    public void setRepairArmorRemoteAmount(Long val) {
        repairArmorRemoteAmount = val;
    }
    /**
     * repair_armor_remote_amount integer
     */
    @JsonProperty("repair_armor_remote_amount")
    public Long getRepairArmorRemoteAmount() {
        return repairArmorRemoteAmount;
    }
    private Long repairArmorSelfAmount;
    /**
     * repair_armor_self_amount integer
     */
    public void setRepairArmorSelfAmount(Long val) {
        repairArmorSelfAmount = val;
    }
    /**
     * repair_armor_self_amount integer
     */
    @JsonProperty("repair_armor_self_amount")
    public Long getRepairArmorSelfAmount() {
        return repairArmorSelfAmount;
    }
    private Long repairCapacitorByRemoteAmount;
    /**
     * repair_capacitor_by_remote_amount integer
     */
    public void setRepairCapacitorByRemoteAmount(Long val) {
        repairCapacitorByRemoteAmount = val;
    }
    /**
     * repair_capacitor_by_remote_amount integer
     */
    @JsonProperty("repair_capacitor_by_remote_amount")
    public Long getRepairCapacitorByRemoteAmount() {
        return repairCapacitorByRemoteAmount;
    }
    private Long repairCapacitorRemoteAmount;
    /**
     * repair_capacitor_remote_amount integer
     */
    public void setRepairCapacitorRemoteAmount(Long val) {
        repairCapacitorRemoteAmount = val;
    }
    /**
     * repair_capacitor_remote_amount integer
     */
    @JsonProperty("repair_capacitor_remote_amount")
    public Long getRepairCapacitorRemoteAmount() {
        return repairCapacitorRemoteAmount;
    }
    private Long repairCapacitorSelfAmount;
    /**
     * repair_capacitor_self_amount integer
     */
    public void setRepairCapacitorSelfAmount(Long val) {
        repairCapacitorSelfAmount = val;
    }
    /**
     * repair_capacitor_self_amount integer
     */
    @JsonProperty("repair_capacitor_self_amount")
    public Long getRepairCapacitorSelfAmount() {
        return repairCapacitorSelfAmount;
    }
    private Long repairHullByRemoteAmount;
    /**
     * repair_hull_by_remote_amount integer
     */
    public void setRepairHullByRemoteAmount(Long val) {
        repairHullByRemoteAmount = val;
    }
    /**
     * repair_hull_by_remote_amount integer
     */
    @JsonProperty("repair_hull_by_remote_amount")
    public Long getRepairHullByRemoteAmount() {
        return repairHullByRemoteAmount;
    }
    private Long repairHullRemoteAmount;
    /**
     * repair_hull_remote_amount integer
     */
    public void setRepairHullRemoteAmount(Long val) {
        repairHullRemoteAmount = val;
    }
    /**
     * repair_hull_remote_amount integer
     */
    @JsonProperty("repair_hull_remote_amount")
    public Long getRepairHullRemoteAmount() {
        return repairHullRemoteAmount;
    }
    private Long repairHullSelfAmount;
    /**
     * repair_hull_self_amount integer
     */
    public void setRepairHullSelfAmount(Long val) {
        repairHullSelfAmount = val;
    }
    /**
     * repair_hull_self_amount integer
     */
    @JsonProperty("repair_hull_self_amount")
    public Long getRepairHullSelfAmount() {
        return repairHullSelfAmount;
    }
    private Long repairShieldByRemoteAmount;
    /**
     * repair_shield_by_remote_amount integer
     */
    public void setRepairShieldByRemoteAmount(Long val) {
        repairShieldByRemoteAmount = val;
    }
    /**
     * repair_shield_by_remote_amount integer
     */
    @JsonProperty("repair_shield_by_remote_amount")
    public Long getRepairShieldByRemoteAmount() {
        return repairShieldByRemoteAmount;
    }
    private Long repairShieldRemoteAmount;
    /**
     * repair_shield_remote_amount integer
     */
    public void setRepairShieldRemoteAmount(Long val) {
        repairShieldRemoteAmount = val;
    }
    /**
     * repair_shield_remote_amount integer
     */
    @JsonProperty("repair_shield_remote_amount")
    public Long getRepairShieldRemoteAmount() {
        return repairShieldRemoteAmount;
    }
    private Long repairShieldSelfAmount;
    /**
     * repair_shield_self_amount integer
     */
    public void setRepairShieldSelfAmount(Long val) {
        repairShieldSelfAmount = val;
    }
    /**
     * repair_shield_self_amount integer
     */
    @JsonProperty("repair_shield_self_amount")
    public Long getRepairShieldSelfAmount() {
        return repairShieldSelfAmount;
    }
    private Long selfDestructs;
    /**
     * self_destructs integer
     */
    public void setSelfDestructs(Long val) {
        selfDestructs = val;
    }
    /**
     * self_destructs integer
     */
    @JsonProperty("self_destructs")
    public Long getSelfDestructs() {
        return selfDestructs;
    }
    private Long warpScramblePc;
    /**
     * warp_scramble_pc integer
     */
    public void setWarpScramblePc(Long val) {
        warpScramblePc = val;
    }
    /**
     * warp_scramble_pc integer
     */
    @JsonProperty("warp_scramble_pc")
    public Long getWarpScramblePc() {
        return warpScramblePc;
    }
    private Long warpScrambledbyNpc;
    /**
     * warp_scrambledby_npc integer
     */
    public void setWarpScrambledbyNpc(Long val) {
        warpScrambledbyNpc = val;
    }
    /**
     * warp_scrambledby_npc integer
     */
    @JsonProperty("warp_scrambledby_npc")
    public Long getWarpScrambledbyNpc() {
        return warpScrambledbyNpc;
    }
    private Long warpScrambledbyPc;
    /**
     * warp_scrambledby_pc integer
     */
    public void setWarpScrambledbyPc(Long val) {
        warpScrambledbyPc = val;
    }
    /**
     * warp_scrambledby_pc integer
     */
    @JsonProperty("warp_scrambledby_pc")
    public Long getWarpScrambledbyPc() {
        return warpScrambledbyPc;
    }
    private Long weaponFlagSet;
    /**
     * weapon_flag_set integer
     */
    public void setWeaponFlagSet(Long val) {
        weaponFlagSet = val;
    }
    /**
     * weapon_flag_set integer
     */
    @JsonProperty("weapon_flag_set")
    public Long getWeaponFlagSet() {
        return weaponFlagSet;
    }
    private Long webifiedbyNpc;
    /**
     * webifiedby_npc integer
     */
    public void setWebifiedbyNpc(Long val) {
        webifiedbyNpc = val;
    }
    /**
     * webifiedby_npc integer
     */
    @JsonProperty("webifiedby_npc")
    public Long getWebifiedbyNpc() {
        return webifiedbyNpc;
    }
    private Long webifiedbyPc;
    /**
     * webifiedby_pc integer
     */
    public void setWebifiedbyPc(Long val) {
        webifiedbyPc = val;
    }
    /**
     * webifiedby_pc integer
     */
    @JsonProperty("webifiedby_pc")
    public Long getWebifiedbyPc() {
        return webifiedbyPc;
    }
    private Long webifyingPc;
    /**
     * webifying_pc integer
     */
    public void setWebifyingPc(Long val) {
        webifyingPc = val;
    }
    /**
     * webifying_pc integer
     */
    @JsonProperty("webifying_pc")
    public Long getWebifyingPc() {
        return webifyingPc;
    }
}
