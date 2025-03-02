/*
Задача 7: Производитель-Потребитель
Уровень сложности: Средний
Описание задачи: Реализуйте паттерн "Производитель-Потребитель" с использованием очереди. Один поток добавляет числа в очередь, другой извлекает их.
Ввод: Нет.
Вывод: Лог действий производителя и потребителя.
Подсказки:
Используйте BlockingQueue для синхронизации.
Производитель должен ждать, если очередь заполнена.
Потребитель должен ждать, если очередь пуста. Рекомендуемые API:
java.util.concurrent.BlockingQueue
java.util.concurrent.ArrayBlockingQueue
 */

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Task07 {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
        Thread producerThread = new Thread(new Producer(queue));
        Thread consumerThread = new Thread(new Consumer(queue));

        producerThread.start();
        consumerThread.start();
    }

    static class Producer implements Runnable {
        private final BlockingQueue<Integer> queue;
        private int counter = 1;

        public Producer(BlockingQueue<Integer> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    Thread.sleep(500); // Симуляция работы
                    queue.put(counter);
                    System.out.println("Производитель добавил: " + counter);
                    counter++;
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    static class Consumer implements Runnable {
        private final BlockingQueue<Integer> queue;

        public Consumer(BlockingQueue<Integer> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    int item = queue.take();
                    System.out.println("Потребитель обработал: " + item);
                    Thread.sleep(1000); // Симуляция обработки
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
