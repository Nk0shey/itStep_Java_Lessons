/*
### 16. Проверить, есть ли в списке хотя бы одно отрицательное число
- **Описание**: Дан список чисел. Определите, есть ли хотя бы одно число < 0 (через `anyMatch`).
- **Пример ввода**: [1, 4, 7, -2, 9]
- **Пример вывода**: true
- **Подсказка**: `stream().anyMatch(x -> x < 0)`.
 */

import java.util.Arrays;
import java.util.List;

public class Task16 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 4, 7, -2, 9);

        boolean result = list.stream()
                .anyMatch(x -> x < 0);

        System.out.println(result);
    }
}
