/*
### 14. Фильтр уникальных слов (distinct)
- **Описание**: Дан список слов с повторениями. Получите поток (stream), уберите дубликаты (`distinct`), выведите итоговый список.
- **Пример ввода**: ["apple","banana","apple","cherry","banana"]
- **Пример вывода**: ["apple","banana","cherry"]
- **Подсказка**: `stream().distinct().collect(...)`
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task14 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","banana","apple","cherry","banana");

        List<String> sortedList = list.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(sortedList);
    }
}
