/*
### 15. Подсчёт вхождений каждого слова (GroupingBy)
- **Описание**: Дан список слов. Нужно создать Map, где ключ — слово, значение — число вхождений.
- **Пример ввода**: ["apple","banana","apple","cherry","banana"]
- **Пример вывода**: { apple=2, banana=2, cherry=1 }
- **Подсказка**: `stream().collect(Collectors.groupingBy(..., Collectors.counting()))`.
 */

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task15 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "banana");

        Map<String, Long> wordCount = words.stream()
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        System.out.println(wordCount);
    }
}
