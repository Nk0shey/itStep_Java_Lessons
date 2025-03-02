/*
Завдання 6: Користувач з клавіатури вводить шляхи до чотирьох файлів.
Додаток має записати до четвертого файлу вміст трьох файлів.
Після роботи програми на екрані відображається звіт з інформацією про кількість перенесених байтів.
 */

import java.io.*;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення шляхів до файлів
        System.out.println("Enter the path of the first file: ");
        String filePath1 = scanner.nextLine();

        System.out.println("Enter the path of the second file: ");
        String filePath2 = scanner.nextLine();

        System.out.println("Enter the path of the third file: ");
        String filePath3 = scanner.nextLine();

        System.out.println("Enter the path of the target file: ");
        String targetFilePath = scanner.nextLine();

        // Масив шляхів до трьох файлів
        String[] sourceFiles = {filePath1, filePath2, filePath3};

        File targetFile = new File(targetFilePath);
        long totalBytesTransferred = 0;

        try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(targetFile))) {
            for (String sourceFilePath : sourceFiles) {
                File sourceFile = new File(sourceFilePath);

                if (sourceFile.exists() && sourceFile.isFile()) {
                    try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(sourceFile))) {
                        byte[] buffer = new byte[1024];
                        int bytesRead;

                        while ((bytesRead = inputStream.read(buffer)) != -1) {
                            outputStream.write(buffer, 0, bytesRead);
                            totalBytesTransferred += bytesRead;
                        }
                    }
                } else {
                    System.out.println("File does not exist or is not a file: " + sourceFilePath);
                }
            }

            System.out.println("Data transfer completed.");
            System.out.println("Total bytes transferred: " + totalBytesTransferred);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

