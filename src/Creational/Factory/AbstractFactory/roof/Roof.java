package Creational.Factory.AbstractFactory.roof;


import Creational.Factory.AbstractFactory.CompanyName;
import Creational.Factory.AbstractFactory.Part;

public abstract class Roof extends Part {
    public Roof(CompanyName companyName) {
        super(companyName);
    }

    @Override
    public String toString() {
        return String.format("[%s] Roof", companyName);
    }
}