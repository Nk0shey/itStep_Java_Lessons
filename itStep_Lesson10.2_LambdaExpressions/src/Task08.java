/*
### 8. Умножение всех чисел списка на 3
- **Описание**: Дан список целых чисел. Примените `map`, умножающий каждое число на 3, и соберите результат.
- **Пример ввода**: [1, 2, 3]
- **Пример вывода**: [3, 6, 9]
- **Подсказка**: `list.stream().map(x -> x * 3) ...`
 */


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task08 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);

        List<Integer> multipleNumbers = numbers.stream()
                .map(x -> x * 3)
                .collect(Collectors.toList());

        System.out.println(multipleNumbers);
    }
}
