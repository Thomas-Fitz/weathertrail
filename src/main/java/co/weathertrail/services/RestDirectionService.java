package co.weathertrail.services;

import co.weathertrail.models.Direction;
import co.weathertrail.oldmodels.DirectionRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestDirectionService implements DirectionService{
    public static String API_BASE_URL = "https://maps.googleapis.com/maps/api/directions/json?origin=Chicago,IL&destination=Portsmouth,NH&key=AIzaSyAiKDGatxgh_OdMKnQwKeIk3WL3v1_BVfk";
    private RestTemplate restTemplate = new RestTemplate();



//    private boolean alternatives;
//    private BigInteger arrivalTimeUnix;
//    private BigInteger departureTimeUnix;
//    private List<String> avoids = new ArrayList<>();
//    private String language;
//    private String mode;
//    private String region;
//    private String trafficModel;
//    private String transitMode;
//    private String transitRoutingPreference;
//    private String units;
//    private List<DirectionRequest> waypoints = new ArrayList<>();

    @Override
    public Direction getDirection(DirectionRequest directionRequest) {
//        String urlSuffix = "" + directionRequest.getOrigin() + "&destination=" + directionRequest.getDestination();
//        urlSuffix += "&key=AIzaSyAiKDGatxgh_OdMKnQwKeIk3WL3v1_BVfk";

        Direction directionResponse = restTemplate.getForObject(API_BASE_URL, Direction.class);
        return directionResponse;
    }
}
