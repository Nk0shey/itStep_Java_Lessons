/*
Задача 18: Параллельная обработка веб-страниц
Условие: Разработайте приложение, которое скачивает содержимое 10 веб-страниц параллельно и сохраняет их в локальные файлы.
Задайте список из 10 URL-адресов.
Используйте 10 потоков для загрузки страниц.
Каждая страница должна сохраняться в файл с именем page_<номер>.html.
Ввод:
Список URL-адресов.
Вывод:
Локальные HTML-файлы.
Подсказки:
Используйте HttpURLConnection для загрузки страниц.
Для управления потоками используйте ExecutorService.
 */

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task04 {
    private static final List<String> URLS = List.of(
            "https://example.com",
            "https://www.wikipedia.org",
            "https://www.github.com",
            "https://www.stackoverflow.com",
            "https://www.oracle.com",
            "https://www.google.com",
            "https://www.microsoft.com",
            "https://www.apple.com",
            "https://www.amazon.com",
            "https://www.mozilla.org"
    );

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10); // 10 потоков

        for (int i = 0; i < URLS.size(); i++) {
            int pageNumber = i + 1;
            String url = URLS.get(i);
            executor.submit(() -> downloadPage(url, pageNumber));
        }

        executor.shutdown(); // Завершаем пул потоков
    }

    private static void downloadPage(String urlString, int pageNumber) {
        try {
            System.out.println("Загрузка: " + urlString);
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                 BufferedWriter writer = new BufferedWriter(new FileWriter("page_" + pageNumber + ".html"))) {

                String line;
                while ((line = reader.readLine()) != null) {
                    writer.write(line);
                    writer.newLine();
                }
            }

            System.out.println("Сохранено: page_" + pageNumber + ".html");
        } catch (IOException e) {
            System.err.println("Ошибка загрузки " + urlString + ": " + e.getMessage());
        }
    }
}

