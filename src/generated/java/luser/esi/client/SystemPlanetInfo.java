package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class SystemPlanetInfo implements ApiParameterObject {
    private int[] asteroidBelts;
    /**
     * asteroid_belts array
     */
    public void setAsteroidBelts(int[] val) {
        asteroidBelts = val;
    }
    /**
     * asteroid_belts array
     */
    @JsonProperty("asteroid_belts")
    public int[] getAsteroidBelts() {
        return asteroidBelts;
    }
    private int[] moons;
    /**
     * moons array
     */
    public void setMoons(int[] val) {
        moons = val;
    }
    /**
     * moons array
     */
    @JsonProperty("moons")
    public int[] getMoons() {
        return moons;
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
}
