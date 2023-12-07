package Behavior.TemplateMethod.implementation;

import Behavior.TemplateMethod.implementation.FileProcessor;

public class SumFileProcessor extends FileProcessor {

    public SumFileProcessor(String path) {
        super(path);
    }

    @Override
    protected int calculate(int result, int number) {
        return result + number;
    }

    @Override
    protected int getInitial() {
        return 0;
    }
}
