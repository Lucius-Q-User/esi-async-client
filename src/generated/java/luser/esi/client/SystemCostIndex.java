package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.carrotsearch.hppc.IntArrayList;
import com.carrotsearch.hppc.LongArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class SystemCostIndex implements ApiParameterObject {
    private ActivityEnum activity;
    /**
     * activity string
     */
    public void setActivity(ActivityEnum val) {
        activity = val;
    }
    /**
     * activity string
     */
    @JsonProperty("activity")
    public ActivityEnum getActivity() {
        return activity;
    }
    private float costIndex;
    /**
     * cost_index number
     */
    public void setCostIndex(float val) {
        costIndex = val;
    }
    /**
     * cost_index number
     */
    @JsonProperty("cost_index")
    public float getCostIndex() {
        return costIndex;
    }
    public static enum ActivityEnum {
        COPYING("copying"),
        DUPLICATING("duplicating"),
        INVENTION("invention"),
        MANUFACTURING("manufacturing"),
        NONE("none"),
        REACTION("reaction"),
        RESEARCHING_MATERIAL_EFFICIENCY("researching_material_efficiency"),
        RESEARCHING_TECHNOLOGY("researching_technology"),
        RESEARCHING_TIME_EFFICIENCY("researching_time_efficiency"),
        REVERSE_ENGINEERING("reverse_engineering");
        private final String stringValue;
        private ActivityEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
        @JsonCreator
        public static ActivityEnum fromString(String str) {
            for (ActivityEnum self : ActivityEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
}
