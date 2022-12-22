package co.weathertrail.services;

import co.weathertrail.models.weather.WeatherResult;

import java.math.BigInteger;

public interface WeatherService {

    WeatherResult getWeatherResult(double latitude, double longitude, long unixTime);
}
