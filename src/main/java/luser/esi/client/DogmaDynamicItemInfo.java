package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class DogmaDynamicItemInfo {
    private int createdBy;
    public void setCreatedBy(int val) {
        createdBy = val;
    }
    public int getCreatedBy() {
        return createdBy;
    }
    private List<DgmAttributeValue> dogmaAttributes;
    public void setDogmaAttributes(List<DgmAttributeValue> val) {
        dogmaAttributes = val;
    }
    public List<DgmAttributeValue> getDogmaAttributes() {
        return dogmaAttributes;
    }
    private List<DgmEffectValue> dogmaEffects;
    public void setDogmaEffects(List<DgmEffectValue> val) {
        dogmaEffects = val;
    }
    public List<DgmEffectValue> getDogmaEffects() {
        return dogmaEffects;
    }
    private int mutatorTypeId;
    public void setMutatorTypeId(int val) {
        mutatorTypeId = val;
    }
    public int getMutatorTypeId() {
        return mutatorTypeId;
    }
    private int sourceTypeId;
    public void setSourceTypeId(int val) {
        sourceTypeId = val;
    }
    public int getSourceTypeId() {
        return sourceTypeId;
    }
    static DogmaDynamicItemInfo fromJson(Json json) {
        if (json == null) {
            return null;
        }
        DogmaDynamicItemInfo self = new DogmaDynamicItemInfo();
        Map<String, Json> js = json.asJsonMap();
        self.createdBy = ApiClientBase.optGetInteger(js.get("created_by"));
        {
            List<Json> jl = js.get("dogma_attributes").asJsonList();
            List<DgmAttributeValue> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.add(DgmAttributeValue.fromJson(jl.get(i)));
            }
            self.dogmaAttributes = rt;
        }
        {
            List<Json> jl = js.get("dogma_effects").asJsonList();
            List<DgmEffectValue> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.add(DgmEffectValue.fromJson(jl.get(i)));
            }
            self.dogmaEffects = rt;
        }
        self.mutatorTypeId = ApiClientBase.optGetInteger(js.get("mutator_type_id"));
        self.sourceTypeId = ApiClientBase.optGetInteger(js.get("source_type_id"));
        return self;
    }
}
