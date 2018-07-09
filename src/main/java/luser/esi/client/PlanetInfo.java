package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class PlanetInfo {
    private Instant lastUpdate;
    public void setLastUpdate(Instant val) {
        lastUpdate = val;
    }
    public Instant getLastUpdate() {
        return lastUpdate;
    }
    private int numPins;
    public void setNumPins(int val) {
        numPins = val;
    }
    public int getNumPins() {
        return numPins;
    }
    private int ownerId;
    public void setOwnerId(int val) {
        ownerId = val;
    }
    public int getOwnerId() {
        return ownerId;
    }
    private int planetId;
    public void setPlanetId(int val) {
        planetId = val;
    }
    public int getPlanetId() {
        return planetId;
    }
    private PlanetTypeEnum planetType;
    public void setPlanetType(PlanetTypeEnum val) {
        planetType = val;
    }
    public PlanetTypeEnum getPlanetType() {
        return planetType;
    }
    private int solarSystemId;
    public void setSolarSystemId(int val) {
        solarSystemId = val;
    }
    public int getSolarSystemId() {
        return solarSystemId;
    }
    private int upgradeLevel;
    public void setUpgradeLevel(int val) {
        upgradeLevel = val;
    }
    public int getUpgradeLevel() {
        return upgradeLevel;
    }
    static PlanetInfo fromJson(Json json) {
        if (json == null) {
            return null;
        }
        PlanetInfo self = new PlanetInfo();
        Map<String, Json> js = json.asJsonMap();
        self.lastUpdate = ApiClientBase.optGetInstant(js.get("last_update"));
        self.numPins = ApiClientBase.optGetInteger(js.get("num_pins"));
        self.ownerId = ApiClientBase.optGetInteger(js.get("owner_id"));
        self.planetId = ApiClientBase.optGetInteger(js.get("planet_id"));
        self.planetType = PlanetTypeEnum.fromString(ApiClientBase.optGetString(js.get("planet_type")));
        self.solarSystemId = ApiClientBase.optGetInteger(js.get("solar_system_id"));
        self.upgradeLevel = ApiClientBase.optGetInteger(js.get("upgrade_level"));
        return self;
    }
    public static enum PlanetTypeEnum {
        TEMPERATE("temperate"),
        BARREN("barren"),
        OCEANIC("oceanic"),
        ICE("ice"),
        GAS("gas"),
        LAVA("lava"),
        STORM("storm"),
        PLASMA("plasma");
        public final String stringValue;
        private PlanetTypeEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        public static PlanetTypeEnum fromString(String str) {
            for (PlanetTypeEnum self : PlanetTypeEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
}
