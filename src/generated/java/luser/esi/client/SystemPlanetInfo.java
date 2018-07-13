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
    public void setAsteroidBelts(int[] val) {
        asteroidBelts = val;
    }
    @JsonProperty("asteroid_belts")
    public int[] getAsteroidBelts() {
        return asteroidBelts;
    }
    private int[] moons;
    public void setMoons(int[] val) {
        moons = val;
    }
    @JsonProperty("moons")
    public int[] getMoons() {
        return moons;
    }
    private int planetId;
    public void setPlanetId(int val) {
        planetId = val;
    }
    @JsonProperty("planet_id")
    public int getPlanetId() {
        return planetId;
    }
}
