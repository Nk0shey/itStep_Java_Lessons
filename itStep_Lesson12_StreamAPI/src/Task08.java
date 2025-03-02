/*
8. Объединение строк с разделителем
Описание: Объедините все строки в одну строку через запятую.
Рекомендуемые функции: Collectors.joining.
Ввод: ["Alice", "Bob", "Charlie"]
Вывод: "Alice, Bob, Charlie"
Подсказка: Collectors.joining(", ") поможет объединить строки.

 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task08 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Alice", "Bob", "Charlie");
        String result = list.stream()
                        .collect(Collectors.joining(", "));
        System.out.println(result);
    }
}
