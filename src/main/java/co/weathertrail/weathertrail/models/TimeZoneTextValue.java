package co.weathertrail.weathertrail.models;

public class TimeZoneTextValue {
    private String timeText;
    private String timezone;
    private int unixTime;

    public TimeZoneTextValue() {
    }

    public TimeZoneTextValue(String timeText, String timezone, int unixTime) {
        this.timeText = timeText;
        this.timezone = timezone;
        this.unixTime = unixTime;
    }

    public String getTimeText() {
        return timeText;
    }

    public void setTimeText(String timeText) {
        this.timeText = timeText;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public int getUnixTime() {
        return unixTime;
    }

    public void setUnixTime(int unixTime) {
        this.unixTime = unixTime;
    }
}
