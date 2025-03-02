/*
41. Подсчитать количество символов в строках
Описание: Подсчитайте общее количество символов во всех строках списка.
Рекомендуемые функции: map, mapToInt, sum.
Ввод: ["hello", "world"]
Вывод: 10
Подсказка: Используйте s.length() для подсчёта длины строки.
 */

import java.util.Arrays;
import java.util.List;

public class Task41 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world");
        int length = list.stream()
                .mapToInt(String::length)
                .sum();

        System.out.println(length);


    }
}
