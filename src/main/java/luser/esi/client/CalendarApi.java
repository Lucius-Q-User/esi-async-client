package luser.esi.client;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import mjson.Json;

@SuppressWarnings("unused")
public class CalendarApi {
    private ApiClient apiClient;
    CalendarApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    
    public CompletableFuture<EsiResponseWrapper<List<CalendarInfo>>> getCharactersCharacterIdCalendar(int characterId, DatasourceEnum datasource, Integer fromEvent, String ifNoneMatch) {
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
        Function<String, List<CalendarInfo>> responseParser = (resp) -> {
            List<Json> js = Json.read(resp).asJsonList();
            List<CalendarInfo> ret = new ArrayList<>(js.size());
            for (Json jo : js) {
                ret.add(CalendarInfo.fromJson(jo));
            }
            return ret;
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<List<EventAttendee>>> getCharactersCharacterIdCalendarEventIdAttendees(int characterId, DatasourceEnum datasource, int eventId, String ifNoneMatch) {
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
        Function<String, List<EventAttendee>> responseParser = (resp) -> {
            List<Json> js = Json.read(resp).asJsonList();
            List<EventAttendee> ret = new ArrayList<>(js.size());
            for (Json jo : js) {
                ret.add(EventAttendee.fromJson(jo));
            }
            return ret;
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<CalendarEvent>> getCharactersCharacterIdCalendarEventId(int characterId, DatasourceEnum datasource, int eventId, String ifNoneMatch) {
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
        Function<String, CalendarEvent> responseParser = (resp) -> {
            Json js = Json.read(resp);
            return CalendarEvent.fromJson(js);
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
    
    public CompletableFuture<EsiResponseWrapper<Void>> putCharactersCharacterIdCalendarEventId(int characterId, DatasourceEnum datasource, int eventId, EventResponse response) {
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
        Function<String, Void> responseParser = (resp) -> {
            return null;
        };
        boolean needsAuth = true;
        return apiClient.invokeApi(url, parametersInHeaders, parametersInUrl, parametersInQuery, body, method, needsAuth, responseParser);
    }
}
