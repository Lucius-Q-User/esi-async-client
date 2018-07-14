package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StargateInfo implements ApiParameterObject {
    private StargateDestination destination;
    /**
     * destination object
     */
    public void setDestination(StargateDestination val) {
        destination = val;
    }
    /**
     * destination object
     */
    @JsonProperty("destination")
    public StargateDestination getDestination() {
        return destination;
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
    private Coordinate position;
    /**
     * position object
     */
    public void setPosition(Coordinate val) {
        position = val;
    }
    /**
     * position object
     */
    @JsonProperty("position")
    public Coordinate getPosition() {
        return position;
    }
    private int stargateId;
    /**
     * stargate_id integer
     */
    public void setStargateId(int val) {
        stargateId = val;
    }
    /**
     * stargate_id integer
     */
    @JsonProperty("stargate_id")
    public int getStargateId() {
        return stargateId;
    }
    private int systemId;
    /**
     * The solar system this stargate is in
     */
    public void setSystemId(int val) {
        systemId = val;
    }
    /**
     * The solar system this stargate is in
     */
    @JsonProperty("system_id")
    public int getSystemId() {
        return systemId;
    }
    private int typeId;
    /**
     * type_id integer
     */
    public void setTypeId(int val) {
        typeId = val;
    }
    /**
     * type_id integer
     */
    @JsonProperty("type_id")
    public int getTypeId() {
        return typeId;
    }
}
