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
    public void setLinks(List<PILink> val) {
        links = val;
    }
    @JsonProperty("links")
    public List<PILink> getLinks() {
        return links;
    }
    private List<PIPin> pins;
    public void setPins(List<PIPin> val) {
        pins = val;
    }
    @JsonProperty("pins")
    public List<PIPin> getPins() {
        return pins;
    }
    private List<PIRoute> routes;
    public void setRoutes(List<PIRoute> val) {
        routes = val;
    }
    @JsonProperty("routes")
    public List<PIRoute> getRoutes() {
        return routes;
    }
}
