/*
Завдання 3: Користувач вводить з клавіатури шлях до файлу та слово для пошуку.
Після роботи програми на екрані відображається кількість разів, скільки слово зустрічається у файлі.

 */

import java.io.*;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Set the file path: ");
        String filePath = scanner.nextLine();

        System.out.println("Set the word that you want to search: ");
        String searchWord = scanner.nextLine();

        File file = new File(filePath);

//        int count = 0;

        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains(searchWord)) {
                    System.out.println(line);
//                    count++;
//                    if (count >= 1) {
//                        scanner.nextLine();
//                    }
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
