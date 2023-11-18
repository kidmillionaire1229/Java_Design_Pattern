package Factory.AfterRefactoring;

public class Client {
    private void print(ShipFactory shipFactory, String name){
        System.out.println(shipFactory.orderShip(name));
    }
    public static void main(String[] args) {
        Ship whiteship = new WhiteShipFactory().orderShip("whiteship");
        System.out.println("white = " + whiteship);

        Ship blackship = new BlackShipFactory().orderShip("blackship");
        System.out.println("blackship = " + blackship);

        System.out.println("--Client Print method--");
        Client client = new Client();
        client.print(new WhiteShipFactory(), "whiteship");
        client.print(new BlackShipFactory(), "blackship");
    }

}
