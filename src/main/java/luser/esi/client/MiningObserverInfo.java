package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class MiningObserverInfo {
    private int characterId;
    public void setCharacterId(int val) {
        characterId = val;
    }
    public int getCharacterId() {
        return characterId;
    }
    private String lastUpdated;
    public void setLastUpdated(String val) {
        lastUpdated = val;
    }
    public String getLastUpdated() {
        return lastUpdated;
    }
    private long quantity;
    public void setQuantity(long val) {
        quantity = val;
    }
    public long getQuantity() {
        return quantity;
    }
    private int recordedCorporationId;
    public void setRecordedCorporationId(int val) {
        recordedCorporationId = val;
    }
    public int getRecordedCorporationId() {
        return recordedCorporationId;
    }
    private int typeId;
    public void setTypeId(int val) {
        typeId = val;
    }
    public int getTypeId() {
        return typeId;
    }
    static MiningObserverInfo fromJson(Json json) {
        if (json == null) {
            return null;
        }
        MiningObserverInfo self = new MiningObserverInfo();
        Map<String, Json> js = json.asJsonMap();
        self.characterId = ApiClientBase.optGetInteger(js.get("character_id"));
        self.lastUpdated = ApiClientBase.optGetString(js.get("last_updated"));
        self.quantity = ApiClientBase.optGetLong(js.get("quantity"));
        self.recordedCorporationId = ApiClientBase.optGetInteger(js.get("recorded_corporation_id"));
        self.typeId = ApiClientBase.optGetInteger(js.get("type_id"));
        return self;
    }
}
