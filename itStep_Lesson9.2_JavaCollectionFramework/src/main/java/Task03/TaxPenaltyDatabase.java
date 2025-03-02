package Task03;

import java.util.*;

class Fine {
    private String type;
    private String city;
    private double amount;

    public Fine(String type, String city, double amount) {
        this.type = type;
        this.city = city;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public String getCity() {
        return city;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Type: " + type + ", City: " + city + ", Amount: $" + amount;
    }
}

class TaxDatabase {
    private Map<String, List<Fine>> database = new HashMap<>();

    public void addPerson(String id) {
        database.putIfAbsent(id, new ArrayList<>());
        System.out.println("Person with ID " + id + " added.");
    }

    public void addFine(String id, Fine fine) {
        if (database.containsKey(id)) {
            database.get(id).add(fine);
            System.out.println("Fine added to ID " + id);
        } else {
            System.out.println("ID not found!");
        }
    }

    public void printDatabase() {
        if (database.isEmpty()) {
            System.out.println("Database is empty!");
            return;
        }
        for (Map.Entry<String, List<Fine>> entry : database.entrySet()) {
            System.out.println("ID: " + entry.getKey());
            entry.getValue().forEach(fine -> System.out.println("  " + fine));
        }
    }

    public void printById(String id) {
        if (database.containsKey(id)) {
            System.out.println("Fines for ID " + id + ":");
            database.get(id).forEach(System.out::println);
        } else {
            System.out.println("ID not found!");
        }
    }

    public void printByType(String type) {
        System.out.println("Fines of type: " + type);
        for (List<Fine> fines : database.values()) {
            fines.stream()
                    .filter(fine -> fine.getType().equalsIgnoreCase(type))
                    .forEach(System.out::println);
        }
    }

    public void printByCity(String city) {
        System.out.println("Fines in city: " + city);
        for (List<Fine> fines : database.values()) {
            fines.stream()
                    .filter(fine -> fine.getCity().equalsIgnoreCase(city))
                    .forEach(System.out::println);
        }
    }

    public void deleteFine(String id, int index) {
        if (database.containsKey(id)) {
            List<Fine> fines = database.get(id);
            if (index >= 0 && index < fines.size()) {
                fines.remove(index);
                System.out.println("Fine removed from ID " + id);
            } else {
                System.out.println("Invalid fine index!");
            }
        } else {
            System.out.println("ID not found!");
        }
    }

    public void updatePerson(String id, List<Fine> updatedFines) {
        if (database.containsKey(id)) {
            database.put(id, updatedFines);
            System.out.println("Updated fines for ID " + id);
        } else {
            System.out.println("ID not found!");
        }
    }
}

public class TaxPenaltyDatabase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaxDatabase db = new TaxDatabase();
        int choice;

        do {
            System.out.println("\nTax Penalty Database");
            System.out.println("1. Add Person");
            System.out.println("2. Add Fine");
            System.out.println("3. Print Full Database");
            System.out.println("4. Print Fines by ID");
            System.out.println("5. Print Fines by Type");
            System.out.println("6. Print Fines by City");
            System.out.println("7. Delete Fine");
            System.out.println("8. Update Person's Fines");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    db.addPerson(id);
                }
                case 2 -> {
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Fine Type: ");
                    String type = scanner.nextLine();
                    System.out.print("Enter City: ");
                    String city = scanner.nextLine();
                    System.out.print("Enter Amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    db.addFine(id, new Fine(type, city, amount));
                }
                case 3 -> db.printDatabase();
                case 4 -> {
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    db.printById(id);
                }
                case 5 -> {
                    System.out.print("Enter Fine Type: ");
                    String type = scanner.nextLine();
                    db.printByType(type);
                }
                case 6 -> {
                    System.out.print("Enter City: ");
                    String city = scanner.nextLine();
                    db.printByCity(city);
                }
                case 7 -> {
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Fine Index to Delete: ");
                    int index = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    db.deleteFine(id, index);
                }
                case 8 -> {
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter number of fines to update: ");
                    int count = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    List<Fine> updatedFines = new ArrayList<>();
                    for (int i = 0; i < count; i++) {
                        System.out.print("Enter Fine Type: ");
                        String type = scanner.nextLine();
                        System.out.print("Enter City: ");
                        String city = scanner.nextLine();
                        System.out.print("Enter Amount: ");
                        double amount = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline
                        updatedFines.add(new Fine(type, city, amount));
                    }
                    db.updatePerson(id, updatedFines);
                }
                case 9 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 9);

        scanner.close();
    }
}
