/*
Завдання 2: До першого завдання додайте поекранне виведення,
 якщо вміст файлу не поміщається на екрані.
 */

import java.io.*;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set the file path: ");
        String filePath = scanner.nextLine();

        File file = new File(filePath);

        int count = 0;

        if (file.exists()) {
            try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                    count++;
                    if (count >= 5) {
                        scanner.nextLine();
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("File does not exist");
        }
    }
}
