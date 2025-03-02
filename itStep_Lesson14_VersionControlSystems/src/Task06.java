/*
Задача 20: Многопоточная загрузка файла с прогрессом
Условие: Реализуйте приложение для загрузки большого файла (например, 1 ГБ) с сервера, разбивая загрузку на несколько потоков. Каждый поток загружает определенный диапазон байтов.
Поделите файл на части, равные числу потоков.
Каждый поток загружает свою часть файла.
Обновляйте и отображайте прогресс загрузки (например, каждые 100 мс).
Ввод:
URL файла.
Количество потоков.
Вывод:
Сообщения о прогрессе загрузки.
Подсказки:
Используйте HTTP-запрос с заголовком Range для указания диапазона байтов.
Для отображения прогресса используйте ScheduledExecutorService.
 */

import java.io.*;
import java.net.*;
import java.util.concurrent.*;

public class Task06 {
    private static final int NUM_THREADS = 4; // Количество потоков
    private static final String FILE_URL = "https://example.com/largefile.zip"; // URL файла
    private static final String OUTPUT_FILE = "downloaded_file.zip"; // Путь для сохранения файла
    private static long totalBytes = 0; // Общее количество байтов в файле
    private static long downloadedBytes = 0; // Загруженные байты

    public static void main(String[] args) throws Exception {
        // Получаем размер файла
        HttpURLConnection connection = (HttpURLConnection) new URL(FILE_URL).openConnection();
        connection.setRequestMethod("HEAD");
        totalBytes = connection.getContentLengthLong();

        // Создаем пул потоков
        ExecutorService executorService = Executors.newFixedThreadPool(NUM_THREADS);

        // Разделяем файл на части и запускаем потоки
        long partSize = totalBytes / NUM_THREADS;
        for (int i = 0; i < NUM_THREADS; i++) {
            long startByte = i * partSize;
            long endByte = (i == NUM_THREADS - 1) ? totalBytes : (startByte + partSize - 1);
            executorService.submit(new DownloadTask(startByte, endByte, i));
        }

        // Планировщик для отслеживания прогресса
        ScheduledExecutorService progressExecutor = Executors.newSingleThreadScheduledExecutor();
        progressExecutor.scheduleAtFixedRate(() -> {
            int progress = (int) ((downloadedBytes * 100) / totalBytes);
            System.out.println("Download Progress: " + progress + "%");
        }, 0, 100, TimeUnit.MILLISECONDS);

        // Ждем завершения всех потоков
        executorService.shutdown();
        executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);

        // Завершаем планировщик прогресса
        progressExecutor.shutdown();
        System.out.println("Download Complete!");
    }

    static class DownloadTask implements Runnable {
        private long startByte;
        private long endByte;
        private int threadId;

        public DownloadTask(long startByte, long endByte, int threadId) {
            this.startByte = startByte;
            this.endByte = endByte;
            this.threadId = threadId;
        }

        @Override
        public void run() {
            try {
                HttpURLConnection connection = (HttpURLConnection) new URL(FILE_URL).openConnection();
                connection.setRequestProperty("Range", "bytes=" + startByte + "-" + endByte);
                connection.setRequestMethod("GET");

                try (InputStream inputStream = connection.getInputStream();
                     RandomAccessFile outputFile = new RandomAccessFile(OUTPUT_FILE, "rw")) {
                    outputFile.seek(startByte);

                    byte[] buffer = new byte[1024];
                    int bytesRead;
                    while ((bytesRead = inputStream.read(buffer)) != -1) {
                        outputFile.write(buffer, 0, bytesRead);
                        synchronized (Task06.class) {
                            downloadedBytes += bytesRead;
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
