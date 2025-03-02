/*
13. Сортировка строк по длине
Описание: Отсортируйте строки в списке по их длине.
Рекомендуемые функции: sorted.
Ввод: ["apple", "banana", "kiwi"]
Вывод: ["kiwi", "apple", "banana"]
Подсказка: Укажите компаратор Comparator.comparing(String::length).
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task13 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "kiwi");
        List<String> sortedList = list.stream()
                .sorted(Comparator.comparing(String::length))
                        .collect(Collectors.toList());

        System.out.println(sortedList);
    }
}
