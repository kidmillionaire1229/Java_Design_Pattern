package Factory.AbstractFactory.roof;


import Factory.AbstractFactory.CompanyName;
import Factory.AbstractFactory.Part;

public abstract class Roof extends Part {
    public Roof(CompanyName companyName) {
        super(companyName);
    }

    @Override
    public String toString() {
        return String.format("[%s] Roof", companyName);
    }
}