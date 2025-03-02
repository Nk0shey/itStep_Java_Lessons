/*
4. Повернути масив у зворотному порядку (ітерація)
Завдання: Напишіть рекурсивний метод, який приймає масив і повертає його у зворотному порядку.
Вхід: [1, 2, 3, 4, 5]
Вихід: [5, 4, 3, 2, 1]
Алгоритм: Змінюємо місцями перший і останній елементи масиву, потім итерационно викликаємо метод для підмасиву.
 */

public class Task05 {
    public static void reversedArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Меняем местами эдемент из начала в конец массива
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Перемещаем указатели
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        reversedArray(arr);

        System.out.println("Масив у зворотньому порядку: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
