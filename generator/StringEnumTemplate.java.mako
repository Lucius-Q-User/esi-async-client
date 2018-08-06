package luser.esi.client;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ${enumTag} implements StringyEnum {
    %for member in enumCases:
<%
    memberTag = member
    if memberTag[0].isnumeric():
        memberTag = "_" + memberTag
    memberTag = memberTag.upper().replace("-", "_").replace("#", "_").replace(" ", "_")
    %>\
    ${memberTag}("${member}")\
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
