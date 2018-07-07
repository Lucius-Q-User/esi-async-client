package luser.esi.client;

public enum ${enumTag} {
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
    public String getStringValue() {
        return stringValue;
    }
    public static ${enumTag} fromString(String str) {
        if (str == null) {
            return null;
        }
        for (${enumTag} self : ${enumTag}.values()) {
            if (self.stringValue.equals(str)) {
                return self;
            }
        }
        throw new IllegalArgumentException();
    }
}
