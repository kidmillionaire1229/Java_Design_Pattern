package Behavior.TemplateMethod.implementation;

/**
 * ConcreteClass 2
 */

public class MultiplyFileProcessor extends FileProcessor {

    public MultiplyFileProcessor(String path) {
        super(path);
    }

    /**
     * multiply 구현
     */
    @Override
    protected int calculate(int result, int number) {
        return result * number;
    }

    /**
     * 곱셈의 초기값을 1로 선언
     */
    @Override
    protected int getInitial() {
        return 1;
    }

}
