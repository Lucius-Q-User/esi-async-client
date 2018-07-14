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
public class DgmEffectModifier implements ApiParameterObject {
    private String domain;
    /**
     * domain string
     */
    public void setDomain(String val) {
        domain = val;
    }
    /**
     * domain string
     */
    @JsonProperty("domain")
    public String getDomain() {
        return domain;
    }
    private Integer effectId;
    /**
     * effect_id integer
     */
    public void setEffectId(Integer val) {
        effectId = val;
    }
    /**
     * effect_id integer
     */
    @JsonProperty("effect_id")
    public Integer getEffectId() {
        return effectId;
    }
    private String func;
    /**
     * func string
     */
    public void setFunc(String val) {
        func = val;
    }
    /**
     * func string
     */
    @JsonProperty("func")
    public String getFunc() {
        return func;
    }
    private Integer modifiedAttributeId;
    /**
     * modified_attribute_id integer
     */
    public void setModifiedAttributeId(Integer val) {
        modifiedAttributeId = val;
    }
    /**
     * modified_attribute_id integer
     */
    @JsonProperty("modified_attribute_id")
    public Integer getModifiedAttributeId() {
        return modifiedAttributeId;
    }
    private Integer modifyingAttributeId;
    /**
     * modifying_attribute_id integer
     */
    public void setModifyingAttributeId(Integer val) {
        modifyingAttributeId = val;
    }
    /**
     * modifying_attribute_id integer
     */
    @JsonProperty("modifying_attribute_id")
    public Integer getModifyingAttributeId() {
        return modifyingAttributeId;
    }
    private Integer operator;
    /**
     * operator integer
     */
    public void setOperator(Integer val) {
        operator = val;
    }
    /**
     * operator integer
     */
    @JsonProperty("operator")
    public Integer getOperator() {
        return operator;
    }
}
