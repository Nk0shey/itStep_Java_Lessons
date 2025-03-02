/*
Задача 1: Создание потоков
Уровень сложности: Простой
Описание задачи: Напишите программу, которая создает два потока. Первый поток печатает числа от 1 до 10. Второй поток печатает те же числа в обратном порядке (от 10 до 1).
Ввод: Нет.
Вывод: Чередующиеся числа от 1 до 10 и от 10 до 1.
Подсказки:
Используйте интерфейс Runnable для создания потоков.
В методе run() задайте логику для каждого потока.
Создайте потоки с помощью Thread и вызовите start(). Рекомендуемые API:
java.lang.Thread
java.lang.Runnable
 */

public class Task01 {
    public static void main(String[] args) {
        Thread ascendingThread = new Thread(new AscendingNumbers());
        Thread descendingThread = new Thread(new DescendingNumbers());

        ascendingThread.start();
        descendingThread.start();
    }
}

class AscendingNumbers implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Ascending: " + i);
            try {
                Thread.sleep(100); // небольшая задержка для наглядности
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class DescendingNumbers implements Runnable {
    @Override
    public void run() {
        for (int i = 10; i >= 1; i--) {
            System.out.println("Descending: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
