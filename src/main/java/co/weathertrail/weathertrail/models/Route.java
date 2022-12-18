package co.weathertrail.weathertrail.models;

import java.util.ArrayList;
import java.util.List;

public class Route {
    private double[] northeastLatLangBound = new double[2];
    private double[] southwestLatLangBound = new double[2];
    private String copyrights;
    List<Leg> legs = new ArrayList<>();
    private String polyline;
    private String summary;
    List<String> warnings = new ArrayList<>();
    List<Integer> waypointsOrder = new ArrayList<>();
    private String fareCurrecy;
    private String fareText;
    private double fareValue;

    public Route() {
    }

    public double[] getNortheastLatLangBound() {
        return northeastLatLangBound;
    }

    public void setNortheastLatLangBound(double[] northeastLatLangBound) {
        this.northeastLatLangBound = northeastLatLangBound;
    }

    public double[] getSouthwestLatLangBound() {
        return southwestLatLangBound;
    }

    public void setSouthwestLatLangBound(double[] southwestLatLangBound) {
        this.southwestLatLangBound = southwestLatLangBound;
    }

    public String getCopyrights() {
        return copyrights;
    }

    public void setCopyrights(String copyrights) {
        this.copyrights = copyrights;
    }

    public List<Leg> getLegs() {
        return legs;
    }

    public void setLegs(List<Leg> legs) {
        this.legs = legs;
    }

    public String getPolyline() {
        return polyline;
    }

    public void setPolyline(String polyline) {
        this.polyline = polyline;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public List<String> getWarnings() {
        return warnings;
    }

    public void setWarnings(List<String> warnings) {
        this.warnings = warnings;
    }

    public List<Integer> getWaypointsOrder() {
        return waypointsOrder;
    }

    public void setWaypointsOrder(List<Integer> waypointsOrder) {
        this.waypointsOrder = waypointsOrder;
    }

    public String getFareCurrecy() {
        return fareCurrecy;
    }

    public void setFareCurrecy(String fareCurrecy) {
        this.fareCurrecy = fareCurrecy;
    }

    public String getFareText() {
        return fareText;
    }

    public void setFareText(String fareText) {
        this.fareText = fareText;
    }

    public double getFareValue() {
        return fareValue;
    }

    public void setFareValue(double fareValue) {
        this.fareValue = fareValue;
    }
}
