/*
23. Преобразование чисел в строки
Описание: Преобразуйте список чисел в список строк.
Рекомендуемые функции: map, collect.
Ввод: [1, 2, 3]
Вывод: ["1", "2", "3"]
Подсказка: Используйте String.valueOf(n).

 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task23 {
    public static List<String> convertNumbersToStrings(List<Integer> numbers) {
        return numbers.stream()
                .map(String::valueOf)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        System.out.println(convertNumbersToStrings(numbers));
    }
}
