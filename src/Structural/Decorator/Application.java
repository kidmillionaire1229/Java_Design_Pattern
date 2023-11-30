package Structural.Decorator;

public class Application {
    private Notifier notifier;

    public Application(Notifier notifier) {
        this.notifier = notifier;
    }

    public void sendMessage(String message){
        this.notifier.send(message);
    }
}
