package Structural.Adapter.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class AdapterExample {

    public static void main(String[] args) {
        //java.io.InputStreamReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //java.util.arrays에서의 asList 메소드
        String[] s = {"a", "b", "c"};
        List<String> list = Arrays.asList(s);
    }
}
