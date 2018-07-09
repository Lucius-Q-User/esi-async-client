package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class CharacterMiningLedgerEntry {
    private String date;
    public void setDate(String val) {
        date = val;
    }
    public String getDate() {
        return date;
    }
    private long quantity;
    public void setQuantity(long val) {
        quantity = val;
    }
    public long getQuantity() {
        return quantity;
    }
    private int solarSystemId;
    public void setSolarSystemId(int val) {
        solarSystemId = val;
    }
    public int getSolarSystemId() {
        return solarSystemId;
    }
    private int typeId;
    public void setTypeId(int val) {
        typeId = val;
    }
    public int getTypeId() {
        return typeId;
    }
    static CharacterMiningLedgerEntry fromJson(Json json) {
        if (json == null) {
            return null;
        }
        CharacterMiningLedgerEntry self = new CharacterMiningLedgerEntry();
        Map<String, Json> js = json.asJsonMap();
        self.date = ApiClientBase.optGetString(js.get("date"));
        self.quantity = ApiClientBase.optGetLong(js.get("quantity"));
        self.solarSystemId = ApiClientBase.optGetInteger(js.get("solar_system_id"));
        self.typeId = ApiClientBase.optGetInteger(js.get("type_id"));
        return self;
    }
}
