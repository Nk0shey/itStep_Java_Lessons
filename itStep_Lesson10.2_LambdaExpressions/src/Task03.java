/*
### 3. Проверка на чётность
- **Описание**: Создайте лямбда-выражение (типа `Predicate<Integer>`),
которое возвращает true, если число чётное, и false — если нечётное.
- **Пример ввода**: 7
- **Пример вывода**: false
- **Подсказка**: Модуль от деления на 2 (`n % 2 == 0`) часто используется.
 */

import java.util.function.Predicate;

public class Task03 {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;

        int testNumber1 = 3;
        int testNumber2 = 8;
        System.out.println(testNumber1 + " is even: " + isEven.test(testNumber1));
        System.out.println(testNumber2 + " is even: " + isEven.test(testNumber2));
    }
}
