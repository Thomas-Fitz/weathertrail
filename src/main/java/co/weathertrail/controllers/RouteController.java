package co.weathertrail.controllers;

import co.weathertrail.models.Direction;
import co.weathertrail.oldmodels.DirectionRequest;
import co.weathertrail.services.RestDirectionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/directions/")
public class RouteController {
    private RestDirectionService restDirectionService;

    public RouteController(RestDirectionService restDirectionService){
        this.restDirectionService = restDirectionService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Direction getDirection (){
        DirectionRequest directionRequest = new DirectionRequest("destination", "origin");
        Direction response = restDirectionService.getDirection(directionRequest);
        return response;
    }

}
