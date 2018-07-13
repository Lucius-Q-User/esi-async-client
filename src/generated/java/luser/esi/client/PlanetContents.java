package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class PlanetContents implements ApiParameterObject {
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
