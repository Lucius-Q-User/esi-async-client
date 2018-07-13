package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class GhaphicInfo implements ApiParameterObject {
    private String collisionFile;
    public void setCollisionFile(String val) {
        collisionFile = val;
    }
    @JsonProperty("collision_file")
    public String getCollisionFile() {
        return collisionFile;
    }
    private String graphicFile;
    public void setGraphicFile(String val) {
        graphicFile = val;
    }
    @JsonProperty("graphic_file")
    public String getGraphicFile() {
        return graphicFile;
    }
    private int graphicId;
    public void setGraphicId(int val) {
        graphicId = val;
    }
    @JsonProperty("graphic_id")
    public int getGraphicId() {
        return graphicId;
    }
    private String iconFolder;
    public void setIconFolder(String val) {
        iconFolder = val;
    }
    @JsonProperty("icon_folder")
    public String getIconFolder() {
        return iconFolder;
    }
    private String sofDna;
    public void setSofDna(String val) {
        sofDna = val;
    }
    @JsonProperty("sof_dna")
    public String getSofDna() {
        return sofDna;
    }
    private String sofFationName;
    public void setSofFationName(String val) {
        sofFationName = val;
    }
    @JsonProperty("sof_fation_name")
    public String getSofFationName() {
        return sofFationName;
    }
    private String sofHullName;
    public void setSofHullName(String val) {
        sofHullName = val;
    }
    @JsonProperty("sof_hull_name")
    public String getSofHullName() {
        return sofHullName;
    }
    private String sofRaceName;
    public void setSofRaceName(String val) {
        sofRaceName = val;
    }
    @JsonProperty("sof_race_name")
    public String getSofRaceName() {
        return sofRaceName;
    }
}
