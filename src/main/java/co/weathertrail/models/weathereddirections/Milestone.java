package co.weathertrail.models.weathereddirections;

public class Milestone {
    private int step;
    private String locationName;
    private double latitude;
    private double longitude;
    private long timeInTrip;
    private int distanceInTrip;
    private long estimatedArrivalTimeUnix;

    public Milestone() {
    }

    public Milestone(int step, String locationName, double latitude, double longitude, long timeInTrip, int distanceInTrip, long estimatedArrivalTimeUnix) {
        this.step = step;
        this.locationName = locationName;
        this.latitude = latitude;
        this.longitude = longitude;
        this.timeInTrip = timeInTrip;
        this.distanceInTrip = distanceInTrip;
        this.estimatedArrivalTimeUnix = estimatedArrivalTimeUnix;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
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

    public int getDistanceInTrip() {
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
