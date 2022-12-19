package co.weathertrail.oldmodels;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class DirectionRequest {
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
    private List<DirectionRequest> waypoints = new ArrayList<>();

    public DirectionRequest(String destination, String origin) {
        this.destination = destination;
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public boolean isAlternatives() {
        return alternatives;
    }

    public void setAlternatives(boolean alternatives) {
        this.alternatives = alternatives;
    }

    public BigInteger getArrivalTimeUnix() {
        return arrivalTimeUnix;
    }

    public void setArrivalTimeUnix(BigInteger arrivalTimeUnix) {
        this.arrivalTimeUnix = arrivalTimeUnix;
    }

    public BigInteger getDepartureTimeUnix() {
        return departureTimeUnix;
    }

    public void setDepartureTimeUnix(BigInteger departureTimeUnix) {
        this.departureTimeUnix = departureTimeUnix;
    }

    public List<String> getAvoids() {
        return avoids;
    }

    public void setAvoids(List<String> avoids) {
        this.avoids = avoids;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getTrafficModel() {
        return trafficModel;
    }

    public void setTrafficModel(String trafficModel) {
        this.trafficModel = trafficModel;
    }

    public String getTransitMode() {
        return transitMode;
    }

    public void setTransitMode(String transitMode) {
        this.transitMode = transitMode;
    }

    public String getTransitRoutingPreference() {
        return transitRoutingPreference;
    }

    public void setTransitRoutingPreference(String transitRoutingPreference) {
        this.transitRoutingPreference = transitRoutingPreference;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public List<DirectionRequest> getWaypoints() {
        return waypoints;
    }

    public void setWaypoints(List<DirectionRequest> waypoints) {
        this.waypoints = waypoints;
    }
}
