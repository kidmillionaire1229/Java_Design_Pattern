package Behavior.Command.After;
import Behavior.Command.Light;

//ConcreteCommand : Behavior.Command 구현
public class LightOnCommand implements Command{
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }


    @Override
    public void execute() {
        light.on();
    }
}
