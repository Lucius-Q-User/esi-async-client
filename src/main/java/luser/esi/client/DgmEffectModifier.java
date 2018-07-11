package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class DgmEffectModifier implements ApiParameterObject {
    private String domain;
    public void setDomain(String val) {
        domain = val;
    }
    @JsonProperty("domain")
    public String getDomain() {
        return domain;
    }
    private Integer effectId;
    public void setEffectId(Integer val) {
        effectId = val;
    }
    @JsonProperty("effect_id")
    public Integer getEffectId() {
        return effectId;
    }
    private String func;
    public void setFunc(String val) {
        func = val;
    }
    @JsonProperty("func")
    public String getFunc() {
        return func;
    }
    private Integer modifiedAttributeId;
    public void setModifiedAttributeId(Integer val) {
        modifiedAttributeId = val;
    }
    @JsonProperty("modified_attribute_id")
    public Integer getModifiedAttributeId() {
        return modifiedAttributeId;
    }
    private Integer modifyingAttributeId;
    public void setModifyingAttributeId(Integer val) {
        modifyingAttributeId = val;
    }
    @JsonProperty("modifying_attribute_id")
    public Integer getModifyingAttributeId() {
        return modifyingAttributeId;
    }
    private Integer operator;
    public void setOperator(Integer val) {
        operator = val;
    }
    @JsonProperty("operator")
    public Integer getOperator() {
        return operator;
    }
}
