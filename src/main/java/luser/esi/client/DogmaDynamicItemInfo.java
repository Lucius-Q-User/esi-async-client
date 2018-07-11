package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class DogmaDynamicItemInfo implements ApiParameterObject {
    private int createdBy;
    public void setCreatedBy(int val) {
        createdBy = val;
    }
    @JsonProperty("created_by")
    public int getCreatedBy() {
        return createdBy;
    }
    private List<DgmAttributeValue> dogmaAttributes;
    public void setDogmaAttributes(List<DgmAttributeValue> val) {
        dogmaAttributes = val;
    }
    @JsonProperty("dogma_attributes")
    public List<DgmAttributeValue> getDogmaAttributes() {
        return dogmaAttributes;
    }
    private List<DgmEffectValue> dogmaEffects;
    public void setDogmaEffects(List<DgmEffectValue> val) {
        dogmaEffects = val;
    }
    @JsonProperty("dogma_effects")
    public List<DgmEffectValue> getDogmaEffects() {
        return dogmaEffects;
    }
    private int mutatorTypeId;
    public void setMutatorTypeId(int val) {
        mutatorTypeId = val;
    }
    @JsonProperty("mutator_type_id")
    public int getMutatorTypeId() {
        return mutatorTypeId;
    }
    private int sourceTypeId;
    public void setSourceTypeId(int val) {
        sourceTypeId = val;
    }
    @JsonProperty("source_type_id")
    public int getSourceTypeId() {
        return sourceTypeId;
    }
}
