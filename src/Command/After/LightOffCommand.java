package Command.After;
import Command.Light;

//ConcreteCommand : Command 구현
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
