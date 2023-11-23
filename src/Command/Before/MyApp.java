package Command.Before;

import Command.Light;

public class MyApp {

    public static void main(String[] args) {
        Button button = new Button(new Light());
        button.press();
        button.press();
        button.press();
        button.press();

        /**
         * [Button이 Light과의 강한 응집도를 가짐]
         * 1. Button안에 Light 객체가 아닌 다른 객체(Game)가 들어가면 코드 수정 필요
         * Button gameButton = new Button(new Game());
         * 2. Light내의 요소 수정시 Button 코드가 수정이 필요
         * Light의 메소드 명 변경 (off => turnOff)
         * light.off => light.turnOff
         */

    }

}
