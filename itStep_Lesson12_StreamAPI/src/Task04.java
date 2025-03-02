/*
4. Проверка, все ли строки начинаются с буквы "A"
Описание: Проверьте, все ли строки в списке начинаются с буквы "A".
Рекомендуемые функции: allMatch.
Ввод: ["Apple", "Axe", "Ant"]
Вывод: true
Подсказка: Используйте условие s.startsWith("A").
 */


import java.util.Arrays;
import java.util.List;

public class Task04 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Axe", "Ant");
        boolean allMatch = list.stream()
                .allMatch(s -> s.startsWith("A"));

        System.out.println(allMatch);
    }
}
