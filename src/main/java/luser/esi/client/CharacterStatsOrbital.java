package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CharacterStatsOrbital implements ApiParameterObject {
    private Long strikeCharactersKilled;
    public void setStrikeCharactersKilled(Long val) {
        strikeCharactersKilled = val;
    }
    @JsonProperty("strike_characters_killed")
    public Long getStrikeCharactersKilled() {
        return strikeCharactersKilled;
    }
    private Long strikeDamageToPlayersArmorAmount;
    public void setStrikeDamageToPlayersArmorAmount(Long val) {
        strikeDamageToPlayersArmorAmount = val;
    }
    @JsonProperty("strike_damage_to_players_armor_amount")
    public Long getStrikeDamageToPlayersArmorAmount() {
        return strikeDamageToPlayersArmorAmount;
    }
    private Long strikeDamageToPlayersShieldAmount;
    public void setStrikeDamageToPlayersShieldAmount(Long val) {
        strikeDamageToPlayersShieldAmount = val;
    }
    @JsonProperty("strike_damage_to_players_shield_amount")
    public Long getStrikeDamageToPlayersShieldAmount() {
        return strikeDamageToPlayersShieldAmount;
    }
}
