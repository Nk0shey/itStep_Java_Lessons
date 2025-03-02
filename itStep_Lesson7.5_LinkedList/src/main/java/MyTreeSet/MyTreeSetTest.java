package MyTreeSet;

public class MyTreeSetTest {
    public static void main(String[] args) {
        MySet<Integer> treeSet = new MyTreeSet<Integer>();

        // Тест 1: Добавление элементов
        System.out.println(treeSet.add(10));  // Ожидается: true
        System.out.println(treeSet.add(20));  // Ожидается: true
        System.out.println(treeSet.add(5));   // Ожидается: true
        System.out.println(treeSet.add(10));  // Ожидается: false (уже существует)
        System.out.println("Size: " + treeSet.size());  // Ожидается: 3

        // Тест 2: Проверка наличия элементов
        System.out.println(treeSet.contains(10));  // Ожидается: true
        System.out.println(treeSet.contains(15));  // Ожидается: false

        // Тест 3: Удаление элементов
        System.out.println(treeSet.remove(10));  // Ожидается: true
        System.out.println(treeSet.remove(15));  // Ожидается: false
        System.out.println("Size: " + treeSet.size());  // Ожидается: 2

        // Тест 4: Проверка после удаления
        System.out.println(treeSet.contains(10));  // Ожидается: false
        System.out.println(treeSet.contains(20));  // Ожидается: true
    }
}
