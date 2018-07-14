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
public class NewMailLabel implements ApiParameterObject {
    private ColorEnum color;
    /**
     * Hexadecimal string representing label color, in RGB format
     */
    public void setColor(ColorEnum val) {
        color = val;
    }
    /**
     * Hexadecimal string representing label color, in RGB format
     */
    @JsonProperty("color")
    public ColorEnum getColor() {
        return color;
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
    public static enum ColorEnum {
        _0000FE("#0000fe"),
        _006634("#006634"),
        _0099FF("#0099ff"),
        _00FF33("#00ff33"),
        _01FFFF("#01ffff"),
        _349800("#349800"),
        _660066("#660066"),
        _666666("#666666"),
        _999999("#999999"),
        _99FFFF("#99ffff"),
        _9A0000("#9a0000"),
        _CCFF9A("#ccff9a"),
        _E6E6E6("#e6e6e6"),
        _FE0000("#fe0000"),
        _FF6600("#ff6600"),
        _FFFF01("#ffff01"),
        _FFFFCD("#ffffcd"),
        _FFFFFF("#ffffff");
        private final String stringValue;
        private ColorEnum(String stringValue) {
            this.stringValue = stringValue;
        }
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
        @JsonCreator
        public static ColorEnum fromString(String str) {
            for (ColorEnum self : ColorEnum.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
}
