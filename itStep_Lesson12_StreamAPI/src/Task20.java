/*
20. Преобразовать массив чисел в список
Описание: Преобразуйте массив чисел в список.
Рекомендуемые функции: Arrays.stream, collect.
Ввод: [1, 2, 3]
Вывод: [1, 2, 3]
Подсказка: Используйте Arrays.stream.
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task20 {
    public static List<Integer> convertArrayToList(int[] array) {
        return Arrays.stream(array)
                .boxed()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println(convertArrayToList(array));
    }
}
