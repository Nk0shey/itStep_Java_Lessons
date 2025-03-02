/*
### Задача 1: Максимум и минимум из списка чисел

**Описание:**
Дан список целых чисел. Найти максимальное и минимальное число,
используя лямбда-выражения и функциональные интерфейсы.

**Пример ввода:**
```
Список: [5, 2, 9, 1, 7]
```

**Пример вывода:**
```
Максимум: 9
Минимум: 1
```

**Подсказки:**
- Можно использовать `Stream.max()` и `Stream.min()` с лямбда-выражением-компаратором.
- Или использовать `Comparator<Integer>` в виде лямбда-выражения.

**Пояснение:**
Лямбда упростит создание компараторов при поиске максимума и минимума.
 */

import java.util.Arrays;
import java.util.List;

public class Task05 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 7);
        Integer max = numbers.stream()
                .max((a, b) -> Integer.compare(a, b))
                .orElse(null);
        System.out.println("Max number is: " + max);

        Integer min = numbers.stream()
                .min((a, b) -> Integer.compare(a, b))
                .orElse(null);
        System.out.println("Min number is: " + min);

    }
}
