package Factory.EnumFactory;

public class Client {

    public static void main(String[] args) {
        Season summer = Season.SUMMER;

        System.out.println("summer.name() = " + summer.name());
        System.out.println("summer.getSeason() = " + summer.getSeason());
    }
}
