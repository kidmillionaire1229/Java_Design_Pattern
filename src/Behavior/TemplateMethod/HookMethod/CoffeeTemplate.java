package Behavior.TemplateMethod.HookMethod;

public abstract class CoffeeTemplate {
    //템플릿 메서드
    public final void makeCoffee() {
        boilWater();
        brewCoffeeGrounds();
        pourInCoup();
        //hook 메서드 호출
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }


    protected abstract void boilWater();

    protected abstract void brewCoffeeGrounds();

    protected abstract void pourInCoup();

    //hook 메소드 (기본이 구현이 있는 경우)
    //아예 빈 method body도 가능
    protected boolean customerWantsCondiments() {
        return true; //기본적으로 조미료 추가를 원하지만, 상속하는 클래스에 따라 다르게 설정할 수 있음
    }

    protected abstract void addCondiments();
}
