package Behavior.Interpreter.After;

import java.util.Map;

public interface PosfixExpression {
    int interpret(Map<Character, Integer> context);
}
