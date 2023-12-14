package Behavior.Command.After;
import Behavior.Command.Light;
import Behavior.Command.Game;
public class Client {

    public static void main(String[] args) {
        Button button = new Button();
        button.press(new LightOnCommand(new Light()));

        //Game 객체를 Command안에 넣어서 코드 수정 없이 문제 해결
        //Receiver(Light => Game등)의 내부코드 수정 시 Invoker(Button), Client 코드에 수정이 필요 없음
        button.press(new GameStartcommand(new Game()));
    }
}
