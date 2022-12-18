package co.weathertrail.weathertrail.models;

import java.util.ArrayList;
import java.util.List;

// TODO figure out if DirectionsTrafficSpeedEntry in Leg even matters
public class Leg {
    private String endAddress;
    private String startAddress;
    private double[] endLocation = new double[2];
    private double[] startLocation = new double[2];
    private List<Step> steps = new ArrayList<>();
    private List<Waypoint> viaWaypoint = new ArrayList<>();
    private TimeZoneTextValue arrivalTime;
    private TimeZoneTextValue departureTime;
    private String distanceString;
    private int distanceMeters;
    private String durationString;
    private int durationSeconds;
    private String durationInTrafficString;
    private int durationInTrafficSeconds;

    public Leg() {
    }

    public String getEndAddress() {
        return endAddress;
    }

    public void setEndAddress(String endAddress) {
        this.endAddress = endAddress;
    }

    public String getStartAddress() {
        return startAddress;
    }

    public void setStartAddress(String startAddress) {
        this.startAddress = startAddress;
    }

    public double[] getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(double[] endLocation) {
        this.endLocation = endLocation;
    }

    public double[] getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(double[] startLocation) {
        this.startLocation = startLocation;
    }

    public List<Step> getSteps() {
        return steps;
    }

    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }

    public List<Waypoint> getViaWaypoint() {
        return viaWaypoint;
    }

    public void setViaWaypoint(List<Waypoint> viaWaypoint) {
        this.viaWaypoint = viaWaypoint;
    }

    public TimeZoneTextValue getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(TimeZoneTextValue arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public TimeZoneTextValue getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(TimeZoneTextValue departureTime) {
        this.departureTime = departureTime;
    }

    public String getDistanceString() {
        return distanceString;
    }

    public void setDistanceString(String distanceString) {
        this.distanceString = distanceString;
    }

    public int getDistanceMeters() {
        return distanceMeters;
    }

    public void setDistanceMeters(int distanceMeters) {
        this.distanceMeters = distanceMeters;
    }

    public String getDurationString() {
        return durationString;
    }

    public void setDurationString(String durationString) {
        this.durationString = durationString;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    public void setDurationSeconds(int durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    public String getDurationInTrafficString() {
        return durationInTrafficString;
    }

    public void setDurationInTrafficString(String durationInTrafficString) {
        this.durationInTrafficString = durationInTrafficString;
    }

    public int getDurationInTrafficSeconds() {
        return durationInTrafficSeconds;
    }

    public void setDurationInTrafficSeconds(int durationInTrafficSeconds) {
        this.durationInTrafficSeconds = durationInTrafficSeconds;
    }
}
