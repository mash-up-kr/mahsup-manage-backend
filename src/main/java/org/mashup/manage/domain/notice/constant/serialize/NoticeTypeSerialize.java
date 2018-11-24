package org.mashup.manage.domain.notice.constant.serialize;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import org.mashup.manage.domain.notice.constant.NoticeType;

import java.io.IOException;

public class NoticeTypeSerialize extends StdSerializer<NoticeType> {

    public NoticeTypeSerialize() {
        super(NoticeType.class);
    }

    public NoticeTypeSerialize(Class c) {
        super(c);
    }

    @Override
    public void serialize(NoticeType value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        gen.writeStartObject();
        gen.writeFieldName("type");
        gen.writeString(value.name());
        gen.writeEndObject();
    }
}
