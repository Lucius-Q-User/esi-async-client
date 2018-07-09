package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class NewMailContents extends JsonConvertible {
    private int[] labels;
    public void setLabels(int[] val) {
        labels = val;
    }
    public int[] getLabels() {
        return labels;
    }
    private Boolean read;
    public void setRead(Boolean val) {
        read = val;
    }
    public Boolean getRead() {
        return read;
    }
    @Override
    Json toJson() {
        Json object = Json.object();
        {
            Json arr = Json.array();
            for (int i : labels){
                arr.add(Json.make(i));
            }
            object.set("labels", arr);
        }
        object.set("read", Json.make(read));
        return object;
    }
}
