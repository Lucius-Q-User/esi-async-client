package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class DogmaAttributeInfo {
    private int attributeId;
    public void setAttributeId(int val) {
        attributeId = val;
    }
    public int getAttributeId() {
        return attributeId;
    }
    private Float defaultValue;
    public void setDefaultValue(Float val) {
        defaultValue = val;
    }
    public Float getDefaultValue() {
        return defaultValue;
    }
    private String description;
    public void setDescription(String val) {
        description = val;
    }
    public String getDescription() {
        return description;
    }
    private String displayName;
    public void setDisplayName(String val) {
        displayName = val;
    }
    public String getDisplayName() {
        return displayName;
    }
    private Boolean highIsGood;
    public void setHighIsGood(Boolean val) {
        highIsGood = val;
    }
    public Boolean getHighIsGood() {
        return highIsGood;
    }
    private Integer iconId;
    public void setIconId(Integer val) {
        iconId = val;
    }
    public Integer getIconId() {
        return iconId;
    }
    private String name;
    public void setName(String val) {
        name = val;
    }
    public String getName() {
        return name;
    }
    private Boolean published;
    public void setPublished(Boolean val) {
        published = val;
    }
    public Boolean getPublished() {
        return published;
    }
    private Boolean stackable;
    public void setStackable(Boolean val) {
        stackable = val;
    }
    public Boolean getStackable() {
        return stackable;
    }
    private Integer unitId;
    public void setUnitId(Integer val) {
        unitId = val;
    }
    public Integer getUnitId() {
        return unitId;
    }
    static DogmaAttributeInfo fromJson(Json json) {
        if (json == null) {
            return null;
        }
        DogmaAttributeInfo self = new DogmaAttributeInfo();
        Map<String, Json> js = json.asJsonMap();
        self.attributeId = ApiClientBase.optGetInteger(js.get("attribute_id"));
        self.defaultValue = ApiClientBase.optGetFloat(js.get("default_value"));
        self.description = ApiClientBase.optGetString(js.get("description"));
        self.displayName = ApiClientBase.optGetString(js.get("display_name"));
        self.highIsGood = ApiClientBase.optGetBoolean(js.get("high_is_good"));
        self.iconId = ApiClientBase.optGetInteger(js.get("icon_id"));
        self.name = ApiClientBase.optGetString(js.get("name"));
        self.published = ApiClientBase.optGetBoolean(js.get("published"));
        self.stackable = ApiClientBase.optGetBoolean(js.get("stackable"));
        self.unitId = ApiClientBase.optGetInteger(js.get("unit_id"));
        return self;
    }
}
