package Decorator;

public class Main {
    public static void main(String[] args) {
        boolean facebookEnabled = true;
        boolean smsEnabled = true;
        boolean slackEnabled = false;

        Notifier notifier = new DefaultNotifier();
        System.out.println("notifier = " + notifier);

        if(facebookEnabled)
            notifier = new FaceBookDecorator(notifier);
        System.out.println("notifier = " + notifier);

        if(smsEnabled)
            notifier = new SMSDecorator(notifier);
        System.out.println("notifier = " + notifier);

        if(slackEnabled)
            notifier = new SlackDecorator(notifier);
        System.out.println("notifier = " + notifier);

        Application application = new Application(notifier);
        application.sendMessage("hello world!!");
    }

}
