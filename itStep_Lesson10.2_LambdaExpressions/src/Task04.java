/*
### 4. Сложение двух чисел
- **Описание**: Напишите лямбду `BiFunction<Integer, Integer, Integer>`, складывающую два целых числа.
- **Пример ввода**: (3, 4)
- **Пример вывода**: 7
- **Подсказка**: Посмотрите, как работать с `BiFunction<A,B,R>`.
 */

import java.util.Scanner;
import java.util.function.BiFunction;

public class Task04 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer a: ");
        int a = scanner.nextInt();
        System.out.println("Enter an integer b: ");
        int b = scanner.nextInt();

        System.out.println(a + " + " + b + " = " + add.apply(a, b));
    }
}
