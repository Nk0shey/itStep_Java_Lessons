/*
39. Преобразовать Map в список
Описание: Преобразуйте Map в список её ключей.
Рекомендуемые функции: map, collect.
Ввод: {1="one", 2="two"}
Вывод: [1, 2]
Подсказка: Используйте map(Map.Entry::getKey).
 */

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task39 {
    public static void main(String[] args) {
        Map<Integer, String> map = Map.of(1, "one", 2, "two");

        List<Integer> list = map.entrySet().stream()
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
