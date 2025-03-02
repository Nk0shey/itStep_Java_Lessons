/*
7. **Задача: Подсчет цифр в числе с помощью рекурсии**
  **Описание**: Создайте рекурсивный метод, который возвращает количество цифр в числе.
  **Пример**:
  - Вход: `12345`
  - Выход: `5`
 */

import java.util.Scanner;

public class Task03 {
    public static int countDigits(int number) {
        if (number < 10) {
            return 1;
        }

        return 1 + countDigits(number / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть будь-яке число: ");
        int number = scanner.nextInt();

        System.out.println("Кількість чисел: " + countDigits(number));
    }
}
