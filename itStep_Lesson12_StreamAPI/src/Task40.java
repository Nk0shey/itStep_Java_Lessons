/*
40. Найти строки, содержащие подстроку
Описание: Найдите строки, содержащие подстроку "api".
Рекомендуемые функции: filter, collect.
Ввод: ["Java API", "Stream", "API"]
Вывод: ["Java API", "API"]
Подсказка: Условие: s.contains("api").
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task40 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java API", "Stream", "API");
        List<String> sortedList = list.stream()
                .filter(s -> s.toLowerCase().contains("api"))
                .collect(Collectors.toList());

        System.out.println(sortedList);
    }
}
