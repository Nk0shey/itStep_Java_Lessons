/*
### 12. Поиск максимального элемента по лямбда-компаратору
- **Описание**: Дан список чисел. Найти максимальное число через `stream().max(...)`.
- **Пример ввода**: [2, 10, 7, 14, 3]
- **Пример вывода**: 14
- **Подсказка**: `max(Comparator.comparingInt(x -> x))` или `Integer::compare`.
 */

import java.util.Arrays;
import java.util.List;

public class Task12 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 10, 7, 14, 3);

        int max = list.stream().max(Integer::compare).get();

        System.out.println(max);
    }
}
