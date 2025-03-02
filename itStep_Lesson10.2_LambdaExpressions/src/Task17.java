/*
### 17. Удалить из списка строки, которые короче N
- **Описание**: Дан список строк и число N. Удалите все строки, длина которых меньше N (можно изменить существующий список или создать новый).
- **Пример ввода**: (["hi","java","codes"], 3)
- **Пример вывода**: ["java", "codes"]
- **Подсказка**: Используйте `removeIf(str -> str.length() < N)` или стрим-фильтрацию.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task17 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("hi", "java", "codes"));
        int N = 3;

        list.removeIf(str -> str.length() < N);
        System.out.println(list);
    }
}
