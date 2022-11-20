package HomeWork1.flowers;

import java.util.Arrays;

public class Flower {
    private String flowerName;
    private String country;
    private double cost;
    int lifeSpan;
    Flower[] flowerBouquet;
    Flower(String flowerColor, String country, double cost) {
        this(flowerColor, country, cost, 3);
    }
    Flower(String flowerColor, String country, double cost, int lifeSpan) {
        if (flowerColor == null || flowerColor.equals("")) {
            this.flowerName = "белый";
        } else {
            this.flowerName = flowerColor;
        }
        if (country == null || country.equals("")) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
        this.lifeSpan = lifeSpan;
    }

    Flower[] getBouquet(){
        return flowerBouquet;
    }
    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        if (flowerName == null || flowerName.equals("")) {
            this.flowerName = "белый";
        } else {
            this.flowerName = flowerName;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null || country.equals("")) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
    }

    public double getCost() {
        return cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setCost(double cost) {
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
    }
    @Override
    public String toString() {
        return flowerName +
                ", страна = '" + country + '\'' +
                ", стоимость = " + cost +
                ", срок стояния = " + lifeSpan +
                " дней.";
    }
}
