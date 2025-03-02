package MyLinkedList;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyList<String> list = new MyLinkedList<String>();  // Используем интерфейс MyLinkedList.MyList

        // Тест 1: Добавление элементов
        list.add("First");
        list.add("Second");
        list.add("Third");
        System.out.println("Size: " + list.size());  // Ожидается: 3

        // Тест 2: Получение элемента по индексу
        System.out.println("Element at index 1: " + list.get(1));  // Ожидается: Second

        // Тест 3: Удаление элемента
        list.remove(1);
        System.out.println("Size after removal: " + list.size());  // Ожидается: 2
        System.out.println("Element at index 1: " + list.get(1));  // Ожидается: Third

        // Тест 4: Удаление первого элемента
        list.remove(0);
        System.out.println("Size after removing first element: " + list.size());  // Ожидается: 1
        System.out.println("Element at index 0: " + list.get(0));  // Ожидается: Third
    }
}
