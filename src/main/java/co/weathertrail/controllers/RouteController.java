package co.weathertrail.controllers;

import co.weathertrail.models.directions.Direction;
import co.weathertrail.models.directions.DirectionRequest;
import co.weathertrail.models.weather.WeatherResult;
import co.weathertrail.services.RestDirectionService;
import co.weathertrail.services.RestOpenMeteoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/directions/")
public class RouteController {
    private RestDirectionService restDirectionService;
    private RestOpenMeteoService restOpenMeteoService;

    public RouteController(RestDirectionService restDirectionService, RestOpenMeteoService restOpenMeteoService){
        this.restDirectionService = restDirectionService;
        this.restOpenMeteoService = restOpenMeteoService;
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


}
