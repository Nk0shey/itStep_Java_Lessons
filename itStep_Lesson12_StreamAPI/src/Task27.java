/*
27. Удалить все пустые строки
Описание: Удалите пустые строки из списка.
Рекомендуемые функции: filter, collect.
Ввод: ["Java", "", "Stream", ""]
Вывод: ["Java", "Stream"]
Подсказка: Условие: !s.isEmpty().

 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task27 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "", "Stream", "");
        List<String> result = list.stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
