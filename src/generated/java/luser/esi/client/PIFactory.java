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
public class PIFactory implements ApiParameterObject {
    private int schematicId;
    /**
     * schematic_id integer
     */
    public void setSchematicId(int val) {
        schematicId = val;
    }
    /**
     * schematic_id integer
     */
    @JsonProperty("schematic_id")
    public int getSchematicId() {
        return schematicId;
    }
}
