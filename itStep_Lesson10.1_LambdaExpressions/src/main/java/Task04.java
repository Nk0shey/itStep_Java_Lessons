/*
Завдання 4: Створіть і викличте наступні лямбда-вирази.
Обов'язково використовуйте лямбду, як параметр методу.
Метод знаходить суму елементів масиву, які відповідають умові лямбда-виразу.
Варіанти лямбда-виразів:  Перевірка на парність.  Перевірка на непарність.
 Число знаходиться в діапазоні від A до B.  Перевірка на кратність параметра A.


 */

import java.util.Random;
import java.util.function.IntPredicate;
import java.util.Arrays;

public class Task04 {
    public static void main(String[] args) {
        // 1. Перевірка на парність
        Random random = new Random();

        int[] array = new int[5];
        int min = 2;
        int max = 20; // Максимальное значение для случайных чисел (0 до max-1)

        // Заполнение массива случайными числами
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min + 1) + min; // Генерация числа от min до max
        }

        // Вывод массива
        System.out.println("Сгенерированный массив: " + Arrays.toString(array));

        IntPredicate isEven = x -> x % 2 == 0;
        int sumEven = sumIf(array, isEven);
        int[] evenNumbers = filterArray(array, isEven);

        IntPredicate isOdd = x -> x % 2 == 1;
        int sumOdd = sumIf(array, isOdd);
        int[] oddNumbers = filterArray(array, isOdd);

        System.out.println("\nПарные числа из массива: " + Arrays.toString(evenNumbers));
        System.out.println("Сумма парных чисел: " + sumEven);

        System.out.println("\nНепарные числа из массива: " + Arrays.toString(oddNumbers));
        System.out.println("Сумма непарных чисел: " + sumOdd);

        IntPredicate inRange = x -> x >= min && x <= max;
        int sumInRange = sumIf(array, inRange);
        int[] inRangeNumbers = filterArray(array, inRange);
        System.out.println("\nДиапазон: " + Arrays.toString(inRangeNumbers));
        System.out.println("Сумма чисел в диапазоне [" + min + ", " + max + "]: " + sumInRange);

        IntPredicate isMultipleOf = x -> x % min == 0;
        int sumMultipleOf = sumIf(array, isMultipleOf);
        int[] multipleOfNumbers = filterArray(array, isMultipleOf);
        System.out.println("\nЧисла кратные " + min + ": " + Arrays.toString(multipleOfNumbers));
        System.out.println("Сумма чисел кратных " + min + ": " + sumMultipleOf);
    }

    private static boolean contains(int[] array, int number) {
        for (int value : array) {
            if (value == number) {
                return true;
            }
        }
        return false;
    }

    public static int sumIf(int[] array, IntPredicate predicate) {
        int sum = 0;
        for (int num : array) {
            if (predicate.test(num)) {
                sum += num;
            }
        }
        return sum;
    }

    // Метод для фильтрации массива по условию
    public static int[] filterArray(int[] array, IntPredicate predicate) {
        return Arrays.stream(array).filter(predicate).toArray();
    }

}
