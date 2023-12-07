package Behavior.TemplateMethod;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public abstract class FileProcessor {
    private String path;

    public FileProcessor(String path) {
        this.path = path;
    }

    //템플릿 메서드
    //final : override 불가
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

    protected abstract int calculate(int result, int number);

    protected abstract int getInitial();
}
