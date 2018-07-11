package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class FleetInvitation implements ApiParameterObject {
    private int characterId;
    public void setCharacterId(int val) {
        characterId = val;
    }
    @JsonProperty("character_id")
    public int getCharacterId() {
        return characterId;
    }
    private RoleEnum role;
    public void setRole(RoleEnum val) {
        role = val;
    }
    @JsonProperty("role")
    public RoleEnum getRole() {
        return role;
    }
    private Long squadId;
    public void setSquadId(Long val) {
        squadId = val;
    }
    @JsonProperty("squad_id")
    public Long getSquadId() {
        return squadId;
    }
    private Long wingId;
    public void setWingId(Long val) {
        wingId = val;
    }
    @JsonProperty("wing_id")
    public Long getWingId() {
        return wingId;
    }
    public static enum RoleEnum {
        FLEET_COMMANDER("fleet_commander"),
        WING_COMMANDER("wing_commander"),
        SQUAD_COMMANDER("squad_commander"),
        SQUAD_MEMBER("squad_member");
        private final String stringValue;
        private RoleEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
        @JsonCreator
        public static RoleEnum fromString(String str) {
            for (RoleEnum self : RoleEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
}
