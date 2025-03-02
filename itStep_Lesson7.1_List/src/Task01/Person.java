package Task01;

/*
 * Завдання 1: Реалізуйте клас «Людина». Збережіть в полях класу: ПІБ, дату народження, контактний телефон,
 * місто, країну, домашню адресу. Реалізуйте методи класу для введення даних, виведення даних. Реалізуйте
 * доступ до окремих полів через методи класу.
 * */

public class Person {

    String name;
    int birthdayDate;
    int phoneNumber;
    String town;
    String country;
    Adress homeAdress;

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
    public Adress getHomeAdress() {
        return homeAdress;
    }
    public void setHomeAdress(Adress homeAdress) {
        this.homeAdress = homeAdress;
    }



}

class Adress {
    int house;
    int appertment;
    String street;


    public int getHouse() {
        return house;
    }
    public void setHouse(int house) {
        this.house = house;
    }
    public int getAppertment() {
        return appertment;
    }
    public void setAppertment(int appertment) {
        this.appertment = appertment;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }



}
