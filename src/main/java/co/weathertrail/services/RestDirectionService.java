package co.weathertrail.services;

import co.weathertrail.KeyConfig;
import co.weathertrail.models.directions.Direction;
import co.weathertrail.models.directions.DirectionRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestDirectionService implements DirectionService{
    public static String API_BASE_URL = "https://maps.googleapis.com/maps/api/directions/json?";
    private RestTemplate restTemplate = new RestTemplate();
    private KeyConfig keyConfig = new KeyConfig();
    private String googleMapsApiKey = keyConfig.getGoogleMapsApiKey();



    @Override
    public Direction getDirection(DirectionRequest directionRequest) {

        String urlSuffix = "&origin=" + directionRequest.getOrigin() + "&destination=" + directionRequest.getDestination();
        urlSuffix += "&key=" + googleMapsApiKey;

        Direction directionResponse = restTemplate.getForObject(API_BASE_URL + urlSuffix, Direction.class);
        return directionResponse;
    }
}
