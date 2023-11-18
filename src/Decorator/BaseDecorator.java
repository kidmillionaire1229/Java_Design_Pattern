package Decorator;

public class BaseDecorator implements Notifier{
    private Notifier wrapee;

    public BaseDecorator(Notifier wrapee) {
        this.wrapee = wrapee;
    }

    @Override
    public void send(String message) {
        wrapee.send(message);
    }
}
