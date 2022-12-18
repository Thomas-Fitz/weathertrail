package co.weathertrail.weathertrail.models;

/*
 Each element in the steps array defines a single step of the calculated directions.
 A step is the most atomic unit of a direction's route, containing a single step describing a specific, single instruction on the journey. E.g. "Turn left at W. 4th St."
 The step not only describes the instruction but also contains distance and duration information relating to how this step relates to the following step.
 For example, a step denoted as "Merge onto I-80 West" may contain a duration of "37 miles" and "40 minutes," indicating that the next step is 37 miles/40 minutes from this step.

When using the Directions API to search for transit directions, the steps array will include additional transit details in the form of a transit_details array.
If the directions include multiple modes of transportation, detailed directions will be provided for walking or driving steps in an inner steps array.
For example, a walking step will include directions from the start and end locations: "Walk to Innes Ave & Fitch St".
That step will include detailed walking directions for that route in the inner steps array, such as: "Head north-west", "Turn left onto Arelious Walker", and "Turn left onto Innes Ave".

 */

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Step {
    private String durationString;
    private int durationSeconds;
    private double[] endLocation = new double[2];
    private String htmlInstructions;
    private String polyline;
    private double[] startLocation = new double[2];
    private String travel_mode;
    private String distanceString;
    private int distanceMeters;
    private String maneuver;
    private List<Step> substepList = new ArrayList<>();

    public Step() {
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


    public String getHtmlInstructions() {
        return htmlInstructions;
    }

    public void setHtmlInstructions(String htmlInstructions) {
        this.htmlInstructions = htmlInstructions;
    }

    public String getPolyline() {
        return polyline;
    }

    public void setPolyline(String polyline) {
        this.polyline = polyline;
    }


    public String getTravel_mode() {
        return travel_mode;
    }

    public void setTravel_mode(String travel_mode) {
        this.travel_mode = travel_mode;
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

    public String getManeuver() {
        return maneuver;
    }

    public void setManeuver(String maneuver) {
        this.maneuver = maneuver;
    }

    public List<Step> getSubstepList() {
        return substepList;
    }

    public void setSubstepList(List<Step> substepList) {
        this.substepList = substepList;
    }
}
