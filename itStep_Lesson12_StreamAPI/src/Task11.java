/*
11. Сумма чётных чисел
Описание: Найдите сумму всех чётных чисел.
Рекомендуемые функции: filter, mapToInt, sum.
Ввод: [1, 2, 3, 4, 5]
Вывод: 6
Подсказка: Используйте комбинацию фильтрации и преобразования.
 */

import java.util.Arrays;
import java.util.List;

public class Task11 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int sumList = list.stream()
                .filter(x -> x % 2 == 0)
                .mapToInt(x -> x)
                .sum();

        System.out.println(sumList);
    }
}
