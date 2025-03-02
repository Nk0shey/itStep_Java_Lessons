package Task02;

/*
 * Завдання 1: Реалізуйте клас «Людина». Збережіть в полях класу: ПІБ, дату народження, контактний телефон,
 * місто, країну, домашню адресу. Реалізуйте методи класу для введення даних, виведення даних. Реалізуйте
 * доступ до окремих полів через методи класу.
 * */

public class Person {

    private static int instanceCount = 0;

    String name;
    int birthdayDate;
    int phoneNumber;
    String town;
    String country;
    Address homeAddress;

    public Person() {
        instanceCount++;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBirthdayDate() {
        return birthdayDate;
    }
    public void setBirthdayDate(int birthdayDate) {
        this.birthdayDate = birthdayDate;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getTown() {
        return town;
    }
    public void setTown(String town) {
        this.town = town;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public Address getHomeAddress() {
        return homeAddress;
    }
    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }



}

class Address {
    int house;
    int apartment;
    String street;


    public int getHouse() {
        return house;
    }
    public void setHouse(int house) {
        this.house = house;
    }
    public int getApartment() {
        return apartment;
    }
    public void setApartment(int apartment) {
        this.apartment = apartment;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }



}

