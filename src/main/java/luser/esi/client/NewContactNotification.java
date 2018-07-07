package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class NewContactNotification {
    private String message;
    public void setMessage(String val) {
        message = val;
    }
    public String getMessage() {
        return message;
    }
    private int notificationId;
    public void setNotificationId(int val) {
        notificationId = val;
    }
    public int getNotificationId() {
        return notificationId;
    }
    private String sendDate;
    public void setSendDate(String val) {
        sendDate = val;
    }
    public String getSendDate() {
        return sendDate;
    }
    private int senderCharacterId;
    public void setSenderCharacterId(int val) {
        senderCharacterId = val;
    }
    public int getSenderCharacterId() {
        return senderCharacterId;
    }
    private float standingLevel;
    public void setStandingLevel(float val) {
        standingLevel = val;
    }
    public float getStandingLevel() {
        return standingLevel;
    }
    static NewContactNotification fromJson(Json json) {
        if (json == null) {
            return null;
        }
        NewContactNotification self = new NewContactNotification();
        Map<String, Json> js = json.asJsonMap();
        self.message = ApiClientBase.optGetString(js.get("message"));
        self.notificationId = ApiClientBase.optGetInteger(js.get("notification_id"));
        self.sendDate = ApiClientBase.optGetString(js.get("send_date"));
        self.senderCharacterId = ApiClientBase.optGetInteger(js.get("sender_character_id"));
        self.standingLevel = ApiClientBase.optGetFloat(js.get("standing_level"));
        return self;
    }
}
