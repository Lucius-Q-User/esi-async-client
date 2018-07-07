package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class PIFactory {
    private int schematicId;
    public void setSchematicId(int val) {
        schematicId = val;
    }
    public int getSchematicId() {
        return schematicId;
    }
    static PIFactory fromJson(Json json) {
        if (json == null) {
            return null;
        }
        PIFactory self = new PIFactory();
        Map<String, Json> js = json.asJsonMap();
        self.schematicId = ApiClientBase.optGetInteger(js.get("schematic_id"));
        return self;
    }
}
