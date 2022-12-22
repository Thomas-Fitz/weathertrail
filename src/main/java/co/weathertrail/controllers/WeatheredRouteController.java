package co.weathertrail.controllers;

import co.weathertrail.models.directions.Direction;
import co.weathertrail.models.directions.Step;
import co.weathertrail.models.weather.WeatherResult;
import co.weathertrail.models.weathereddirections.Milestone;
import co.weathertrail.services.RestOpenMeteoService;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WeatheredRouteController {
    private Direction direction;
    private RestOpenMeteoService restOpenMeteoService = new RestOpenMeteoService();

    public WeatheredRouteController () {
    }

    public List<Milestone> getWeatheredDirection (Direction direction) {
        // declare output milestone list

        // declare distance counter

        // declare duration counter

        // get first milestone and add to array

        // iterate through direction's steps
            // if distanceCounter > n || durationCounter > n
                // get new milestone and add to array
                // reset distanceCounter
                // reset durationCounter
                // continue
            // distanceCounter += step distance
            // durationCounter += step duration

        // return array
        return null;
    }

    public Milestone getMilestoneForLocation(Step step, long unixTime, long timeInTrip, long distanceInTrip) {
        double stepLatitude = step.getStartLocation().getLat();
        double stepLongitude = step.getStartLocation().getLat();

        // get weather for location and time
        WeatherResult newWeatherResult = restOpenMeteoService.getWeatherResult(stepLatitude, stepLongitude, unixTime);
        List<Integer> time = newWeatherResult.getHourly().getTime();
        List<Double> temperature2m = newWeatherResult.getHourly().getTemperature2m();
        List<Integer> relativehumidity2m = newWeatherResult.getHourly().getRelativehumidity2m();
        List<Double> apparentTemperature = newWeatherResult.getHourly().getApparentTemperature();
        List<Double> precipitation = newWeatherResult.getHourly().getPrecipitation();
        List<Double> rain = newWeatherResult.getHourly().getRain();
        List<Double> showers = newWeatherResult.getHourly().getShowers();
        List<Double> snowfall = newWeatherResult.getHourly().getSnowfall();
        List<Double> snowDepth = newWeatherResult.getHourly().getSnowDepth();
        List<Integer> weathercode = newWeatherResult.getHourly().getWeathercode();
        List<Double> visibility = newWeatherResult.getHourly().getVisibility();

        // create milestone object with blank weatherresults
        Milestone newMilestone = new Milestone(step.getHtmlInstructions(), stepLatitude, stepLongitude, timeInTrip, distanceInTrip, unixTime);

        // set milestone units
        // get relevant weatherresult for specific time. add to milestone
            // declare arrayLocationForTime = 0
            // declare bestTimeOption long = time.get(0)
            // loop through newWeatherResult.getTime starting at i = 1
                // if ABS(unixtime - bestTimeOption) < ABS(unixtime - time.get(i))
                    // arrayLocationForTime = i
                    // bestTimeOption = time.get(i)
        // set milestone values using arrayLocationForTime as the index value

        return newMilestone;
    }
}
