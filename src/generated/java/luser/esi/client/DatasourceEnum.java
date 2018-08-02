package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DatasourceEnum implements StringyEnum {
    TRANQUILITY("tranquility"),
    SINGULARITY("singularity");
    public final String stringValue;
    private DatasourceEnum(String stringValue) {
       this.stringValue = stringValue;
    }
    @Override
    @JsonValue
    public String getStringValue() {
        return stringValue;
    }
}
