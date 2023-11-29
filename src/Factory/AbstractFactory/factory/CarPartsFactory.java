package Factory.AbstractFactory.factory;


import Factory.AbstractFactory.CompanyName;
import Factory.AbstractFactory.door.Door;
import Factory.AbstractFactory.roof.Roof;
import Factory.AbstractFactory.wheel.Wheel;

public interface CarPartsFactory {
    Door createDoor();
    Wheel createWheel();
    Roof createRoof();
    CompanyName getCompanyName();
}
