/*
34. Создать строку из первых букв
Описание: Создайте строку из первых букв всех слов.
Рекомендуемые функции: map, Collectors.joining.
Ввод: ["Java", "Stream", "API"]
Вывод: "JSA"
Подсказка: Используйте s.charAt(0).
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task34 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Stream", "API");
        String result = list.stream()
                .map(s -> String.valueOf(s.charAt(0)))
                .collect(Collectors.joining());

        System.out.println(result);
    }
}
