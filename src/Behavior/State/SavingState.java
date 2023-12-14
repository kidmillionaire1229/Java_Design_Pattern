package Behavior.State;

/**
 * 절전 상태
 * power button을 누르면 Onstate로 변함
 */
public class SavingState implements PowerState{

    @Override
    public void pushPowerButton(LaptopContext context) {
        System.out.println("Laptop power on");
        context.changeState(new OnState());
    }
}
