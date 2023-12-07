package Behavior.State;

public class SavingState implements PowerState{

    @Override
    public void pushPowerButton(LaptopContext context) {
        System.out.println("Laptop power on");
        context.changeState(new OnState());
    }
}
