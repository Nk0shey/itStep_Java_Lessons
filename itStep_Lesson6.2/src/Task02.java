/*
6. **Задача: Возведение числа в степень с использованием рекурсии**
  **Описание**: Напишите рекурсивный метод, который возводит число в целую степень.
  **Пример**:
  - Вход: `2, 3`
  - Выход: `8`
 */

import java.util.Scanner;

public class Task02 {
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }

        if (n == 1) {
            return x;
        }

        return x = x * power(x, n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть число: ");
        int base = scanner.nextInt();

        System.out.println("Введіть степінь, до якої піднесемо число: ");
        int exponent = scanner.nextInt();

        System.out.println("Результат: " + power(base, exponent));
    }
}
