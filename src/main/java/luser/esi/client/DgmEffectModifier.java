package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class DgmEffectModifier {
    private String domain;
    public void setDomain(String val) {
        domain = val;
    }
    public String getDomain() {
        return domain;
    }
    private Integer effectId;
    public void setEffectId(Integer val) {
        effectId = val;
    }
    public Integer getEffectId() {
        return effectId;
    }
    private String func;
    public void setFunc(String val) {
        func = val;
    }
    public String getFunc() {
        return func;
    }
    private Integer modifiedAttributeId;
    public void setModifiedAttributeId(Integer val) {
        modifiedAttributeId = val;
    }
    public Integer getModifiedAttributeId() {
        return modifiedAttributeId;
    }
    private Integer modifyingAttributeId;
    public void setModifyingAttributeId(Integer val) {
        modifyingAttributeId = val;
    }
    public Integer getModifyingAttributeId() {
        return modifyingAttributeId;
    }
    private Integer operator;
    public void setOperator(Integer val) {
        operator = val;
    }
    public Integer getOperator() {
        return operator;
    }
    static DgmEffectModifier fromJson(Json json) {
        if (json == null) {
            return null;
        }
        DgmEffectModifier self = new DgmEffectModifier();
        Map<String, Json> js = json.asJsonMap();
        self.domain = ApiClientBase.optGetString(js.get("domain"));
        self.effectId = ApiClientBase.optGetInteger(js.get("effect_id"));
        self.func = ApiClientBase.optGetString(js.get("func"));
        self.modifiedAttributeId = ApiClientBase.optGetInteger(js.get("modified_attribute_id"));
        self.modifyingAttributeId = ApiClientBase.optGetInteger(js.get("modifying_attribute_id"));
        self.operator = ApiClientBase.optGetInteger(js.get("operator"));
        return self;
    }
}
