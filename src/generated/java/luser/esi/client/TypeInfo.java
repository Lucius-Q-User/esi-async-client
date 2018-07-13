package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class TypeInfo implements ApiParameterObject {
    private Float capacity;
    public void setCapacity(Float val) {
        capacity = val;
    }
    @JsonProperty("capacity")
    public Float getCapacity() {
        return capacity;
    }
    private String description;
    public void setDescription(String val) {
        description = val;
    }
    @JsonProperty("description")
    public String getDescription() {
        return description;
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
    private Integer graphicId;
    public void setGraphicId(Integer val) {
        graphicId = val;
    }
    @JsonProperty("graphic_id")
    public Integer getGraphicId() {
        return graphicId;
    }
    private int groupId;
    public void setGroupId(int val) {
        groupId = val;
    }
    @JsonProperty("group_id")
    public int getGroupId() {
        return groupId;
    }
    private Integer iconId;
    public void setIconId(Integer val) {
        iconId = val;
    }
    @JsonProperty("icon_id")
    public Integer getIconId() {
        return iconId;
    }
    private Integer marketGroupId;
    public void setMarketGroupId(Integer val) {
        marketGroupId = val;
    }
    @JsonProperty("market_group_id")
    public Integer getMarketGroupId() {
        return marketGroupId;
    }
    private Float mass;
    public void setMass(Float val) {
        mass = val;
    }
    @JsonProperty("mass")
    public Float getMass() {
        return mass;
    }
    private String name;
    public void setName(String val) {
        name = val;
    }
    @JsonProperty("name")
    public String getName() {
        return name;
    }
    private Float packagedVolume;
    public void setPackagedVolume(Float val) {
        packagedVolume = val;
    }
    @JsonProperty("packaged_volume")
    public Float getPackagedVolume() {
        return packagedVolume;
    }
    private Integer portionSize;
    public void setPortionSize(Integer val) {
        portionSize = val;
    }
    @JsonProperty("portion_size")
    public Integer getPortionSize() {
        return portionSize;
    }
    private boolean published;
    public void setPublished(boolean val) {
        published = val;
    }
    @JsonProperty("published")
    public boolean getPublished() {
        return published;
    }
    private Float radius;
    public void setRadius(Float val) {
        radius = val;
    }
    @JsonProperty("radius")
    public Float getRadius() {
        return radius;
    }
    private int typeId;
    public void setTypeId(int val) {
        typeId = val;
    }
    @JsonProperty("type_id")
    public int getTypeId() {
        return typeId;
    }
    private Float volume;
    public void setVolume(Float val) {
        volume = val;
    }
    @JsonProperty("volume")
    public Float getVolume() {
        return volume;
    }
}
