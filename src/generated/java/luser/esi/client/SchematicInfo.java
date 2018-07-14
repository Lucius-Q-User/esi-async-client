package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SchematicInfo implements ApiParameterObject {
    private int cycleTime;
    /**
     * Time in seconds to process a run
     */
    public void setCycleTime(int val) {
        cycleTime = val;
    }
    /**
     * Time in seconds to process a run
     */
    @JsonProperty("cycle_time")
    public int getCycleTime() {
        return cycleTime;
    }
    private String schematicName;
    /**
     * schematic_name string
     */
    public void setSchematicName(String val) {
        schematicName = val;
    }
    /**
     * schematic_name string
     */
    @JsonProperty("schematic_name")
    public String getSchematicName() {
        return schematicName;
    }
}
