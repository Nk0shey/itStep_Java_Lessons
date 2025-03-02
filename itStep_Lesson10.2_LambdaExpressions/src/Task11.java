/*
### 11. Подсчёт суммарной длины всех строк
- **Описание**: Дан список строк. Посчитайте сумму их длин (через `mapToInt` + `sum`).
- **Пример ввода**: ["hi", "java", "lambda"]
- **Пример вывода**: 14 (2 + 4 + 6 = 12, если "lambda" — 6 символов; "java" — 4; "hi" — 2)
- **Подсказка**: Примените стрим, `mapToInt(str -> str.length())`, затем `.sum()`.
 */

import java.util.Arrays;
import java.util.List;

public class Task11 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hi", "java", "lambda");

        int sum = list.stream()
                .mapToInt(str -> str.length())
                .sum();

        System.out.println(sum);
    }
}
