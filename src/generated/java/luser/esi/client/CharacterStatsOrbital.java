package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CharacterStatsOrbital {
    private Long strikeCharactersKilled;
    /**
     * strike_characters_killed integer
     */
    public void setStrikeCharactersKilled(Long val) {
        strikeCharactersKilled = val;
    }
    /**
     * strike_characters_killed integer
     */
    @JsonProperty("strike_characters_killed")
    public Long getStrikeCharactersKilled() {
        return strikeCharactersKilled;
    }
    private Long strikeDamageToPlayersArmorAmount;
    /**
     * strike_damage_to_players_armor_amount integer
     */
    public void setStrikeDamageToPlayersArmorAmount(Long val) {
        strikeDamageToPlayersArmorAmount = val;
    }
    /**
     * strike_damage_to_players_armor_amount integer
     */
    @JsonProperty("strike_damage_to_players_armor_amount")
    public Long getStrikeDamageToPlayersArmorAmount() {
        return strikeDamageToPlayersArmorAmount;
    }
    private Long strikeDamageToPlayersShieldAmount;
    /**
     * strike_damage_to_players_shield_amount integer
     */
    public void setStrikeDamageToPlayersShieldAmount(Long val) {
        strikeDamageToPlayersShieldAmount = val;
    }
    /**
     * strike_damage_to_players_shield_amount integer
     */
    @JsonProperty("strike_damage_to_players_shield_amount")
    public Long getStrikeDamageToPlayersShieldAmount() {
        return strikeDamageToPlayersShieldAmount;
    }
}
