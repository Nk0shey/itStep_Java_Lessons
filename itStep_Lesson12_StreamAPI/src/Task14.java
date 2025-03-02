/*
14. Найти слово с максимальной длиной
Описание: Найдите самое длинное слово в списке.
Рекомендуемые функции: max.
Ввод: ["apple", "banana", "cherry"]
Вывод: "banana"
Подсказка: Используйте компаратор Comparator.comparingInt(String::length).
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


public class Task14 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "cherry");
        Optional<String> result = list.stream()
                .max(Comparator.comparingInt(String::length));

        System.out.println(result);
    }
}
