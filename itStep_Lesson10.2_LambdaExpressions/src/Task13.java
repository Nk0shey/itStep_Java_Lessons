/*
### 13. Сортировка строк по убыванию длины, а при равенстве — лексикографически

- **Описание**: Дан список строк. Отсортируйте так, чтобы самые длинные шли первыми; при одинаковой длине — по алфавиту.

- **Пример ввода**: ["cat","car","apple","hi"]

- **Пример вывода**: ["apple", "car", "cat", "hi"]

- **Подсказка**: Используйте `list.sort(...)` с лямбда-компаратором. Сначала `Integer.compare(b.length(), a.length())`, при равенстве `a.compareTo(b)`.

list.sort((a, b) -> {

            // Сравниваем длину: b - a, чтобы более длинные шли первыми

            // Если длины одинаковы, сортируем лексикографически по возрастанию

        });

 */

import java.util.Arrays;
import java.util.List;

public class Task13 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("cat","car","apple","hi");

        list.sort((a, b) -> {
            int lengthComparison = Integer.compare(b.length(), a.length());
            if (lengthComparison != 0) {
                return lengthComparison;
            }
            return a.compareTo(b);
        });
        System.out.println(list);
    }
}
