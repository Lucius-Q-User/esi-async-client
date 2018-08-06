package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NewMailLabel {
    private MailLabelColorEnum color;
    /**
     * Hexadecimal string representing label color, in RGB format
     */
    public void setColor(MailLabelColorEnum val) {
        color = val;
    }
    /**
     * Hexadecimal string representing label color, in RGB format
     */
    @JsonProperty("color")
    public MailLabelColorEnum getColor() {
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
}
