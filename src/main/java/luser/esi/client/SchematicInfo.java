package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class SchematicInfo {
    private int cycleTime;
    public void setCycleTime(int val) {
        cycleTime = val;
    }
    public int getCycleTime() {
        return cycleTime;
    }
    private String schematicName;
    public void setSchematicName(String val) {
        schematicName = val;
    }
    public String getSchematicName() {
        return schematicName;
    }
    static SchematicInfo fromJson(Json json) {
        if (json == null) {
            return null;
        }
        SchematicInfo self = new SchematicInfo();
        Map<String, Json> js = json.asJsonMap();
        self.cycleTime = ApiClientBase.optGetInteger(js.get("cycle_time"));
        self.schematicName = ApiClientBase.optGetString(js.get("schematic_name"));
        return self;
    }
}
