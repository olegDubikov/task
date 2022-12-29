package main.java.ru.olegD.loop;

import java.util.StringJoiner;

public class Task26 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 0; num-- >= 0; i = i - 8) {
            joiner.add(Integer.toString(i));
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop(3);
    }
}
/*
Вывести числа в арифметической прогрессии по убыванию
Ниже представлен метод loop(int num), который принимает целое положительное число.
Задание: Написать код, который выводит в консоль через пробел в убывающем порядке серию чисел
в виде арифметической прогрессии в количестве членов равном 2 * входящее число, начиная с нуля.
Разница между соседними членами этой прогрессии должна быть равна 8.
Например, для числа 2 вывод будет:
0 -8 -16 -24
 */