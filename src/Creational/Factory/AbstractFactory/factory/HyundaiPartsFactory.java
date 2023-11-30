package Creational.Factory.AbstractFactory.factory;



import Creational.Factory.AbstractFactory.CompanyName;
import Creational.Factory.AbstractFactory.door.Door;
import Creational.Factory.AbstractFactory.door.HyundaiDoor;
import Creational.Factory.AbstractFactory.roof.HyundaiRoof;
import Creational.Factory.AbstractFactory.roof.Roof;
import Creational.Factory.AbstractFactory.wheel.HyundaiWheel;
import Creational.Factory.AbstractFactory.wheel.Wheel;

/**
 * ==============BEGIN==============
 * Complete the below code that requires your implementation
 * If necessary, you can make your own methods or classes so that the corresponding tests are passed
 */
public class HyundaiPartsFactory implements CarPartsFactory {
    CompanyName companyName;

    public HyundaiPartsFactory() {
        this.companyName = CompanyName.HYUNDAI;
    }

    public CompanyName getCompanyName() {
        return companyName;
    }

    @Override
    public Door createDoor() {
        return new HyundaiDoor();
    }

    @Override
    public Wheel createWheel() {
        return new HyundaiWheel();
    }

    @Override
    public Roof createRoof() { return new HyundaiRoof(); }
}
/**
 * ===============END===============
 */
