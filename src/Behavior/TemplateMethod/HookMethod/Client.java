package Behavior.TemplateMethod.HookMethod;

public class Client {

    public static void main(String[] args) {
        CoffeeTemplate coffeeTemplate = new CoffeeWithHook();
        coffeeTemplate.makeCoffee();
    }
}
