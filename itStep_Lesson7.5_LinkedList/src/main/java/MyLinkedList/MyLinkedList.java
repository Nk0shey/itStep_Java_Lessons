package MyLinkedList;

public class MyLinkedList<T> implements MyList<T> {
    // Узел (внутренний класс для хранения данных и ссылок)
    private class Node {
        T data;    // Данные узла
        Node next; // Ссылка на следующий узел

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // Поля
    private Node head;  // Ссылка на первый элемент списка
    private int size;   // Текущий размер списка

    // Конструктор
    public MyLinkedList() {
        head = null; // Список изначально пуст
        size = 0;
    }

    @Override
    public void add(T element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
        // Подсказка:
        // 1. Создайте новый узел с данными element.
        // 2. Если список пустой (head == null), установите этот узел как head.
        // 3. Если список не пустой, найдите последний узел (у которого next == null) и добавьте новый узел после него.
        // 4. Увеличьте значение переменной size на 1.
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс вне допустимого диапазона");
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
        // Подсказка:
        // 1. Проверьте, что индекс находится в пределах [0, size).
        //    Если индекс недопустим, выбросьте исключение IndexOutOfBoundsException.
        // 2. Пройдите по списку от head, перемещаясь к следующему узлу с помощью next, пока не дойдёте до узла с нужным индексом.
        // 3. Верните данные (data) из найденного узла.
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс вне допустимого диапазона");
        }
        if (index == 0) {
            head = head.next;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
        // Подсказка:
        // 1. Проверьте, что индекс находится в пределах [0, size).
        //    Если индекс недопустим, выбросьте исключение IndexOutOfBoundsException.
        // 2. Если нужно удалить первый элемент (index == 0):
        //    Установите head = head.next.
        // 3. Если удаляемый элемент находится не на первом месте:
        //    Пройдите по списку до узла, который находится перед удаляемым (index - 1).
        //    Установите next этого узла на next удаляемого узла (чтобы пропустить удаляемый).
        // 4. Уменьшите значение переменной size на 1.
    }

    @Override
    public int size() {
        return size;
    }
}
