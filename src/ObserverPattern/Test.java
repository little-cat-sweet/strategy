package ObserverPattern;

public class Test {

    public static void main(String[] args) throws InterruptedException {

        WeatherData weatherData = new WeatherData();

        ConcurrentConditionDisplay concurrentConditionDisplay = new ConcurrentConditionDisplay(weatherData);

        Thread.sleep(2000);
        weatherData.setMeasurements(2,3,4);
        System.out.println("-------------------------------");

        WeatherDataFromPackage weatherDataFromPackage = new WeatherDataFromPackage();

        ConcurrentConditionDisplayFromPackage concurrentConditionDisplayFromPackage = new ConcurrentConditionDisplayFromPackage(weatherDataFromPackage);
        Thread.sleep(2000);
        weatherDataFromPackage.setMeasurements(3,45,6);

    }
}
