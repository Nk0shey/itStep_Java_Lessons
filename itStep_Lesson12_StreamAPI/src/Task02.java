/*
2. Преобразование строк в верхний регистр
Описание: Преобразуйте все строки списка в верхний регистр.
Рекомендуемые функции: map, collect.
Ввод: ["java", "stream", "api"]
Вывод: ["JAVA", "STREAM", "API"]
Подсказка: Используйте метод String::toUpperCase.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task02 {
    public static void main(String[] args) {
        List <String> list = Arrays.asList("java", "stream", "api");
        List <String> sorted = list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(sorted);
    }
}
