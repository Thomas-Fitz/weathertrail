package co.weathertrail.controllers;

import co.weathertrail.models.Direction;
import co.weathertrail.models.DirectionRequest;
import co.weathertrail.services.RestDirectionService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RequestBody;
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

}
