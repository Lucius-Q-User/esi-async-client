package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class GhaphicInfo {
    private String collisionFile;
    public void setCollisionFile(String val) {
        collisionFile = val;
    }
    public String getCollisionFile() {
        return collisionFile;
    }
    private String graphicFile;
    public void setGraphicFile(String val) {
        graphicFile = val;
    }
    public String getGraphicFile() {
        return graphicFile;
    }
    private int graphicId;
    public void setGraphicId(int val) {
        graphicId = val;
    }
    public int getGraphicId() {
        return graphicId;
    }
    private String iconFolder;
    public void setIconFolder(String val) {
        iconFolder = val;
    }
    public String getIconFolder() {
        return iconFolder;
    }
    private String sofDna;
    public void setSofDna(String val) {
        sofDna = val;
    }
    public String getSofDna() {
        return sofDna;
    }
    private String sofFationName;
    public void setSofFationName(String val) {
        sofFationName = val;
    }
    public String getSofFationName() {
        return sofFationName;
    }
    private String sofHullName;
    public void setSofHullName(String val) {
        sofHullName = val;
    }
    public String getSofHullName() {
        return sofHullName;
    }
    private String sofRaceName;
    public void setSofRaceName(String val) {
        sofRaceName = val;
    }
    public String getSofRaceName() {
        return sofRaceName;
    }
    static GhaphicInfo fromJson(Json json) {
        if (json == null) {
            return null;
        }
        GhaphicInfo self = new GhaphicInfo();
        Map<String, Json> js = json.asJsonMap();
        self.collisionFile = ApiClientBase.optGetString(js.get("collision_file"));
        self.graphicFile = ApiClientBase.optGetString(js.get("graphic_file"));
        self.graphicId = ApiClientBase.optGetInteger(js.get("graphic_id"));
        self.iconFolder = ApiClientBase.optGetString(js.get("icon_folder"));
        self.sofDna = ApiClientBase.optGetString(js.get("sof_dna"));
        self.sofFationName = ApiClientBase.optGetString(js.get("sof_fation_name"));
        self.sofHullName = ApiClientBase.optGetString(js.get("sof_hull_name"));
        self.sofRaceName = ApiClientBase.optGetString(js.get("sof_race_name"));
        return self;
    }
}
