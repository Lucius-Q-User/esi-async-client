package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class Coordinate implements ApiParameterObject {
    private double x;
    public void setX(double val) {
        x = val;
    }
    @JsonProperty("x")
    public double getX() {
        return x;
    }
    private double y;
    public void setY(double val) {
        y = val;
    }
    @JsonProperty("y")
    public double getY() {
        return y;
    }
    private double z;
    public void setZ(double val) {
        z = val;
    }
    @JsonProperty("z")
    public double getZ() {
        return z;
    }
}
