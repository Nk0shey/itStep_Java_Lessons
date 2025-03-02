package MyTreeSet;

public interface MySet<T> {
    boolean add(T element);       // Добавляет элемент в множество (если его нет)
    boolean remove(T element);    // Удаляет элемент из множества
    boolean contains(T element);  // Проверяет, содержится ли элемент в множестве
    int size();                   // Возвращает количество элементов в множестве
}
