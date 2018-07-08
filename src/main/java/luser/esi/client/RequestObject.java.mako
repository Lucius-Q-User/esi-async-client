package luser.esi.client;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import mjson.Json;

@SuppressWarnings("unused")
public class ${title} \
%if isRequest or title in specialSnowflakes:
extends JsonConvertible \
%endif
{
<%
        enumsToGenerate = {}
    %>\
    %for pname, ptype in properties.items():
<%
        if ptype["type"] == "string" and "enum" not in ptype:
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
                    typeTag = "int[]"
                else:
                    typeTag = "long[]"
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
    public void set${toUcaseJava(pname)}(${typeTag} val) {
        ${toLcaseJava(pname)} = val;
    }
    public ${typeTag} get${toUcaseJava(pname)}() {
        return ${toLcaseJava(pname)};
    }
    %endfor
    %if isRequest or title in specialSnowflakes:
    @Override
    Json toJson() {
        Json object = Json.object();
        %for pname, ptype in properties.items():
        %if ptype["type"] == "boolean" or ptype["type"] == "integer" or ptype["type"] == "string":
        object.set("${pname}", Json.make(${toLcaseJava(pname)}${".stringValue" if "enum" in ptype else ""}));
        %elif ptype["type"] == "array" and ptype["items"]["type"] == "integer":
        {
            Json arr = Json.array();
            for (int i : ${toLcaseJava(pname)}){
                arr.add(Json.make(i));
            }
            object.set("${pname}", arr);
        }
        %elif ptype["type"] == "array" and ptype["items"]["type"] == "object":
        {
            Json arr = Json.array();
            for (JsonConvertible i : ${toLcaseJava(pname)}){
                arr.add(i.toJson());
            }
            object.set("${pname}", arr);
        }
        %else:
        object.set("${pname}", ApiClient.pass(${toLcaseJava(pname)}));
        %endif
        %endfor
        return object;
    }
    %endif
    %if not isRequest or title in specialSnowflakes:
    static ${title} fromJson(Json json) {
        if (json == null) {
            return null;
        }
        ${title} self = new ${title}();
        Map<String, Json> js = json.asJsonMap();
        %for pname, ptype in properties.items():
        %if ptype["type"] == "boolean":
        self.${toLcaseJava(pname)} = ApiClientBase.optGetBoolean(js.get("${pname}"));
        %elif ptype["type"] == "number" and ptype["format"] == "double":
        self.${toLcaseJava(pname)} = ApiClientBase.optGetDouble(js.get("${pname}"));
        %elif ptype["type"] == "number" and ptype["format"] == "float":
        self.${toLcaseJava(pname)} = ApiClientBase.optGetFloat(js.get("${pname}"));
        %elif ptype["type"] == "integer" and "format" in ptype and ptype["format"] == "int64":
        self.${toLcaseJava(pname)} = ApiClientBase.optGetLong(js.get("${pname}"));
        %elif ptype["type"] == "integer" and ("format" not in ptype or ptype["format"] == "int32"):
        self.${toLcaseJava(pname)} = ApiClientBase.optGetInteger(js.get("${pname}"));
        %elif ptype["type"] == "string" and "enum" in ptype:
        self.${toLcaseJava(pname)} = ${toUcaseJava(pname) + "Enum"}.fromString(ApiClientBase.optGetString(js.get("${pname}")));
        %elif ptype["type"] == "object":
<%
        tag = ptype["title"]
        tag = toUcaseJava(tag)
        tag = generateParameterObject(tag, None, None, None)
        %>\
        self.${toLcaseJava(pname)} = ${tag}.fromJson(js.get("${pname}"));
        %elif ptype["type"] == "array" and ptype["items"]["type"] == "integer" and ptype["items"]["format"] == "int32":
        {
            List<Json> jl = js.get("${pname}").asJsonList();
            int[] rt = new int[jl.size()];
            for (int i = 0; i < jl.size(); i++) {
                rt[i] = jl.get(i).asInteger();
            }
            self.${toLcaseJava(pname)} = rt;
        }
        %elif ptype["type"] == "array" and ptype["items"]["type"] == "integer" and ptype["items"]["format"] == "int64":
        {
            List<Json> jl = js.get("${pname}").asJsonList();
            long[] rt = new long[jl.size()];
            for (int i = 0; i < jl.size(); i++) {
                rt[i] = jl.get(i).asLong();
            }
            self.${toLcaseJava(pname)} = rt;
        }
        %elif ptype["type"] == "array" and ptype["items"]["type"] == "string" and "enum" in ptype["items"]:
        {
            List<Json> jl = js.get("${pname}").asJsonList();
            List<${toUcaseJava(pname) + "Enum"}> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.set(i, ${toUcaseJava(pname) + "Enum"}.fromString(jl.get(i).asString()));
            }
            self.${toLcaseJava(pname)} = rt;
        }
        %elif ptype["type"] == "array" and ptype["items"]["type"] == "object":
<%
        tag = ptype["items"]["title"]
        tag = toUcaseJava(tag)
        tag = generateParameterObject(tag, None, None, isRequest)
        %>\
        {
            List<Json> jl = js.get("${pname}").asJsonList();
            List<${tag}> rt = new ArrayList<>(jl.size());
            for (int i = 0; i < jl.size(); i++) {
                rt.set(i, ${tag}.fromJson(jl.get(i)));
            }
            self.${toLcaseJava(pname)} = rt;
        }

        %else:
        self.${toLcaseJava(pname)} = ApiClientBase.optGetString(js.get("${pname}"));
        %endif
        %endfor
        return self;
    }
    %endif
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
        public final String stringValue;
        private ${tag}(String stringValue) {
            this.stringValue = stringValue;
        }
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