package Task01;

import java.util.Objects;
import java.util.Scanner;

public class City {
    public City(String cityName, String regionName, String countryName, int population, String postalCode, String phoneCode) {
        this.cityName = cityName;
        this.regionName = regionName;
        this.countryName = countryName;
        this.population = population;
        this.postalCode = postalCode;
        this.phoneCode = phoneCode;
    }

    @Override
    public String toString() {
        return "Task02.City{" +
                "cityName='" + cityName + '\'' +
                ", regionName='" + regionName + '\'' +
                ", countryName='" + countryName + '\'' +
                ", population=" + population +
                ", postalCode='" + postalCode + '\'' +
                ", phoneCode='" + phoneCode + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return population == city.population && Objects.equals(cityName, city.cityName) && Objects.equals(regionName, city.regionName) && Objects.equals(countryName, city.countryName) && Objects.equals(postalCode, city.postalCode) && Objects.equals(phoneCode, city.phoneCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityName, regionName, countryName, population, postalCode, phoneCode);
    }

    private String cityName;
    private String regionName;
    private String countryName;
    private int population;
    private String postalCode;
    private String phoneCode;

    // Конструктор за замовчуванням
    public City() {}

    // Метод для введення даних
    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть назву міста: ");
        cityName = scanner.nextLine();

        System.out.print("Введіть назву регіону: ");
        regionName = scanner.nextLine();

        System.out.print("Введіть назву країни: ");
        countryName = scanner.nextLine();

        System.out.print("Введіть кількість жителів у місті: ");
        population = scanner.nextInt();
        scanner.nextLine(); // очищення буфера

        System.out.print("Введіть поштовий індекс міста: ");
        postalCode = scanner.nextLine();

        System.out.print("Введіть телефонний код міста: ");
        phoneCode = scanner.nextLine();
    }

    // Метод для виведення даних
    public void displayData() {
        System.out.println("Інформація про місто:");
        System.out.println("Назва міста: " + cityName);
        System.out.println("Назва регіону: " + regionName);
        System.out.println("Назва країни: " + countryName);
        System.out.println("Кількість жителів: " + population);
        System.out.println("Поштовий індекс: " + postalCode);
        System.out.println("Телефонний код: " + phoneCode);
    }

    // Методи доступу до полів (геттери та сеттери)
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public static void main(String[] args) {
        City city = new City();

        // Введення даних
        city.inputData();

        // Виведення даних
        city.displayData();
    }
}