package Factory.AfterRefactoring;

public class ConcreteShip implements Ship{

    private String name;
    private String color;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }


}
