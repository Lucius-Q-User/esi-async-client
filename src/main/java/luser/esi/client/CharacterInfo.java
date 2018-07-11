package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CharacterInfo implements ApiParameterObject {
    private Integer allianceId;
    public void setAllianceId(Integer val) {
        allianceId = val;
    }
    @JsonProperty("alliance_id")
    public Integer getAllianceId() {
        return allianceId;
    }
    private Integer ancestryId;
    public void setAncestryId(Integer val) {
        ancestryId = val;
    }
    @JsonProperty("ancestry_id")
    public Integer getAncestryId() {
        return ancestryId;
    }
    private Instant birthday;
    public void setBirthday(Instant val) {
        birthday = val;
    }
    @JsonProperty("birthday")
    public Instant getBirthday() {
        return birthday;
    }
    private int bloodlineId;
    public void setBloodlineId(int val) {
        bloodlineId = val;
    }
    @JsonProperty("bloodline_id")
    public int getBloodlineId() {
        return bloodlineId;
    }
    private int corporationId;
    public void setCorporationId(int val) {
        corporationId = val;
    }
    @JsonProperty("corporation_id")
    public int getCorporationId() {
        return corporationId;
    }
    private String description;
    public void setDescription(String val) {
        description = val;
    }
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }
    private Integer factionId;
    public void setFactionId(Integer val) {
        factionId = val;
    }
    @JsonProperty("faction_id")
    public Integer getFactionId() {
        return factionId;
    }
    private GenderEnum gender;
    public void setGender(GenderEnum val) {
        gender = val;
    }
    @JsonProperty("gender")
    public GenderEnum getGender() {
        return gender;
    }
    private String name;
    public void setName(String val) {
        name = val;
    }
    @JsonProperty("name")
    public String getName() {
        return name;
    }
    private int raceId;
    public void setRaceId(int val) {
        raceId = val;
    }
    @JsonProperty("race_id")
    public int getRaceId() {
        return raceId;
    }
    private Float securityStatus;
    public void setSecurityStatus(Float val) {
        securityStatus = val;
    }
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
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
        @JsonCreator
        public static GenderEnum fromString(String str) {
            for (GenderEnum self : GenderEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
}
