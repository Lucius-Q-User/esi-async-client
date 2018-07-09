package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class CharacterInfo {
    private Integer allianceId;
    public void setAllianceId(Integer val) {
        allianceId = val;
    }
    public Integer getAllianceId() {
        return allianceId;
    }
    private Integer ancestryId;
    public void setAncestryId(Integer val) {
        ancestryId = val;
    }
    public Integer getAncestryId() {
        return ancestryId;
    }
    private Instant birthday;
    public void setBirthday(Instant val) {
        birthday = val;
    }
    public Instant getBirthday() {
        return birthday;
    }
    private int bloodlineId;
    public void setBloodlineId(int val) {
        bloodlineId = val;
    }
    public int getBloodlineId() {
        return bloodlineId;
    }
    private int corporationId;
    public void setCorporationId(int val) {
        corporationId = val;
    }
    public int getCorporationId() {
        return corporationId;
    }
    private String description;
    public void setDescription(String val) {
        description = val;
    }
    public String getDescription() {
        return description;
    }
    private Integer factionId;
    public void setFactionId(Integer val) {
        factionId = val;
    }
    public Integer getFactionId() {
        return factionId;
    }
    private GenderEnum gender;
    public void setGender(GenderEnum val) {
        gender = val;
    }
    public GenderEnum getGender() {
        return gender;
    }
    private String name;
    public void setName(String val) {
        name = val;
    }
    public String getName() {
        return name;
    }
    private int raceId;
    public void setRaceId(int val) {
        raceId = val;
    }
    public int getRaceId() {
        return raceId;
    }
    private Float securityStatus;
    public void setSecurityStatus(Float val) {
        securityStatus = val;
    }
    public Float getSecurityStatus() {
        return securityStatus;
    }
    static CharacterInfo fromJson(Json json) {
        if (json == null) {
            return null;
        }
        CharacterInfo self = new CharacterInfo();
        Map<String, Json> js = json.asJsonMap();
        self.allianceId = ApiClientBase.optGetInteger(js.get("alliance_id"));
        self.ancestryId = ApiClientBase.optGetInteger(js.get("ancestry_id"));
        self.birthday = ApiClientBase.optGetInstant(js.get("birthday"));
        self.bloodlineId = ApiClientBase.optGetInteger(js.get("bloodline_id"));
        self.corporationId = ApiClientBase.optGetInteger(js.get("corporation_id"));
        self.description = ApiClientBase.optGetString(js.get("description"));
        self.factionId = ApiClientBase.optGetInteger(js.get("faction_id"));
        self.gender = GenderEnum.fromString(ApiClientBase.optGetString(js.get("gender")));
        self.name = ApiClientBase.optGetString(js.get("name"));
        self.raceId = ApiClientBase.optGetInteger(js.get("race_id"));
        self.securityStatus = ApiClientBase.optGetFloat(js.get("security_status"));
        return self;
    }
    public static enum GenderEnum {
        FEMALE("female"),
        MALE("male");
        public final String stringValue;
        private GenderEnum(String stringValue) {
            this.stringValue = stringValue;
        }
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
