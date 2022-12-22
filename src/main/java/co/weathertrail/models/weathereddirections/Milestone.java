package co.weathertrail.models.weathereddirections;

public class Milestone {
    private String locationName;
    private double latitude;
    private double longitude;
    private long timeInTrip;
    private long distanceInTrip;
    private long estimatedArrivalTimeUnix;
    private String timezone;
    private String timezoneAbbreviation;
    private double elevation;
    private long unixTime;
    private String tempUnit;
    private String precipitationUnit;
    private String rainUnit;
    private String showersUnit;
    private String snowfallUnit;
    private String snow_depthUnit;
    private String visibilityUnit;
    private double temp;
    private double apparentTemp;
    private double precipitation;
    private double rain;
    private double showers;
    private double snowfall;
    private double snow_depth;
    private double visibility;


    public Milestone() {
    }

    public Milestone(String locationName, double latitude, double longitude, long timeInTrip, long distanceInTrip, long estimatedArrivalTimeUnix) {
        this.locationName = locationName;
        this.latitude = latitude;
        this.longitude = longitude;
        this.timeInTrip = timeInTrip;
        this.distanceInTrip = distanceInTrip;
        this.estimatedArrivalTimeUnix = estimatedArrivalTimeUnix;
    }


    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public long getTimeInTrip() {
        return timeInTrip;
    }

    public void setTimeInTrip(long timeInTrip) {
        this.timeInTrip = timeInTrip;
    }

    public long getDistanceInTrip() {
        return distanceInTrip;
    }

    public void setDistanceInTrip(int distanceInTrip) {
        this.distanceInTrip = distanceInTrip;
    }

    public long getEstimatedArrivalTimeUnix() {
        return estimatedArrivalTimeUnix;
    }

    public void setEstimatedArrivalTimeUnix(long estimatedArrivalTimeUnix) {
        this.estimatedArrivalTimeUnix = estimatedArrivalTimeUnix;
    }
}
