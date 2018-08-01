package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MedalGraphic {
    private Integer color;
    /**
     * color integer
     */
    public void setColor(Integer val) {
        color = val;
    }
    /**
     * color integer
     */
    @JsonProperty("color")
    public Integer getColor() {
        return color;
    }
    private String graphic;
    /**
     * graphic string
     */
    public void setGraphic(String val) {
        graphic = val;
    }
    /**
     * graphic string
     */
    @JsonProperty("graphic")
    public String getGraphic() {
        return graphic;
    }
    private int layer;
    /**
     * layer integer
     */
    public void setLayer(int val) {
        layer = val;
    }
    /**
     * layer integer
     */
    @JsonProperty("layer")
    public int getLayer() {
        return layer;
    }
    private int part;
    /**
     * part integer
     */
    public void setPart(int val) {
        part = val;
    }
    /**
     * part integer
     */
    @JsonProperty("part")
    public int getPart() {
        return part;
    }
}
