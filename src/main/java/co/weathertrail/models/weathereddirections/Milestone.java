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
    private double humidity;


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

    public void setDistanceInTrip(long distanceInTrip) {
        this.distanceInTrip = distanceInTrip;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getTimezoneAbbreviation() {
        return timezoneAbbreviation;
    }

    public void setTimezoneAbbreviation(String timezoneAbbreviation) {
        this.timezoneAbbreviation = timezoneAbbreviation;
    }

    public double getElevation() {
        return elevation;
    }

    public void setElevation(double elevation) {
        this.elevation = elevation;
    }

    public long getUnixTime() {
        return unixTime;
    }

    public void setUnixTime(long unixTime) {
        this.unixTime = unixTime;
    }

    public String getTempUnit() {
        return tempUnit;
    }

    public void setTempUnit(String tempUnit) {
        this.tempUnit = tempUnit;
    }

    public String getPrecipitationUnit() {
        return precipitationUnit;
    }

    public void setPrecipitationUnit(String precipitationUnit) {
        this.precipitationUnit = precipitationUnit;
    }

    public String getRainUnit() {
        return rainUnit;
    }

    public void setRainUnit(String rainUnit) {
        this.rainUnit = rainUnit;
    }

    public String getShowersUnit() {
        return showersUnit;
    }

    public void setShowersUnit(String showersUnit) {
        this.showersUnit = showersUnit;
    }

    public String getSnowfallUnit() {
        return snowfallUnit;
    }

    public void setSnowfallUnit(String snowfallUnit) {
        this.snowfallUnit = snowfallUnit;
    }

    public String getSnow_depthUnit() {
        return snow_depthUnit;
    }

    public void setSnow_depthUnit(String snow_depthUnit) {
        this.snow_depthUnit = snow_depthUnit;
    }

    public String getVisibilityUnit() {
        return visibilityUnit;
    }

    public void setVisibilityUnit(String visibilityUnit) {
        this.visibilityUnit = visibilityUnit;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getApparentTemp() {
        return apparentTemp;
    }

    public void setApparentTemp(double apparentTemp) {
        this.apparentTemp = apparentTemp;
    }

    public double getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(double precipitation) {
        this.precipitation = precipitation;
    }

    public double getRain() {
        return rain;
    }

    public void setRain(double rain) {
        this.rain = rain;
    }

    public double getShowers() {
        return showers;
    }

    public void setShowers(double showers) {
        this.showers = showers;
    }

    public double getSnowfall() {
        return snowfall;
    }

    public void setSnowfall(double snowfall) {
        this.snowfall = snowfall;
    }

    public double getSnow_depth() {
        return snow_depth;
    }

    public void setSnow_depth(double snow_depth) {
        this.snow_depth = snow_depth;
    }

    public double getVisibility() {
        return visibility;
    }

    public void setVisibility(double visibility) {
        this.visibility = visibility;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }
}
