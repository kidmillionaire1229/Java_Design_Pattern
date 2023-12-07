package Behavior.State;

public class OnState implements PowerState{

    @Override
    public void pushPowerButton(LaptopContext context) {
        System.out.println("Laptop power OFF");
        context.changeState(new Offstate());
    }
}
