import java.net.URL;
import java.net.HttpURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OpenWeatherAPI implements IweatherService{

    String apiKey= "d8cd760b3580f1e07d438dae55455ab2";
    private String endpoint = "https://api.openweathermap.org/data/2.5/weather";


    @Override
    public WeatherData getWeatherbyLocation(String location) {
        try{
            String url_ = endpoint + "?q=" + location + "&appid=" + apiKey;
            URL url = new URL(url_);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            System.out.println("response code: " + responseCode);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }






}
