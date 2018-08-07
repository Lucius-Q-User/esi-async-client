package luser.esi.client;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;

class CalendarApiImpl implements CalendarApi {
    private ApiClient apiClient;
    CalendarApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    @Override
    public ApiClient getApiClient() {
        return apiClient;
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<CalendarInfo>>> getCalendar(int characterId, Integer fromEvent, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/characters/{character_id}/calendar/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(1);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            parametersInHeaders.put("If-None-Match", val);
        }
        Map<String, String> parametersInQuery = new HashMap<>(1);
        
        if (fromEvent != null) {
            String val = String.valueOf(fromEvent);
            parametersInQuery.put("from_event", val);
        }

        Map<String, String> parametersInUrl = new HashMap<>(1);
        parametersInUrl.put("character_id", String.valueOf(characterId));
        String body = null;
        String method = "GET";
        TypeReference<List<CalendarInfo>> responseTypeRef = new TypeReference<List<CalendarInfo>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<EventAttendee>>> getCalendarEventAttendees(int characterId, int eventId, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v1/characters/{character_id}/calendar/{event_id}/attendees/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(1);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            parametersInHeaders.put("If-None-Match", val);
        }
        Map<String, String> parametersInQuery = new HashMap<>(0);

        Map<String, String> parametersInUrl = new HashMap<>(2);
        parametersInUrl.put("character_id", String.valueOf(characterId));
        parametersInUrl.put("event_id", String.valueOf(eventId));
        String body = null;
        String method = "GET";
        TypeReference<List<EventAttendee>> responseTypeRef = new TypeReference<List<EventAttendee>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<CalendarEvent>> getCalendarEventInfo(int characterId, int eventId, String ifNoneMatch) {
        String url = "https://esi.evetech.net/v3/characters/{character_id}/calendar/{event_id}/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(1);
        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            parametersInHeaders.put("If-None-Match", val);
        }
        Map<String, String> parametersInQuery = new HashMap<>(0);

        Map<String, String> parametersInUrl = new HashMap<>(2);
        parametersInUrl.put("character_id", String.valueOf(characterId));
        parametersInUrl.put("event_id", String.valueOf(eventId));
        String body = null;
        String method = "GET";
        TypeReference<CalendarEvent> responseTypeRef = new TypeReference<CalendarEvent>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<Void>> respondToCalendarEvent(int characterId, int eventId, EventResponse response) {
        String url = "https://esi.evetech.net/v3/characters/{character_id}/calendar/{event_id}/";
        
        Map<String, String> parametersInHeaders = new HashMap<>(0);
        Map<String, String> parametersInQuery = new HashMap<>(0);

        Map<String, String> parametersInUrl = new HashMap<>(2);
        parametersInUrl.put("character_id", String.valueOf(characterId));
        parametersInUrl.put("event_id", String.valueOf(eventId));
        String body = null;
        body = ApiClientBase.renderToBody(response);
        String method = "PUT";
        TypeReference<Void> responseTypeRef = null;
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseTypeRef);
    }
}
