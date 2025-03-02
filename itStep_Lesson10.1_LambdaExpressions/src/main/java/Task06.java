/*
### Задача 2: Фильтрация списка строк по длине

**Описание:**
Дан список строк. Отфильтровать те, у которых длина больше 3 символов.

**Пример ввода:**
```
["cat", "car", "apple", "hi", "java"]
```

**Пример вывода:**
```
["apple", "java"]
```

**Подсказки:**
- Использовать `stream().filter(...)`, в лямбда-выражении проверить `str.length() > 3`.

**Пояснение:**
Лямбда сделает фильтрацию лаконичной.
 */

import java.util.Arrays;
import java.util.List;

public class Task06 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("cat", "car", "apple", "hi", "java");

        List<String> sorted = strings.stream()
                .filter(str -> str.length() > 3)
                .toList();

        System.out.println("Слова, у которых длина больше 3 символов: " + sorted);
    }
}
