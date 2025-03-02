/*
38. Упорядочить строки в обратном порядке
Описание: Отсортируйте строки в обратном алфавитном порядке.
Рекомендуемые функции: sorted.
Ввод: ["apple", "banana", "cherry"]
Вывод: ["cherry", "banana", "apple"]
Подсказка: Компаратор Comparator.reverseOrder().
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task38 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "cherry");
        List<String> sortedList = list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(sortedList);
    }
}
