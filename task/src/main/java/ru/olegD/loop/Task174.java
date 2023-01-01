package main.java.ru.olegD.loop;

public class Task174 {
    public static void isPalindrome(int number) {
        int reverted = number % 10;
        if (reverted == 0) {
            System.out.println("Нет");
        } else {
            int num = number / 10;
            while (num > reverted) {
                int revNext = num % 10;
                num /= 10;
                reverted = 10 * reverted + revNext;
            }
            System.out.println(num == reverted || num == reverted / 10 ? "Да" : "Нет");
        }
    }

    public static void main(String[] args) {
        isPalindrome(2);

    }
}
/*
Написать код, который проверяет, является ли входящее число палиндромом
(т.е. симметричным), и выводит в консоль "Да", если является, и "Нет", если не является.
 */