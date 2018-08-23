package luser.esi.client;

public enum ${enumTag} {
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
    public String toString() {
        return stringValue;
    }
}
