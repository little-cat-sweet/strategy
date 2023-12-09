package ObserverPattern;

import java.util.Observable;

public class WeatherDataFromPackage extends Observable {

    private float temp;
    private float humidity;
    private float pressure;

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public WeatherDataFromPackage(){

    }
    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temp, float humanity, float pressure){
        this.humidity = humanity;
        this.pressure = pressure;
        this.temp = temp;
        measurementsChanged();
    }
}
