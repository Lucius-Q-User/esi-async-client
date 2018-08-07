package luser.esi.client;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface CalendarApi {
    public ApiClient getApiClient();
    /**
     * Get 50 event summaries from the calendar. If no from_event ID is given, the resource will return the next 50 chronological event summaries from now. If a from_event ID is specified, it will return the next 50 chronological event summaries from after that event.
     * 
     * ---
     * 
     * This route is cached for up to 5 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param fromEvent The event ID to retrieve events from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return A collection of event summaries
     */
    
    public CompletableFuture<EsiResponseWrapper<List<CalendarInfo>>> getCalendar(int characterId, Integer fromEvent, String ifNoneMatch);
    /**
     * Get all invited attendees for a given event
     * 
     * ---
     * 
     * This route is cached for up to 600 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param eventId The id of the event requested
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return List of attendees
     */
    
    public CompletableFuture<EsiResponseWrapper<List<EventAttendee>>> getCalendarEventAttendees(int characterId, int eventId, String ifNoneMatch);
    /**
     * Get all the information for a specific event
     * 
     * ---
     * 
     * This route is cached for up to 5 seconds
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param eventId The id of the event requested
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return Full details of a specific event
     */
    
    public CompletableFuture<EsiResponseWrapper<CalendarEvent>> getCalendarEventInfo(int characterId, int eventId, String ifNoneMatch);
    /**
     * Set your response status to an event
     * 
     * ---
     * 
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param eventId The ID of the event requested
     * @param response The response value to set, overriding current value.
     * @return Event updated
     */
    
    public CompletableFuture<EsiResponseWrapper<Void>> respondToCalendarEvent(int characterId, int eventId, EventResponse response);
}
