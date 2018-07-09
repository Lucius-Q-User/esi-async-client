package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class CharacterStatsSocial {
    private Long addContactBad;
    public void setAddContactBad(Long val) {
        addContactBad = val;
    }
    public Long getAddContactBad() {
        return addContactBad;
    }
    private Long addContactGood;
    public void setAddContactGood(Long val) {
        addContactGood = val;
    }
    public Long getAddContactGood() {
        return addContactGood;
    }
    private Long addContactHigh;
    public void setAddContactHigh(Long val) {
        addContactHigh = val;
    }
    public Long getAddContactHigh() {
        return addContactHigh;
    }
    private Long addContactHorrible;
    public void setAddContactHorrible(Long val) {
        addContactHorrible = val;
    }
    public Long getAddContactHorrible() {
        return addContactHorrible;
    }
    private Long addContactNeutral;
    public void setAddContactNeutral(Long val) {
        addContactNeutral = val;
    }
    public Long getAddContactNeutral() {
        return addContactNeutral;
    }
    private Long addNote;
    public void setAddNote(Long val) {
        addNote = val;
    }
    public Long getAddNote() {
        return addNote;
    }
    private Long addedAsContactBad;
    public void setAddedAsContactBad(Long val) {
        addedAsContactBad = val;
    }
    public Long getAddedAsContactBad() {
        return addedAsContactBad;
    }
    private Long addedAsContactGood;
    public void setAddedAsContactGood(Long val) {
        addedAsContactGood = val;
    }
    public Long getAddedAsContactGood() {
        return addedAsContactGood;
    }
    private Long addedAsContactHigh;
    public void setAddedAsContactHigh(Long val) {
        addedAsContactHigh = val;
    }
    public Long getAddedAsContactHigh() {
        return addedAsContactHigh;
    }
    private Long addedAsContactHorrible;
    public void setAddedAsContactHorrible(Long val) {
        addedAsContactHorrible = val;
    }
    public Long getAddedAsContactHorrible() {
        return addedAsContactHorrible;
    }
    private Long addedAsContactNeutral;
    public void setAddedAsContactNeutral(Long val) {
        addedAsContactNeutral = val;
    }
    public Long getAddedAsContactNeutral() {
        return addedAsContactNeutral;
    }
    private Long calendarEventCreated;
    public void setCalendarEventCreated(Long val) {
        calendarEventCreated = val;
    }
    public Long getCalendarEventCreated() {
        return calendarEventCreated;
    }
    private Long chatMessagesAlliance;
    public void setChatMessagesAlliance(Long val) {
        chatMessagesAlliance = val;
    }
    public Long getChatMessagesAlliance() {
        return chatMessagesAlliance;
    }
    private Long chatMessagesConstellation;
    public void setChatMessagesConstellation(Long val) {
        chatMessagesConstellation = val;
    }
    public Long getChatMessagesConstellation() {
        return chatMessagesConstellation;
    }
    private Long chatMessagesCorporation;
    public void setChatMessagesCorporation(Long val) {
        chatMessagesCorporation = val;
    }
    public Long getChatMessagesCorporation() {
        return chatMessagesCorporation;
    }
    private Long chatMessagesFleet;
    public void setChatMessagesFleet(Long val) {
        chatMessagesFleet = val;
    }
    public Long getChatMessagesFleet() {
        return chatMessagesFleet;
    }
    private Long chatMessagesRegion;
    public void setChatMessagesRegion(Long val) {
        chatMessagesRegion = val;
    }
    public Long getChatMessagesRegion() {
        return chatMessagesRegion;
    }
    private Long chatMessagesSolarsystem;
    public void setChatMessagesSolarsystem(Long val) {
        chatMessagesSolarsystem = val;
    }
    public Long getChatMessagesSolarsystem() {
        return chatMessagesSolarsystem;
    }
    private Long chatMessagesWarfaction;
    public void setChatMessagesWarfaction(Long val) {
        chatMessagesWarfaction = val;
    }
    public Long getChatMessagesWarfaction() {
        return chatMessagesWarfaction;
    }
    private Long chatTotalMessageLength;
    public void setChatTotalMessageLength(Long val) {
        chatTotalMessageLength = val;
    }
    public Long getChatTotalMessageLength() {
        return chatTotalMessageLength;
    }
    private Long directTrades;
    public void setDirectTrades(Long val) {
        directTrades = val;
    }
    public Long getDirectTrades() {
        return directTrades;
    }
    private Long fleetBroadcasts;
    public void setFleetBroadcasts(Long val) {
        fleetBroadcasts = val;
    }
    public Long getFleetBroadcasts() {
        return fleetBroadcasts;
    }
    private Long fleetJoins;
    public void setFleetJoins(Long val) {
        fleetJoins = val;
    }
    public Long getFleetJoins() {
        return fleetJoins;
    }
    private Long mailsReceived;
    public void setMailsReceived(Long val) {
        mailsReceived = val;
    }
    public Long getMailsReceived() {
        return mailsReceived;
    }
    private Long mailsSent;
    public void setMailsSent(Long val) {
        mailsSent = val;
    }
    public Long getMailsSent() {
        return mailsSent;
    }
    static CharacterStatsSocial fromJson(Json json) {
        if (json == null) {
            return null;
        }
        CharacterStatsSocial self = new CharacterStatsSocial();
        Map<String, Json> js = json.asJsonMap();
        self.addContactBad = ApiClientBase.optGetLong(js.get("add_contact_bad"));
        self.addContactGood = ApiClientBase.optGetLong(js.get("add_contact_good"));
        self.addContactHigh = ApiClientBase.optGetLong(js.get("add_contact_high"));
        self.addContactHorrible = ApiClientBase.optGetLong(js.get("add_contact_horrible"));
        self.addContactNeutral = ApiClientBase.optGetLong(js.get("add_contact_neutral"));
        self.addNote = ApiClientBase.optGetLong(js.get("add_note"));
        self.addedAsContactBad = ApiClientBase.optGetLong(js.get("added_as_contact_bad"));
        self.addedAsContactGood = ApiClientBase.optGetLong(js.get("added_as_contact_good"));
        self.addedAsContactHigh = ApiClientBase.optGetLong(js.get("added_as_contact_high"));
        self.addedAsContactHorrible = ApiClientBase.optGetLong(js.get("added_as_contact_horrible"));
        self.addedAsContactNeutral = ApiClientBase.optGetLong(js.get("added_as_contact_neutral"));
        self.calendarEventCreated = ApiClientBase.optGetLong(js.get("calendar_event_created"));
        self.chatMessagesAlliance = ApiClientBase.optGetLong(js.get("chat_messages_alliance"));
        self.chatMessagesConstellation = ApiClientBase.optGetLong(js.get("chat_messages_constellation"));
        self.chatMessagesCorporation = ApiClientBase.optGetLong(js.get("chat_messages_corporation"));
        self.chatMessagesFleet = ApiClientBase.optGetLong(js.get("chat_messages_fleet"));
        self.chatMessagesRegion = ApiClientBase.optGetLong(js.get("chat_messages_region"));
        self.chatMessagesSolarsystem = ApiClientBase.optGetLong(js.get("chat_messages_solarsystem"));
        self.chatMessagesWarfaction = ApiClientBase.optGetLong(js.get("chat_messages_warfaction"));
        self.chatTotalMessageLength = ApiClientBase.optGetLong(js.get("chat_total_message_length"));
        self.directTrades = ApiClientBase.optGetLong(js.get("direct_trades"));
        self.fleetBroadcasts = ApiClientBase.optGetLong(js.get("fleet_broadcasts"));
        self.fleetJoins = ApiClientBase.optGetLong(js.get("fleet_joins"));
        self.mailsReceived = ApiClientBase.optGetLong(js.get("mails_received"));
        self.mailsSent = ApiClientBase.optGetLong(js.get("mails_sent"));
        return self;
    }
}
