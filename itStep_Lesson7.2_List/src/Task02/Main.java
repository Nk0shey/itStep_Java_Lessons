/*
Завдання 1: До вже реалізованого класу «Людина» додайте статичний метод,
який під час виклику повертає кількість створених об'єктів класу «Людина»
 */

package Task02;

public class Main {
    public static void main(String[] args) {

        Person one = new Person();
        Person two = new Person();
        Person three = new Person();

        System.out.println(Person.getInstanceCount());
    }
}
