package co.weathertrail.oldmodels;

import co.weathertrail.resources.GoogleDirectionsDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.ArrayList;
import java.util.List;

// TODO figure out why geocoded_waypoints in DirectionResponse exist
@JsonDeserialize(using = GoogleDirectionsDeserializer.class)
public class Direction {
    private List<Route> routes = new ArrayList<>();
    private String status;
    private List<String> availableTravelModes = new ArrayList<>();
    private String errorMessage;

    public Direction() {
    }

    public List<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getAvailableTravelModes() {
        return availableTravelModes;
    }

    public void setAvailableTravelModes(List<String> availableTravelModes) {
        this.availableTravelModes = availableTravelModes;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
