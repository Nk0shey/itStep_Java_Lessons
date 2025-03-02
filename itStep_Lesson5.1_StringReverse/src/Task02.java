/*
Користувач вводить з клавіатури рядок та слово для пошуку.
Підрахуйте, скільки разів у рядку зустрічається шукане слово. Отримане число виведіть на екран.
 */

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть рядок: ");
        String input = scanner.nextLine();

        System.out.print("Введіть слово для пошуку: ");
        String word = scanner.nextLine();

        String[] words = input.split(" +");

        int count = 0;

        for (String w : words) {
            if (w.equals(word)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
