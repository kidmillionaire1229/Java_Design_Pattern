package Command.After;
import Command.Game;

//ConcreteCommand : Command 구현 
public class GameStartcommand implements Command{
    private Game game;

    public GameStartcommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.start();
    }
}
