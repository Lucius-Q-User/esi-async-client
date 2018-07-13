package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CharacterPortrait implements ApiParameterObject {
    private String px128x128;
    public void setPx128x128(String val) {
        px128x128 = val;
    }
    @JsonProperty("px128x128")
    public String getPx128x128() {
        return px128x128;
    }
    private String px256x256;
    public void setPx256x256(String val) {
        px256x256 = val;
    }
    @JsonProperty("px256x256")
    public String getPx256x256() {
        return px256x256;
    }
    private String px512x512;
    public void setPx512x512(String val) {
        px512x512 = val;
    }
    @JsonProperty("px512x512")
    public String getPx512x512() {
        return px512x512;
    }
    private String px64x64;
    public void setPx64x64(String val) {
        px64x64 = val;
    }
    @JsonProperty("px64x64")
    public String getPx64x64() {
        return px64x64;
    }
}
