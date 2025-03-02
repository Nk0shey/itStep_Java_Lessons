/*
Завдання 1: Реалізуйте клас «Людина».
Збережіть в полях класу: ПІБ, дату народження, контактний телефон, місто, країну, домашню адресу.
Реалізуйте методи класу для введення даних, виведення даних.
Реалізуйте доступ до окремих полів через методи класу.
 */

package Task01;

public class Task01 {

        public static void main(String[] args) {

            Person personOne = new Person();

            personOne.setBirthdayDate(12);
            personOne.setCountry("Ukraine");
            personOne.setName("Polina");
            personOne.setPhoneNumber(380555555);
            personOne.setTown("Kyiv");

            // address
            Adress personOneAdress = new Adress();

            personOneAdress.setAppertment(5);
            personOneAdress.setHouse(1);
            personOneAdress.setStreet("Dnipra");

            personOne.setHomeAdress(personOneAdress);

            System.out.println(personOne.getHomeAdress().getStreet());
            System.out.println(personOne.getBirthdayDate());

        }
}
