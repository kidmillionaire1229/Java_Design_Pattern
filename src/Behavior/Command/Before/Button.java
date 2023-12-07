package Behavior.Command.Before;

import Behavior.Command.Light;

public class Button {
    private Light light;

    public Button(Light light) {
        this.light = light;
    }

    public void press() {
        light.off();
    }
}
