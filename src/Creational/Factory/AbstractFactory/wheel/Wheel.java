package Creational.Factory.AbstractFactory.wheel;


import Creational.Factory.AbstractFactory.CompanyName;
import Creational.Factory.AbstractFactory.Part;

public abstract class Wheel extends Part {
    public Wheel(CompanyName factoryName) {
        super(factoryName);
    }

    @Override
    public String toString() {
        return String.format("[%s] Wheel", companyName);
    }
}
