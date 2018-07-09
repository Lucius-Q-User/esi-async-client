package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class CharacterMedal {
    private int corporationId;
    public void setCorporationId(int val) {
        corporationId = val;
    }
    public int getCorporationId() {
        return corporationId;
    }
    private Instant date;
    public void setDate(Instant val) {
        date = val;
    }
    public Instant getDate() {
        return date;
    }
    private String description;
    public void setDescription(String val) {
        description = val;
    }
    public String getDescription() {
        return description;
    }
    private List<MedalGraphic> graphics;
    public void setGraphics(List<MedalGraphic> val) {
        graphics = val;
    }
    public List<MedalGraphic> getGraphics() {
        return graphics;
    }
    private int issuerId;
    public void setIssuerId(int val) {
        issuerId = val;
    }
    public int getIssuerId() {
        return issuerId;
    }
    private int medalId;
    public void setMedalId(int val) {
        medalId = val;
    }
    public int getMedalId() {
        return medalId;
    }
    private String reason;
    public void setReason(String val) {
        reason = val;
    }
    public String getReason() {
        return reason;
    }
    private StatusEnum status;
    public void setStatus(StatusEnum val) {
        status = val;
    }
    public StatusEnum getStatus() {
        return status;
    }
    private String title;
    public void setTitle(String val) {
        title = val;
    }
    public String getTitle() {
        return title;
    }
    static CharacterMedal fromJson(Json json) {
        if (json == null) {
            return null;
        }
        CharacterMedal self = new CharacterMedal();
        Map<String, Json> js = json.asJsonMap();
        self.corporationId = ApiClientBase.optGetInteger(js.get("corporation_id"));
        self.date = ApiClientBase.optGetInstant(js.get("date"));
        self.description = ApiClientBase.optGetString(js.get("description"));
        {
            List<Json> jl = js.get("graphics").asJsonList();
            List<MedalGraphic> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.add(MedalGraphic.fromJson(jl.get(i)));
            }
            self.graphics = rt;
        }
        self.issuerId = ApiClientBase.optGetInteger(js.get("issuer_id"));
        self.medalId = ApiClientBase.optGetInteger(js.get("medal_id"));
        self.reason = ApiClientBase.optGetString(js.get("reason"));
        self.status = StatusEnum.fromString(ApiClientBase.optGetString(js.get("status")));
        self.title = ApiClientBase.optGetString(js.get("title"));
        return self;
    }
    public static enum StatusEnum {
        PUBLIC("public"),
        PRIVATE("private");
        public final String stringValue;
        private StatusEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        public static StatusEnum fromString(String str) {
            for (StatusEnum self : StatusEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
}
