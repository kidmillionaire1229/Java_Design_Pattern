package Behavior.TemplateMethod.implementation;

/**
 * Concrete Class 1
 */

public class SumFileProcessor extends FileProcessor {

    public SumFileProcessor(String path) {
        super(path);
    }

    /**
     * sum 구현
     */
    @Override
    protected int calculate(int result, int number) {
        return result + number;
    }

    /**
     * 덧셈의 초기값을 0으로 선언
     */
    @Override
    protected int getInitial() {
        return 0;
    }
}
