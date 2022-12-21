
package co.weathertrail.models.weather;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "time",
    "temperature_2m",
    "relativehumidity_2m",
    "apparent_temperature",
    "precipitation",
    "rain",
    "showers",
    "snowfall",
    "snow_depth",
    "weathercode",
    "visibility"
})
public class HourlyUnits {

    @JsonProperty("time")
    private String time;
    @JsonProperty("temperature_2m")
    private String temperature2m;
    @JsonProperty("relativehumidity_2m")
    private String relativehumidity2m;
    @JsonProperty("apparent_temperature")
    private String apparentTemperature;
    @JsonProperty("precipitation")
    private String precipitation;
    @JsonProperty("rain")
    private String rain;
    @JsonProperty("showers")
    private String showers;
    @JsonProperty("snowfall")
    private String snowfall;
    @JsonProperty("snow_depth")
    private String snowDepth;
    @JsonProperty("weathercode")
    private String weathercode;
    @JsonProperty("visibility")
    private String visibility;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("time")
    public String getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(String time) {
        this.time = time;
    }

    public HourlyUnits withTime(String time) {
        this.time = time;
        return this;
    }

    @JsonProperty("temperature_2m")
    public String getTemperature2m() {
        return temperature2m;
    }

    @JsonProperty("temperature_2m")
    public void setTemperature2m(String temperature2m) {
        this.temperature2m = temperature2m;
    }

    public HourlyUnits withTemperature2m(String temperature2m) {
        this.temperature2m = temperature2m;
        return this;
    }

    @JsonProperty("relativehumidity_2m")
    public String getRelativehumidity2m() {
        return relativehumidity2m;
    }

    @JsonProperty("relativehumidity_2m")
    public void setRelativehumidity2m(String relativehumidity2m) {
        this.relativehumidity2m = relativehumidity2m;
    }

    public HourlyUnits withRelativehumidity2m(String relativehumidity2m) {
        this.relativehumidity2m = relativehumidity2m;
        return this;
    }

    @JsonProperty("apparent_temperature")
    public String getApparentTemperature() {
        return apparentTemperature;
    }

    @JsonProperty("apparent_temperature")
    public void setApparentTemperature(String apparentTemperature) {
        this.apparentTemperature = apparentTemperature;
    }

    public HourlyUnits withApparentTemperature(String apparentTemperature) {
        this.apparentTemperature = apparentTemperature;
        return this;
    }

    @JsonProperty("precipitation")
    public String getPrecipitation() {
        return precipitation;
    }

    @JsonProperty("precipitation")
    public void setPrecipitation(String precipitation) {
        this.precipitation = precipitation;
    }

    public HourlyUnits withPrecipitation(String precipitation) {
        this.precipitation = precipitation;
        return this;
    }

    @JsonProperty("rain")
    public String getRain() {
        return rain;
    }

    @JsonProperty("rain")
    public void setRain(String rain) {
        this.rain = rain;
    }

    public HourlyUnits withRain(String rain) {
        this.rain = rain;
        return this;
    }

    @JsonProperty("showers")
    public String getShowers() {
        return showers;
    }

    @JsonProperty("showers")
    public void setShowers(String showers) {
        this.showers = showers;
    }

    public HourlyUnits withShowers(String showers) {
        this.showers = showers;
        return this;
    }

    @JsonProperty("snowfall")
    public String getSnowfall() {
        return snowfall;
    }

    @JsonProperty("snowfall")
    public void setSnowfall(String snowfall) {
        this.snowfall = snowfall;
    }

    public HourlyUnits withSnowfall(String snowfall) {
        this.snowfall = snowfall;
        return this;
    }

    @JsonProperty("snow_depth")
    public String getSnowDepth() {
        return snowDepth;
    }

    @JsonProperty("snow_depth")
    public void setSnowDepth(String snowDepth) {
        this.snowDepth = snowDepth;
    }

    public HourlyUnits withSnowDepth(String snowDepth) {
        this.snowDepth = snowDepth;
        return this;
    }

    @JsonProperty("weathercode")
    public String getWeathercode() {
        return weathercode;
    }

    @JsonProperty("weathercode")
    public void setWeathercode(String weathercode) {
        this.weathercode = weathercode;
    }

    public HourlyUnits withWeathercode(String weathercode) {
        this.weathercode = weathercode;
        return this;
    }

    @JsonProperty("visibility")
    public String getVisibility() {
        return visibility;
    }

    @JsonProperty("visibility")
    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public HourlyUnits withVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public HourlyUnits withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
