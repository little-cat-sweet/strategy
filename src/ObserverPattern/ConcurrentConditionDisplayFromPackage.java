package ObserverPattern;

import java.util.Observable;
import java.util.Observer;

public class ConcurrentConditionDisplayFromPackage implements Observer, DisplayElement{

    private Observable observable;
    private float temp;
    private float humidity;

    public ConcurrentConditionDisplayFromPackage(Observable observable){
        this.observable = observable;
        observable.addObserver( this);
    }

    @Override
    public void display() {
        System.out.println("I am observer, temp is " + temp + ", humidity is " + humidity);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherDataFromPackage){
            WeatherDataFromPackage weatherDataFromPackage = (WeatherDataFromPackage) o;
            this.temp = weatherDataFromPackage.getTemp();
            this.humidity = weatherDataFromPackage.getHumidity();
            display();
        }
    }
}
