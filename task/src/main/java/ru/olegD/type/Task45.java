package main.java.ru.olegD.type;

public class Task45 {
    public static void leftNumChange(int number1, int number2) {
        int first1 = number1/100*100;
        int first2 = number2/100*100;
        int num1 = number1%100+number2/100*100;
        int num2 = number2%100+number1/100*100;
        System.out.println(num1 +"\n"+ num2);
    }
}
/*
Обмен левыми цифрами двух трехзначных чисел
Ниже представлен метод leftNumChange(int number1, int number2),
который принимает 2 целых положительных трехзначных числа.
Задание: Написать код, который обменивает левые цифры этих чисел между собой. Результат вывести в консоль построчно.
Например, для чисел 123 и 456 вывод должен быть:
423
156
 */