/*
### 7. Фильтрация списка по длине строк
- **Описание**: Дан список строк. Отфильтруйте (через `filter`) только те, у которых длина больше 3.
- **Пример ввода**: ["cat", "car", "apple", "hi", "java"]
- **Пример вывода**: ["apple", "java"]
- **Подсказка**: Используйте Stream и `filter(str -> str.length() > 3)`.
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Task07 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("cat", "car", "apple", "hi", "java");
        List<String> filteredList = list.stream()
                .filter(str -> str.length() > 3)
                .collect(Collectors.toList());

        System.out.println(filteredList);

    }
}
