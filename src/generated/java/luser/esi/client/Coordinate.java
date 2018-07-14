package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Coordinate implements ApiParameterObject {
    private double x;
    /**
     * x number
     */
    public void setX(double val) {
        x = val;
    }
    /**
     * x number
     */
    @JsonProperty("x")
    public double getX() {
        return x;
    }
    private double y;
    /**
     * y number
     */
    public void setY(double val) {
        y = val;
    }
    /**
     * y number
     */
    @JsonProperty("y")
    public double getY() {
        return y;
    }
    private double z;
    /**
     * z number
     */
    public void setZ(double val) {
        z = val;
    }
    /**
     * z number
     */
    @JsonProperty("z")
    public double getZ() {
        return z;
    }
}
