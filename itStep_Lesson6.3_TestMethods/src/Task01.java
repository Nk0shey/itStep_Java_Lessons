/*
Перетворення двовимірного масиву в одномірний із сумою рядків
Завдання: Напишіть статичний метод, який приймає двовимірний масив цілих чисел і повертає одномірний масив,
де кожен елемент — сума чисел відповідного рядка вхідного масиву.
Вхід:
int[][] arr = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

Вихід: [6, 15, 24]
Алгоритм: Проходимо по кожному рядку вхідного масиву, обчислюємо суму
елементів і додаємо її до результуючого одномірного масиву.
 */

public class Task01 {
    public static int[] singleArraySummed(int[][] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            result[i] = sum;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] result = singleArraySummed(arr);

        for (int sum : result) {
            System.out.print(sum + " ");
        }
    }
}

