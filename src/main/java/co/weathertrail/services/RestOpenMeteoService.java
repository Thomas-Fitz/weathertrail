package co.weathertrail.services;

import co.weathertrail.models.weather.WeatherResult;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


@Component
public class RestOpenMeteoService implements WeatherService{
    private static String API_BASE_URL = "https://api.open-meteo.com/v1/forecast?";
    RestTemplate restTemplate = new RestTemplate();

    @Override
    public WeatherResult getWeatherResult(double latitude, double longitude, long unixTime) {
        String urlLocationSuffix = "latitude=" + latitude + "&longitude=" + longitude;
        String urlMetaDataSuffix = "&hourly=temperature_2m,relativehumidity_2m,apparent_temperature,precipitation,rain,showers,snowfall,snow_depth,weathercode,visibility&temperature_unit=fahrenheit&timeformat=unixtime";
        String urlTimezoneSuffix = "&timezone=CST"; // ""&timezone=America%2FChicago";
        Date date = new Date((long)unixTime * 1000);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = sdf.format(date);


        System.out.println("UNIX TIME == " + unixTime + "DATE == " + formattedDate);
        String urlDateSuffix = "&start_date=" + formattedDate + "&end_date=" + formattedDate;

        System.out.println("" + API_BASE_URL + urlLocationSuffix + urlMetaDataSuffix + urlTimezoneSuffix + urlDateSuffix);



        WeatherResult weatherResult = restTemplate.getForObject(API_BASE_URL + urlLocationSuffix + urlMetaDataSuffix + urlTimezoneSuffix + urlDateSuffix, WeatherResult.class);
        return weatherResult;
    }
}
