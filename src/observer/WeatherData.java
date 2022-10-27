package observer;

public class WeatherData {
    private float temperature;
    private float humidity;
    private float pressure;

    public float getTemperature() {
        return 0.1f;
    }

    public float getHumidity() {
        return 0.1f;
    }

    public float getPressure() {
        return 0.1f;
    }

    public void measurementsChanged() {
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

    }

    private void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }

}
