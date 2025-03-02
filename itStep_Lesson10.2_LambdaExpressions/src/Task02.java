/*
### 2. Удвоение числа
- **Описание**: Напишите лямбду (типа `Function<Integer, Integer>`), которая принимает целое число и возвращает это число, умноженное на 2.
- **Пример ввода**: 5
- **Пример вывода**: 10
- **Подсказка**: Используйте простую арифметику в лямбде: `n -> n * 2`.
 */

import java.util.function.Function;

public class Task02 {
    public static void main(String[] args) {
        Function<Integer, Integer> fun = x -> x * 2;
        System.out.println(fun.apply(5));
    }
}
