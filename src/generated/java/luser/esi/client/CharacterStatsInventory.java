package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.carrotsearch.hppc.IntArrayList;
import com.carrotsearch.hppc.LongArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CharacterStatsInventory implements ApiParameterObject {
    private Long abandonLootQuantity;
    /**
     * abandon_loot_quantity integer
     */
    public void setAbandonLootQuantity(Long val) {
        abandonLootQuantity = val;
    }
    /**
     * abandon_loot_quantity integer
     */
    @JsonProperty("abandon_loot_quantity")
    public Long getAbandonLootQuantity() {
        return abandonLootQuantity;
    }
    private Long trashItemQuantity;
    /**
     * trash_item_quantity integer
     */
    public void setTrashItemQuantity(Long val) {
        trashItemQuantity = val;
    }
    /**
     * trash_item_quantity integer
     */
    @JsonProperty("trash_item_quantity")
    public Long getTrashItemQuantity() {
        return trashItemQuantity;
    }
}
