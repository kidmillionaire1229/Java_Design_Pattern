package Behavior.State;

public class Offstate implements PowerState{

    @Override
    public void pushPowerButton(LaptopContext context) {
        System.out.println("Laptop power On");
        context.changeState(new OnState());
    }
}
