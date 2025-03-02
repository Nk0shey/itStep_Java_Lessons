/*
Задача 2: Синхронизация вывода
Уровень сложности: Простой
Описание задачи: Создайте два потока. Первый поток выводит "Hello", второй — "World". Потоки должны чередоваться.
Ввод: Нет.
Вывод: Hello World Hello World ...
Подсказки:
Используйте объект блокировки (synchronized или Lock).
Чередование можно организовать через wait() и notify(). Рекомендуемые API:
synchronized
Object.wait()
Object.notify()

 */

public class Task02 {
    private static final Object lock = new Object();
    private static boolean helloTurn = true;

    public static void main(String[] args) {
        Thread helloThread = new Thread(new HelloPrinter());
        Thread worldThread = new Thread(new WorldPrinter());

        helloThread.start();
        worldThread.start();
    }

    static class HelloPrinter implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                synchronized (lock) {
                    while (!helloTurn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.print("Hello ");
                    helloTurn = false;
                    lock.notify();
                }
            }
        }
    }

    static class WorldPrinter implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                synchronized (lock) {
                    while (helloTurn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.print("World ");
                    helloTurn = true;
                    lock.notify();
                }
            }
        }
    }
}


