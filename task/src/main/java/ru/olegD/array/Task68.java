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
/*
Вывести значения массива, начиная с первой ячейки
Ниже представлен метод array(int[] arr), который принимает массив целых чисел.
Задание: написать код, который выводит в консоль через пробел все значения массива, начиная с первой ячейки.
Примечание: для сборки результирующей строки с выводом значений через пробел нужно использовать
StringJoiner в этой и последующих задачах.
Например, для массива значений [5, -2, 6, 0] вывод должен быть:
5 -2 6 0
 */