package Behavior.Interpreter.After;

import java.util.Stack;

public class PostfixParser {
    public static PosfixExpression parse(String expression){
        Stack<PosfixExpression> stack = new Stack<>();
        for (char c : expression.toCharArray())
            stack.push(getExpression(c,stack));

        return stack.pop();
    }

    private static PosfixExpression getExpression(char c, Stack<PosfixExpression> stack){
        switch (c) {
            case '+':
                return new PlusExpression(stack.pop(), stack.pop());
            case '-':
                PosfixExpression right = stack.pop();
                PosfixExpression left = stack.pop();
                return new MinusExpression(left, right);
            default:
                return new VariableExpression(c);
        }
    }
}
