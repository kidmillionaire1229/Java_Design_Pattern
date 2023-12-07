package Behavior.TemplateMethod.implementation;

import Behavior.TemplateMethod.implementation.FileProcessor;

public class MultiplyFileProcessor extends FileProcessor {

    public MultiplyFileProcessor(String path) {
        super(path);
    }

    @Override
    protected int calculate(int result, int number) {
        return result * number;
    }

    @Override
    protected int getInitial() {
        return 1;
    }

}
