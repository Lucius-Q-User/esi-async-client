package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class TypeInfo {
    private Float capacity;
    public void setCapacity(Float val) {
        capacity = val;
    }
    public Float getCapacity() {
        return capacity;
    }
    private String description;
    public void setDescription(String val) {
        description = val;
    }
    public String getDescription() {
        return description;
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
    private Integer graphicId;
    public void setGraphicId(Integer val) {
        graphicId = val;
    }
    public Integer getGraphicId() {
        return graphicId;
    }
    private int groupId;
    public void setGroupId(int val) {
        groupId = val;
    }
    public int getGroupId() {
        return groupId;
    }
    private Integer iconId;
    public void setIconId(Integer val) {
        iconId = val;
    }
    public Integer getIconId() {
        return iconId;
    }
    private Integer marketGroupId;
    public void setMarketGroupId(Integer val) {
        marketGroupId = val;
    }
    public Integer getMarketGroupId() {
        return marketGroupId;
    }
    private Float mass;
    public void setMass(Float val) {
        mass = val;
    }
    public Float getMass() {
        return mass;
    }
    private String name;
    public void setName(String val) {
        name = val;
    }
    public String getName() {
        return name;
    }
    private Float packagedVolume;
    public void setPackagedVolume(Float val) {
        packagedVolume = val;
    }
    public Float getPackagedVolume() {
        return packagedVolume;
    }
    private Integer portionSize;
    public void setPortionSize(Integer val) {
        portionSize = val;
    }
    public Integer getPortionSize() {
        return portionSize;
    }
    private boolean published;
    public void setPublished(boolean val) {
        published = val;
    }
    public boolean getPublished() {
        return published;
    }
    private Float radius;
    public void setRadius(Float val) {
        radius = val;
    }
    public Float getRadius() {
        return radius;
    }
    private int typeId;
    public void setTypeId(int val) {
        typeId = val;
    }
    public int getTypeId() {
        return typeId;
    }
    private Float volume;
    public void setVolume(Float val) {
        volume = val;
    }
    public Float getVolume() {
        return volume;
    }
    static TypeInfo fromJson(Json json) {
        if (json == null) {
            return null;
        }
        TypeInfo self = new TypeInfo();
        Map<String, Json> js = json.asJsonMap();
        self.capacity = ApiClientBase.optGetFloat(js.get("capacity"));
        self.description = ApiClientBase.optGetString(js.get("description"));
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
        self.graphicId = ApiClientBase.optGetInteger(js.get("graphic_id"));
        self.groupId = ApiClientBase.optGetInteger(js.get("group_id"));
        self.iconId = ApiClientBase.optGetInteger(js.get("icon_id"));
        self.marketGroupId = ApiClientBase.optGetInteger(js.get("market_group_id"));
        self.mass = ApiClientBase.optGetFloat(js.get("mass"));
        self.name = ApiClientBase.optGetString(js.get("name"));
        self.packagedVolume = ApiClientBase.optGetFloat(js.get("packaged_volume"));
        self.portionSize = ApiClientBase.optGetInteger(js.get("portion_size"));
        self.published = ApiClientBase.optGetBoolean(js.get("published"));
        self.radius = ApiClientBase.optGetFloat(js.get("radius"));
        self.typeId = ApiClientBase.optGetInteger(js.get("type_id"));
        self.volume = ApiClientBase.optGetFloat(js.get("volume"));
        return self;
    }
}
