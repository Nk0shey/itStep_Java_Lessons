/*
42. Преобразование списка в Set
Описание: Преобразуйте список чисел в множество, удаляя дубликаты.
Рекомендуемые функции: collect, Collectors.toSet.
Ввод: [1, 2, 2, 3]
Вывод: {1, 2, 3}
Подсказка: Используйте Collectors.toSet().
 */

import java.util.*;
import java.util.stream.Collectors;

public class Task42 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3);
        Set<Integer> set = list.stream().
                collect(Collectors.toSet());

        System.out.println(set);
    }
}
