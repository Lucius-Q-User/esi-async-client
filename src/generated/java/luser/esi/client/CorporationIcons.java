package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CorporationIcons implements ApiParameterObject {
    private String px128x128;
    /**
     * px128x128 string
     */
    public void setPx128x128(String val) {
        px128x128 = val;
    }
    /**
     * px128x128 string
     */
    @JsonProperty("px128x128")
    public String getPx128x128() {
        return px128x128;
    }
    private String px256x256;
    /**
     * px256x256 string
     */
    public void setPx256x256(String val) {
        px256x256 = val;
    }
    /**
     * px256x256 string
     */
    @JsonProperty("px256x256")
    public String getPx256x256() {
        return px256x256;
    }
    private String px64x64;
    /**
     * px64x64 string
     */
    public void setPx64x64(String val) {
        px64x64 = val;
    }
    /**
     * px64x64 string
     */
    @JsonProperty("px64x64")
    public String getPx64x64() {
        return px64x64;
    }
}
