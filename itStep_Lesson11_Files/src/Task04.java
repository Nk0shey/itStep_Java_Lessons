/*
Завдання 4: Користувач вводить з клавіатури шлях до файлу,
Після роботи програми на екрані відображається кількість літер, чисел і розділових знаків у файлі.
 */

import java.io.*;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set the file path: ");
        String filePath = scanner.nextLine();

        File file = new File(filePath);

        if (file.exists()) {
            int letterCount = 0;
            int digitCount = 0;
            int punctuationCount = 0;

            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    for (char c : line.toCharArray()) {
                        if (Character.isLetter(c)) {
                            letterCount++;
                        } else if (Character.isDigit(c)) {
                            digitCount++;
                        } else if (isPunctuation(c)) {
                            punctuationCount++;
                        }
                    }
                }

                // Виведення результатів після завершення читання файлу
                System.out.println("Letters: " + letterCount);
                System.out.println("Digits: " + digitCount);
                System.out.println("Punctuation marks: " + punctuationCount);

            } catch (IOException e) {
                System.out.println("An error occurred while reading the file: " + e.getMessage());
            }
        } else {
            System.out.println("File does not exist");
        }
    }

    /**
     * Перевіряє, чи є символ розділовим знаком
     */
    private static boolean isPunctuation(char c) {
        // Перевіряємо, чи є символ у наборі розділових знаків
        return "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~".indexOf(c) != -1;
    }
}
