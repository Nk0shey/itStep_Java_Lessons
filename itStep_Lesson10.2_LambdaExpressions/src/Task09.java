/*
### 9. Проверить, все ли элементы списка — положительные
- **Описание**: Дан список чисел. Определите, являются ли все числа > 0 (через `allMatch`).
- **Пример ввода**: [2, 5, -1, 7]
- **Пример вывода**: false (так как -1 — не положительное)
- **Подсказка**: Используйте `stream().allMatch(x -> x > 0)`.
 */

import java.util.Arrays;
import java.util.List;

public class Task09 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 5, -1, 7);

        boolean sorted = list.stream()
                .allMatch(x -> x > 0);

        System.out.println(sorted);
    }
}