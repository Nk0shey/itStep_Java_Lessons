import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/*
Задача 13: Параллельный поиск минимального элемента в массиве
Условие: Дан массив из 1 миллиарда случайных чисел. Найдите минимальный элемент массива с использованием многопоточности.
Разделите массив на части.
Запустите потоки для нахождения минимального элемента в каждой части.
После завершения работы всех потоков найдите минимальный элемент среди всех локальных минимумов.
Ввод:
Массив из 1 миллиарда элементов.
Вывод:
Минимальный элемент массива.
Подсказки:
Для разделения работы используйте ForkJoinPool.
Для поиска минимума в каждом подмассиве используйте Arrays.stream(part).min().

 */

public class Task01 {
    private static final int SIZE = 100000;  // 1 миллиард элементов
    private static final int THRESHOLD = 10_000; // Порог для разделения

    public static void main(String[] args) {
        // Создаем массив случайных чисел
        int[] array = new Random().ints(SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE).toArray();

        // Создаем пул потоков
        ForkJoinPool pool = new ForkJoinPool();

        // Запускаем задачу поиска минимума
        int min = pool.invoke(new MinSearchTask(array, 0, SIZE));

        // Выводим результат
        System.out.println("Минимальный элемент: " + min);
    }

    static class MinSearchTask extends RecursiveTask<Integer> {
        private final int[] array;
        private final int start, end;

        public MinSearchTask(int[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }

        @Override
        protected Integer compute() {
            if (end - start <= THRESHOLD) {
                // Базовый случай: находим минимум в подмассиве
                return Arrays.stream(array, start, end).min().getAsInt();
            } else {
                // Разделяем массив на две части
                int mid = start + (end - start) / 2;
                MinSearchTask leftTask = new MinSearchTask(array, start, mid);
                MinSearchTask rightTask = new MinSearchTask(array, mid, end);

                // Запускаем подзадачи
                leftTask.fork();
                int rightResult = rightTask.compute();
                int leftResult = leftTask.join();

                // Возвращаем минимум из двух частей
                return Math.min(leftResult, rightResult);
            }
        }
    }
}
