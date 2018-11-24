package org.mashup.manage.domain.member.constant.serialize;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import org.mashup.manage.domain.member.constant.Team;

import java.io.IOException;

public class TeamSerialize extends StdSerializer<Team> {

    public TeamSerialize() {
        super(Team.class);
    }

    public TeamSerialize(Class c) {
        super(c);
    }

    @Override
    public void serialize(Team value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        gen.writeStartObject();
        gen.writeFieldName("team");
        gen.writeString(value.name());
        gen.writeEndObject();
    }
}
