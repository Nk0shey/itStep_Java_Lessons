/*
### 10. Получить первый элемент, который больше 10
- **Описание**: Дан список чисел. Найдите первый (через `findFirst`), который больше 10, или верните что-то вроде "None", если не найдено.
- **Пример ввода**: [3, 9, 10, 12, 15]
- **Пример вывода**: 12 (первый, кто строго > 10)
- **Подсказка**: `stream().filter(x -> x > 10).findFirst().orElse(...)`.
 */

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;

public class Task10 {
    public static void main(String[] args) {
       List<Integer> list = Arrays.asList(3, 9, 10, 12, 15);

        Integer result = list.stream()
                .filter(x -> x > 10)
                .findFirst()
                .orElse(null);

        if(result != null) {
            System.out.println(result);
        } else {
            System.out.println("None");
        }
    }
}
