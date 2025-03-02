/*
7. Преобразование чисел в их квадраты
Описание: Преобразуйте каждый элемент в его квадрат.
Рекомендуемые функции: map, collect.
Ввод: [1, 2, 3, 4]
Вывод: [1, 4, 9, 16]
Подсказка: Используйте лямбда-выражение n -> n * n.
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task07 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        List<Integer> sorted = list.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println(sorted);
    }
}
