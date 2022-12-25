package main.java.ru.olegD.loop;

import java.util.StringJoiner;

public class Task25 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        int a = 7;
        while (num > 0) {
            joiner.add(Integer.toString(a));
            a += 4;
            num--;
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop(5);
    }
}
