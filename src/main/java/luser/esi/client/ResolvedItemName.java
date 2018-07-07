package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class ResolvedItemName {
    private CategoryEnum category;
    public void setCategory(CategoryEnum val) {
        category = val;
    }
    public CategoryEnum getCategory() {
        return category;
    }
    private int id;
    public void setId(int val) {
        id = val;
    }
    public int getId() {
        return id;
    }
    private String name;
    public void setName(String val) {
        name = val;
    }
    public String getName() {
        return name;
    }
    static ResolvedItemName fromJson(Json json) {
        if (json == null) {
            return null;
        }
        ResolvedItemName self = new ResolvedItemName();
        Map<String, Json> js = json.asJsonMap();
        self.category = CategoryEnum.fromString(ApiClientBase.optGetString(js.get("category")));
        self.id = ApiClientBase.optGetInteger(js.get("id"));
        self.name = ApiClientBase.optGetString(js.get("name"));
        return self;
    }
    public static enum CategoryEnum {
        ALLIANCE("alliance"),
        CHARACTER("character"),
        CONSTELLATION("constellation"),
        CORPORATION("corporation"),
        INVENTORY_TYPE("inventory_type"),
        REGION("region"),
        SOLAR_SYSTEM("solar_system"),
        STATION("station");
        public final String stringValue;
        private CategoryEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        public static CategoryEnum fromString(String str) {
            for (CategoryEnum self : CategoryEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
}
