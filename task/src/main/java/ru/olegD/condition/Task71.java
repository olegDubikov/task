package main.java.ru.olegD.condition;

public class Task71 {
    public static void change(int money) {
        int hundred = 0;
        int fifty = 0;
        int ten = 0;
        while (money >= 100) {
            money -= 100;
            hundred++;
        }
        while (money < 100 && money >= 50) {
            money -= 50;
            fifty++;
        }
        while (money < 50 && money >= 10) {
            money -= 10;
            ten++;
        }
        System.out.println(money % 10 == 0 ? "100: " + hundred
                + ", 50: " + fifty
                + ", 10: " + ten : "Нельзя");
    }

    public static void main(String[] args) {
        change(876543210);
    }
}
/*
Минимальный набор купюр
Ниже представлен метод change(int money),
который принимает целое число - сумму в рублях, которую нужно выплатить.
В кассе есть купюры достоинством 100, 50 и 10 рублей.
Задание: Написать код, который определяет,
каким минимальным набором купюр можно выдать данную сумму.
Результат вывести в консоль в виде:
"100: x, 50: y, 10: z", где x, y, z - количество соответствующих купюр к выдаче.
Если сумму нельзя выдать полностью (Например, 156) - вывести "Нельзя".
Например, для числа 170, вывод будет:
100: 1, 50: 1, 10: 2
 */
