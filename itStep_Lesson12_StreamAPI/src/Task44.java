/*
44. Упорядочить строки по алфавиту
Описание: Отсортируйте строки списка в алфавитном порядке.
Рекомендуемые функции: sorted, collect.
Ввод: ["banana", "apple", "cherry"]
Вывод: ["apple", "banana", "cherry"]
Подсказка: Используйте sorted().
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task44 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("banana", "apple", "cherry");
        List<String> sortedList = list.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedList);
    }
}
