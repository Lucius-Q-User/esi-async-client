package luser.esi.client;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;

public class CalendarApi {
    private ApiClient apiClient;
    CalendarApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
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
    
    public CompletableFuture<EsiResponseWrapper<List<CalendarInfo>>> getCalendar(int characterId, DatasourceEnum datasource, Integer fromEvent, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/characters/{character_id}/calendar/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(1);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            parametersInHeaders.put("If-None-Match", val);
        }
        Map<String, String> parametersInQuery = new HashMap<>(2);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }
        
        if (fromEvent != null) {
            String val = String.valueOf(fromEvent);
            parametersInQuery.put("from_event", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("character_id", String.valueOf(characterId));
        String body = null;
        String method = "GET";
        ResponseParser<List<CalendarInfo>> responseParser = (resp) -> {
            return ApiClientBase.GLOBAL_OBJECT_MAPPER.readValue(resp, new TypeReference<List<CalendarInfo>>() {});
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
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
    
    public CompletableFuture<EsiResponseWrapper<List<EventAttendee>>> getCalendarEventAttendees(int characterId, DatasourceEnum datasource, int eventId, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/characters/{character_id}/calendar/{event_id}/attendees/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(1);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            parametersInHeaders.put("If-None-Match", val);
        }
        Map<String, String> parametersInQuery = new HashMap<>(1);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(2);
        parametersInUrl.put("character_id", String.valueOf(characterId));
        parametersInUrl.put("event_id", String.valueOf(eventId));
        String body = null;
        String method = "GET";
        ResponseParser<List<EventAttendee>> responseParser = (resp) -> {
            return ApiClientBase.GLOBAL_OBJECT_MAPPER.readValue(resp, new TypeReference<List<EventAttendee>>() {});
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
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
    
    public CompletableFuture<EsiResponseWrapper<CalendarEvent>> getCalendarEventInfo(int characterId, DatasourceEnum datasource, int eventId, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v3/characters/{character_id}/calendar/{event_id}/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(1);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            parametersInHeaders.put("If-None-Match", val);
        }
        Map<String, String> parametersInQuery = new HashMap<>(1);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(2);
        parametersInUrl.put("character_id", String.valueOf(characterId));
        parametersInUrl.put("event_id", String.valueOf(eventId));
        String body = null;
        String method = "GET";
        ResponseParser<CalendarEvent> responseParser = (resp) -> {
            return ApiClientBase.GLOBAL_OBJECT_MAPPER.readValue(resp, CalendarEvent.class);
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
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
    
    public CompletableFuture<EsiResponseWrapper<Void>> respondToCalendarEvent(int characterId, DatasourceEnum datasource, int eventId, EventResponse response) {
        String url = "https://esi.evetech.net/v3/characters/{character_id}/calendar/{event_id}/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(0);
        Map<String, String> parametersInQuery = new HashMap<>(1);
        
        if (datasource != null) {
            String val = datasource.stringValue;
            parametersInQuery.put("datasource", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(2);
        parametersInUrl.put("character_id", String.valueOf(characterId));
        parametersInUrl.put("event_id", String.valueOf(eventId));
        String body = null;
        body = ApiClientBase.renderToBody(response);
        String method = "PUT";
        ResponseParser<Void> responseParser = (resp) -> {
            return null;
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
}
