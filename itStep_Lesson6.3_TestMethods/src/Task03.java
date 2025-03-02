/*
#### 3. Факторіал числа за допомогою рекурсії
Завдання: Напишіть статичний метод, який обчислює факторіал числа рекурсивно.
Вхід: n = 5
Вихід: 120
Алгоритм: Рекурсивно викликаємо метод, поки не досягнемо базового випадку n == 1.
 */

import java.util.Scanner;

public class Task03 {
    public static int findFactorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * findFactorial(n - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть число N, факторіал якого хочете знайти: ");
        int number = scanner.nextInt();

        int result = findFactorial(number);
        System.out.println("Факторіал числа N: " + result);
    }
}
