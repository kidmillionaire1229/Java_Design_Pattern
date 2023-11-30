package Behavior.Interpreter.After;


import java.util.Map;

public class PlusExpression implements PosfixExpression {
    private PosfixExpression left, right;

    public PlusExpression(PosfixExpression left, PosfixExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Map<Character, Integer> context){
        return left.interpret(context) + right.interpret(context);
    }
}
