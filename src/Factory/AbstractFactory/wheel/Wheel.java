package Factory.AbstractFactory.wheel;


import Factory.AbstractFactory.CompanyName;
import Factory.AbstractFactory.Part;

public abstract class Wheel extends Part {
    public Wheel(CompanyName factoryName) {
        super(factoryName);
    }

    @Override
    public String toString() {
        return String.format("[%s] Wheel", companyName);
    }
}
