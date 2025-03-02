package MyTreeSet;

public class MyTreeSet<T extends Comparable<T>> implements MySet<T> {
    // Внутренний класс для узла дерева
    private class Node {
        T data;       // Данные узла
        Node left;    // Левый потомок
        Node right;   // Правый потомок

        Node(T data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Поля
    private Node root;  // Корень дерева
    private int size;   // Текущий размер множества

    // Конструктор
    public MyTreeSet() {
        root = null; // Изначально дерево пустое
        size = 0;
    }

    @Override
    public boolean add(T element) {
        if (element == null) return false;
        if (contains(element)) return false;
        root = addRecursive(root, element);
        size++;
        // Подсказка:
        // 1. Используйте рекурсивный метод для добавления элемента в дерево.
        // 2. Если элемент уже существует в дереве, ничего не делайте и верните false.
        // 3. Если элемент добавлен успешно, увеличьте size и верните true.
        return true;
    }

    private Node addRecursive(Node current, T element) {
        if (current == null) {
            return new Node(element);
        }
        int comparison = element.compareTo(current.data);
        if (comparison < 0) {
            current.left = addRecursive(current.left, element);
        } else if (comparison > 0) {
            current.right = addRecursive(current.right, element);
        }
        return current;
    }

    @Override
    public boolean remove(T element) {
        if (element == null || !contains(element)) return false;
        root = removeRecursive(root, element);
        size--;
        // Подсказка:
        // 1. Используйте рекурсивный метод для удаления элемента из дерева.
        // 2. Если элемент найден и удалён, уменьшите size и верните true.
        // 3. Если элемент не найден, верните false.
        return true;
    }

    private Node removeRecursive(Node current, T element) {
        if (current == null) {
            return null;
        }
        int comparison = element.compareTo(current.data);
        if (comparison < 0) {
            current.left = removeRecursive(current.left, element);
        } else if (comparison > 0) {
            current.right = removeRecursive(current.right, element);
        } else {
            if (current.left == null && current.right == null) {
                return null;
            } else if (current.left == null) {
                return current.right;
            } else if (current.right == null) {
                return current.left;
            } else {
                T smallestValue = findMin(current.right);
                current.data = smallestValue;
                current.right = removeRecursive(current.right, smallestValue);
            }
        }
        return current;
    }

    private T findMin(Node current) {
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    @Override
    public boolean contains(T element) {
        return containsRecursive(root, element);
        // Подсказка:
        // 1. Используйте рекурсивный метод для поиска элемента в дереве.
        // 2. Если элемент найден, верните true. Если нет — false.

    }

    private boolean containsRecursive(Node current, T element) {
        if (current == null) return false;
        int comparison = element.compareTo(current.data);
        if (comparison < 0) {
            return containsRecursive(current.left, element);
        } else if (comparison > 0) {
            return containsRecursive(current.right, element);
        } else {
            return true;
        }
    }

    @Override
    public int size() {
        // Подсказка:
        // 1. Просто верните значение переменной size.
        return size;
    }
}
