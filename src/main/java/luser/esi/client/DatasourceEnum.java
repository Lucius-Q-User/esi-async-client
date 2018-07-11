package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum DatasourceEnum {
    TRANQUILITY("tranquility"),
    SINGULARITY("singularity");
    public final String stringValue;
    private DatasourceEnum(String stringValue) {
       this.stringValue = stringValue;
    }
    @JsonValue
    public String getStringValue() {
        return stringValue;
    }
    @JsonCreator
    public static DatasourceEnum fromString(String str) {
        if (str == null) {
            return null;
        }
        for (DatasourceEnum self : DatasourceEnum.values()) {
            if (self.stringValue.equals(str)) {
                return self;
            }
        }
        throw new IllegalArgumentException();
    }
}
