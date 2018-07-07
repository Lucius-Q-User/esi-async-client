package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class SystemCostIndex {
    private ActivityEnum activity;
    public void setActivity(ActivityEnum val) {
        activity = val;
    }
    public ActivityEnum getActivity() {
        return activity;
    }
    private float costIndex;
    public void setCostIndex(float val) {
        costIndex = val;
    }
    public float getCostIndex() {
        return costIndex;
    }
    static SystemCostIndex fromJson(Json json) {
        if (json == null) {
            return null;
        }
        SystemCostIndex self = new SystemCostIndex();
        Map<String, Json> js = json.asJsonMap();
        self.activity = ActivityEnum.fromString(ApiClientBase.optGetString(js.get("activity")));
        self.costIndex = ApiClientBase.optGetFloat(js.get("cost_index"));
        return self;
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
        public final String stringValue;
        private ActivityEnum(String stringValue) {
            this.stringValue = stringValue;
        }
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
