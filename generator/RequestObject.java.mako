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
public class ${title} implements ApiParameterObject {
<%
        enumsToGenerate = {}
    %>\
    %for pname, ptype in properties.items():
<%
        if ptype["type"] == "string" and "format" in ptype and ptype["format"] == "date-time":
            typeTag = "Instant"
        elif ptype["type"] == "string" and "enum" not in ptype:
            typeTag = "String"
        elif ptype["type"] == "string" and "enum" in ptype:
            typeTag = toUcaseJava(pname) + "Enum"
            enumsToGenerate[typeTag] = ptype["enum"]
        elif ptype["type"] == "integer":
            if "format" not in ptype or  ptype["format"] == "int32":
                if pname in required:
                    typeTag = "int"
                else:
                    typeTag = "Integer"
            elif ptype["format"] == "int64":
                if pname in required:
                    typeTag = "long"
                else:
                    typeTag = "Long"
        elif ptype["type"] == "number":
            if "format" not in ptype or ptype["format"] == "double":
                if pname in required:
                    typeTag = "double"
                else:
                    typeTag = "Double"
            elif ptype["format"] == "float":
                if pname in required:
                    typeTag = "float"
                else:
                    typeTag = "Float"
        elif ptype["type"] == "boolean":
            if pname in required:
                typeTag = "boolean"
            else:
                typeTag = "Boolean"
        elif ptype["type"] == "array":
            items = ptype["items"]
            if items["type"] == "integer":
                if "format" not in items or items["format"] == "int32":
                    typeTag = "IntArrayList"
                else:
                    typeTag = "LongArrayList"
            elif items["type"] == "object":
                tag = items["title"]
                tag = toUcaseJava(tag)
                tag = generateParameterObject(tag, items["properties"], items["required"] if "required" in items else [], isRequest)
                typeTag = "List<" + tag + ">"
            elif items["type"] == "string" and "enum" in items:
                tag = toUcaseJava(pname) + "Enum"
                enumsToGenerate[tag] = items["enum"]
                typeTag = "List<" + tag + ">"
            else:
                print(par)
                typeTag = "BLANK"
        elif ptype["type"] == "object":
            tag = ptype["title"]
            tag = toUcaseJava(tag)
            tag = generateParameterObject(tag, ptype["properties"], ptype["required"] if "required" in ptype else [], isRequest)
            typeTag = tag
        else:
            print(ptype)
            typeTag = "BLANK"
    %>\
    private ${typeTag} ${toLcaseJava(pname)};
    /**
     * ${ptype["description"]}
     */
    public void set${toUcaseJava(pname)}(${typeTag} val) {
        ${toLcaseJava(pname)} = val;
    }
    /**
     * ${ptype["description"]}
     */
    @JsonProperty("${pname}")
    public ${typeTag} get${toUcaseJava(pname)}() {
        return ${toLcaseJava(pname)};
    }
    %endfor
    %for tag, members in enumsToGenerate.items():
    public static enum ${tag} {
        %for member in members:
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
        private final String stringValue;
        private ${tag}(String stringValue) {
            this.stringValue = stringValue;
        }
        @JsonValue
        public String getStringValue() {
            return stringValue;
        }
        @JsonCreator
        public static ${tag} fromString(String str) {
            for (${tag} self : ${tag}.values()) {
                if (self.stringValue.equals(str)) {
                    return self;
                }
            }
            throw new IllegalArgumentException();
        }
    }
    %endfor
}
