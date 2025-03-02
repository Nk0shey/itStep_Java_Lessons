/*
43. Умножить все числа на фиксированное значение
Описание: Умножьте каждое число в списке на 5.
Рекомендуемые функции: map, collect.
Ввод: [1, 2, 3]
Вывод: [5, 10, 15]
Подсказка: Используйте n * 5.
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task43 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        List<Integer> res = list.stream()
                .map(n -> n * 5)
                .collect(Collectors.toList());

        System.out.println(res);
    }
}
