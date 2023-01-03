package main.java.ru.olegD.loop;

import java.util.*;

public class Task27 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        int number = -num + 1;
            while (number < num) {
                joiner.add(String.valueOf(number));
                number++;
        }
        System.out.print(joiner);
    }
}
/*
Написать код, который выводит в консоль через пробел
все целые числа из диапазона -num...num (не включая крайние значения диапазона).
Например, для числа 2 вывод будет:
-1 0 1
 */