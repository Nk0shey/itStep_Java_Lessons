/*
Задача 4: Счётчик с потоками
Уровень сложности: Простой
Описание задачи: Создайте общий счетчик, который увеличивается двумя потоками. Каждый поток увеличивает значение на 1, пока оно не достигнет 100.
Ввод: Нет.
Вывод: Последовательность чисел от 1 до 100.
Подсказки:
Используйте общий объект для хранения значения.
Обеспечьте синхронизацию доступа к переменной. Рекомендуемые API:
synchronized
java.util.concurrent.atomic.AtomicInteger

 */

import java.util.concurrent.atomic.AtomicInteger;

public class Task04 {
    private static final int LIMIT = 100;
    private static final AtomicInteger count = new AtomicInteger(0);

    public static void main(String[] args) {
        Thread thread1 = new Thread(new CounterRunnable());
        Thread thread2 = new Thread(new CounterRunnable());

        thread1.start();
        thread2.start();
    }

    static class CounterRunnable implements Runnable {
        @Override
        public void run() {
            while (true) {
                int current = count.incrementAndGet();
                if (current > LIMIT) {
                    break;
                }
                System.out.println(Thread.currentThread().getName() + " - " + current);
            }
        }
    }
}
