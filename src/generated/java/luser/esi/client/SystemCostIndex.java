package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SystemCostIndex {
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
        @Override
        public String toString() {
            return stringValue;
        }
    }
}
