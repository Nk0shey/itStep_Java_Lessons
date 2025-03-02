package Task01;

/*
Завдання 2: Користувач вводить з клавіатури в рядок 0 та 1.
Перетворіть рядок на число цілого типу в десятковій системі числення.
Передбачте випадок виходу за межі діапазону, визначеного типом int, неправильне введення.
Використовуйте механізм винятків.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку, содержащую только 0 и 1:");

        String input = scanner.nextLine();

        try {
            // Проверка: строка не должна быть пустой
            if (input.isEmpty()) {
                throw new IllegalArgumentException("Введена пустая строка.");
            }

            // Проверка: строка должна содержать только 0 и 1
            if (!input.matches("[01]+")) {
                throw new IllegalArgumentException("Строка содержит символы, отличные от 0 и 1.");
            }

            // Преобразование двоичной строки в число
            int number = Integer.parseUnsignedInt(input, 2);
            System.out.println("Число в десятичной системе: " + number);

        } catch (NumberFormatException e) {
            // Обработка выхода за пределы диапазона int
            System.out.println("Ошибка: введенное двоичное число выходит за пределы диапазона int (от -2,147,483,648 до 2,147,483,647).");
            throw e;

        } catch (IllegalArgumentException e) {
            // Обработка неправильного ввода
            System.out.println("Ошибка: " + e.getMessage());
            throw e;

        } catch (Exception e) {
            // Общий блок для всех остальных непредвиденных исключений
            System.out.println("Произошла неизвестная ошибка: " + e.getMessage());
            throw e;

        } finally {
            // Закрытие сканера
            scanner.close();
        }
    }
}

