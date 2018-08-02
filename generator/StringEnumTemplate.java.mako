package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ${enumTag} implements StringyEnum {
    %for case in enumCases:
    ${case.upper().replace("-", "_")}("${case}")\
    %if not loop.last:
,
    %else:
;
    %endif
    %endfor
    public final String stringValue;
    private ${enumTag}(String stringValue) {
       this.stringValue = stringValue;
    }
    @Override
    @JsonValue
    public String getStringValue() {
        return stringValue;
    }
}
