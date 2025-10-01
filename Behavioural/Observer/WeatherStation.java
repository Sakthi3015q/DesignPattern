import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    List<Observer> observerList=new ArrayList<>();
    String weather="";
    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);

    }

    @Override
    public void notifyUser() {
        for(Observer observer:observerList){
            observer.update(weather);
        }

    }
    public  void setWeather(String weather){
        this.weather=weather;
        notifyUser();
    }
}
