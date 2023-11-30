package Creational.Factory.FactoryMethod.BeforeRefactoring;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();

        Ship whiteship = ShipFactory.orderShip("whiteship");
        System.out.println("whiteship's color: = " + whiteship.getColor());

        Ship blackShip = ShipFactory.orderShip("blackship");
        System.out.println("blackShip's color: = " + blackShip.getColor());
    }

}
