package Creational.Factory.AbstractFactory.factory;


import Creational.Factory.AbstractFactory.CompanyName;
import Creational.Factory.AbstractFactory.door.Door;
import Creational.Factory.AbstractFactory.door.TeslaDoor;
import Creational.Factory.AbstractFactory.roof.Roof;
import Creational.Factory.AbstractFactory.roof.TeslaRoof;
import Creational.Factory.AbstractFactory.wheel.TeslaWheel;
import Creational.Factory.AbstractFactory.wheel.Wheel;

public class TeslaPartsFactory implements CarPartsFactory{
    CompanyName companyName;

    public TeslaPartsFactory() { this.companyName = CompanyName.TESLA;}

    @Override
    public Door createDoor() {
        return new TeslaDoor();
    }

    @Override
    public Wheel createWheel() {
        return new TeslaWheel();
    }

    @Override
    public Roof createRoof() {
        return new TeslaRoof();
    }

    @Override
    public CompanyName getCompanyName() {
        return companyName;
    }


}
