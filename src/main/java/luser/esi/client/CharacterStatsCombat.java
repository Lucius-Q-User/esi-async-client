package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class CharacterStatsCombat {
    private Long capDrainedbyNpc;
    public void setCapDrainedbyNpc(Long val) {
        capDrainedbyNpc = val;
    }
    public Long getCapDrainedbyNpc() {
        return capDrainedbyNpc;
    }
    private Long capDrainedbyPc;
    public void setCapDrainedbyPc(Long val) {
        capDrainedbyPc = val;
    }
    public Long getCapDrainedbyPc() {
        return capDrainedbyPc;
    }
    private Long capDrainingPc;
    public void setCapDrainingPc(Long val) {
        capDrainingPc = val;
    }
    public Long getCapDrainingPc() {
        return capDrainingPc;
    }
    private Long criminalFlagSet;
    public void setCriminalFlagSet(Long val) {
        criminalFlagSet = val;
    }
    public Long getCriminalFlagSet() {
        return criminalFlagSet;
    }
    private Long damageFromNpCsAmount;
    public void setDamageFromNpCsAmount(Long val) {
        damageFromNpCsAmount = val;
    }
    public Long getDamageFromNpCsAmount() {
        return damageFromNpCsAmount;
    }
    private Long damageFromNpCsNumShots;
    public void setDamageFromNpCsNumShots(Long val) {
        damageFromNpCsNumShots = val;
    }
    public Long getDamageFromNpCsNumShots() {
        return damageFromNpCsNumShots;
    }
    private Long damageFromPlayersBombAmount;
    public void setDamageFromPlayersBombAmount(Long val) {
        damageFromPlayersBombAmount = val;
    }
    public Long getDamageFromPlayersBombAmount() {
        return damageFromPlayersBombAmount;
    }
    private Long damageFromPlayersBombNumShots;
    public void setDamageFromPlayersBombNumShots(Long val) {
        damageFromPlayersBombNumShots = val;
    }
    public Long getDamageFromPlayersBombNumShots() {
        return damageFromPlayersBombNumShots;
    }
    private Long damageFromPlayersCombatDroneAmount;
    public void setDamageFromPlayersCombatDroneAmount(Long val) {
        damageFromPlayersCombatDroneAmount = val;
    }
    public Long getDamageFromPlayersCombatDroneAmount() {
        return damageFromPlayersCombatDroneAmount;
    }
    private Long damageFromPlayersCombatDroneNumShots;
    public void setDamageFromPlayersCombatDroneNumShots(Long val) {
        damageFromPlayersCombatDroneNumShots = val;
    }
    public Long getDamageFromPlayersCombatDroneNumShots() {
        return damageFromPlayersCombatDroneNumShots;
    }
    private Long damageFromPlayersEnergyAmount;
    public void setDamageFromPlayersEnergyAmount(Long val) {
        damageFromPlayersEnergyAmount = val;
    }
    public Long getDamageFromPlayersEnergyAmount() {
        return damageFromPlayersEnergyAmount;
    }
    private Long damageFromPlayersEnergyNumShots;
    public void setDamageFromPlayersEnergyNumShots(Long val) {
        damageFromPlayersEnergyNumShots = val;
    }
    public Long getDamageFromPlayersEnergyNumShots() {
        return damageFromPlayersEnergyNumShots;
    }
    private Long damageFromPlayersFighterBomberAmount;
    public void setDamageFromPlayersFighterBomberAmount(Long val) {
        damageFromPlayersFighterBomberAmount = val;
    }
    public Long getDamageFromPlayersFighterBomberAmount() {
        return damageFromPlayersFighterBomberAmount;
    }
    private Long damageFromPlayersFighterBomberNumShots;
    public void setDamageFromPlayersFighterBomberNumShots(Long val) {
        damageFromPlayersFighterBomberNumShots = val;
    }
    public Long getDamageFromPlayersFighterBomberNumShots() {
        return damageFromPlayersFighterBomberNumShots;
    }
    private Long damageFromPlayersFighterDroneAmount;
    public void setDamageFromPlayersFighterDroneAmount(Long val) {
        damageFromPlayersFighterDroneAmount = val;
    }
    public Long getDamageFromPlayersFighterDroneAmount() {
        return damageFromPlayersFighterDroneAmount;
    }
    private Long damageFromPlayersFighterDroneNumShots;
    public void setDamageFromPlayersFighterDroneNumShots(Long val) {
        damageFromPlayersFighterDroneNumShots = val;
    }
    public Long getDamageFromPlayersFighterDroneNumShots() {
        return damageFromPlayersFighterDroneNumShots;
    }
    private Long damageFromPlayersHybridAmount;
    public void setDamageFromPlayersHybridAmount(Long val) {
        damageFromPlayersHybridAmount = val;
    }
    public Long getDamageFromPlayersHybridAmount() {
        return damageFromPlayersHybridAmount;
    }
    private Long damageFromPlayersHybridNumShots;
    public void setDamageFromPlayersHybridNumShots(Long val) {
        damageFromPlayersHybridNumShots = val;
    }
    public Long getDamageFromPlayersHybridNumShots() {
        return damageFromPlayersHybridNumShots;
    }
    private Long damageFromPlayersMissileAmount;
    public void setDamageFromPlayersMissileAmount(Long val) {
        damageFromPlayersMissileAmount = val;
    }
    public Long getDamageFromPlayersMissileAmount() {
        return damageFromPlayersMissileAmount;
    }
    private Long damageFromPlayersMissileNumShots;
    public void setDamageFromPlayersMissileNumShots(Long val) {
        damageFromPlayersMissileNumShots = val;
    }
    public Long getDamageFromPlayersMissileNumShots() {
        return damageFromPlayersMissileNumShots;
    }
    private Long damageFromPlayersProjectileAmount;
    public void setDamageFromPlayersProjectileAmount(Long val) {
        damageFromPlayersProjectileAmount = val;
    }
    public Long getDamageFromPlayersProjectileAmount() {
        return damageFromPlayersProjectileAmount;
    }
    private Long damageFromPlayersProjectileNumShots;
    public void setDamageFromPlayersProjectileNumShots(Long val) {
        damageFromPlayersProjectileNumShots = val;
    }
    public Long getDamageFromPlayersProjectileNumShots() {
        return damageFromPlayersProjectileNumShots;
    }
    private Long damageFromPlayersSmartBombAmount;
    public void setDamageFromPlayersSmartBombAmount(Long val) {
        damageFromPlayersSmartBombAmount = val;
    }
    public Long getDamageFromPlayersSmartBombAmount() {
        return damageFromPlayersSmartBombAmount;
    }
    private Long damageFromPlayersSmartBombNumShots;
    public void setDamageFromPlayersSmartBombNumShots(Long val) {
        damageFromPlayersSmartBombNumShots = val;
    }
    public Long getDamageFromPlayersSmartBombNumShots() {
        return damageFromPlayersSmartBombNumShots;
    }
    private Long damageFromPlayersSuperAmount;
    public void setDamageFromPlayersSuperAmount(Long val) {
        damageFromPlayersSuperAmount = val;
    }
    public Long getDamageFromPlayersSuperAmount() {
        return damageFromPlayersSuperAmount;
    }
    private Long damageFromPlayersSuperNumShots;
    public void setDamageFromPlayersSuperNumShots(Long val) {
        damageFromPlayersSuperNumShots = val;
    }
    public Long getDamageFromPlayersSuperNumShots() {
        return damageFromPlayersSuperNumShots;
    }
    private Long damageFromStructuresTotalAmount;
    public void setDamageFromStructuresTotalAmount(Long val) {
        damageFromStructuresTotalAmount = val;
    }
    public Long getDamageFromStructuresTotalAmount() {
        return damageFromStructuresTotalAmount;
    }
    private Long damageFromStructuresTotalNumShots;
    public void setDamageFromStructuresTotalNumShots(Long val) {
        damageFromStructuresTotalNumShots = val;
    }
    public Long getDamageFromStructuresTotalNumShots() {
        return damageFromStructuresTotalNumShots;
    }
    private Long damageToPlayersBombAmount;
    public void setDamageToPlayersBombAmount(Long val) {
        damageToPlayersBombAmount = val;
    }
    public Long getDamageToPlayersBombAmount() {
        return damageToPlayersBombAmount;
    }
    private Long damageToPlayersBombNumShots;
    public void setDamageToPlayersBombNumShots(Long val) {
        damageToPlayersBombNumShots = val;
    }
    public Long getDamageToPlayersBombNumShots() {
        return damageToPlayersBombNumShots;
    }
    private Long damageToPlayersCombatDroneAmount;
    public void setDamageToPlayersCombatDroneAmount(Long val) {
        damageToPlayersCombatDroneAmount = val;
    }
    public Long getDamageToPlayersCombatDroneAmount() {
        return damageToPlayersCombatDroneAmount;
    }
    private Long damageToPlayersCombatDroneNumShots;
    public void setDamageToPlayersCombatDroneNumShots(Long val) {
        damageToPlayersCombatDroneNumShots = val;
    }
    public Long getDamageToPlayersCombatDroneNumShots() {
        return damageToPlayersCombatDroneNumShots;
    }
    private Long damageToPlayersEnergyAmount;
    public void setDamageToPlayersEnergyAmount(Long val) {
        damageToPlayersEnergyAmount = val;
    }
    public Long getDamageToPlayersEnergyAmount() {
        return damageToPlayersEnergyAmount;
    }
    private Long damageToPlayersEnergyNumShots;
    public void setDamageToPlayersEnergyNumShots(Long val) {
        damageToPlayersEnergyNumShots = val;
    }
    public Long getDamageToPlayersEnergyNumShots() {
        return damageToPlayersEnergyNumShots;
    }
    private Long damageToPlayersFighterBomberAmount;
    public void setDamageToPlayersFighterBomberAmount(Long val) {
        damageToPlayersFighterBomberAmount = val;
    }
    public Long getDamageToPlayersFighterBomberAmount() {
        return damageToPlayersFighterBomberAmount;
    }
    private Long damageToPlayersFighterBomberNumShots;
    public void setDamageToPlayersFighterBomberNumShots(Long val) {
        damageToPlayersFighterBomberNumShots = val;
    }
    public Long getDamageToPlayersFighterBomberNumShots() {
        return damageToPlayersFighterBomberNumShots;
    }
    private Long damageToPlayersFighterDroneAmount;
    public void setDamageToPlayersFighterDroneAmount(Long val) {
        damageToPlayersFighterDroneAmount = val;
    }
    public Long getDamageToPlayersFighterDroneAmount() {
        return damageToPlayersFighterDroneAmount;
    }
    private Long damageToPlayersFighterDroneNumShots;
    public void setDamageToPlayersFighterDroneNumShots(Long val) {
        damageToPlayersFighterDroneNumShots = val;
    }
    public Long getDamageToPlayersFighterDroneNumShots() {
        return damageToPlayersFighterDroneNumShots;
    }
    private Long damageToPlayersHybridAmount;
    public void setDamageToPlayersHybridAmount(Long val) {
        damageToPlayersHybridAmount = val;
    }
    public Long getDamageToPlayersHybridAmount() {
        return damageToPlayersHybridAmount;
    }
    private Long damageToPlayersHybridNumShots;
    public void setDamageToPlayersHybridNumShots(Long val) {
        damageToPlayersHybridNumShots = val;
    }
    public Long getDamageToPlayersHybridNumShots() {
        return damageToPlayersHybridNumShots;
    }
    private Long damageToPlayersMissileAmount;
    public void setDamageToPlayersMissileAmount(Long val) {
        damageToPlayersMissileAmount = val;
    }
    public Long getDamageToPlayersMissileAmount() {
        return damageToPlayersMissileAmount;
    }
    private Long damageToPlayersMissileNumShots;
    public void setDamageToPlayersMissileNumShots(Long val) {
        damageToPlayersMissileNumShots = val;
    }
    public Long getDamageToPlayersMissileNumShots() {
        return damageToPlayersMissileNumShots;
    }
    private Long damageToPlayersProjectileAmount;
    public void setDamageToPlayersProjectileAmount(Long val) {
        damageToPlayersProjectileAmount = val;
    }
    public Long getDamageToPlayersProjectileAmount() {
        return damageToPlayersProjectileAmount;
    }
    private Long damageToPlayersProjectileNumShots;
    public void setDamageToPlayersProjectileNumShots(Long val) {
        damageToPlayersProjectileNumShots = val;
    }
    public Long getDamageToPlayersProjectileNumShots() {
        return damageToPlayersProjectileNumShots;
    }
    private Long damageToPlayersSmartBombAmount;
    public void setDamageToPlayersSmartBombAmount(Long val) {
        damageToPlayersSmartBombAmount = val;
    }
    public Long getDamageToPlayersSmartBombAmount() {
        return damageToPlayersSmartBombAmount;
    }
    private Long damageToPlayersSmartBombNumShots;
    public void setDamageToPlayersSmartBombNumShots(Long val) {
        damageToPlayersSmartBombNumShots = val;
    }
    public Long getDamageToPlayersSmartBombNumShots() {
        return damageToPlayersSmartBombNumShots;
    }
    private Long damageToPlayersSuperAmount;
    public void setDamageToPlayersSuperAmount(Long val) {
        damageToPlayersSuperAmount = val;
    }
    public Long getDamageToPlayersSuperAmount() {
        return damageToPlayersSuperAmount;
    }
    private Long damageToPlayersSuperNumShots;
    public void setDamageToPlayersSuperNumShots(Long val) {
        damageToPlayersSuperNumShots = val;
    }
    public Long getDamageToPlayersSuperNumShots() {
        return damageToPlayersSuperNumShots;
    }
    private Long damageToStructuresTotalAmount;
    public void setDamageToStructuresTotalAmount(Long val) {
        damageToStructuresTotalAmount = val;
    }
    public Long getDamageToStructuresTotalAmount() {
        return damageToStructuresTotalAmount;
    }
    private Long damageToStructuresTotalNumShots;
    public void setDamageToStructuresTotalNumShots(Long val) {
        damageToStructuresTotalNumShots = val;
    }
    public Long getDamageToStructuresTotalNumShots() {
        return damageToStructuresTotalNumShots;
    }
    private Long deathsHighSec;
    public void setDeathsHighSec(Long val) {
        deathsHighSec = val;
    }
    public Long getDeathsHighSec() {
        return deathsHighSec;
    }
    private Long deathsLowSec;
    public void setDeathsLowSec(Long val) {
        deathsLowSec = val;
    }
    public Long getDeathsLowSec() {
        return deathsLowSec;
    }
    private Long deathsNullSec;
    public void setDeathsNullSec(Long val) {
        deathsNullSec = val;
    }
    public Long getDeathsNullSec() {
        return deathsNullSec;
    }
    private Long deathsPodHighSec;
    public void setDeathsPodHighSec(Long val) {
        deathsPodHighSec = val;
    }
    public Long getDeathsPodHighSec() {
        return deathsPodHighSec;
    }
    private Long deathsPodLowSec;
    public void setDeathsPodLowSec(Long val) {
        deathsPodLowSec = val;
    }
    public Long getDeathsPodLowSec() {
        return deathsPodLowSec;
    }
    private Long deathsPodNullSec;
    public void setDeathsPodNullSec(Long val) {
        deathsPodNullSec = val;
    }
    public Long getDeathsPodNullSec() {
        return deathsPodNullSec;
    }
    private Long deathsPodWormhole;
    public void setDeathsPodWormhole(Long val) {
        deathsPodWormhole = val;
    }
    public Long getDeathsPodWormhole() {
        return deathsPodWormhole;
    }
    private Long deathsWormhole;
    public void setDeathsWormhole(Long val) {
        deathsWormhole = val;
    }
    public Long getDeathsWormhole() {
        return deathsWormhole;
    }
    private Long droneEngage;
    public void setDroneEngage(Long val) {
        droneEngage = val;
    }
    public Long getDroneEngage() {
        return droneEngage;
    }
    private Long dscans;
    public void setDscans(Long val) {
        dscans = val;
    }
    public Long getDscans() {
        return dscans;
    }
    private Long duelRequested;
    public void setDuelRequested(Long val) {
        duelRequested = val;
    }
    public Long getDuelRequested() {
        return duelRequested;
    }
    private Long engagementRegister;
    public void setEngagementRegister(Long val) {
        engagementRegister = val;
    }
    public Long getEngagementRegister() {
        return engagementRegister;
    }
    private Long killsAssists;
    public void setKillsAssists(Long val) {
        killsAssists = val;
    }
    public Long getKillsAssists() {
        return killsAssists;
    }
    private Long killsHighSec;
    public void setKillsHighSec(Long val) {
        killsHighSec = val;
    }
    public Long getKillsHighSec() {
        return killsHighSec;
    }
    private Long killsLowSec;
    public void setKillsLowSec(Long val) {
        killsLowSec = val;
    }
    public Long getKillsLowSec() {
        return killsLowSec;
    }
    private Long killsNullSec;
    public void setKillsNullSec(Long val) {
        killsNullSec = val;
    }
    public Long getKillsNullSec() {
        return killsNullSec;
    }
    private Long killsPodHighSec;
    public void setKillsPodHighSec(Long val) {
        killsPodHighSec = val;
    }
    public Long getKillsPodHighSec() {
        return killsPodHighSec;
    }
    private Long killsPodLowSec;
    public void setKillsPodLowSec(Long val) {
        killsPodLowSec = val;
    }
    public Long getKillsPodLowSec() {
        return killsPodLowSec;
    }
    private Long killsPodNullSec;
    public void setKillsPodNullSec(Long val) {
        killsPodNullSec = val;
    }
    public Long getKillsPodNullSec() {
        return killsPodNullSec;
    }
    private Long killsPodWormhole;
    public void setKillsPodWormhole(Long val) {
        killsPodWormhole = val;
    }
    public Long getKillsPodWormhole() {
        return killsPodWormhole;
    }
    private Long killsWormhole;
    public void setKillsWormhole(Long val) {
        killsWormhole = val;
    }
    public Long getKillsWormhole() {
        return killsWormhole;
    }
    private Long npcFlagSet;
    public void setNpcFlagSet(Long val) {
        npcFlagSet = val;
    }
    public Long getNpcFlagSet() {
        return npcFlagSet;
    }
    private Long probeScans;
    public void setProbeScans(Long val) {
        probeScans = val;
    }
    public Long getProbeScans() {
        return probeScans;
    }
    private Long pvpFlagSet;
    public void setPvpFlagSet(Long val) {
        pvpFlagSet = val;
    }
    public Long getPvpFlagSet() {
        return pvpFlagSet;
    }
    private Long repairArmorByRemoteAmount;
    public void setRepairArmorByRemoteAmount(Long val) {
        repairArmorByRemoteAmount = val;
    }
    public Long getRepairArmorByRemoteAmount() {
        return repairArmorByRemoteAmount;
    }
    private Long repairArmorRemoteAmount;
    public void setRepairArmorRemoteAmount(Long val) {
        repairArmorRemoteAmount = val;
    }
    public Long getRepairArmorRemoteAmount() {
        return repairArmorRemoteAmount;
    }
    private Long repairArmorSelfAmount;
    public void setRepairArmorSelfAmount(Long val) {
        repairArmorSelfAmount = val;
    }
    public Long getRepairArmorSelfAmount() {
        return repairArmorSelfAmount;
    }
    private Long repairCapacitorByRemoteAmount;
    public void setRepairCapacitorByRemoteAmount(Long val) {
        repairCapacitorByRemoteAmount = val;
    }
    public Long getRepairCapacitorByRemoteAmount() {
        return repairCapacitorByRemoteAmount;
    }
    private Long repairCapacitorRemoteAmount;
    public void setRepairCapacitorRemoteAmount(Long val) {
        repairCapacitorRemoteAmount = val;
    }
    public Long getRepairCapacitorRemoteAmount() {
        return repairCapacitorRemoteAmount;
    }
    private Long repairCapacitorSelfAmount;
    public void setRepairCapacitorSelfAmount(Long val) {
        repairCapacitorSelfAmount = val;
    }
    public Long getRepairCapacitorSelfAmount() {
        return repairCapacitorSelfAmount;
    }
    private Long repairHullByRemoteAmount;
    public void setRepairHullByRemoteAmount(Long val) {
        repairHullByRemoteAmount = val;
    }
    public Long getRepairHullByRemoteAmount() {
        return repairHullByRemoteAmount;
    }
    private Long repairHullRemoteAmount;
    public void setRepairHullRemoteAmount(Long val) {
        repairHullRemoteAmount = val;
    }
    public Long getRepairHullRemoteAmount() {
        return repairHullRemoteAmount;
    }
    private Long repairHullSelfAmount;
    public void setRepairHullSelfAmount(Long val) {
        repairHullSelfAmount = val;
    }
    public Long getRepairHullSelfAmount() {
        return repairHullSelfAmount;
    }
    private Long repairShieldByRemoteAmount;
    public void setRepairShieldByRemoteAmount(Long val) {
        repairShieldByRemoteAmount = val;
    }
    public Long getRepairShieldByRemoteAmount() {
        return repairShieldByRemoteAmount;
    }
    private Long repairShieldRemoteAmount;
    public void setRepairShieldRemoteAmount(Long val) {
        repairShieldRemoteAmount = val;
    }
    public Long getRepairShieldRemoteAmount() {
        return repairShieldRemoteAmount;
    }
    private Long repairShieldSelfAmount;
    public void setRepairShieldSelfAmount(Long val) {
        repairShieldSelfAmount = val;
    }
    public Long getRepairShieldSelfAmount() {
        return repairShieldSelfAmount;
    }
    private Long selfDestructs;
    public void setSelfDestructs(Long val) {
        selfDestructs = val;
    }
    public Long getSelfDestructs() {
        return selfDestructs;
    }
    private Long warpScramblePc;
    public void setWarpScramblePc(Long val) {
        warpScramblePc = val;
    }
    public Long getWarpScramblePc() {
        return warpScramblePc;
    }
    private Long warpScrambledbyNpc;
    public void setWarpScrambledbyNpc(Long val) {
        warpScrambledbyNpc = val;
    }
    public Long getWarpScrambledbyNpc() {
        return warpScrambledbyNpc;
    }
    private Long warpScrambledbyPc;
    public void setWarpScrambledbyPc(Long val) {
        warpScrambledbyPc = val;
    }
    public Long getWarpScrambledbyPc() {
        return warpScrambledbyPc;
    }
    private Long weaponFlagSet;
    public void setWeaponFlagSet(Long val) {
        weaponFlagSet = val;
    }
    public Long getWeaponFlagSet() {
        return weaponFlagSet;
    }
    private Long webifiedbyNpc;
    public void setWebifiedbyNpc(Long val) {
        webifiedbyNpc = val;
    }
    public Long getWebifiedbyNpc() {
        return webifiedbyNpc;
    }
    private Long webifiedbyPc;
    public void setWebifiedbyPc(Long val) {
        webifiedbyPc = val;
    }
    public Long getWebifiedbyPc() {
        return webifiedbyPc;
    }
    private Long webifyingPc;
    public void setWebifyingPc(Long val) {
        webifyingPc = val;
    }
    public Long getWebifyingPc() {
        return webifyingPc;
    }
    static CharacterStatsCombat fromJson(Json json) {
        if (json == null) {
            return null;
        }
        CharacterStatsCombat self = new CharacterStatsCombat();
        Map<String, Json> js = json.asJsonMap();
        self.capDrainedbyNpc = ApiClientBase.optGetLong(js.get("cap_drainedby_npc"));
        self.capDrainedbyPc = ApiClientBase.optGetLong(js.get("cap_drainedby_pc"));
        self.capDrainingPc = ApiClientBase.optGetLong(js.get("cap_draining_pc"));
        self.criminalFlagSet = ApiClientBase.optGetLong(js.get("criminal_flag_set"));
        self.damageFromNpCsAmount = ApiClientBase.optGetLong(js.get("damage_from_np_cs_amount"));
        self.damageFromNpCsNumShots = ApiClientBase.optGetLong(js.get("damage_from_np_cs_num_shots"));
        self.damageFromPlayersBombAmount = ApiClientBase.optGetLong(js.get("damage_from_players_bomb_amount"));
        self.damageFromPlayersBombNumShots = ApiClientBase.optGetLong(js.get("damage_from_players_bomb_num_shots"));
        self.damageFromPlayersCombatDroneAmount = ApiClientBase.optGetLong(js.get("damage_from_players_combat_drone_amount"));
        self.damageFromPlayersCombatDroneNumShots = ApiClientBase.optGetLong(js.get("damage_from_players_combat_drone_num_shots"));
        self.damageFromPlayersEnergyAmount = ApiClientBase.optGetLong(js.get("damage_from_players_energy_amount"));
        self.damageFromPlayersEnergyNumShots = ApiClientBase.optGetLong(js.get("damage_from_players_energy_num_shots"));
        self.damageFromPlayersFighterBomberAmount = ApiClientBase.optGetLong(js.get("damage_from_players_fighter_bomber_amount"));
        self.damageFromPlayersFighterBomberNumShots = ApiClientBase.optGetLong(js.get("damage_from_players_fighter_bomber_num_shots"));
        self.damageFromPlayersFighterDroneAmount = ApiClientBase.optGetLong(js.get("damage_from_players_fighter_drone_amount"));
        self.damageFromPlayersFighterDroneNumShots = ApiClientBase.optGetLong(js.get("damage_from_players_fighter_drone_num_shots"));
        self.damageFromPlayersHybridAmount = ApiClientBase.optGetLong(js.get("damage_from_players_hybrid_amount"));
        self.damageFromPlayersHybridNumShots = ApiClientBase.optGetLong(js.get("damage_from_players_hybrid_num_shots"));
        self.damageFromPlayersMissileAmount = ApiClientBase.optGetLong(js.get("damage_from_players_missile_amount"));
        self.damageFromPlayersMissileNumShots = ApiClientBase.optGetLong(js.get("damage_from_players_missile_num_shots"));
        self.damageFromPlayersProjectileAmount = ApiClientBase.optGetLong(js.get("damage_from_players_projectile_amount"));
        self.damageFromPlayersProjectileNumShots = ApiClientBase.optGetLong(js.get("damage_from_players_projectile_num_shots"));
        self.damageFromPlayersSmartBombAmount = ApiClientBase.optGetLong(js.get("damage_from_players_smart_bomb_amount"));
        self.damageFromPlayersSmartBombNumShots = ApiClientBase.optGetLong(js.get("damage_from_players_smart_bomb_num_shots"));
        self.damageFromPlayersSuperAmount = ApiClientBase.optGetLong(js.get("damage_from_players_super_amount"));
        self.damageFromPlayersSuperNumShots = ApiClientBase.optGetLong(js.get("damage_from_players_super_num_shots"));
        self.damageFromStructuresTotalAmount = ApiClientBase.optGetLong(js.get("damage_from_structures_total_amount"));
        self.damageFromStructuresTotalNumShots = ApiClientBase.optGetLong(js.get("damage_from_structures_total_num_shots"));
        self.damageToPlayersBombAmount = ApiClientBase.optGetLong(js.get("damage_to_players_bomb_amount"));
        self.damageToPlayersBombNumShots = ApiClientBase.optGetLong(js.get("damage_to_players_bomb_num_shots"));
        self.damageToPlayersCombatDroneAmount = ApiClientBase.optGetLong(js.get("damage_to_players_combat_drone_amount"));
        self.damageToPlayersCombatDroneNumShots = ApiClientBase.optGetLong(js.get("damage_to_players_combat_drone_num_shots"));
        self.damageToPlayersEnergyAmount = ApiClientBase.optGetLong(js.get("damage_to_players_energy_amount"));
        self.damageToPlayersEnergyNumShots = ApiClientBase.optGetLong(js.get("damage_to_players_energy_num_shots"));
        self.damageToPlayersFighterBomberAmount = ApiClientBase.optGetLong(js.get("damage_to_players_fighter_bomber_amount"));
        self.damageToPlayersFighterBomberNumShots = ApiClientBase.optGetLong(js.get("damage_to_players_fighter_bomber_num_shots"));
        self.damageToPlayersFighterDroneAmount = ApiClientBase.optGetLong(js.get("damage_to_players_fighter_drone_amount"));
        self.damageToPlayersFighterDroneNumShots = ApiClientBase.optGetLong(js.get("damage_to_players_fighter_drone_num_shots"));
        self.damageToPlayersHybridAmount = ApiClientBase.optGetLong(js.get("damage_to_players_hybrid_amount"));
        self.damageToPlayersHybridNumShots = ApiClientBase.optGetLong(js.get("damage_to_players_hybrid_num_shots"));
        self.damageToPlayersMissileAmount = ApiClientBase.optGetLong(js.get("damage_to_players_missile_amount"));
        self.damageToPlayersMissileNumShots = ApiClientBase.optGetLong(js.get("damage_to_players_missile_num_shots"));
        self.damageToPlayersProjectileAmount = ApiClientBase.optGetLong(js.get("damage_to_players_projectile_amount"));
        self.damageToPlayersProjectileNumShots = ApiClientBase.optGetLong(js.get("damage_to_players_projectile_num_shots"));
        self.damageToPlayersSmartBombAmount = ApiClientBase.optGetLong(js.get("damage_to_players_smart_bomb_amount"));
        self.damageToPlayersSmartBombNumShots = ApiClientBase.optGetLong(js.get("damage_to_players_smart_bomb_num_shots"));
        self.damageToPlayersSuperAmount = ApiClientBase.optGetLong(js.get("damage_to_players_super_amount"));
        self.damageToPlayersSuperNumShots = ApiClientBase.optGetLong(js.get("damage_to_players_super_num_shots"));
        self.damageToStructuresTotalAmount = ApiClientBase.optGetLong(js.get("damage_to_structures_total_amount"));
        self.damageToStructuresTotalNumShots = ApiClientBase.optGetLong(js.get("damage_to_structures_total_num_shots"));
        self.deathsHighSec = ApiClientBase.optGetLong(js.get("deaths_high_sec"));
        self.deathsLowSec = ApiClientBase.optGetLong(js.get("deaths_low_sec"));
        self.deathsNullSec = ApiClientBase.optGetLong(js.get("deaths_null_sec"));
        self.deathsPodHighSec = ApiClientBase.optGetLong(js.get("deaths_pod_high_sec"));
        self.deathsPodLowSec = ApiClientBase.optGetLong(js.get("deaths_pod_low_sec"));
        self.deathsPodNullSec = ApiClientBase.optGetLong(js.get("deaths_pod_null_sec"));
        self.deathsPodWormhole = ApiClientBase.optGetLong(js.get("deaths_pod_wormhole"));
        self.deathsWormhole = ApiClientBase.optGetLong(js.get("deaths_wormhole"));
        self.droneEngage = ApiClientBase.optGetLong(js.get("drone_engage"));
        self.dscans = ApiClientBase.optGetLong(js.get("dscans"));
        self.duelRequested = ApiClientBase.optGetLong(js.get("duel_requested"));
        self.engagementRegister = ApiClientBase.optGetLong(js.get("engagement_register"));
        self.killsAssists = ApiClientBase.optGetLong(js.get("kills_assists"));
        self.killsHighSec = ApiClientBase.optGetLong(js.get("kills_high_sec"));
        self.killsLowSec = ApiClientBase.optGetLong(js.get("kills_low_sec"));
        self.killsNullSec = ApiClientBase.optGetLong(js.get("kills_null_sec"));
        self.killsPodHighSec = ApiClientBase.optGetLong(js.get("kills_pod_high_sec"));
        self.killsPodLowSec = ApiClientBase.optGetLong(js.get("kills_pod_low_sec"));
        self.killsPodNullSec = ApiClientBase.optGetLong(js.get("kills_pod_null_sec"));
        self.killsPodWormhole = ApiClientBase.optGetLong(js.get("kills_pod_wormhole"));
        self.killsWormhole = ApiClientBase.optGetLong(js.get("kills_wormhole"));
        self.npcFlagSet = ApiClientBase.optGetLong(js.get("npc_flag_set"));
        self.probeScans = ApiClientBase.optGetLong(js.get("probe_scans"));
        self.pvpFlagSet = ApiClientBase.optGetLong(js.get("pvp_flag_set"));
        self.repairArmorByRemoteAmount = ApiClientBase.optGetLong(js.get("repair_armor_by_remote_amount"));
        self.repairArmorRemoteAmount = ApiClientBase.optGetLong(js.get("repair_armor_remote_amount"));
        self.repairArmorSelfAmount = ApiClientBase.optGetLong(js.get("repair_armor_self_amount"));
        self.repairCapacitorByRemoteAmount = ApiClientBase.optGetLong(js.get("repair_capacitor_by_remote_amount"));
        self.repairCapacitorRemoteAmount = ApiClientBase.optGetLong(js.get("repair_capacitor_remote_amount"));
        self.repairCapacitorSelfAmount = ApiClientBase.optGetLong(js.get("repair_capacitor_self_amount"));
        self.repairHullByRemoteAmount = ApiClientBase.optGetLong(js.get("repair_hull_by_remote_amount"));
        self.repairHullRemoteAmount = ApiClientBase.optGetLong(js.get("repair_hull_remote_amount"));
        self.repairHullSelfAmount = ApiClientBase.optGetLong(js.get("repair_hull_self_amount"));
        self.repairShieldByRemoteAmount = ApiClientBase.optGetLong(js.get("repair_shield_by_remote_amount"));
        self.repairShieldRemoteAmount = ApiClientBase.optGetLong(js.get("repair_shield_remote_amount"));
        self.repairShieldSelfAmount = ApiClientBase.optGetLong(js.get("repair_shield_self_amount"));
        self.selfDestructs = ApiClientBase.optGetLong(js.get("self_destructs"));
        self.warpScramblePc = ApiClientBase.optGetLong(js.get("warp_scramble_pc"));
        self.warpScrambledbyNpc = ApiClientBase.optGetLong(js.get("warp_scrambledby_npc"));
        self.warpScrambledbyPc = ApiClientBase.optGetLong(js.get("warp_scrambledby_pc"));
        self.weaponFlagSet = ApiClientBase.optGetLong(js.get("weapon_flag_set"));
        self.webifiedbyNpc = ApiClientBase.optGetLong(js.get("webifiedby_npc"));
        self.webifiedbyPc = ApiClientBase.optGetLong(js.get("webifiedby_pc"));
        self.webifyingPc = ApiClientBase.optGetLong(js.get("webifying_pc"));
        return self;
    }
}
