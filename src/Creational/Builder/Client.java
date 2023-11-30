package Creational.Builder;

public class Client {

    public static void main(String[] args) {
        Director director = new Director();
        HouseBuilder houseBuilder = new HouseBuilder();
        director.makeSimpleHouse(houseBuilder);
        House simpleHouse = houseBuilder.getResult();
        System.out.println("simpleHouse = " + simpleHouse.toString());

        director.makeComplexHouse(houseBuilder);
        House complexHouse = houseBuilder.getResult();
        System.out.println("complexHouse = " + complexHouse.toString());
    }

}
