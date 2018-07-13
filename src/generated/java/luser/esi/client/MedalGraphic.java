package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class MedalGraphic implements ApiParameterObject {
    private Integer color;
    public void setColor(Integer val) {
        color = val;
    }
    @JsonProperty("color")
    public Integer getColor() {
        return color;
    }
    private String graphic;
    public void setGraphic(String val) {
        graphic = val;
    }
    @JsonProperty("graphic")
    public String getGraphic() {
        return graphic;
    }
    private int layer;
    public void setLayer(int val) {
        layer = val;
    }
    @JsonProperty("layer")
    public int getLayer() {
        return layer;
    }
    private int part;
    public void setPart(int val) {
        part = val;
    }
    @JsonProperty("part")
    public int getPart() {
        return part;
    }
}
