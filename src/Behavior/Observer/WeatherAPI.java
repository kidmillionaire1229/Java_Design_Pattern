package Behavior.Observer;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherAPI implements Publisher{
    private float temp;
    private float humidity;
    private float pressure;

    private List<Subscriber> subscribers = new ArrayList<>();

    private Random generator;

    @Override
    public void register(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void remove(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void inform() {
        for (Subscriber subscriber : subscribers) {
            subscriber.display(this);
        }
    }

    @Override
    public String toString() {
        return "{" +
                "temp=" + temp +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }

    public void measurementChanged() {
        this.generator = new Random();
        this.temp = generator.nextFloat() * 100;
        this.humidity = generator.nextFloat() * 100;
        this.pressure = generator.nextFloat() * 100;
        inform();
    }
}
