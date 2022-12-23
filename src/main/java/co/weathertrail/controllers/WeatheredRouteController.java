package co.weathertrail.controllers;

import co.weathertrail.models.directions.Direction;
import co.weathertrail.models.directions.Leg;
import co.weathertrail.models.directions.Route;
import co.weathertrail.models.directions.Step;
import co.weathertrail.models.weather.Hourly;
import co.weathertrail.models.weather.HourlyUnits;
import co.weathertrail.models.weather.WeatherResult;
import co.weathertrail.models.weathereddirections.Milestone;
import co.weathertrail.services.RestOpenMeteoService;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class WeatheredRouteController {
    private Direction direction;
    private RestOpenMeteoService restOpenMeteoService = new RestOpenMeteoService();

    public WeatheredRouteController () {
    }


    public List<Milestone> getWeatheredDirection (Direction direction) {
        List<Milestone> milestoneList = new ArrayList<>();
        int distanceCounter = 0;
        int durationCounter = 0;
        int distanceInTrip = 0;
        int durationInTrip = 0;
        List<Route> routeList = direction.getRoutes();
        Route route = routeList.get(0);
        Leg leg = route.getLegs().get(0);
        List<Step> steps = leg.getSteps();
        long currentTime = Instant.now().getEpochSecond();
        WeatherResult newWeatherResult = restOpenMeteoService.getWeatherResult(steps.get(0).getStartLocation().getLat(), steps.get(0).getStartLocation().getLng(), currentTime);

        // get first milestone and add to array
        milestoneList.add(getMilestoneForLocation(steps.get(0), currentTime, durationCounter, distanceCounter, newWeatherResult));

        // iterate through direction's steps
        for (int i = 1; i < steps.size(); i++) {
            Step step = steps.get(i);
            if (distanceCounter > 16000 || durationCounter > 3600) {
                newWeatherResult = restOpenMeteoService.getWeatherResult(step.getStartLocation().getLat(), step.getStartLocation().getLng(), currentTime + durationInTrip);
            }

            milestoneList.add(getMilestoneForLocation(step, currentTime, currentTime + durationInTrip, distanceInTrip, newWeatherResult));

            distanceCounter += step.getDistance().getValue();
            durationCounter += step.getDuration().getValue();
            distanceInTrip += step.getDistance().getValue();
            durationInTrip += step.getDuration().getValue();
        }

        // return array
        return milestoneList;
    }

    public Milestone getMilestoneForLocation(Step step, long unixTime, long timeInTrip, long distanceInTrip, WeatherResult newWeatherResult) {
        double stepLatitude = step.getStartLocation().getLat();
        double stepLongitude = step.getStartLocation().getLng();

        // get weather for location and time
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
        HourlyUnits unitMap = newWeatherResult.getHourlyUnits();
        Hourly hourlyForecast = newWeatherResult.getHourly();

        // create milestone object with blank weatherresults
        Milestone newMilestone = new Milestone(step.getHtmlInstructions(), step.getManeuver(), step.getDistance(), step.getDuration(), stepLatitude, stepLongitude, timeInTrip, distanceInTrip, unixTime);

        // set milestone units of measurement from WeatherResult object
        newMilestone.setTempUnit(unitMap.getTemperature2m());
        newMilestone.setPrecipitationUnit(unitMap.getPrecipitation());
        newMilestone.setRainUnit(unitMap.getRain());
        newMilestone.setShowersUnit(unitMap.getShowers());
        newMilestone.setSnowfallUnit(unitMap.getSnowfall());
        newMilestone.setSnow_depthUnit(unitMap.getSnowDepth());
        newMilestone.setVisibilityUnit(unitMap.getVisibility());


    // get relevant weatherresult for specific time. add to milestone
        // declare arrayLocationForTime = 0
        int arrayLocationForTime = 0;
        // declare bestTimeOption long = time.get(0)
        long bestTimeOption = time.get(0);
        // loop through newWeatherResult.getTime starting at i = 1
        for (int i = 1; i < time.size(); i++) {
            if (Math.abs(unixTime - bestTimeOption) < Math.abs(unixTime - time.get(i))) {
                arrayLocationForTime = i;
                bestTimeOption = time.get(i);
            }
        }
        // set milestone values using arrayLocationForTime as the index value
        newMilestone.setTemp(hourlyForecast.getTemperature2m().get(arrayLocationForTime));
        newMilestone.setHumidity(hourlyForecast.getRelativehumidity2m().get(arrayLocationForTime));
        newMilestone.setApparentTemp(hourlyForecast.getApparentTemperature().get(arrayLocationForTime));
        newMilestone.setPrecipitation(hourlyForecast.getPrecipitation().get(arrayLocationForTime));
        newMilestone.setRain(hourlyForecast.getRain().get(arrayLocationForTime));
        newMilestone.setShowers(hourlyForecast.getShowers().get(arrayLocationForTime));
        newMilestone.setApparentTemp(hourlyForecast.getApparentTemperature().get(arrayLocationForTime));
        newMilestone.setSnowfall(hourlyForecast.getSnowfall().get(arrayLocationForTime));
        newMilestone.setSnow_depth(hourlyForecast.getSnowDepth().get(arrayLocationForTime));
        newMilestone.setVisibility(hourlyForecast.getVisibility().get(arrayLocationForTime));

        return newMilestone;
    }
}
