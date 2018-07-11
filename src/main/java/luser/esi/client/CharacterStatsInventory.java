package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CharacterStatsInventory implements ApiParameterObject {
    private Long abandonLootQuantity;
    public void setAbandonLootQuantity(Long val) {
        abandonLootQuantity = val;
    }
    @JsonProperty("abandon_loot_quantity")
    public Long getAbandonLootQuantity() {
        return abandonLootQuantity;
    }
    private Long trashItemQuantity;
    public void setTrashItemQuantity(Long val) {
        trashItemQuantity = val;
    }
    @JsonProperty("trash_item_quantity")
    public Long getTrashItemQuantity() {
        return trashItemQuantity;
    }
}
