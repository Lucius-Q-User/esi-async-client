package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

public class StarInfo {
    private long age;
    /**
     * Age of star in years
     */
    public void setAge(long val) {
        age = val;
    }
    /**
     * Age of star in years
     */
    @JsonProperty("age")
    public long getAge() {
        return age;
    }
    private float luminosity;
    /**
     * luminosity number
     */
    public void setLuminosity(float val) {
        luminosity = val;
    }
    /**
     * luminosity number
     */
    @JsonProperty("luminosity")
    public float getLuminosity() {
        return luminosity;
    }
    private String name;
    /**
     * name string
     */
    public void setName(String val) {
        name = val;
    }
    /**
     * name string
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }
    private long radius;
    /**
     * radius integer
     */
    public void setRadius(long val) {
        radius = val;
    }
    /**
     * radius integer
     */
    @JsonProperty("radius")
    public long getRadius() {
        return radius;
    }
    private int solarSystemId;
    /**
     * solar_system_id integer
     */
    public void setSolarSystemId(int val) {
        solarSystemId = val;
    }
    /**
     * solar_system_id integer
     */
    @JsonProperty("solar_system_id")
    public int getSolarSystemId() {
        return solarSystemId;
    }
    private SpectralClassEnum spectralClass;
    /**
     * spectral_class string
     */
    public void setSpectralClass(SpectralClassEnum val) {
        spectralClass = val;
    }
    /**
     * spectral_class string
     */
    @JsonProperty("spectral_class")
    public SpectralClassEnum getSpectralClass() {
        return spectralClass;
    }
    private int temperature;
    /**
     * temperature integer
     */
    public void setTemperature(int val) {
        temperature = val;
    }
    /**
     * temperature integer
     */
    @JsonProperty("temperature")
    public int getTemperature() {
        return temperature;
    }
    private int typeId;
    /**
     * type_id integer
     */
    public void setTypeId(int val) {
        typeId = val;
    }
    /**
     * type_id integer
     */
    @JsonProperty("type_id")
    public int getTypeId() {
        return typeId;
    }
    public static enum SpectralClassEnum implements StringyEnum{
        K2_V("K2 V"),
        K4_V("K4 V"),
        G2_V("G2 V"),
        G8_V("G8 V"),
        M7_V("M7 V"),
        K7_V("K7 V"),
        M2_V("M2 V"),
        K5_V("K5 V"),
        M3_V("M3 V"),
        G0_V("G0 V"),
        G7_V("G7 V"),
        G3_V("G3 V"),
        F9_V("F9 V"),
        G5_V("G5 V"),
        F6_V("F6 V"),
        K8_V("K8 V"),
        K9_V("K9 V"),
        K6_V("K6 V"),
        G9_V("G9 V"),
        G6_V("G6 V"),
        G4_VI("G4 VI"),
        G4_V("G4 V"),
        F8_V("F8 V"),
        F2_V("F2 V"),
        F1_V("F1 V"),
        K3_V("K3 V"),
        F0_VI("F0 VI"),
        G1_VI("G1 VI"),
        G0_VI("G0 VI"),
        K1_V("K1 V"),
        M4_V("M4 V"),
        M1_V("M1 V"),
        M6_V("M6 V"),
        M0_V("M0 V"),
        K2_IV("K2 IV"),
        G2_VI("G2 VI"),
        K0_V("K0 V"),
        K5_IV("K5 IV"),
        F5_VI("F5 VI"),
        G6_VI("G6 VI"),
        F6_VI("F6 VI"),
        F2_IV("F2 IV"),
        G3_VI("G3 VI"),
        M8_V("M8 V"),
        F1_VI("F1 VI"),
        K1_IV("K1 IV"),
        F7_V("F7 V"),
        G5_VI("G5 VI"),
        M5_V("M5 V"),
        G7_VI("G7 VI"),
        F5_V("F5 V"),
        F4_VI("F4 VI"),
        F8_VI("F8 VI"),
        K3_IV("K3 IV"),
        F4_IV("F4 IV"),
        F0_V("F0 V"),
        G7_IV("G7 IV"),
        G8_VI("G8 VI"),
        F2_VI("F2 VI"),
        F4_V("F4 V"),
        F7_VI("F7 VI"),
        F3_V("F3 V"),
        G1_V("G1 V"),
        G9_VI("G9 VI"),
        F3_IV("F3 IV"),
        F9_VI("F9 VI"),
        M9_V("M9 V"),
        K0_IV("K0 IV"),
        F1_IV("F1 IV"),
        G4_IV("G4 IV"),
        F3_VI("F3 VI"),
        K4_IV("K4 IV"),
        G5_IV("G5 IV"),
        G3_IV("G3 IV"),
        G1_IV("G1 IV"),
        K7_IV("K7 IV"),
        G0_IV("G0 IV"),
        K6_IV("K6 IV"),
        K9_IV("K9 IV"),
        G2_IV("G2 IV"),
        F9_IV("F9 IV"),
        F0_IV("F0 IV"),
        K8_IV("K8 IV"),
        G8_IV("G8 IV"),
        F6_IV("F6 IV"),
        F5_IV("F5 IV"),
        A0("A0"),
        A0IV("A0IV"),
        A0IV2("A0IV2");
        private final String stringValue;
        private SpectralClassEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @Override
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
    }
}
