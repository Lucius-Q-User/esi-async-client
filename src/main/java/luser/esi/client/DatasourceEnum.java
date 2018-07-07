package luser.esi.client;

public enum DatasourceEnum {
    TRANQUILITY("tranquility"),
    SINGULARITY("singularity");
    public final String stringValue;
    private DatasourceEnum(String stringValue) {
       this.stringValue = stringValue;
    }
    public String getStringValue() {
        return stringValue;
    }
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
