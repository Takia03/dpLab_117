import java.net.URL;
import java.net.HttpURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class WeatherSatck implements IweatherService{

    String apiKey ="9783cb02f3b0a9c5927e89a863a9382b";
    private String endpoint = "http://api.weatherstack.com/current";

    @Override

    public WeatherData getWeatherbyLocation(String location) {
        try {
            String url_ = endpoint + "?access_key=" + apiKey + "&query=" + location;
            URL url = new URL(url_);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");


            int responseCode = connection.getResponseCode();
            System.out.println("response code: " + responseCode);


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;

    }
}
