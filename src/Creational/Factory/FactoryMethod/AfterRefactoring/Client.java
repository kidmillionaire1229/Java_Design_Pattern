package Creational.Factory.FactoryMethod.AfterRefactoring;

/**
 * 새로운 BlackShip을 추가하려고 할 때, 기존 코드의 수정이 발생하지 않음
 */
public class Client {
    private void print(ShipFactory shipFactory, String name){
        System.out.println(shipFactory.orderShip(name));
    }
    public static void main(String[] args) {
        Ship whiteship = new WhiteShipFactory().orderShip("whiteship");
        System.out.println("white = " + whiteship);

        //추가된 BlackShip을 BlackShipFactory가 도맡아 객체 생성
        Ship blackship = new BlackShipFactory().orderShip("blackship");
        System.out.println("blackship = " + blackship);

        System.out.println("--Client Print method--");
        Client client = new Client();
        client.print(new WhiteShipFactory(), "whiteship");
        client.print(new BlackShipFactory(), "blackship");
    }

}
