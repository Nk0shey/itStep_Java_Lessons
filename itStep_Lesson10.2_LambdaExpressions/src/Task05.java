/*
### 5. Преобразование строки в её длину
- **Описание**: Сделайте лямбду типа `Function<String, Integer>`: на вход строка, на выходе длина этой строки.
- **Пример ввода**: "Java"
- **Пример вывода**: 4
- **Подсказка**: Воспользуйтесь методом `.length()` строки.
 */

import java.util.function.Function;

public class Task05 {
    public static void main(String[] args) {
        Function<String, Integer> lambda = x -> x.length();
        String word = "Java";
        System.out.println("The word " + word + " has " + lambda.apply("Java") + " characters.");
    }
}
