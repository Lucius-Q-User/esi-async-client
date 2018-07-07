package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class CharacterStatsOrbital {
    private Long strikeCharactersKilled;
    public void setStrikeCharactersKilled(Long val) {
        strikeCharactersKilled = val;
    }
    public Long getStrikeCharactersKilled() {
        return strikeCharactersKilled;
    }
    private Long strikeDamageToPlayersArmorAmount;
    public void setStrikeDamageToPlayersArmorAmount(Long val) {
        strikeDamageToPlayersArmorAmount = val;
    }
    public Long getStrikeDamageToPlayersArmorAmount() {
        return strikeDamageToPlayersArmorAmount;
    }
    private Long strikeDamageToPlayersShieldAmount;
    public void setStrikeDamageToPlayersShieldAmount(Long val) {
        strikeDamageToPlayersShieldAmount = val;
    }
    public Long getStrikeDamageToPlayersShieldAmount() {
        return strikeDamageToPlayersShieldAmount;
    }
    static CharacterStatsOrbital fromJson(Json json) {
        if (json == null) {
            return null;
        }
        CharacterStatsOrbital self = new CharacterStatsOrbital();
        Map<String, Json> js = json.asJsonMap();
        self.strikeCharactersKilled = ApiClientBase.optGetLong(js.get("strike_characters_killed"));
        self.strikeDamageToPlayersArmorAmount = ApiClientBase.optGetLong(js.get("strike_damage_to_players_armor_amount"));
        self.strikeDamageToPlayersShieldAmount = ApiClientBase.optGetLong(js.get("strike_damage_to_players_shield_amount"));
        return self;
    }
}
