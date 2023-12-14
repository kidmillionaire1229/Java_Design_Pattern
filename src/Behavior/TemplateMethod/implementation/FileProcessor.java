package Behavior.TemplateMethod.implementation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public abstract class FileProcessor {
    private String path;

    public FileProcessor(String path) {
        this.path = path;
    }

    /**
     * 템플릿 메서드
     * final선언하여 오버라이딩 금지
     * [구성]
     * - 디폴트 단계 메서드
     * - 추상 단계 메서드(getInitial, calculate)
     */
    public final int process() {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            int result = getInitial();
            String line = null;

            while ((line = reader.readLine()) != null){
                result = calculate(result, Integer.parseInt(line));
            }
            return result;
        } catch (IOException e) {
            throw new IllegalArgumentException(path + " is not found", e);
        }
    }

    /**
     * 추상 단계 메서드
     * ConcreteClass(자식 클래스)에서 오버라이딩
     */
    protected abstract int calculate(int result, int number);

    protected abstract int getInitial();
}
