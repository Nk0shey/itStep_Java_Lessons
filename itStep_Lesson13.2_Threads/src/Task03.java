/*
Задача 3: Таймер в потоке
Уровень сложности: Простой
Описание задачи: Создайте поток, который каждую секунду выводит текущее время в формате HH:mm:ss.
Ввод: Нет.
Вывод: Текущее время каждую секунду.
Подсказки:
Используйте класс SimpleDateFormat для форматирования времени.
Остановите поток через Thread.sleep(1000). Рекомендуемые API:
java.text.SimpleDateFormat
java.lang.Thread.sleep
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task03 {
    public static void main(String[] args) {
        Thread timeThread = new Thread(new TimeRunnable());
        timeThread.start();
    }

    static class TimeRunnable implements Runnable {
        @Override
        public void run() {
            SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
            while (true) {
                System.out.println("Current Time: " + formatter.format(new Date()));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
