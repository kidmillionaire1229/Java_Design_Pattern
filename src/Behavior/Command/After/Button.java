package Behavior.Command.After;


//Invoker
//Command를 주입 받아, execute 호출
public class Button {
    public void press(Command command){
        command.execute();
    }
}
