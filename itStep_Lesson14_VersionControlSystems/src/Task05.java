/*
Задача 19: Многопоточная сортировка строк
Условие: У вас есть текстовый файл, содержащий 1 миллион строк. Реализуйте программу, которая сортирует эти строки в алфавитном порядке с использованием многопоточности.
Разделите файл на 10 частей.
Каждый поток обрабатывает одну часть, сортируя строки.
Объедините результаты из всех потоков в один отсортированный файл.
Ввод:
Текстовый файл с 1 миллионом строк.
Вывод:
Отсортированный файл.
Подсказки:
Для разделения файла на части используйте BufferedReader.
Для сортировки строк в частях используйте Collections.sort.
Для слияния отсортированных частей используйте метод merge из сортировки слиянием.
 */

import java.io.*;
import java.util.*;
import java.util.concurrent.*;

public class Task05 {
    private static final int NUM_THREADS = 10;

    public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
        String inputFilePath = "input.txt";  // Исходный файл с 1 млн строк
        String outputFilePath = "sorted_output.txt";  // Файл с отсортированными строками

        // Разбиваем файл на 10 частей
        List<List<String>> chunks = splitFile(inputFilePath, NUM_THREADS);

        // Создаем пул потоков
        ExecutorService executor = Executors.newFixedThreadPool(NUM_THREADS);
        List<Future<List<String>>> futures = new ArrayList<>();

        // Запускаем сортировку в потоках
        for (List<String> chunk : chunks) {
            futures.add(executor.submit(() -> {
                Collections.sort(chunk);
                return chunk;
            }));
        }

        // Собираем отсортированные части
        List<List<String>> sortedChunks = new ArrayList<>();
        for (Future<List<String>> future : futures) {
            sortedChunks.add(future.get());
        }

        executor.shutdown();  // Завершаем пул потоков

        // Объединяем отсортированные части в один список
        List<String> sortedLines = mergeSortedChunks(sortedChunks);

        // Записываем результат в файл
        writeFile(sortedLines, outputFilePath);

        System.out.println("Сортировка завершена, результат записан в файл: " + outputFilePath);
    }

    // Разделение файла на части
    private static List<List<String>> splitFile(String filePath, int numParts) throws IOException {
        List<List<String>> chunks = new ArrayList<>();
        for (int i = 0; i < numParts; i++) {
            chunks.add(new ArrayList<>());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int index = 0;
            while ((line = reader.readLine()) != null) {
                chunks.get(index % numParts).add(line);
                index++;
            }
        }
        return chunks;
    }

    // Запись отсортированного списка в файл
    private static void writeFile(List<String> lines, String filePath) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        }
    }

    // Слияние отсортированных частей
    private static List<String> mergeSortedChunks(List<List<String>> sortedChunks) {
        PriorityQueue<ChunkEntry> minHeap = new PriorityQueue<>();

        // Добавляем первую строку из каждой отсортированной части в кучу
        for (int i = 0; i < sortedChunks.size(); i++) {
            if (!sortedChunks.get(i).isEmpty()) {
                minHeap.add(new ChunkEntry(sortedChunks.get(i).remove(0), i));
            }
        }

        List<String> merged = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            ChunkEntry entry = minHeap.poll();
            merged.add(entry.value);

            // Если в соответствующей части остались строки, добавляем следующую
            if (!sortedChunks.get(entry.chunkIndex).isEmpty()) {
                minHeap.add(new ChunkEntry(sortedChunks.get(entry.chunkIndex).remove(0), entry.chunkIndex));
            }
        }

        return merged;
    }

    // Класс для хранения элементов из разных частей в приоритетной очереди
    private static class ChunkEntry implements Comparable<ChunkEntry> {
        String value;
        int chunkIndex;

        ChunkEntry(String value, int chunkIndex) {
            this.value = value;
            this.chunkIndex = chunkIndex;
        }

        @Override
        public int compareTo(ChunkEntry other) {
            return this.value.compareTo(other.value);
        }
    }
}

