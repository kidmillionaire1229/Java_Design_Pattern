package Factory.AbstractFactory.factory;



import Factory.AbstractFactory.CompanyName;
import Factory.AbstractFactory.door.Door;
import Factory.AbstractFactory.door.HyundaiDoor;
import Factory.AbstractFactory.roof.HyundaiRoof;
import Factory.AbstractFactory.roof.Roof;
import Factory.AbstractFactory.wheel.HyundaiWheel;
import Factory.AbstractFactory.wheel.Wheel;

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
