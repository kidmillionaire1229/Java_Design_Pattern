package Creational.Factory.AbstractFactory;

import Creational.Factory.AbstractFactory.door.Door;
import Creational.Factory.AbstractFactory.factory.CarPartsFactory;
import Creational.Factory.AbstractFactory.factory.HyundaiPartsFactory;
import Creational.Factory.AbstractFactory.roof.Roof;
import Creational.Factory.AbstractFactory.wheel.Wheel;

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
