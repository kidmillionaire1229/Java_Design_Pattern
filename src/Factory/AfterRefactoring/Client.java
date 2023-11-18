package Factory.AfterRefactoring;

public class Client {

    public static void main(String[] args) {
        Ship whiteship = new WhiteShipFactory().orderShip("whiteship");
        System.out.println("white = " + whiteship);

        Ship blackship = new BlackShipFactory().orderShip("blackship");
        System.out.println("blackship = " + blackship);
    }

}
