package Command.Before;

import Command.Light;

public class Button {
    private Light light;

    public Button(Light light) {
        this.light = light;
    }

    public void press() {
        light.off();
    }
}
