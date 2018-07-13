package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class SchematicInfo implements ApiParameterObject {
    private int cycleTime;
    public void setCycleTime(int val) {
        cycleTime = val;
    }
    @JsonProperty("cycle_time")
    public int getCycleTime() {
        return cycleTime;
    }
    private String schematicName;
    public void setSchematicName(String val) {
        schematicName = val;
    }
    @JsonProperty("schematic_name")
    public String getSchematicName() {
        return schematicName;
    }
}
