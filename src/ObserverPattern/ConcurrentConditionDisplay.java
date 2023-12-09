package ObserverPattern;

public class ConcurrentConditionDisplay implements DisplayElement, Observer{

    private float temp;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public ConcurrentConditionDisplay(Subject weatherData){
        this.weatherData = weatherData;
         weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("I am concurrent display " + ", temp is " + temp + ", humanity is " + humidity + ", pressure is " + pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure= pressure;
        display();
    }
}
