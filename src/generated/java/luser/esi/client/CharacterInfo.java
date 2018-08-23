package luser.esi.client;

import java.time.Instant;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CharacterInfo {
    private Integer allianceId;
    /**
     * The character's alliance ID
     */
    public void setAllianceId(Integer val) {
        allianceId = val;
    }
    /**
     * The character's alliance ID
     */
    @JsonProperty("alliance_id")
    public Integer getAllianceId() {
        return allianceId;
    }
    private Integer ancestryId;
    /**
     * ancestry_id integer
     */
    public void setAncestryId(Integer val) {
        ancestryId = val;
    }
    /**
     * ancestry_id integer
     */
    @JsonProperty("ancestry_id")
    public Integer getAncestryId() {
        return ancestryId;
    }
    private Instant birthday;
    /**
     * Creation date of the character
     */
    public void setBirthday(Instant val) {
        birthday = val;
    }
    /**
     * Creation date of the character
     */
    @JsonProperty("birthday")
    public Instant getBirthday() {
        return birthday;
    }
    private int bloodlineId;
    /**
     * bloodline_id integer
     */
    public void setBloodlineId(int val) {
        bloodlineId = val;
    }
    /**
     * bloodline_id integer
     */
    @JsonProperty("bloodline_id")
    public int getBloodlineId() {
        return bloodlineId;
    }
    private int corporationId;
    /**
     * The character's corporation ID
     */
    public void setCorporationId(int val) {
        corporationId = val;
    }
    /**
     * The character's corporation ID
     */
    @JsonProperty("corporation_id")
    public int getCorporationId() {
        return corporationId;
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
    private Integer factionId;
    /**
     * ID of the faction the character is fighting for, if the character is enlisted in Factional Warfare
     */
    public void setFactionId(Integer val) {
        factionId = val;
    }
    /**
     * ID of the faction the character is fighting for, if the character is enlisted in Factional Warfare
     */
    @JsonProperty("faction_id")
    public Integer getFactionId() {
        return factionId;
    }
    private GenderEnum gender;
    /**
     * gender string
     */
    public void setGender(GenderEnum val) {
        gender = val;
    }
    /**
     * gender string
     */
    @JsonProperty("gender")
    public GenderEnum getGender() {
        return gender;
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
    private int raceId;
    /**
     * race_id integer
     */
    public void setRaceId(int val) {
        raceId = val;
    }
    /**
     * race_id integer
     */
    @JsonProperty("race_id")
    public int getRaceId() {
        return raceId;
    }
    private Float securityStatus;
    /**
     * security_status number
     */
    public void setSecurityStatus(Float val) {
        securityStatus = val;
    }
    /**
     * security_status number
     */
    @JsonProperty("security_status")
    public Float getSecurityStatus() {
        return securityStatus;
    }
    public static enum GenderEnum {
        FEMALE("female"),
        MALE("male");
        private final String stringValue;
        private GenderEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @Override
        public String toString() {
            return stringValue;
        }
    }
}
