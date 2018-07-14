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
public class WarAllyInfo implements ApiParameterObject {
    private Integer allianceId;
    /**
     * Alliance ID if and only if this ally is an alliance
     */
    public void setAllianceId(Integer val) {
        allianceId = val;
    }
    /**
     * Alliance ID if and only if this ally is an alliance
     */
    @JsonProperty("alliance_id")
    public Integer getAllianceId() {
        return allianceId;
    }
    private Integer corporationId;
    /**
     * Corporation ID if and only if this ally is a corporation
     */
    public void setCorporationId(Integer val) {
        corporationId = val;
    }
    /**
     * Corporation ID if and only if this ally is a corporation
     */
    @JsonProperty("corporation_id")
    public Integer getCorporationId() {
        return corporationId;
    }
}
