/*
8. **Задача: Поиск наибольшего общего делителя (НОД) с рекурсией**
  **Описание**: Напишите рекурсивный метод для нахождения НОД двух чисел.
  **Пример**:
  - Вход: `48, 18`
  - Выход: `6`
 */

import java.util.Scanner;

public class Task04 {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть два числа щоб знайти їх НОД: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Результат: " + gcd(a, b));
    }
}
