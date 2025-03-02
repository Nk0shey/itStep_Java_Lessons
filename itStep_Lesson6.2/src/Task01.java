/*
4. **Задача: Проверка чисел Фибоначчи с помощью рекурсии**
  **Описание**: Создайте рекурсивный метод, который определяет, принадлежит ли число последовательности Фибоначчи.
  **Пример**:
  - Вход: `21`
  - Выход: `true`
  - Вход: `22`
  - Выход: `false`
 */

public class Task01 {
    public static boolean isFibonacci(int n) {
        // Начинаем с первых двух чисел последовательности Фибоначчи (0 и 1)
        return checkFibonacci(n, 0, 1);
    }

    private static boolean checkFibonacci(int n, int a, int b) {
        // Если нашли совпадение с текущим числом, возвращаем true
        if (n == a || n == b) {
            return true;
        }
        // Если текущее число больше n, значит, n не в последовательности
        if (b > n) {
            return false;
        }
        // Рекурсивный вызов, переходя к следующему числу в последовательности
        return checkFibonacci(n, b, a + b);
    }

    public static void main(String[] args) {
        int number1 = 21;
        int number2 = 22;

        System.out.println(isFibonacci(number1)); // true
        System.out.println(isFibonacci(number2)); // false
    }
}
