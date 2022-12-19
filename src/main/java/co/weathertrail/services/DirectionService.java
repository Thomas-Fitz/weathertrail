package co.weathertrail.services;

import co.weathertrail.models.Direction;
import co.weathertrail.oldmodels.DirectionRequest;

public interface DirectionService {
    Direction getDirection(DirectionRequest directionRequest);
}
