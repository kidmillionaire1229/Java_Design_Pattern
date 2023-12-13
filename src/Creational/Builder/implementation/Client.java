package Creational.Builder.implementation;

public class Client {

    public static void main(String[] args) {
        Director director = new Director();
        HouseBuilder houseBuilder = new HouseBuilder();

        //houseBuilder.setRoofs(1);
        director.makeSimpleHouse(houseBuilder);
        House simpleHouse = houseBuilder.getResult();
        System.out.println("simpleHouse = " + simpleHouse.toString());

        //houseBuilder.setRoofs(4).setWalls(4).setWindows(4);
        director.makeComplexHouse(houseBuilder);
        House complexHouse = houseBuilder.getResult();
        System.out.println("complexHouse = " + complexHouse.toString());
    }

}
