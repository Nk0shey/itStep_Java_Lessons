/*
Завдання 2: Створіть і викличте наступні лямбда-вирази:
 Максимум з двох.  Мінімум з двох.  Факторіал числа.  Перевірка на просте число.
 */

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Task02 {
    public static void main(String[] args) {
        // 1. Максимум з двох чисел
        BiFunction<Integer, Integer, Integer> max = (x, y) -> x > y ? x : y;
        System.out.println("Max: " + max.apply(1, 4));

        // 2. Мінімум з двох чисел
        BiFunction<Integer, Integer, Integer> min = (x, y) -> x < y ? x : y;
        System.out.println("Min: " + min.apply(1, 4));

        // 3. Факторіал числа
        // Повернемо значення типу Long, оскільки факторіал швидко зростає
        Function<Integer, Long> factorial = n -> {
            if (n < 0) throw new IllegalArgumentException("Factorial cannot be negative");
            long result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };

        System.out.println("Factorial: " + factorial.apply(5));

        // 4. Перевірка на просте число
        Predicate<Integer> isPrime = n -> {
            if (n < 0) throw new IllegalArgumentException("Natural cannot be negative");
            if (n <= 1) return false;
            if (n == 2) return true;
            if (n % 2 == 0) return false;
            for (int i = 3; i <= Math.sqrt(n); i += 2) {
                if (n % i == 0) return false;
            }
            return true;
        };

        System.out.println("IsPrime ?: " + isPrime.test(6));
    }
}

