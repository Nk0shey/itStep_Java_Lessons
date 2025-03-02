/*
15. Подсчитать частоту каждого элемента
Описание: Подсчитайте, сколько раз каждый элемент встречается в списке.
Рекомендуемые функции: Collectors.groupingBy, Collectors.counting.
Ввод: ["a", "b", "a", "c", "b", "a"]
Вывод: {a=3, b=2, c=1}
Подсказка: Используйте Collectors.groupingBy.
 */

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task15 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "a", "c", "b", "a");
        Map<String, Long> frequencyMap = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(frequencyMap);
    }
}
