import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/*
Задача 16: Многопоточный калькулятор
Условие: Создайте многопоточный калькулятор, который выполняет следующие операции: сложение, вычитание, умножение и деление.
Пользователь вводит строку вида число1 оператор число2 (например, 5 + 3).
Каждое выражение передается в отдельный поток для вычисления.
Результаты вычислений сохраняются в потокобезопасную коллекцию и выводятся на экран в порядке выполнения операций.
Ввод:
Набор строк вида число1 оператор число2.
Вывод:
Результаты вычислений, например:
5 + 3 = 8
7 - 2 = 5
Подсказки:
Используйте ConcurrentLinkedQueue для хранения задач.
Для выполнения вычислений используйте  ExecutorService.
Реализуйте парсер выражений для разбора строки.
 */

public class Task02 {
    private static final ExecutorService executor = Executors.newFixedThreadPool(4); // 4 потока
    private static final ConcurrentLinkedQueue<String> results = new ConcurrentLinkedQueue<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражения (или 'exit' для выхода):");

        while (true) {
            String input = scanner.nextLine();
            if ("exit".equalsIgnoreCase(input)) break; // Выход из программы

            executor.submit(() -> {
                String result = calculateExpression(input);
                results.add(result);
            });
        }

        executor.shutdown(); // Завершаем потоковый пул
        try {
            executor.awaitTermination(5, TimeUnit.SECONDS); // Ждем завершения
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Выводим результаты в порядке выполнения
        results.forEach(System.out::println);
    }

    private static String calculateExpression(String input) {
        try {
            String[] parts = input.split(" ");
            if (parts.length != 3) return "Ошибка: Неверный формат";

            double num1 = Double.parseDouble(parts[0]);
            double num2 = Double.parseDouble(parts[2]);
            String operator = parts[1];
            double result;

            switch (operator) {
                case "+" -> result = num1 + num2;
                case "-" -> result = num1 - num2;
                case "*" -> result = num1 * num2;
                case "/" -> {
                    if (num2 == 0) return input + " = Ошибка: деление на ноль";
                    result = num1 / num2;
                }
                default -> {
                    return "Ошибка: Неизвестный оператор";
                }
            }
            return input + " = " + result;
        } catch (NumberFormatException e) {
            return "Ошибка: Некорректные числа";
        }
    }
}
