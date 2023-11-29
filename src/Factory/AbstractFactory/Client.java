package Factory.AbstractFactory;

import Factory.AbstractFactory.door.Door;
import Factory.AbstractFactory.factory.CarPartsFactory;
import Factory.AbstractFactory.factory.HyundaiPartsFactory;
import Factory.AbstractFactory.roof.Roof;
import Factory.AbstractFactory.wheel.Wheel;

public class Client {

    public static void main(String[] args) {
        CarPartsFactory factory = new HyundaiPartsFactory();
        Door door = factory.createDoor();
        Roof roof = factory.createRoof();
        Wheel wheel = factory.createWheel();
        System.out.println("door.getClass() = " + door.getClass());
        System.out.println("roof.getClass() = " + roof.getClass());
        System.out.println("roof.getClass() = " + roof.getClass());
    }
}
