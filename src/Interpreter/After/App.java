package Interpreter.After;

import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {
        PosfixExpression expression = PostfixParser.parse("xyz+-a+");
        Map<Character, Integer> context = new HashMap<>();

        context.put('x',1);
        context.put('y',2);
        context.put('z',3);
        context.put('a',4);

        int result = expression.interpret(context);
        System.out.println("result = " + result);
    }
}
