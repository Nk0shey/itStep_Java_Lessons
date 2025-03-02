/*
3. Подсчёт количества элементов
Описание: Подсчитайте количество элементов в списке.
Рекомендуемые функции: count.
Ввод: [1, 2, 3, 4, 5]
Вывод: 5
Подсказка: Вы можете сразу вызвать count() после создания потока.
 */

import java.util.Arrays;
import java.util.List;

public class Task03 {
    public static void main(String[] args) {
        List <Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        long countedList = list.stream()
                .count();

        System.out.println(countedList);
    }
}
