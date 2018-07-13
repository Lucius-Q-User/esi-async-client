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
    /**
     * collision_file string
     */
    public void setCollisionFile(String val) {
        collisionFile = val;
    }
    /**
     * collision_file string
     */
    @JsonProperty("collision_file")
    public String getCollisionFile() {
        return collisionFile;
    }
    private String graphicFile;
    /**
     * graphic_file string
     */
    public void setGraphicFile(String val) {
        graphicFile = val;
    }
    /**
     * graphic_file string
     */
    @JsonProperty("graphic_file")
    public String getGraphicFile() {
        return graphicFile;
    }
    private int graphicId;
    /**
     * graphic_id integer
     */
    public void setGraphicId(int val) {
        graphicId = val;
    }
    /**
     * graphic_id integer
     */
    @JsonProperty("graphic_id")
    public int getGraphicId() {
        return graphicId;
    }
    private String iconFolder;
    /**
     * icon_folder string
     */
    public void setIconFolder(String val) {
        iconFolder = val;
    }
    /**
     * icon_folder string
     */
    @JsonProperty("icon_folder")
    public String getIconFolder() {
        return iconFolder;
    }
    private String sofDna;
    /**
     * sof_dna string
     */
    public void setSofDna(String val) {
        sofDna = val;
    }
    /**
     * sof_dna string
     */
    @JsonProperty("sof_dna")
    public String getSofDna() {
        return sofDna;
    }
    private String sofFationName;
    /**
     * sof_fation_name string
     */
    public void setSofFationName(String val) {
        sofFationName = val;
    }
    /**
     * sof_fation_name string
     */
    @JsonProperty("sof_fation_name")
    public String getSofFationName() {
        return sofFationName;
    }
    private String sofHullName;
    /**
     * sof_hull_name string
     */
    public void setSofHullName(String val) {
        sofHullName = val;
    }
    /**
     * sof_hull_name string
     */
    @JsonProperty("sof_hull_name")
    public String getSofHullName() {
        return sofHullName;
    }
    private String sofRaceName;
    /**
     * sof_race_name string
     */
    public void setSofRaceName(String val) {
        sofRaceName = val;
    }
    /**
     * sof_race_name string
     */
    @JsonProperty("sof_race_name")
    public String getSofRaceName() {
        return sofRaceName;
    }
}
