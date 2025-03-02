/*
1. Фильтрация чисел
Описание: Отфильтруйте только чётные числа из списка чисел.
Рекомендуемые функции: filter, collect.
Ввод: [1, 2, 3, 4, 5, 6]
Вывод: [2, 4, 6]
Подсказка: Используйте функцию фильтрации с условием n % 2 == 0.
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task01 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);
    }
}
