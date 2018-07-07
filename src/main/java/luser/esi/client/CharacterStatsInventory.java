package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class CharacterStatsInventory {
    private Long abandonLootQuantity;
    public void setAbandonLootQuantity(Long val) {
        abandonLootQuantity = val;
    }
    public Long getAbandonLootQuantity() {
        return abandonLootQuantity;
    }
    private Long trashItemQuantity;
    public void setTrashItemQuantity(Long val) {
        trashItemQuantity = val;
    }
    public Long getTrashItemQuantity() {
        return trashItemQuantity;
    }
    static CharacterStatsInventory fromJson(Json json) {
        if (json == null) {
            return null;
        }
        CharacterStatsInventory self = new CharacterStatsInventory();
        Map<String, Json> js = json.asJsonMap();
        self.abandonLootQuantity = ApiClientBase.optGetLong(js.get("abandon_loot_quantity"));
        self.trashItemQuantity = ApiClientBase.optGetLong(js.get("trash_item_quantity"));
        return self;
    }
}
