/*
#### 4. Повернути масив у зворотному порядку (рекурсія)
Завдання: Напишіть рекурсивний метод, який приймає масив і повертає його у зворотному порядку.
Вхід: [1, 2, 3, 4, 5]
Вихід: [5, 4, 3, 2, 1]
Алгоритм: Змінюємо місцями перший і останній елементи масиву, потім рекурсивно викликаємо метод для підмасиву.

 */

public class Task04 {
    public static void reversedArray(int[] arr, int start, int end) {

        if (start >= end) {
            return;
        }

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reversedArray(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        reversedArray(arr, 0, arr.length - 1);

        System.out.println("Масив у зворотньому порядку: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
