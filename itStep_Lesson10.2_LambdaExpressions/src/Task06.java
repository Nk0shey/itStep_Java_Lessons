/*
### 6. Склеивание двух строк
- **Описание**: Лямбда `BiFunction<String, String, String>`, которая конкатенирует две строки.
- **Пример ввода**: ("Hello, ", "world!")
- **Пример вывода**: "Hello, world!"
- **Подсказка**: Не забывайте про оператор `+` для строк или `StringBuilder`.
 */

import java.util.function.BiFunction;

public class Task06 {
    public static void main(String[] args) {
        BiFunction<String, String, String> fun = (s1, s2) -> s1 + s2;

        String input = "Hello, ";
        String input2 = "World!";

        String output = fun.apply(input, input2);
        System.out.println(output);
    }
}
