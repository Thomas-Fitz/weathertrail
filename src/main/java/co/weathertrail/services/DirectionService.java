package co.weathertrail.services;

import co.weathertrail.models.Direction;
import co.weathertrail.models.DirectionRequest;

public interface DirectionService {
    Direction getDirection(DirectionRequest directionRequest);
}
