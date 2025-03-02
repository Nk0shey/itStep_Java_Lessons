/*
авдання 4: Вкажіть усі прості числа в діапазоні, зазначеному користувачем.
Число називається простим, якщо воно ділиться без остачі тільки на себе та на одиницю.
Наприклад, 3 — це просте число, а 4 — ні.

s
 */

public class NumberTask {
    public static void main(String[] args) {
        int low = 3;
        int high = 20;
        for (int number = low; number <= high; number++) { //range of numbers, i - number;
            boolean isSimple = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isSimple = false;
                    break;
                }
            }
            if (isSimple) {
                System.out.println(number + " - число просте" + " ");
            }
        }
    }
}
