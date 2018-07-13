package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class ResolvedItemName implements ApiParameterObject {
    private CategoryEnum category;
    /**
     * category string
     */
    public void setCategory(CategoryEnum val) {
        category = val;
    }
    /**
     * category string
     */
    @JsonProperty("category")
    public CategoryEnum getCategory() {
        return category;
    }
    private int id;
    /**
     * id integer
     */
    public void setId(int val) {
        id = val;
    }
    /**
     * id integer
     */
    @JsonProperty("id")
    public int getId() {
        return id;
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
    public static enum CategoryEnum {
        ALLIANCE("alliance"),
        CHARACTER("character"),
        CONSTELLATION("constellation"),
        CORPORATION("corporation"),
        INVENTORY_TYPE("inventory_type"),
        REGION("region"),
        SOLAR_SYSTEM("solar_system"),
        STATION("station");
        private final String stringValue;
        private CategoryEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
        @JsonCreator
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
