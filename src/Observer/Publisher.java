package Observer;

public interface Publisher {
    void register(Subscriber subscriber);
    void remove(Subscriber subscriber);
    void inform();
}
