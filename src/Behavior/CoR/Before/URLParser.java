package Behavior.CoR.Before;

public class URLParser {
    public static void run(String url) {
        //Protocol, Domain, Port Parsing을 하나의 함수에 모두 처리

        //Protocol Parsing (http)
        int index = url.indexOf("://");
        if (index != -1) System.out.println("PROTOCOL : " + url.substring(0, index));
        else System.out.println("NO PROTOCOL");

        //Domain Parsing (www.youtube.com)
        int startIndex = url.indexOf("://");
        int lastIndex = url.lastIndexOf(":");
        System.out.print("DOMAIN : ");
        if (startIndex == -1) {
            if (lastIndex == -1) System.out.println(url);
            else System.out.println(url.substring(0, lastIndex));
        } else if (startIndex != lastIndex) {
            System.out.println(url.substring(startIndex + 3, lastIndex));
        } else {
            System.out.println(url.substring(startIndex + 3));
        }

        //Port Parsing (80)
        int index2 = url.lastIndexOf(":");
        if (index2 != -1) {
            String strPort = url.substring(index2 + 1);
            try {
                int port = Integer.parseInt((strPort));
                System.out.println("PORT : " + port);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }
}
