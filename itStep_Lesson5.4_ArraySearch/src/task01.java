/*
### 1. **Линейный поиск в массиве**

  - **Задача:** Напишите метод, который ищет заданное число в массиве и возвращает его индекс.
  Если число не найдено, метод должен вернуть `-1`.
  - **Метод:** `public static int linearSearch(int[] arr, int target)`
  - **Решение:** Последовательно проходите по массиву и проверяйте, равен ли элемент целевому числу.
 */

import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Введите числа, индекс которого хотите получить: ");


        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Введите число для сравнения: ");
        int target = scanner.nextInt();

        int result = LinearSearch(arr, target);

        if (result == -1) {
            System.out.println("число" + target + "не найдено");
        } else {
            System.out.println("число" + target + " найдено и имеет данный индекс в массиве: " + result);
        }
    }
    public static int LinearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
