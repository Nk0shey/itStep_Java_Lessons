/*
Задача 17: Синхронизация потоков через барьер
Условие: Реализуйте многопоточное приложение, где 5 потоков выполняют свои задачи параллельно, но должны синхронизироваться на определенном этапе выполнения. После этого этапа они продолжают выполнение.
Каждый поток должен вывести сообщение перед барьером: Thread <номер> is waiting.
После прохождения барьера каждый поток выводит: Thread <номер> has passed the barrier.
Ввод:
Нет ввода.
Вывод:
Сообщения от потоков о прохождении барьера.
Подсказки:
Используйте CyclicBarrier из пакета java.util.concurrent.
Для имитации работы потоков до барьера используйте Thread.sleep.
 */

import java.util.concurrent.CyclicBarrier;

public class Task03 {
    private static final int THREAD_COUNT = 5;

    public static void main(String[] args) {
        // Создаем барьер для 5 потоков, который выполняет действие при разблокировке
        CyclicBarrier barrier = new CyclicBarrier(THREAD_COUNT,
                () -> System.out.println("Все потоки достигли барьера, продолжаем выполнение!\n")
        );

        // Запускаем 5 потоков
        for (int i = 1; i <= THREAD_COUNT; i++) {
            new Thread(new Worker(i, barrier)).start();
        }
    }

    static class Worker implements Runnable {
        private final int threadNumber;
        private final CyclicBarrier barrier;

        public Worker(int threadNumber, CyclicBarrier barrier) {
            this.threadNumber = threadNumber;
            this.barrier = barrier;
        }

        @Override
        public void run() {
            try {
                // Имитация работы перед барьером
                System.out.println("Thread " + threadNumber + " is working...");
                Thread.sleep((long) (Math.random() * 3000));

                // Поток сообщает, что он ждет других
                System.out.println("Thread " + threadNumber + " is waiting at the barrier.");
                barrier.await(); // Ожидание других потоков

                // После барьера
                System.out.println("Thread " + threadNumber + " has passed the barrier.");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

