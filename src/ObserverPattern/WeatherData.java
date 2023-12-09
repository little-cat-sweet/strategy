package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    private float temp;
    private float humidity;
    private float pressure;
    private final List<Observer> observerList;

    public WeatherData(){
        this.observerList = new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer observer) {
        if(! observerList.contains(observer)){
            observerList.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.update(temp, humidity, pressure);
        }
    }

    public void measurementsChanged(){
        notifyObserver();
    }

    public void setMeasurements(float temp, float humanity, float pressure){
        this.humidity = humanity;
        this.pressure = pressure;
        this.temp = temp;
        measurementsChanged();
    }
}
