package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CharacterStatsSocial implements ApiParameterObject {
    private Long addContactBad;
    public void setAddContactBad(Long val) {
        addContactBad = val;
    }
    @JsonProperty("add_contact_bad")
    public Long getAddContactBad() {
        return addContactBad;
    }
    private Long addContactGood;
    public void setAddContactGood(Long val) {
        addContactGood = val;
    }
    @JsonProperty("add_contact_good")
    public Long getAddContactGood() {
        return addContactGood;
    }
    private Long addContactHigh;
    public void setAddContactHigh(Long val) {
        addContactHigh = val;
    }
    @JsonProperty("add_contact_high")
    public Long getAddContactHigh() {
        return addContactHigh;
    }
    private Long addContactHorrible;
    public void setAddContactHorrible(Long val) {
        addContactHorrible = val;
    }
    @JsonProperty("add_contact_horrible")
    public Long getAddContactHorrible() {
        return addContactHorrible;
    }
    private Long addContactNeutral;
    public void setAddContactNeutral(Long val) {
        addContactNeutral = val;
    }
    @JsonProperty("add_contact_neutral")
    public Long getAddContactNeutral() {
        return addContactNeutral;
    }
    private Long addNote;
    public void setAddNote(Long val) {
        addNote = val;
    }
    @JsonProperty("add_note")
    public Long getAddNote() {
        return addNote;
    }
    private Long addedAsContactBad;
    public void setAddedAsContactBad(Long val) {
        addedAsContactBad = val;
    }
    @JsonProperty("added_as_contact_bad")
    public Long getAddedAsContactBad() {
        return addedAsContactBad;
    }
    private Long addedAsContactGood;
    public void setAddedAsContactGood(Long val) {
        addedAsContactGood = val;
    }
    @JsonProperty("added_as_contact_good")
    public Long getAddedAsContactGood() {
        return addedAsContactGood;
    }
    private Long addedAsContactHigh;
    public void setAddedAsContactHigh(Long val) {
        addedAsContactHigh = val;
    }
    @JsonProperty("added_as_contact_high")
    public Long getAddedAsContactHigh() {
        return addedAsContactHigh;
    }
    private Long addedAsContactHorrible;
    public void setAddedAsContactHorrible(Long val) {
        addedAsContactHorrible = val;
    }
    @JsonProperty("added_as_contact_horrible")
    public Long getAddedAsContactHorrible() {
        return addedAsContactHorrible;
    }
    private Long addedAsContactNeutral;
    public void setAddedAsContactNeutral(Long val) {
        addedAsContactNeutral = val;
    }
    @JsonProperty("added_as_contact_neutral")
    public Long getAddedAsContactNeutral() {
        return addedAsContactNeutral;
    }
    private Long calendarEventCreated;
    public void setCalendarEventCreated(Long val) {
        calendarEventCreated = val;
    }
    @JsonProperty("calendar_event_created")
    public Long getCalendarEventCreated() {
        return calendarEventCreated;
    }
    private Long chatMessagesAlliance;
    public void setChatMessagesAlliance(Long val) {
        chatMessagesAlliance = val;
    }
    @JsonProperty("chat_messages_alliance")
    public Long getChatMessagesAlliance() {
        return chatMessagesAlliance;
    }
    private Long chatMessagesConstellation;
    public void setChatMessagesConstellation(Long val) {
        chatMessagesConstellation = val;
    }
    @JsonProperty("chat_messages_constellation")
    public Long getChatMessagesConstellation() {
        return chatMessagesConstellation;
    }
    private Long chatMessagesCorporation;
    public void setChatMessagesCorporation(Long val) {
        chatMessagesCorporation = val;
    }
    @JsonProperty("chat_messages_corporation")
    public Long getChatMessagesCorporation() {
        return chatMessagesCorporation;
    }
    private Long chatMessagesFleet;
    public void setChatMessagesFleet(Long val) {
        chatMessagesFleet = val;
    }
    @JsonProperty("chat_messages_fleet")
    public Long getChatMessagesFleet() {
        return chatMessagesFleet;
    }
    private Long chatMessagesRegion;
    public void setChatMessagesRegion(Long val) {
        chatMessagesRegion = val;
    }
    @JsonProperty("chat_messages_region")
    public Long getChatMessagesRegion() {
        return chatMessagesRegion;
    }
    private Long chatMessagesSolarsystem;
    public void setChatMessagesSolarsystem(Long val) {
        chatMessagesSolarsystem = val;
    }
    @JsonProperty("chat_messages_solarsystem")
    public Long getChatMessagesSolarsystem() {
        return chatMessagesSolarsystem;
    }
    private Long chatMessagesWarfaction;
    public void setChatMessagesWarfaction(Long val) {
        chatMessagesWarfaction = val;
    }
    @JsonProperty("chat_messages_warfaction")
    public Long getChatMessagesWarfaction() {
        return chatMessagesWarfaction;
    }
    private Long chatTotalMessageLength;
    public void setChatTotalMessageLength(Long val) {
        chatTotalMessageLength = val;
    }
    @JsonProperty("chat_total_message_length")
    public Long getChatTotalMessageLength() {
        return chatTotalMessageLength;
    }
    private Long directTrades;
    public void setDirectTrades(Long val) {
        directTrades = val;
    }
    @JsonProperty("direct_trades")
    public Long getDirectTrades() {
        return directTrades;
    }
    private Long fleetBroadcasts;
    public void setFleetBroadcasts(Long val) {
        fleetBroadcasts = val;
    }
    @JsonProperty("fleet_broadcasts")
    public Long getFleetBroadcasts() {
        return fleetBroadcasts;
    }
    private Long fleetJoins;
    public void setFleetJoins(Long val) {
        fleetJoins = val;
    }
    @JsonProperty("fleet_joins")
    public Long getFleetJoins() {
        return fleetJoins;
    }
    private Long mailsReceived;
    public void setMailsReceived(Long val) {
        mailsReceived = val;
    }
    @JsonProperty("mails_received")
    public Long getMailsReceived() {
        return mailsReceived;
    }
    private Long mailsSent;
    public void setMailsSent(Long val) {
        mailsSent = val;
    }
    @JsonProperty("mails_sent")
    public Long getMailsSent() {
        return mailsSent;
    }
}
