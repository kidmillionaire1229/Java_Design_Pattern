package Creational.Factory.AbstractFactory.factory;


import Creational.Factory.AbstractFactory.CompanyName;
import Creational.Factory.AbstractFactory.door.Door;
import Creational.Factory.AbstractFactory.roof.Roof;
import Creational.Factory.AbstractFactory.wheel.Wheel;

public interface CarPartsFactory {
    Door createDoor();
    Wheel createWheel();
    Roof createRoof();
    CompanyName getCompanyName();
}
