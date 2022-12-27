package co.weathertrail.resources;

import co.weathertrail.models.directions.Direction;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

public class GoogleDirectionsDeserializer extends StdDeserializer {
    protected GoogleDirectionsDeserializer(Class vc) {
        super(vc);
    }

    protected GoogleDirectionsDeserializer(JavaType valueType) {
        super(valueType);
    }

    protected GoogleDirectionsDeserializer(StdDeserializer src) {
        super(src);
    }

//    private List<Route> routes = new ArrayList<>();
//    private String directionStatus;
//    private List<String> availableTravelModes = new ArrayList<>();
//    private String errorMessage;

    @Override
    public Direction deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        Direction direction = new Direction();
        JsonNode node = jsonParser.getCodec().readTree(jsonParser);
        direction.setStatus(node.get("status").asText());


        return direction;
    }
}
