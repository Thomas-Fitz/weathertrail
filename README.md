# Weather-Trail

## Getting a Weathered Route
The application runs off of a single REST endpoint. A post to the server (default port 5000) with the following body will respond with a WeatherRoute object.

> curl --location --request POST 'http://localhost:5000/directions/weathertrail/' \
> --header 'Content-Type: application/json' \
> --data-raw '{
>     "destination": "New York, NY",
>     "origin": "Chicago, IL"
> }'


## API Key Config
A KeyConfig class file must be created and stored in the co.weathertrail directory.

    public class KeyConfig {
        // Google API key
        private String googleMapsApiKey = "";

        // Client Keys
        private String appUserName = "";
        private String appPassword = "";

        public KeyConfig() {
            this.googleMapsApiKey = googleMapsApiKey;
        }

        public String getGoogleMapsApiKey() {
            return googleMapsApiKey;
        }

        public String getAppUserName() {
            return appUserName;
        }

        public String getAppPassword() {
            return appPassword;
        }
    }

## Models
**Direction**
    Maps to a set of directions from the Google Directions API: https://developers.google.com/maps/documentation/directions/overview

    Locations along the route along with distances, times, and instructions are stored in the *Step*.

    Direction > Route > Leg > Step

**DirectionRequest**
    Origin and destination for the route.

**WeatherResult**
    Holds a 24 window of weather details for a specified geocoordinate. Provided by OpenMeteo: https://open-meteo.com/en/docs

**weathereddirections/Milestone**
    An array of direction steps with metadata about the weather forecasted to the time that the user is projected to reach that point in the journey.
    
    Includes all step details for driving instructions in adddition to temp, humidity, visibility, etc...

## Views
    REST only application for the time being. Frontend in-progress. See "Getting a Weathered Route"

## Controllers
    **RouteController**
        Contains client facing endpoints. /weathertrail/ to get a set of weathered milestones along a route.

    **WeatheredRouteController**
    getWeatheredDirection(Direction direction):
        Takes a set of directions provided by the Google Maps API (see RestDirectionService) and plots Milestones with weather along the route. Returns an array of Milestones.

    getMilestoneForLocation(Step step, long unixTime, long timeInTrip, long distanceInTrip, WeatherResult newWeatherResult):
        Receive details of a step from a Direction object. Create a milestone object for the step. Get weather details for the new Milestone. Return a complete Milestone object.

**WeatheredRouteController**

## Services
    **RestDirectionService**
        Calls Google Directions endpoint to get directions from an origin to a destination. Maps to a Direction object.

    **RestOpenMeteoService**
        Calls OpenMeteo to get weather for geocoordinates. Maps to a WeatherResult object.
