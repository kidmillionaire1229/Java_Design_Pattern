package Factory.AfterRefactoring;



public interface ShipFactory {
    default Ship orderShip(String name){
        validate(name);
        prepareFor(name);
        Ship ship = createShip();
        return ship;
    }

    Ship createShip();

    private void validate(String name){
        if(name == null || name.isBlank()){
            throw new RuntimeException("Invalid name");
        }
    }

    private static void prepareFor(String name){
        System.out.println("Preparing for building = " + name);
    }
}
