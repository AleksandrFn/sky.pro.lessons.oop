package HomeWork1.part2;

public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    Car(String brand, String model, double engineVolume, String color, int year, String country) {
        if (brand == null || brand.equals("")) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }if (model == null || model.equals("")) {
            this.model = "default";
        } else {
            this.model = model;
        }if (country == null || country.equals("")) {
            this.country = "default";
        } else {
            this.country = country;
        }if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }if (color == null || color.equals("")) {
            this.color = "белый";
        } else {
            this.color = color;
        }if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
    }

    public String toString() {
        return this.brand + " " + this.model + ", обьем двигателя - " + this.engineVolume + " л., цвет - " + this.color + ", год выпуска - " + this.year + ", сборка - " + this.country;
    }
}
