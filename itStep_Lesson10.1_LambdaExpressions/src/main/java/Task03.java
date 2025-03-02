/*
Завдання 3: Створіть і викличте наступні лямбда-вирази.
Обов'язково використовуйте шаблони:  Максимум з трьох.  Мінімум з трьох.
 */

public class Task03 {
    public static void main(String[] args) {

        // Лямбда-вираз для знаходження максимуму з трьох цілих чисел

        TriFunction<Integer, Integer, Integer, Integer> maxOfThree = (x, y, z) -> {
            int max = x;
            if (y > max) max = y;
            if (z > max) max = z;

            return max;
        };

        System.out.println("Максимум з трьох: " + maxOfThree.apply(2, 5, 9));

        TriFunction<Integer, Integer, Integer, Integer> minOfThree = (a, b, c) -> {
            int min = a;
            if (b < min) min = b;
            if (c < min) min = c;

            return min;
        };

        System.out.println("Мінімум з трьох: " + minOfThree.apply(2, 5, 9));


        // Функціональний інтерфейс для трьох аргументів

        @FunctionalInterface

        interface TriFunction<A, B, C, R> {

            R apply(A a, B b, C c);

        }
    }
}
