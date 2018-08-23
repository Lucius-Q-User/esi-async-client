package luser.esi.client;

public enum DatasourceEnum {
    TRANQUILITY("tranquility"),
    SINGULARITY("singularity");
    public final String stringValue;
    private DatasourceEnum(String stringValue) {
       this.stringValue = stringValue;
    }
    @Override
    public String toString() {
        return stringValue;
    }
}
