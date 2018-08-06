package luser.esi.client;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.deser.Deserializers;

class EnumDeserModule extends Module {

    @Override
    public Version version() {
        return Version.unknownVersion();
    }

    @Override
    public void setupModule(SetupContext context) {
        context.addDeserializers(new DeserializerHolder());
    }

    @Override
    public String getModuleName() {
        return EnumDeserModule.class.getCanonicalName();
    }
    private static class DeserializerHolder extends Deserializers.Base {
        @Override
        public JsonDeserializer<?> findEnumDeserializer(Class<?> type, DeserializationConfig config,
                BeanDescription beanDesc) throws JsonMappingException {
            if (!StringyEnum.class.isAssignableFrom(type)) {
                return null;
            }
            return new EnumDeserialzier<>(type);
        }
    }
    private static class EnumDeserialzier<T> extends JsonDeserializer<T> {
        private Class<T> clazz;
        public EnumDeserialzier(Class<T> clazz) {
            this.clazz = clazz;
        }
        @Override
        public T deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            T[] csts = clazz.getEnumConstants();
            String str = p.readValueAs(String.class);
            for (T cst : csts) {
                StringyEnum vl = (StringyEnum)cst;
                if (vl.getStringValue().equals(str)) {
                    return cst;
                }
            }

            return null;
        }
    }

}
