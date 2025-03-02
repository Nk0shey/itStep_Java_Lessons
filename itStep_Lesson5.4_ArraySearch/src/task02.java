/*
### 3. **Поиск минимального и максимального элемента в массиве**

  - **Задача:** Найдите минимальное и максимальное значения в массиве.
  - **Метод:** `public static int[] findMinMax(int[] arr)`
  - **Решение:** Пройдите по массиву и обновляйте минимальное и максимальное значения.
 */

public class task02 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, -5, -12, 32};

        int minMax[] = findMinMax(arr);
        System.out.println("Минимальное значение: " + minMax[0]);
        System.out.println("Максимальное значение: " + minMax[1]);
    }
    public static int[] findMinMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым.");
        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        return new int[]{min, max};
    }
}
