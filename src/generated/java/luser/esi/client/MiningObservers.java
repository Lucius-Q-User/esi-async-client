package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MiningObservers {
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
        @Override
        public String toString() {
            return stringValue;
        }
    }
}
