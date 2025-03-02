/*
12. Проверка наличия хотя бы одного отрицательного числа
Описание: Проверьте, есть ли хотя бы одно отрицательное число.
Рекомендуемые функции: anyMatch.
Ввод: [1, -2, 3, 4]
Вывод: true
Подсказка: Используйте условие n < 0.
 */

import java.util.Arrays;
import java.util.List;

public class Task12 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, -2, 3, 4);
        boolean result = list.stream()
                .anyMatch(n -> n < 0);

        System.out.println(result);
    }
}
