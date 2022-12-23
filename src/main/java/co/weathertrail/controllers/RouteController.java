package co.weathertrail.controllers;

import co.weathertrail.models.directions.Direction;
import co.weathertrail.models.directions.DirectionRequest;
import co.weathertrail.models.weather.WeatherResult;
import co.weathertrail.models.weathereddirections.Milestone;
import co.weathertrail.services.RestDirectionService;
import co.weathertrail.services.RestOpenMeteoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/directions/")
public class RouteController {
    private RestDirectionService restDirectionService;
    private RestOpenMeteoService restOpenMeteoService;
    private WeatheredRouteController weatheredRouteController;

    public RouteController(RestDirectionService restDirectionService, RestOpenMeteoService restOpenMeteoService, WeatheredRouteController weatheredRouteController){
        this.restDirectionService = restDirectionService;
        this.restOpenMeteoService = restOpenMeteoService;
        this.weatheredRouteController = weatheredRouteController;
    }

//    @RequestMapping(method = RequestMethod.GET)
//    public Direction getDirection (){
//        DirectionRequest directionRequest = new DirectionRequest("destination", "origin");
//        Direction response = restDirectionService.getDirection(directionRequest);
//        return response;
//    }

    @RequestMapping(method = RequestMethod.POST)
    public Direction getDirection (@Valid @RequestBody DirectionRequest directionRequest){
        System.out.println("INPUT FROM REQUESTBODY origin = " + directionRequest.getOrigin() + "destination = " + directionRequest.getDestination());
        Direction response = restDirectionService.getDirection(directionRequest);
        return response;
    }

    @RequestMapping(path = "", method = RequestMethod.GET)
    public WeatherResult getWeather (@RequestParam double latitude, @RequestParam double longitude, @RequestParam long unixTime){
        WeatherResult response = restOpenMeteoService.getWeatherResult(latitude, longitude, unixTime);
        return response;
    }

    @RequestMapping(path = "weathertrail/", method = RequestMethod.POST)
    public List<Milestone> getWeatherOnRoute (@Valid @RequestBody DirectionRequest directionRequest){
        System.out.println("INPUT FROM REQUESTBODY origin = " + directionRequest.getOrigin() + "destination = " + directionRequest.getDestination());
        Direction newDirection = restDirectionService.getDirection(directionRequest);
        List<Milestone> milestoneList = weatheredRouteController.getWeatheredDirection(newDirection);
        return milestoneList;
    }


}
