package Behavior.State;

public class LaptopContext {
    PowerState powerState;

    public LaptopContext() {
        powerState = new Offstate();
    }

    void changeState(PowerState state){
        this.powerState = state;
    }

    void pushPowerButton(){
        this.powerState.pushPowerButton(this);
    }

    void setSavingState(){
        System.out.println("Laptop saving Mode");
        this.changeState(new SavingState());
    }

    void printCurrentState() {
        System.out.println(this.powerState.getClass().getName());
    }
}
