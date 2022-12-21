
package co.weathertrail.models.weather;

import java.util.HashMap;
import java.util.List;
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
public class Hourly {

    @JsonProperty("time")
    private List<Integer> time = null;
    @JsonProperty("temperature_2m")
    private List<Double> temperature2m = null;
    @JsonProperty("relativehumidity_2m")
    private List<Integer> relativehumidity2m = null;
    @JsonProperty("apparent_temperature")
    private List<Double> apparentTemperature = null;
    @JsonProperty("precipitation")
    private List<Double> precipitation = null;
    @JsonProperty("rain")
    private List<Double> rain = null;
    @JsonProperty("showers")
    private List<Double> showers = null;
    @JsonProperty("snowfall")
    private List<Double> snowfall = null;
    @JsonProperty("snow_depth")
    private List<Double> snowDepth = null;
    @JsonProperty("weathercode")
    private List<Integer> weathercode = null;
    @JsonProperty("visibility")
    private List<Double> visibility = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("time")
    public List<Integer> getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(List<Integer> time) {
        this.time = time;
    }

    public Hourly withTime(List<Integer> time) {
        this.time = time;
        return this;
    }

    @JsonProperty("temperature_2m")
    public List<Double> getTemperature2m() {
        return temperature2m;
    }

    @JsonProperty("temperature_2m")
    public void setTemperature2m(List<Double> temperature2m) {
        this.temperature2m = temperature2m;
    }

    public Hourly withTemperature2m(List<Double> temperature2m) {
        this.temperature2m = temperature2m;
        return this;
    }

    @JsonProperty("relativehumidity_2m")
    public List<Integer> getRelativehumidity2m() {
        return relativehumidity2m;
    }

    @JsonProperty("relativehumidity_2m")
    public void setRelativehumidity2m(List<Integer> relativehumidity2m) {
        this.relativehumidity2m = relativehumidity2m;
    }

    public Hourly withRelativehumidity2m(List<Integer> relativehumidity2m) {
        this.relativehumidity2m = relativehumidity2m;
        return this;
    }

    @JsonProperty("apparent_temperature")
    public List<Double> getApparentTemperature() {
        return apparentTemperature;
    }

    @JsonProperty("apparent_temperature")
    public void setApparentTemperature(List<Double> apparentTemperature) {
        this.apparentTemperature = apparentTemperature;
    }

    public Hourly withApparentTemperature(List<Double> apparentTemperature) {
        this.apparentTemperature = apparentTemperature;
        return this;
    }

    @JsonProperty("precipitation")
    public List<Double> getPrecipitation() {
        return precipitation;
    }

    @JsonProperty("precipitation")
    public void setPrecipitation(List<Double> precipitation) {
        this.precipitation = precipitation;
    }

    public Hourly withPrecipitation(List<Double> precipitation) {
        this.precipitation = precipitation;
        return this;
    }

    @JsonProperty("rain")
    public List<Double> getRain() {
        return rain;
    }

    @JsonProperty("rain")
    public void setRain(List<Double> rain) {
        this.rain = rain;
    }

    public Hourly withRain(List<Double> rain) {
        this.rain = rain;
        return this;
    }

    @JsonProperty("showers")
    public List<Double> getShowers() {
        return showers;
    }

    @JsonProperty("showers")
    public void setShowers(List<Double> showers) {
        this.showers = showers;
    }

    public Hourly withShowers(List<Double> showers) {
        this.showers = showers;
        return this;
    }

    @JsonProperty("snowfall")
    public List<Double> getSnowfall() {
        return snowfall;
    }

    @JsonProperty("snowfall")
    public void setSnowfall(List<Double> snowfall) {
        this.snowfall = snowfall;
    }

    public Hourly withSnowfall(List<Double> snowfall) {
        this.snowfall = snowfall;
        return this;
    }

    @JsonProperty("snow_depth")
    public List<Double> getSnowDepth() {
        return snowDepth;
    }

    @JsonProperty("snow_depth")
    public void setSnowDepth(List<Double> snowDepth) {
        this.snowDepth = snowDepth;
    }

    public Hourly withSnowDepth(List<Double> snowDepth) {
        this.snowDepth = snowDepth;
        return this;
    }

    @JsonProperty("weathercode")
    public List<Integer> getWeathercode() {
        return weathercode;
    }

    @JsonProperty("weathercode")
    public void setWeathercode(List<Integer> weathercode) {
        this.weathercode = weathercode;
    }

    public Hourly withWeathercode(List<Integer> weathercode) {
        this.weathercode = weathercode;
        return this;
    }

    @JsonProperty("visibility")
    public List<Double> getVisibility() {
        return visibility;
    }

    @JsonProperty("visibility")
    public void setVisibility(List<Double> visibility) {
        this.visibility = visibility;
    }

    public Hourly withVisibility(List<Double> visibility) {
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

    public Hourly withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
