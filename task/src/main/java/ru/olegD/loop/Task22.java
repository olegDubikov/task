package main.java.ru.olegD.loop;

import java.util.StringJoiner;

public class Task22 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 100; i < 301; i++) {
            if (i % 80 == 45) {
                joiner.add(Integer.toString(i));
            }
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop();
    }
}
/*
Вывести положительные трехзначные числа, делящиеся на 80 с остатком 45
Задание: Написать код, который выводит в консоль через пробел в порядке
возрастания все положительные трехзначные числа до 300, делящиеся на 80 с остатком 45.
Вывод должен получиться такой:

125 205 285
 */