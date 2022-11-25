package main.java.ru.olegD.condition;

import java.util.Arrays;
import java.util.HashSet;

public class Task77 {
    public static void diffNumAmount(int num) {
        String[] str = String.valueOf(num).split("");
        HashSet<String> s = new HashSet<>(Arrays.asList(str));
        int a = str.length - s.size();
        if (a == 0) {
            System.out.println(3);
        } else if (a == 2) {
            System.out.println(0);
        } else {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        diffNumAmount(225);
    }
}
/*
Количество разных цифр в трехзначном числе
Ниже представлен метод diffNumAmount(int num),
который принимает целое положительное трехзначное число.
Задание: Написать код, который определяет и выводит в консоль количество разных цифр в этом числе.
Например, для числа 225 вывод будет:
1
 */
