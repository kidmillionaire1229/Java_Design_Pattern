package Behavior.Command.After;
import Behavior.Command.Light;

//ConcreteCommand : Behavior.Command 구현
public class LightOffCommand implements Command{
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.off();
    }
}
