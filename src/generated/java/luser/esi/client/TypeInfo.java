package luser.esi.client;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TypeInfo {
    private Float capacity;
    /**
     * capacity number
     */
    public void setCapacity(Float val) {
        capacity = val;
    }
    /**
     * capacity number
     */
    @JsonProperty("capacity")
    public Float getCapacity() {
        return capacity;
    }
    private String description;
    /**
     * description string
     */
    public void setDescription(String val) {
        description = val;
    }
    /**
     * description string
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
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
    private Integer graphicId;
    /**
     * graphic_id integer
     */
    public void setGraphicId(Integer val) {
        graphicId = val;
    }
    /**
     * graphic_id integer
     */
    @JsonProperty("graphic_id")
    public Integer getGraphicId() {
        return graphicId;
    }
    private int groupId;
    /**
     * group_id integer
     */
    public void setGroupId(int val) {
        groupId = val;
    }
    /**
     * group_id integer
     */
    @JsonProperty("group_id")
    public int getGroupId() {
        return groupId;
    }
    private Integer iconId;
    /**
     * icon_id integer
     */
    public void setIconId(Integer val) {
        iconId = val;
    }
    /**
     * icon_id integer
     */
    @JsonProperty("icon_id")
    public Integer getIconId() {
        return iconId;
    }
    private Integer marketGroupId;
    /**
     * This only exists for types that can be put on the market
     */
    public void setMarketGroupId(Integer val) {
        marketGroupId = val;
    }
    /**
     * This only exists for types that can be put on the market
     */
    @JsonProperty("market_group_id")
    public Integer getMarketGroupId() {
        return marketGroupId;
    }
    private Float mass;
    /**
     * mass number
     */
    public void setMass(Float val) {
        mass = val;
    }
    /**
     * mass number
     */
    @JsonProperty("mass")
    public Float getMass() {
        return mass;
    }
    private String name;
    /**
     * name string
     */
    public void setName(String val) {
        name = val;
    }
    /**
     * name string
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }
    private Float packagedVolume;
    /**
     * packaged_volume number
     */
    public void setPackagedVolume(Float val) {
        packagedVolume = val;
    }
    /**
     * packaged_volume number
     */
    @JsonProperty("packaged_volume")
    public Float getPackagedVolume() {
        return packagedVolume;
    }
    private Integer portionSize;
    /**
     * portion_size integer
     */
    public void setPortionSize(Integer val) {
        portionSize = val;
    }
    /**
     * portion_size integer
     */
    @JsonProperty("portion_size")
    public Integer getPortionSize() {
        return portionSize;
    }
    private boolean published;
    /**
     * published boolean
     */
    public void setPublished(boolean val) {
        published = val;
    }
    /**
     * published boolean
     */
    @JsonProperty("published")
    public boolean getPublished() {
        return published;
    }
    private Float radius;
    /**
     * radius number
     */
    public void setRadius(Float val) {
        radius = val;
    }
    /**
     * radius number
     */
    @JsonProperty("radius")
    public Float getRadius() {
        return radius;
    }
    private int typeId;
    /**
     * type_id integer
     */
    public void setTypeId(int val) {
        typeId = val;
    }
    /**
     * type_id integer
     */
    @JsonProperty("type_id")
    public int getTypeId() {
        return typeId;
    }
    private Float volume;
    /**
     * volume number
     */
    public void setVolume(Float val) {
        volume = val;
    }
    /**
     * volume number
     */
    @JsonProperty("volume")
    public Float getVolume() {
        return volume;
    }
}
