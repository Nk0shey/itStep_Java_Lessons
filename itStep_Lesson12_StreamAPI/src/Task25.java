/*
25. Объединение первых N строк
Описание: Возьмите первые 3 строки и объедините их через пробел.
Рекомендуемые функции: limit, Collectors.joining.
Ввод: ["Alice", "Bob", "Charlie", "David"]
Вывод: "Alice Bob Charlie"
Подсказка: Используйте limit(3).
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task25 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Alice", "Bob", "Charlie", "David");

        String result = list.stream()
                .limit(3)
                .collect(Collectors.joining(" "));

        System.out.println(result);
    }
}
