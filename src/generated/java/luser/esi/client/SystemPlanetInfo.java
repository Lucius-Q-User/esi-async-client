package luser.esi.client;

import com.carrotsearch.hppc.IntArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SystemPlanetInfo {
    private IntArrayList asteroidBelts;
    /**
     * asteroid_belts array
     */
    public void setAsteroidBelts(IntArrayList val) {
        asteroidBelts = val;
    }
    /**
     * asteroid_belts array
     */
    @JsonProperty("asteroid_belts")
    public IntArrayList getAsteroidBelts() {
        return asteroidBelts;
    }
    private IntArrayList moons;
    /**
     * moons array
     */
    public void setMoons(IntArrayList val) {
        moons = val;
    }
    /**
     * moons array
     */
    @JsonProperty("moons")
    public IntArrayList getMoons() {
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
