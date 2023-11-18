package Decorator;

public class SlackDecorator extends BaseDecorator{
    public SlackDecorator(Notifier wrapee) {
        super(wrapee);
    }

    @Override
    public void send(String message){
        super.send(message);
        System.out.println("[Slack] " +message);
    }
}
