package main.java.ru.olegD.array;

import java.util.StringJoiner;

public class Task68 {
    public static void array(int[] arr) {
        StringJoiner joinNames = new StringJoiner(" ");
        for (int j : arr) {
            String str = Integer.toString(j);
            joinNames.add(str);
        }
        System.out.println(joinNames);
    }
}