package Creational.Factory.FactoryMethod.BeforeRefactoring;

/**
 * 문제점
 * Ship - Ship Factory 사이의 강한 결합
 * 확장을 시도하게 되면 기존의 코드의 수정이 발생
 *
 *
 * 1. 요구사항 변경으로 새로운 배(e.g blueship)이 추가 되어야 한다면?
 * 2. Ship 클래스에 새로운 멤버 변수가 추가 된다면?
 */
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
