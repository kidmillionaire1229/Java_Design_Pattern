package Behavior.TemplateMethod;

public class Client {

    public static void main(String[] args) {
        FileProcessor sumFileProcessor = new SumFileProcessor("./src/Behavior/TemplateMethod/numbers.txt");
        int sumResult = sumFileProcessor.process();
        System.out.println("sumResult = " + sumResult);

        FileProcessor multiplyFileProcessor = new MultiplyFileProcessor("./src/Behavior/TemplateMethod/numbers.txt");
        int multiplyResult = multiplyFileProcessor.process();
        System.out.println("multiplyResult = " + multiplyResult);
    }
}
