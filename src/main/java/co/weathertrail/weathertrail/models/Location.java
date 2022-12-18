package co.weathertrail.weathertrail.models;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Location {
    private String destination;
    private String origin;
    private boolean alternatives;
    private BigInteger arrivalTimeUnix;
    private BigInteger departureTimeUnix;
    private List<String> avoids = new ArrayList<>();
    private String language;
    private String mode;
    private String region;
    private String trafficModel;
    private String transitMode;
    private String transitRoutingPreference;
    private String units;
    private List<Location> waypoints = new ArrayList<>();


}
