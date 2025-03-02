package Task01;

/*
Завдання 1:
Користувач вводить з клавіатури в рядок набір символів від 0 до
9.
Перетворіть рядок на число цілого типу. Передбачте випадок
виходу за межі діапазону, визначеного типом int. Використовуйте
механізм виключень.
 */

import java.util.Scanner;

public class symbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите набор символов от 0 до 9:");

        String input = scanner.nextLine();

        try {
            // Проверка: строка не должна быть пустой
            if (input.isEmpty()) {
                throw new IllegalArgumentException("Введена пустая строка.");
            }

            // Проверка: строка должна содержать только цифры
            if (!input.matches("\\d+")) {
                throw new IllegalArgumentException("Строка содержит недопустимые символы, кроме цифр.");
            }

            // Преобразование строки в целое число
            int number = Integer.parseInt(input);
            System.out.println("Число: " + number);

        } catch (NumberFormatException e) {
            // Обработка выхода за пределы диапазона int
            System.out.println("Ошибка: введенное число выходит за пределы диапазона int (-2,147,483,648 до 2,147,483,647).");
            throw e;

        } catch (IllegalArgumentException e) {
            // Обработка некорректного ввода
            System.out.println("Ошибка: " + e.getMessage());
            throw e;

        } catch (Exception e) {
            // Общий блок для непредвиденных ошибок
            System.out.println("Произошла неизвестная ошибка: " + e.getMessage());
            throw e;

        } finally {
            // Закрытие сканера
            scanner.close();
        }
    }
}

