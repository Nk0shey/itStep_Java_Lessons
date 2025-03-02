/*
### 1. Вывод строки через лямбда

- **Описание**: Создайте лямбда-выражение, которое принимает строку и выводит её в консоль (аналог Consumer). Проверьте его на нескольких входных строках.

- **Пример ввода**: "Hello", "Lambda"

- **Пример вывода**:

  ```

  Hello

  Lambda

  ```

- **Подсказка**: Можно использовать функциональный интерфейс типа `Consumer<String>`.


 */

import java.util.function.Consumer;

public class Task01 {
    public static void main(String[] args) {
        Consumer<String> printString = str -> System.out.println(str);

        printString.accept("Hello");
        printString.accept("Lambda");

    }
}
