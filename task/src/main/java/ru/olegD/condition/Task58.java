package main.java.ru.olegD.condition;

public class Task58 {
    public static void isWinning(int number){
        String str = String.valueOf(number);
        int num1 = str.charAt(0) + str.charAt(1) + str.charAt(2);
        int num2 = str.charAt(3) + str.charAt(4) + str.charAt(5);
        if(num1%2==0 && num1==num2) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
/*
Счастливый билет
Ниже представлен метод isWinning(int number), который принимает целое шестизначное число.
В этой задаче нужно определить выигрышный билет. Пусть выигрышным считается такой билет,
где сумма первых трех цифр входящего числа равна сумме последних трех цифр этого числа,
и обе эти суммы являются четными.
Задание: Написать код, который проверяет, является ли такой билет выигрышным, и выводит в консоль "Да",
если является, и "Нет", если не является.
Например, для числа 145505 вывод будет:
Да
 */