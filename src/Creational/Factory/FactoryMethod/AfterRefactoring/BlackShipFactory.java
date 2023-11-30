package Creational.Factory.FactoryMethod.AfterRefactoring;

public class BlackShipFactory implements ShipFactory{

    @Override
    public Ship createShip() {
        return new BlackShip();
    }
}
