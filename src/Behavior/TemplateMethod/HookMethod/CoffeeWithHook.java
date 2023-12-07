package Behavior.TemplateMethod.HookMethod;

public class CoffeeWithHook extends CoffeeTemplate {

    @Override
    protected void boilWater() {
        System.out.println("물 끓이기");
    }

    @Override
    protected void brewCoffeeGrounds() {
        System.out.println("커피 내리기");
    }

    @Override
    protected void pourInCoup() {
        System.out.println("컵에 따르기");
    }

    @Override
    protected void addCondiments() {
        System.out.println("설탕과 우유 추가");
    }

    //Hook 메소드 내용 변경
    //만약 조미료 추가 원하지 않는다면 해당 메소드 주석 해제
//    @Override
//    protected boolean customerWantsCondiments() {
//        return false;
//    }
}
