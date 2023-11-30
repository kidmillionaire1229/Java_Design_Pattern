package Creational.Factory.AbstractFactory.door;


import Creational.Factory.AbstractFactory.CompanyName;
import Creational.Factory.AbstractFactory.Part;

public abstract class Door extends Part {
    public Door(CompanyName companyName){
        super(companyName);
    }

    @Override
    public String toString() {
        return String.format("[%s] Door", companyName);
    }
}
