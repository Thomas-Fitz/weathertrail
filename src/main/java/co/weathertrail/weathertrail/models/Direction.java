package co.weathertrail.weathertrail.models;

import java.util.ArrayList;
import java.util.List;

// TODO figure out why geocoded_waypoints in DirectionResponse exist
public class Direction {
    private List<Route> routes = new ArrayList<>();
    private String directionStatus;
    private List<String> availableTravelModes = new ArrayList<>();
    private String errorMessage;
}
