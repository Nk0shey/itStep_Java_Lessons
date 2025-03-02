/*
Завдання 5: Користувач вводить з клавіатури шлях до файлу та слово для пошуку.
Програма шукає потрібне слово і робить заміну на друге слово.
 */

import java.io.*;
import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення шляху до файлу
        System.out.println("Set the file path: ");
        String filePath = scanner.nextLine();

        // Введення слова для пошуку
        System.out.println("Enter the word to search: ");
        String searchWord = scanner.nextLine();

        // Введення слова для заміни
        System.out.println("Enter the word to replace it with: ");
        String replaceWord = scanner.nextLine();

        File file = new File(filePath);

        if (file.exists()) {
            try {
                // Зчитування вмісту файлу
                StringBuilder content = new StringBuilder();
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        // Заміна слова в кожному рядку
                        content.append(line.replaceAll("\\b" + searchWord + "\\b", replaceWord)).append(System.lineSeparator());
                    }
                }

                // Запис оновленого вмісту назад у файл
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                    writer.write(content.toString());
                }

                System.out.println("The word \"" + searchWord + "\" has been replaced with \"" + replaceWord + "\".");

            } catch (IOException e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
}

