/*
### 18. Объединить несколько списков строк в один (concat)
- **Описание**: Дан набор списков строк. Слейте их в один список без дубликатов.
- **Пример ввода**: ["apple","car"] и ["car","banana"] и ["apple","banana","date"]
- **Пример вывода**: ["apple","car","banana","date"]
- **Подсказка**: `Stream.concat(...).distinct()` (можно цепочкой).
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Task18 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("apple", "car");
        List<String> list2 = Arrays.asList("car", "banana");
        List<String> list3 = Arrays.asList("apple", "banana", "date");

        List<String> sorted = Stream.concat(Stream.concat(list1.stream(), list2.stream()), list3.stream())
                .distinct()
                .toList();

        System.out.println(sorted);
    }
}
