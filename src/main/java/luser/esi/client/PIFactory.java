package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class PIFactory implements ApiParameterObject {
    private int schematicId;
    public void setSchematicId(int val) {
        schematicId = val;
    }
    @JsonProperty("schematic_id")
    public int getSchematicId() {
        return schematicId;
    }
}
