package luser.esi.client;

import java.util.List;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.concurrent.CompletableFuture;
import org.asynchttpclient.Dsl;
import org.asynchttpclient.RequestBuilder;

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
        String url = "https://esi.evetech.net/v1/characters/" + characterId + "/calendar/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        
        if (fromEvent != null) {
            String val = String.valueOf(fromEvent);
            builder.addQueryParam("from_event", val);
        }
        TypeReference<List<CalendarInfo>> responseTypeRef = new TypeReference<List<CalendarInfo>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<List<EventAttendee>>> getCalendarEventAttendees(int characterId, int eventId, String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v1/characters/" + characterId + "/calendar/" + eventId + "/attendees/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<List<EventAttendee>> responseTypeRef = new TypeReference<List<EventAttendee>>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<CalendarEvent>> getCalendarEventInfo(int characterId, int eventId, String ifNoneMatch) {         
        String url = "https://esi.evetech.net/v3/characters/" + characterId + "/calendar/" + eventId + "/";
        RequestBuilder builder = Dsl.get(url);

        if (ifNoneMatch != null) {
            String val = ifNoneMatch;
            builder.addHeader("If-None-Match", val);
        }
        TypeReference<CalendarEvent> responseTypeRef = new TypeReference<CalendarEvent>() {};
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
    
    @Override
    public CompletableFuture<EsiResponseWrapper<Void>> respondToCalendarEvent(int characterId, int eventId, EventResponse response) {         
        String url = "https://esi.evetech.net/v3/characters/" + characterId + "/calendar/" + eventId + "/";
        RequestBuilder builder = Dsl.put(url);

        builder.setBody(ApiClientBase.renderToBody(response));
        TypeReference<Void> responseTypeRef = null;
        boolean needsAuth = true;
        return apiClient.invokeApi(builder, needsAuth, responseTypeRef);
    }
}
