package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class PlanetContents {
    private List<PILink> links;
    public void setLinks(List<PILink> val) {
        links = val;
    }
    public List<PILink> getLinks() {
        return links;
    }
    private List<PIPin> pins;
    public void setPins(List<PIPin> val) {
        pins = val;
    }
    public List<PIPin> getPins() {
        return pins;
    }
    private List<PIRoute> routes;
    public void setRoutes(List<PIRoute> val) {
        routes = val;
    }
    public List<PIRoute> getRoutes() {
        return routes;
    }
    static PlanetContents fromJson(Json json) {
        if (json == null) {
            return null;
        }
        PlanetContents self = new PlanetContents();
        Map<String, Json> js = json.asJsonMap();
        {
            List<Json> jl = js.get("links").asJsonList();
            List<PILink> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.set(i, PILink.fromJson(jl.get(i)));
            }
            self.links = rt;
        }

        {
            List<Json> jl = js.get("pins").asJsonList();
            List<PIPin> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.set(i, PIPin.fromJson(jl.get(i)));
            }
            self.pins = rt;
        }

        {
            List<Json> jl = js.get("routes").asJsonList();
            List<PIRoute> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.set(i, PIRoute.fromJson(jl.get(i)));
            }
            self.routes = rt;
        }

        return self;
    }
}
