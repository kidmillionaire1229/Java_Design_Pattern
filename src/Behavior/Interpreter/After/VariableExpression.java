package Behavior.Interpreter.After;

import java.util.Map;

public class VariableExpression implements PosfixExpression{
    private Character character;

    public VariableExpression(Character character) {
        this.character = character;
    }


    @Override
    public int interpret(Map<Character, Integer> context) {
        return context.get(this.character);
    }
}
