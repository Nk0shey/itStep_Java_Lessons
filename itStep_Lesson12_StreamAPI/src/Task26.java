/*
26. Найти индекс элемента
Описание: Найдите индекс первого элемента, равного "target".
Рекомендуемые функции: IntStream.range, filter, findFirst.
Ввод: ["a", "b", "target", "c"]
Вывод: 2
Подсказка: Используйте IntStream.range(0, list.size()).
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Task26 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "target", "c");
        String target = "target";

        int index = IntStream.range(0, list.size())
                .filter(i -> list.get(i).equals(target))
                .findFirst().
                orElse(-1);

        System.out.println(index);
    }
}
