package Creational.Factory.FactoryMethod.AfterRefactoring;

public class WhiteShipFactory implements ShipFactory{

    @Override
    public Ship createShip() {
        return new WhiteShip();
    }
}
