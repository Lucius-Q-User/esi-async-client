package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class FwSystemsList {
    private ContestedEnum contested;
    public void setContested(ContestedEnum val) {
        contested = val;
    }
    public ContestedEnum getContested() {
        return contested;
    }
    private int occupierFactionId;
    public void setOccupierFactionId(int val) {
        occupierFactionId = val;
    }
    public int getOccupierFactionId() {
        return occupierFactionId;
    }
    private int ownerFactionId;
    public void setOwnerFactionId(int val) {
        ownerFactionId = val;
    }
    public int getOwnerFactionId() {
        return ownerFactionId;
    }
    private int solarSystemId;
    public void setSolarSystemId(int val) {
        solarSystemId = val;
    }
    public int getSolarSystemId() {
        return solarSystemId;
    }
    private int victoryPoints;
    public void setVictoryPoints(int val) {
        victoryPoints = val;
    }
    public int getVictoryPoints() {
        return victoryPoints;
    }
    private int victoryPointsThreshold;
    public void setVictoryPointsThreshold(int val) {
        victoryPointsThreshold = val;
    }
    public int getVictoryPointsThreshold() {
        return victoryPointsThreshold;
    }
    static FwSystemsList fromJson(Json json) {
        if (json == null) {
            return null;
        }
        FwSystemsList self = new FwSystemsList();
        Map<String, Json> js = json.asJsonMap();
        self.contested = ContestedEnum.fromString(ApiClientBase.optGetString(js.get("contested")));
        self.occupierFactionId = ApiClientBase.optGetInteger(js.get("occupier_faction_id"));
        self.ownerFactionId = ApiClientBase.optGetInteger(js.get("owner_faction_id"));
        self.solarSystemId = ApiClientBase.optGetInteger(js.get("solar_system_id"));
        self.victoryPoints = ApiClientBase.optGetInteger(js.get("victory_points"));
        self.victoryPointsThreshold = ApiClientBase.optGetInteger(js.get("victory_points_threshold"));
        return self;
    }
    public static enum ContestedEnum {
        CAPTURED("captured"),
        CONTESTED("contested"),
        UNCONTESTED("uncontested"),
        VULNERABLE("vulnerable");
        public final String stringValue;
        private ContestedEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        public static ContestedEnum fromString(String str) {
            for (ContestedEnum self : ContestedEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
}
