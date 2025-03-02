/*
Завдання 1: Створіть і викличте наступні лямбда-вирази:
 Підрахунок суми трьох цілих чисел.  Підрахунок добутку трьох цілих чисел.
 Виведення поточного часу.  Виведення поточної дати.
 */

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.function.Supplier;

public class Task01 {
    public static void main(String[] args) {

        TriFunction<Integer, Integer, Integer, Integer> sum = (a, b, c) -> a + b + c;
        System.out.println("Sum: " + sum.apply(1, 2, 3));

        TriFunction<Integer, Integer, Integer, Integer> product = (a, b, c) -> a * b * c;
        System.out.println("Sum: " + sum.apply(1, 2, 3));

        Supplier<LocalTime> currentTime = () -> LocalTime.now();
        System.out.println("Current time: " + currentTime.get());

        Supplier<LocalDate> currentDate = () -> LocalDate.now();
        System.out.println("Current date: " + currentDate.get());
    }
}

@FunctionalInterface
interface TriFunction<A, B, C, R> {
    public R apply(A a, B b, C c);
}