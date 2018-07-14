package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AllianceIcons implements ApiParameterObject {
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
