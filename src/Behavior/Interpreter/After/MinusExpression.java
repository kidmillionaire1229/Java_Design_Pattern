package Behavior.Interpreter.After;

import java.util.Map;

public class MinusExpression implements PosfixExpression{
    private PosfixExpression left, right;

    public MinusExpression(PosfixExpression left, PosfixExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Map<Character, Integer> context) {
        return left.interpret(context) - right.interpret(context);
    }
}
