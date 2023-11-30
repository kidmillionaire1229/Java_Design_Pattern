package Structural.Decorator;

public class SMSDecorator extends BaseDecorator{
    public SMSDecorator(Notifier wrapee) {
        super(wrapee);
    }

    @Override
    public void send(String message){
        super.send(message);
        System.out.println("[SMS] " +message);
    }
}
