package Mediator;

public interface Mediator {
    void sendMessage(Component sender, String message);
    void addUser(Component user);
}
