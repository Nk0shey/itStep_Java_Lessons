/*
5. Выборка уникальных элементов
Описание: Выберите только уникальные элементы из списка.
Рекомендуемые функции: distinct, collect.
Ввод: [1, 2, 2, 3, 3, 4]
Вывод: [1, 2, 3, 4]
Подсказка: distinct автоматически удаляет дубликаты.
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task05 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 3, 4);
        List<Integer> sortedList = list.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(sortedList);
    }
}
