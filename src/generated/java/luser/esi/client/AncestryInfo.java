package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AncestryInfo implements ApiParameterObject {
    private int bloodlineId;
    /**
     * The bloodline associated with this ancestry
     */
    public void setBloodlineId(int val) {
        bloodlineId = val;
    }
    /**
     * The bloodline associated with this ancestry
     */
    @JsonProperty("bloodline_id")
    public int getBloodlineId() {
        return bloodlineId;
    }
    private String description;
    /**
     * description string
     */
    public void setDescription(String val) {
        description = val;
    }
    /**
     * description string
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }
    private Integer iconId;
    /**
     * icon_id integer
     */
    public void setIconId(Integer val) {
        iconId = val;
    }
    /**
     * icon_id integer
     */
    @JsonProperty("icon_id")
    public Integer getIconId() {
        return iconId;
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
    private String shortDescription;
    /**
     * short_description string
     */
    public void setShortDescription(String val) {
        shortDescription = val;
    }
    /**
     * short_description string
     */
    @JsonProperty("short_description")
    public String getShortDescription() {
        return shortDescription;
    }
}
