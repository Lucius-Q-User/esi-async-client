package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class StandingsEntry {
    private int fromId;
    public void setFromId(int val) {
        fromId = val;
    }
    public int getFromId() {
        return fromId;
    }
    private FromTypeEnum fromType;
    public void setFromType(FromTypeEnum val) {
        fromType = val;
    }
    public FromTypeEnum getFromType() {
        return fromType;
    }
    private float standing;
    public void setStanding(float val) {
        standing = val;
    }
    public float getStanding() {
        return standing;
    }
    static StandingsEntry fromJson(Json json) {
        if (json == null) {
            return null;
        }
        StandingsEntry self = new StandingsEntry();
        Map<String, Json> js = json.asJsonMap();
        self.fromId = ApiClientBase.optGetInteger(js.get("from_id"));
        self.fromType = FromTypeEnum.fromString(ApiClientBase.optGetString(js.get("from_type")));
        self.standing = ApiClientBase.optGetFloat(js.get("standing"));
        return self;
    }
    public static enum FromTypeEnum {
        AGENT("agent"),
        NPC_CORP("npc_corp"),
        FACTION("faction");
        public final String stringValue;
        private FromTypeEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        public static FromTypeEnum fromString(String str) {
            for (FromTypeEnum self : FromTypeEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
}
