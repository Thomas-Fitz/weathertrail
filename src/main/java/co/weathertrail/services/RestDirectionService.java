package co.weathertrail.services;

import co.weathertrail.KeyConfig;
import co.weathertrail.models.Direction;
import co.weathertrail.models.DirectionRequest;
import jakarta.validation.Valid;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import java.io.ObjectInputFilter;

@Component
public class RestDirectionService implements DirectionService{
    // public static String API_BASE_URL = "https://maps.googleapis.com/maps/api/directions/json?origin=Chicago,IL&destination=Portsmouth,NH&key=AIzaSyAiKDGatxgh_OdMKnQwKeIk3WL3v1_BVfk";
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
