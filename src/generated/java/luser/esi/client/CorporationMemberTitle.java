package luser.esi.client;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.carrotsearch.hppc.IntArrayList;
import com.carrotsearch.hppc.LongArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public class CorporationMemberTitle implements ApiParameterObject {
    private int characterId;
    /**
     * character_id integer
     */
    public void setCharacterId(int val) {
        characterId = val;
    }
    /**
     * character_id integer
     */
    @JsonProperty("character_id")
    public int getCharacterId() {
        return characterId;
    }
    private IntArrayList titles;
    /**
     * A list of title_id
     */
    public void setTitles(IntArrayList val) {
        titles = val;
    }
    /**
     * A list of title_id
     */
    @JsonProperty("titles")
    public IntArrayList getTitles() {
        return titles;
    }
}
