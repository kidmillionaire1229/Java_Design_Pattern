package CoR.After;

public class Client {

    public static void main(String[] args) {
        Handler handler1 = new ProtocolHandler();
        Handler handler2 = new DomainHandler();
        Handler handler3 = new PortHandler();

        handler1.setNext(handler2).setNext(handler3);

        String url = "http://www.youtube.com:80";
        System.out.println("INPUT: "+url);
        handler1.run(url);

        String url2 = "https://www.inpa.tistory.com:443";
        System.out.println("INPUT2: "+url2);
        handler1.run(url2);
    }
}
