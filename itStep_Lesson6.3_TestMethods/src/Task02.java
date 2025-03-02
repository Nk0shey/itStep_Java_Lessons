/*
#### 2. Знайти найдовше слово у рядку
Завдання: Напишіть статичний метод, який приймає рядок і повертає найдовше слово в цьому рядку.
Вхід: "Java is a powerful programming language"
Вихід: "programming"
Алгоритм: Розбиваємо рядок на слова, використовуючи метод split().
Порівнюємо довжини кожного слова та повертаємо найдовше.
 */

public class Task02 {
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");

        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }

    public static void main(String[] args) {
        String sentence = "Java is a powerful programming language";

        System.out.println("Найдовше слово у реченні: " + findLongestWord(sentence));
    }
}
