package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class NewContactNotification implements ApiParameterObject {
    private String message;
    public void setMessage(String val) {
        message = val;
    }
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }
    private int notificationId;
    public void setNotificationId(int val) {
        notificationId = val;
    }
    @JsonProperty("notification_id")
    public int getNotificationId() {
        return notificationId;
    }
    private Instant sendDate;
    public void setSendDate(Instant val) {
        sendDate = val;
    }
    @JsonProperty("send_date")
    public Instant getSendDate() {
        return sendDate;
    }
    private int senderCharacterId;
    public void setSenderCharacterId(int val) {
        senderCharacterId = val;
    }
    @JsonProperty("sender_character_id")
    public int getSenderCharacterId() {
        return senderCharacterId;
    }
    private float standingLevel;
    public void setStandingLevel(float val) {
        standingLevel = val;
    }
    @JsonProperty("standing_level")
    public float getStandingLevel() {
        return standingLevel;
    }
}
