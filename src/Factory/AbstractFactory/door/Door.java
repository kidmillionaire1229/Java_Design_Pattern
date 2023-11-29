package Factory.AbstractFactory.door;


import Factory.AbstractFactory.CompanyName;
import Factory.AbstractFactory.Part;

public abstract class Door extends Part {
    public Door(CompanyName companyName){
        super(companyName);
    }

    @Override
    public String toString() {
        return String.format("[%s] Door", companyName);
    }
}
