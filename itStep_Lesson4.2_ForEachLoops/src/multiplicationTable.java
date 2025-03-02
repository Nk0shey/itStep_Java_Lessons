/*
Завдання 5: Виведіть на екран таблицю множення у діапазоні, вказаному користувачем.
Наприклад, якщо користувач вказав 3 та 5, таблиця може виглядати так:
3*1 = 3 3*2 = 6 3*3 = 9 ………… 3* 10 = 30 …………………………………………………………
5*1 = 5 5 *2 = 10 5 *3 = 15 ………….
 */


import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        int minValue = 3;
        int maxValue = 5;

        for (int i = 1; i <= maxValue; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }
}
