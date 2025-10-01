//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Observer phoneDisplay = new PhoneDisplay();
        Observer tvDisplay = new TVDisplay();


        weatherStation.addObserver(phoneDisplay);
        weatherStation.addObserver(tvDisplay);


        weatherStation.setWeather("Sunny");
        weatherStation.setWeather("Rainy");
        weatherStation.setWeather("Cloudy");

        // Remove one observer
        weatherStation.removeObserver(tvDisplay);

        // Notify remaining observer
        weatherStation.setWeather("Windy");
    }
}