package main.java.ru.olegD.loop;

import java.util.StringJoiner;

public class Task23 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        int a = 5;
        for (int i = num - 10; a-- > 0; i = i - 6) {
            joiner.add(Integer.toString(i));
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop(50);
    }
}
