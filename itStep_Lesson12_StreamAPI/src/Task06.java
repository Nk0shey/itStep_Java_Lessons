/*
6. Найти первое чётное число
Описание: Найдите первое чётное число в списке.
Рекомендуемые функции: filter, findFirst.
Ввод: [1, 3, 5, 6, 7]
Вывод: 6
Подсказка: Используйте фильтрацию с findFirst.
 */

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task06 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 5, 6, 7);
        Optional<Integer> filtered = list.stream()
                .filter(x -> x % 2 == 0)
                .findFirst();

        System.out.println(filtered);
    }
}
