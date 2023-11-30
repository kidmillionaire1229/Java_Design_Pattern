package Observer;

public class Client {

    public static void main(String[] args) {
        WeatherAPI publisher = new WeatherAPI();
        KoreanUser kanye = new KoreanUser("Kanye");
        KoreanUser snoop = new KoreanUser("Snoop");
        KoreanUser biggie = new KoreanUser("Biggie");

        publisher.register(kanye);
        publisher.register(snoop);
        publisher.register(biggie);

        publisher.measurementChanged();
    }
}
