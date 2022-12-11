package main.java.ru.olegD.condition;


import java.util.Arrays;
import java.util.HashSet;

public class Task77 {
    public static void diffNumAmount(int num) {
        String[] str = String.valueOf(num).split("");
        HashSet<String> s = new HashSet<>(Arrays.asList(str));
        switch (s.size()) {
            case 1 -> System.out.println(0);
            case 2 -> System.out.println(2);
            case 3 -> System.out.println(3);
        }
    }

    public static void main(String[] args) {
        diffNumAmount(223);
    }
}
/*
Количество разных цифр в трехзначном числе
Ниже представлен метод diffNumAmount(int num), который принимает целое положительное трехзначное число.
Задание: Написать код, который определяет и выводит в консоль количество разных цифр в этом числе.
Например, для числа 225 вывод будет:
2
 */