# Weather-Trail

## Getting a Weathered Route
The application runs off of a single REST endpoint. A post to the server (default port 5000) with the following body will respond with a WeatherRoute object.

> curl --location --request POST 'http://localhost:5000/directions/weathertrail/' \
> --header 'Content-Type: application/json' \
> --data-raw '{
>     "destination": "New York, NY",
>     "origin": "Chicago, IL"
> }'
