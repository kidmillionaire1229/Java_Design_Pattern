package Structural.Decorator;

public class Main {
    public static void main(String[] args) {
        boolean facebookEnabled = true;
        boolean smsEnabled = true;
        boolean slackEnabled = false;

        Notifier notifier = new DefaultNotifier();
        System.out.println("notifier = " + notifier);

        /**
         * 처음에 생성한 Notifier가 DefaultNotifier인데 생성자 주입시 super인 BaseDecorator 호출
         * FacebookDecorator의 send에서는 무조건 super인 BaseDecorator send호출
         *  => DefaultNotifier의 send 호출 => Email 기본 send 
         */

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
