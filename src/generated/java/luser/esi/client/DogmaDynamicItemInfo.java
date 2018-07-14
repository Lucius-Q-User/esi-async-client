package luser.esi.client;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DogmaDynamicItemInfo implements ApiParameterObject {
    private int createdBy;
    /**
     * The ID of the character who created the item
     */
    public void setCreatedBy(int val) {
        createdBy = val;
    }
    /**
     * The ID of the character who created the item
     */
    @JsonProperty("created_by")
    public int getCreatedBy() {
        return createdBy;
    }
    private List<DgmAttributeValue> dogmaAttributes;
    /**
     * dogma_attributes array
     */
    public void setDogmaAttributes(List<DgmAttributeValue> val) {
        dogmaAttributes = val;
    }
    /**
     * dogma_attributes array
     */
    @JsonProperty("dogma_attributes")
    public List<DgmAttributeValue> getDogmaAttributes() {
        return dogmaAttributes;
    }
    private List<DgmEffectValue> dogmaEffects;
    /**
     * dogma_effects array
     */
    public void setDogmaEffects(List<DgmEffectValue> val) {
        dogmaEffects = val;
    }
    /**
     * dogma_effects array
     */
    @JsonProperty("dogma_effects")
    public List<DgmEffectValue> getDogmaEffects() {
        return dogmaEffects;
    }
    private int mutatorTypeId;
    /**
     * The type ID of the mutator used to generate the dynamic item.
     */
    public void setMutatorTypeId(int val) {
        mutatorTypeId = val;
    }
    /**
     * The type ID of the mutator used to generate the dynamic item.
     */
    @JsonProperty("mutator_type_id")
    public int getMutatorTypeId() {
        return mutatorTypeId;
    }
    private int sourceTypeId;
    /**
     * The type ID of the source item the mutator was applied to create the dynamic item.
     */
    public void setSourceTypeId(int val) {
        sourceTypeId = val;
    }
    /**
     * The type ID of the source item the mutator was applied to create the dynamic item.
     */
    @JsonProperty("source_type_id")
    public int getSourceTypeId() {
        return sourceTypeId;
    }
}
