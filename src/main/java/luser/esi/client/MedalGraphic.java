package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class MedalGraphic {
    private Integer color;
    public void setColor(Integer val) {
        color = val;
    }
    public Integer getColor() {
        return color;
    }
    private String graphic;
    public void setGraphic(String val) {
        graphic = val;
    }
    public String getGraphic() {
        return graphic;
    }
    private int layer;
    public void setLayer(int val) {
        layer = val;
    }
    public int getLayer() {
        return layer;
    }
    private int part;
    public void setPart(int val) {
        part = val;
    }
    public int getPart() {
        return part;
    }
    static MedalGraphic fromJson(Json json) {
        if (json == null) {
            return null;
        }
        MedalGraphic self = new MedalGraphic();
        Map<String, Json> js = json.asJsonMap();
        self.color = ApiClientBase.optGetInteger(js.get("color"));
        self.graphic = ApiClientBase.optGetString(js.get("graphic"));
        self.layer = ApiClientBase.optGetInteger(js.get("layer"));
        self.part = ApiClientBase.optGetInteger(js.get("part"));
        return self;
    }
}
