package luser.esi.client;

import java.time.Instant;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public class PlanetInfo implements ApiParameterObject {
    private Instant lastUpdate;
    /**
     * last_update string
     */
    public void setLastUpdate(Instant val) {
        lastUpdate = val;
    }
    /**
     * last_update string
     */
    @JsonProperty("last_update")
    public Instant getLastUpdate() {
        return lastUpdate;
    }
    private int numPins;
    /**
     * num_pins integer
     */
    public void setNumPins(int val) {
        numPins = val;
    }
    /**
     * num_pins integer
     */
    @JsonProperty("num_pins")
    public int getNumPins() {
        return numPins;
    }
    private int ownerId;
    /**
     * owner_id integer
     */
    public void setOwnerId(int val) {
        ownerId = val;
    }
    /**
     * owner_id integer
     */
    @JsonProperty("owner_id")
    public int getOwnerId() {
        return ownerId;
    }
    private int planetId;
    /**
     * planet_id integer
     */
    public void setPlanetId(int val) {
        planetId = val;
    }
    /**
     * planet_id integer
     */
    @JsonProperty("planet_id")
    public int getPlanetId() {
        return planetId;
    }
    private PlanetTypeEnum planetType;
    /**
     * planet_type string
     */
    public void setPlanetType(PlanetTypeEnum val) {
        planetType = val;
    }
    /**
     * planet_type string
     */
    @JsonProperty("planet_type")
    public PlanetTypeEnum getPlanetType() {
        return planetType;
    }
    private int solarSystemId;
    /**
     * solar_system_id integer
     */
    public void setSolarSystemId(int val) {
        solarSystemId = val;
    }
    /**
     * solar_system_id integer
     */
    @JsonProperty("solar_system_id")
    public int getSolarSystemId() {
        return solarSystemId;
    }
    private int upgradeLevel;
    /**
     * upgrade_level integer
     */
    public void setUpgradeLevel(int val) {
        upgradeLevel = val;
    }
    /**
     * upgrade_level integer
     */
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
