package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class MailLabels {
    private List<MailLabel> labels;
    public void setLabels(List<MailLabel> val) {
        labels = val;
    }
    public List<MailLabel> getLabels() {
        return labels;
    }
    private Integer totalUnreadCount;
    public void setTotalUnreadCount(Integer val) {
        totalUnreadCount = val;
    }
    public Integer getTotalUnreadCount() {
        return totalUnreadCount;
    }
    static MailLabels fromJson(Json json) {
        if (json == null) {
            return null;
        }
        MailLabels self = new MailLabels();
        Map<String, Json> js = json.asJsonMap();
        {
            List<Json> jl = js.get("labels").asJsonList();
            List<MailLabel> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.add(MailLabel.fromJson(jl.get(i)));
            }
            self.labels = rt;
        }
        self.totalUnreadCount = ApiClientBase.optGetInteger(js.get("total_unread_count"));
        return self;
    }
}
