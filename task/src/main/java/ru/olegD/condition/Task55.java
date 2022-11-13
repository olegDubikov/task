package main.java.ru.olegD.condition;

public class Task55 {
    public static void apartmentPlace(int number) {
        int count = 0;
        while (number > 0) {
            number -= 3;
            count++;

        }
        System.out.println(count);
        switch (number % 3) {
            case -1 -> {
                System.out.println(2);
            }
            case -2 -> {
                System.out.println(1);
            }
            default -> {
                System.out.println(3);
            }
        }
    }
}
/*
Найти этаж и расположение квартиры
Ниже представлен метод apartmentPlace(int number), который принимает целое положительное число.
На каждом этаже многоквартирного дома три квартиры. Счет идет слева направо.
Например, на первом этаже квартира 1 расположена слева, квартира 2 по центру и квартира 3 - справа, и т.д.
Задание: Написать код, который находит этаж квартиры, и какое место она занимает на этом этаже.
Результат вывести в консоль построчно. Обозначение расположения квартир: 1 - слева, 2 - центр, 3 - справа.
Например, для квартиры 12 вывод будет:
4
3
 */