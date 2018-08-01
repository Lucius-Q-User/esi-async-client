package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PIFactory {
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
