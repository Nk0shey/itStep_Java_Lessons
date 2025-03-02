/*
9. Найти минимальное число
Описание: Найдите минимальное значение в списке чисел.
Рекомендуемые функции: min.
Ввод: [5, 3, 8, 1, 2]
Вывод: 1
Подсказка: Укажите компаратор Integer::compare.
 */

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task09 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 2);

        Optional<Integer> min = numbers.stream()
                .min(Integer::compare);

        System.out.println(min);
    }
}
