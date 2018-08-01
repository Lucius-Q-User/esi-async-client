package luser.esi.client;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PlanetContents {
    private List<PILink> links;
    /**
     * links array
     */
    public void setLinks(List<PILink> val) {
        links = val;
    }
    /**
     * links array
     */
    @JsonProperty("links")
    public List<PILink> getLinks() {
        return links;
    }
    private List<PIPin> pins;
    /**
     * pins array
     */
    public void setPins(List<PIPin> val) {
        pins = val;
    }
    /**
     * pins array
     */
    @JsonProperty("pins")
    public List<PIPin> getPins() {
        return pins;
    }
    private List<PIRoute> routes;
    /**
     * routes array
     */
    public void setRoutes(List<PIRoute> val) {
        routes = val;
    }
    /**
     * routes array
     */
    @JsonProperty("routes")
    public List<PIRoute> getRoutes() {
        return routes;
    }
}
