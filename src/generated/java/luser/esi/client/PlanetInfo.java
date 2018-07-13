package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class PlanetInfo implements ApiParameterObject {
    private Instant lastUpdate;
    public void setLastUpdate(Instant val) {
        lastUpdate = val;
    }
    @JsonProperty("last_update")
    public Instant getLastUpdate() {
        return lastUpdate;
    }
    private int numPins;
    public void setNumPins(int val) {
        numPins = val;
    }
    @JsonProperty("num_pins")
    public int getNumPins() {
        return numPins;
    }
    private int ownerId;
    public void setOwnerId(int val) {
        ownerId = val;
    }
    @JsonProperty("owner_id")
    public int getOwnerId() {
        return ownerId;
    }
    private int planetId;
    public void setPlanetId(int val) {
        planetId = val;
    }
    @JsonProperty("planet_id")
    public int getPlanetId() {
        return planetId;
    }
    private PlanetTypeEnum planetType;
    public void setPlanetType(PlanetTypeEnum val) {
        planetType = val;
    }
    @JsonProperty("planet_type")
    public PlanetTypeEnum getPlanetType() {
        return planetType;
    }
    private int solarSystemId;
    public void setSolarSystemId(int val) {
        solarSystemId = val;
    }
    @JsonProperty("solar_system_id")
    public int getSolarSystemId() {
        return solarSystemId;
    }
    private int upgradeLevel;
    public void setUpgradeLevel(int val) {
        upgradeLevel = val;
    }
    @JsonProperty("upgrade_level")
    public int getUpgradeLevel() {
        return upgradeLevel;
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
        private final String stringValue;
        private PlanetTypeEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
        @JsonCreator
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