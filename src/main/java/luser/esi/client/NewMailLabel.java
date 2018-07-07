package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class NewMailLabel extends JsonConvertible {
    private ColorEnum color;
    public void setColor(ColorEnum val) {
        color = val;
    }
    public ColorEnum getColor() {
        return color;
    }
    private String name;
    public void setName(String val) {
        name = val;
    }
    public String getName() {
        return name;
    }
    @Override
    Json toJson() {
        Json object = Json.object();
        object.set("color", Json.make(color.stringValue));
        object.set("name", Json.make(name));
        return object;
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
        public final String stringValue;
        private ColorEnum(String stringValue) {
            this.stringValue = stringValue;
        }
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
