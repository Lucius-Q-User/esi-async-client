package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class CorporationDivision {
    private List<DivisionInfo> hangar;
    public void setHangar(List<DivisionInfo> val) {
        hangar = val;
    }
    public List<DivisionInfo> getHangar() {
        return hangar;
    }
    private List<DivisionInfo> wallet;
    public void setWallet(List<DivisionInfo> val) {
        wallet = val;
    }
    public List<DivisionInfo> getWallet() {
        return wallet;
    }
    static CorporationDivision fromJson(Json json) {
        if (json == null) {
            return null;
        }
        CorporationDivision self = new CorporationDivision();
        Map<String, Json> js = json.asJsonMap();
        {
            List<Json> jl = js.get("hangar").asJsonList();
            List<DivisionInfo> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.set(i, DivisionInfo.fromJson(jl.get(i)));
            }
            self.hangar = rt;
        }

        {
            List<Json> jl = js.get("wallet").asJsonList();
            List<DivisionInfo> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.set(i, DivisionInfo.fromJson(jl.get(i)));
            }
            self.wallet = rt;
        }

        return self;
    }
}
