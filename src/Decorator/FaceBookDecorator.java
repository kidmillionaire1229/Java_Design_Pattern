package Decorator;

public class FaceBookDecorator extends BaseDecorator{
    public FaceBookDecorator(Notifier wrapee) {
        super(wrapee);
    }

    @Override
    public void send(String message){
        super.send(message);
        System.out.println("[FaceBook] " +message);
    }
}
