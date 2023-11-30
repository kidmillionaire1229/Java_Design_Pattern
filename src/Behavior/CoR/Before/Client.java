package Behavior.CoR.Before;

public class Client {
    public static void main(String[] args) {
        String url1 = "http://www.youtube.com:80";
        System.out.println("INPUT: " + url1);
        URLParser.run(url1);
        String url2 = "https://www.inpa.tistory.com:443";
        System.out.println("INPUT: " + url2);
        URLParser.run(url2);
        String url3 = "http://localhost:8080";
        System.out.println("INPUT: " + url3);
        URLParser.run(url3);
    }
}
