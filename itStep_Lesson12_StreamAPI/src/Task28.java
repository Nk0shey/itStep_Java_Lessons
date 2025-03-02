/*
28. Найти минимальную длину строки
Описание: Найдите минимальную длину строки.
Рекомендуемые функции: map, min.
Ввод: ["apple", "kiwi", "banana"]
Вывод: 4
Подсказка: Преобразуйте строки в их длину.
 */

import java.util.List;

public class Task28 {
    public static void main(String[] args) {
        List<String> list = List.of("apple", "kiwi", "banana");

        int minLength = list.stream()
                .mapToInt(String::length)
                .min()
                .orElse(0);

        System.out.println(minLength);
    }
}
