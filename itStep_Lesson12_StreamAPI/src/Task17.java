/*
17. Найти последний элемент
Описание: Найдите последний элемент списка.
Рекомендуемые функции: reduce.
Ввод: [1, 2, 3, 4]
Вывод: 4
Подсказка: Используйте функцию свертки с акцентом на последний элемент.
 */

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task17 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);

        Optional<Integer> lastElement = list.stream()
                .reduce((first, second) -> second);

        System.out.println(lastElement);
    }
}
