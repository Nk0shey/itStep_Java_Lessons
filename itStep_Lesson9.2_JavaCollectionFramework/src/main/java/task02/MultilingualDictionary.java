package task02;

import java.util.*;

public class MultilingualDictionary {
    private static Map<String, List<String>> dictionary = new HashMap<>();
    private static Map<String, Integer> wordPopularity = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMultilingual Dictionary");
            System.out.println("1. Add Word and Translations");
            System.out.println("2. View Word and Translations");
            System.out.println("3. Edit Translations");
            System.out.println("4. Remove Word");
            System.out.println("5. View Top 10 Popular Words");
            System.out.println("6. View Top 10 Unpopular Words");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> addWord(scanner);
                case 2 -> viewWord(scanner);
                case 3 -> editTranslations(scanner);
                case 4 -> removeWord(scanner);
                case 5 -> viewTopWords(true);
                case 6 -> viewTopWords(false);
                case 7 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);

        scanner.close();
    }

    private static void addWord(Scanner scanner) {
        System.out.print("Enter the word: ");
        String word = scanner.nextLine().toLowerCase();
        System.out.print("Enter translations (comma-separated): ");
        String[] translations = scanner.nextLine().split(",");

        dictionary.put(word, new ArrayList<>(List.of(translations)));
        wordPopularity.put(word, 0);
        System.out.println("Word added successfully!");
    }

    private static void viewWord(Scanner scanner) {
        System.out.print("Enter the word to view: ");
        String word = scanner.nextLine().toLowerCase();

        if (dictionary.containsKey(word)) {
            System.out.println("Translations: " + dictionary.get(word));
            wordPopularity.put(word, wordPopularity.get(word) + 1);
        } else {
            System.out.println("Word not found!");
        }
    }

    private static void editTranslations(Scanner scanner) {
        System.out.print("Enter the word to edit: ");
        String word = scanner.nextLine().toLowerCase();

        if (dictionary.containsKey(word)) {
            System.out.println("Current Translations: " + dictionary.get(word));
            System.out.print("Enter new translations (comma-separated): ");
            String[] translations = scanner.nextLine().split(",");
            dictionary.put(word, new ArrayList<>(List.of(translations)));
            System.out.println("Translations updated!");
        } else {
            System.out.println("Word not found!");
        }
    }

    private static void removeWord(Scanner scanner) {
        System.out.print("Enter the word to remove: ");
        String word = scanner.nextLine().toLowerCase();

        if (dictionary.remove(word) != null) {
            wordPopularity.remove(word);
            System.out.println("Word removed!");
        } else {
            System.out.println("Word not found!");
        }
    }

    private static void viewTopWords(boolean popular) {
        Comparator<Map.Entry<String, Integer>> comparator = Map.Entry.comparingByValue();
        if (!popular) comparator = comparator.reversed();

        Comparator<Map.Entry<String, Integer>> finalComparator = comparator;
        dictionary.keySet().stream()
                .sorted((w1, w2) -> finalComparator.compare(
                        Map.entry(w1, wordPopularity.getOrDefault(w1, 0)),
                        Map.entry(w2, wordPopularity.getOrDefault(w2, 0))
                ))
                .limit(10)
                .forEach(word -> System.out.println(word + " (accessed " + wordPopularity.getOrDefault(word, 0) + " times)"));
    }
}

