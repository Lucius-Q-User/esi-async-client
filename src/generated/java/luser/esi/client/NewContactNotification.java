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
public class NewContactNotification implements ApiParameterObject {
    private String message;
    /**
     * message string
     */
    public void setMessage(String val) {
        message = val;
    }
    /**
     * message string
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }
    private int notificationId;
    /**
     * notification_id integer
     */
    public void setNotificationId(int val) {
        notificationId = val;
    }
    /**
     * notification_id integer
     */
    @JsonProperty("notification_id")
    public int getNotificationId() {
        return notificationId;
    }
    private Instant sendDate;
    /**
     * send_date string
     */
    public void setSendDate(Instant val) {
        sendDate = val;
    }
    /**
     * send_date string
     */
    @JsonProperty("send_date")
    public Instant getSendDate() {
        return sendDate;
    }
    private int senderCharacterId;
    /**
     * sender_character_id integer
     */
    public void setSenderCharacterId(int val) {
        senderCharacterId = val;
    }
    /**
     * sender_character_id integer
     */
    @JsonProperty("sender_character_id")
    public int getSenderCharacterId() {
        return senderCharacterId;
    }
    private float standingLevel;
    /**
     * A number representing the standing level the receiver has been added at by the sender. The standing levels are as follows: -10 -> Terrible | -5 -> Bad |  0 -> Neutral |  5 -> Good |  10 -> Excellent
     */
    public void setStandingLevel(float val) {
        standingLevel = val;
    }
    /**
     * A number representing the standing level the receiver has been added at by the sender. The standing levels are as follows: -10 -> Terrible | -5 -> Bad |  0 -> Neutral |  5 -> Good |  10 -> Excellent
     */
    @JsonProperty("standing_level")
    public float getStandingLevel() {
        return standingLevel;
    }
}
