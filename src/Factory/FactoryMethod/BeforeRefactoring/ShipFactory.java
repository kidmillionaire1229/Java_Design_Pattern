package Factory.FactoryMethod.BeforeRefactoring;

import Factory.FactoryMethod.BeforeRefactoring.Ship;

public class ShipFactory {
    public static Ship orderShip(String name){
        validate(name);
        prepareFor(name);

        Ship ship = new Ship();
        ship.setName(name);

        if(name.equalsIgnoreCase("whiteship"))
            ship.setColor("white");
        else if (name.equalsIgnoreCase("blackship")) {
            ship.setColor("black");
        }

        return ship;
    }
    private static void validate(String name){
        if(name == null || name.isBlank()){
            throw new RuntimeException("Invalid name");
        }
    }

    private static void prepareFor(String name){
        System.out.println("Preparing for building = " + name);
    }

}
