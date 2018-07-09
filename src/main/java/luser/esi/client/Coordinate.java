package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class Coordinate {
    private double x;
    public void setX(double val) {
        x = val;
    }
    public double getX() {
        return x;
    }
    private double y;
    public void setY(double val) {
        y = val;
    }
    public double getY() {
        return y;
    }
    private double z;
    public void setZ(double val) {
        z = val;
    }
    public double getZ() {
        return z;
    }
    static Coordinate fromJson(Json json) {
        if (json == null) {
            return null;
        }
        Coordinate self = new Coordinate();
        Map<String, Json> js = json.asJsonMap();
        self.x = ApiClientBase.optGetDouble(js.get("x"));
        self.y = ApiClientBase.optGetDouble(js.get("y"));
        self.z = ApiClientBase.optGetDouble(js.get("z"));
        return self;
    }
}
