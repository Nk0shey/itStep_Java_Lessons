package collections;


import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

// Реализация фиксированного стека целых чисел с использованием Deque
public class Stack1<E> implements Deque<E> {
    private final Deque<E> stack;  // Основная структура данных
    private final int maxSize;    // Максимальный размер стека

    // Конструктор для задания максимального размера стека
    public Stack1(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new ArrayDeque<>(maxSize);
    }

    // Добавление элемента в стек
    @Override
    public void push(E value) {
        if (stack.size() >= maxSize) {
            System.out.println("Ошибка: Стек полон.");
            return;
        }
        stack.push(value);
    }

    // Удаление верхнего элемента из стека
    public E pop() {
        if (stack.isEmpty()) {
            System.out.println("Ошибка: Стек пуст.");
            return null;
        }
        return stack.pop();
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    // Проверка, является ли стек пустым
    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Проверка, является ли стек полным
    public boolean isFull() {
        return stack.size() == maxSize;
    }

    // Очистка стека
    @Override
    public void clear() {
        stack.clear();
        System.out.println("Стек очищен.");
    }

    // Получение верхнего элемента без его удаления
    @Override
    public E peek() {
        if (stack.isEmpty()) {
            System.out.println("Ошибка: Стек пуст.");
            return null;
        }
        return stack.peek();
    }

//    @Override
//    public void addAll(Collection<? extends E> c) {
//        return;a
//    }

    // Подсчет количества элементов в стеке
    public int count() {
        return stack.size();
    }

    // Все оставшиеся методы интерфейса Deque, которые не используются, выбрасывают исключение
    @Override
    public void addFirst(E e) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void addLast(E e) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean offerFirst(E e) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean offerLast(E e) {
        throw new UnsupportedOperationException();
    }

    @Override
    public E removeFirst() {
        throw new UnsupportedOperationException();
    }

    @Override
    public E removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override
    public E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override
    public E pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override
    public E getFirst() {
        throw new UnsupportedOperationException();
    }

    @Override
    public E getLast() {
        throw new UnsupportedOperationException();
    }

    @Override
    public E peekFirst() {
        throw new UnsupportedOperationException();
    }

    @Override
    public E peekLast() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeFirstOccurrence(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeLastOccurrence(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean offer(E e) {
        throw new UnsupportedOperationException();
    }

    @Override
    public E remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public E poll() {
        throw new UnsupportedOperationException();
    }

    @Override
    public E element() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator<E> iterator() {
        return stack.iterator();
    }

    @Override
    public Iterator<E> descendingIterator() {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
        // Создаем стек с максимальным размером 5
        Stack1<Integer> stack = new Stack1<>(5);

        // Тестирование методов
        stack.push(10);
        stack.push(20);
        System.out.println("Верхний элемент: " + stack.peek());
        System.out.println("Количество элементов: " + stack.count());
        stack.pop();
        System.out.println("Количество элементов после удаления: " + stack.count());
        stack.clear();
        System.out.println("Стек пуст: " + stack.isEmpty());
    }
}
