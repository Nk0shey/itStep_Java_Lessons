/*
### Задача 4: Подсчёт количества слов, начинающихся с определённой буквы

**Описание:**
Дан список слов и символ `c`. Подсчитать количество слов, начинающихся на эту букву `c`.

**Пример ввода:**
```
Слова: ["apple", "art", "cat", "car"]
Символ: 'a'
```

**Пример вывода:**
```
Количество слов на 'a': 2 (apple, art)
```

**Подсказки:**
- Использовать `filter(str -> str.startsWith("a"))` и затем `count()`.

**Пояснение:**
Лямбда легко задаёт условие фильтрации.
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task08 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "art", "cat", "car");

        long sorted = strings.stream()
                .filter(str -> str.startsWith("c"))
                .count();
        List<String> sortedWords = strings.stream()
                        .filter(str -> str.startsWith("c"))
                        .toList();

        System.out.println("The quantity of words started on c: " + sorted);
        System.out.println("List of sorted words " + sortedWords);
    }
}
