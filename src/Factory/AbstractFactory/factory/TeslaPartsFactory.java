package Factory.AbstractFactory.factory;


import Factory.AbstractFactory.CompanyName;
import Factory.AbstractFactory.door.Door;
import Factory.AbstractFactory.door.TeslaDoor;
import Factory.AbstractFactory.roof.Roof;
import Factory.AbstractFactory.roof.TeslaRoof;
import Factory.AbstractFactory.wheel.TeslaWheel;
import Factory.AbstractFactory.wheel.Wheel;

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
