package Decorator;

public class Main {
    public static void main(String[] args) {
        boolean facebookEnabled = false;
        boolean smsEnabled = true;
        boolean slackEnabled = false;

        Notifier notifier = new DefaultNotifier();

        if(facebookEnabled)
            notifier = new FaceBookDecorator(notifier);

        if(smsEnabled)
            notifier = new SMSDecorator(notifier);

        if(slackEnabled)
            notifier = new SlackDecorator(notifier);

        Application application = new Application(notifier);
        application.sendMessage("hello world!!");
    }

}
