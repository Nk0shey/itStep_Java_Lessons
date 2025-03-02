/*
19. Найти сумму чисел в диапазоне
Описание: Суммируйте все числа в заданном диапазоне.
Рекомендуемые функции: IntStream.range, sum.
Ввод: [1, 5]
Вывод: 15 (1+2+3+4)
Подсказка: Используйте IntStream.range для создания последовательности.

 */


import java.util.stream.IntStream;

public class Task19 {
        public static int sumInRange(int start, int end) {
            return IntStream.range(start, end).sum();
        }

        public static void main(String[] args) {
            System.out.println(sumInRange(1, 5)); // 10 (1+2+3+4)
        }
}
