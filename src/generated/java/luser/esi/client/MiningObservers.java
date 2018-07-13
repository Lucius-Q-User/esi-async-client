package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class MiningObservers implements ApiParameterObject {
    private String lastUpdated;
    /**
     * last_updated string
     */
    public void setLastUpdated(String val) {
        lastUpdated = val;
    }
    /**
     * last_updated string
     */
    @JsonProperty("last_updated")
    public String getLastUpdated() {
        return lastUpdated;
    }
    private long observerId;
    /**
     * The entity that was observing the asteroid field when it was mined.

     */
    public void setObserverId(long val) {
        observerId = val;
    }
    /**
     * The entity that was observing the asteroid field when it was mined.

     */
    @JsonProperty("observer_id")
    public long getObserverId() {
        return observerId;
    }
    private ObserverTypeEnum observerType;
    /**
     * The category of the observing entity
     */
    public void setObserverType(ObserverTypeEnum val) {
        observerType = val;
    }
    /**
     * The category of the observing entity
     */
    @JsonProperty("observer_type")
    public ObserverTypeEnum getObserverType() {
        return observerType;
    }
    public static enum ObserverTypeEnum {
        STRUCTURE("structure");
        private final String stringValue;
        private ObserverTypeEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
        @JsonCreator
        public static ObserverTypeEnum fromString(String str) {
            for (ObserverTypeEnum self : ObserverTypeEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
}
