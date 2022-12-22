package co.weathertrail.services;

import co.weathertrail.models.directions.Direction;
import co.weathertrail.models.directions.DirectionRequest;

public interface DirectionService {
    Direction getDirection(DirectionRequest directionRequest);
}
