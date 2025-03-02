/*
### Задача 3: Преобразование списка чисел в их квадраты

**Описание:**
Дан список чисел. Вернуть новый список, в котором каждое число возведено в квадрат.

**Пример ввода:**
```
[1, 2, 3, 4]
```

**Пример вывода:**
```
[1, 4, 9, 16]
```

**Подсказки:**
- Использовать `map(x -> x*x)`.

**Пояснение:**
Лямбда в `map()` упрощает определение преобразования.
 */

import java.util.Arrays;
import java.util.List;

public class Task07 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);

        List<Integer> square = list.stream()
                .map(x -> x * x)
                .toList();

        System.out.println(square);
    }
}
