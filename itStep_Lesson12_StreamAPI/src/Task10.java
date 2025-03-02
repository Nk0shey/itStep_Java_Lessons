/*
10. Создание списка строк длиной больше 3
Описание: Оставьте только строки, длина которых больше 3 символов.
Рекомендуемые функции: filter, collect.
Ввод: ["a", "abc", "abcd"]
Вывод: ["abcd"]
Подсказка: Используйте условие s.length() > 3.
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task10 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "abc", "abcd");
        List<String> sortedList = list.stream()
                .filter(s -> s.length() > 3)
                .collect(Collectors.toList());

        System.out.println(sortedList);

    }
}
