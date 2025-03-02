/*
Объединение нескольких списков
Описание: Объедините два списка в один.
Рекомендуемые функции: Stream.concat, collect.
Ввод: [1, 2] и [3, 4]
Вывод: [1, 2, 3, 4]
Подсказка: Используйте Stream.concat.
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task16 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2);
        List<Integer> list2 = Arrays.asList(3, 4);

        List<Integer> unitedList = Stream.concat(list1.stream(), list2.stream())
                .collect(Collectors.toList());

        System.out.println(unitedList);
    }
}
