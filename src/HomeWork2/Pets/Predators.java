package HomeWork2.Pets;

import java.util.Objects;

public class Predators extends Mammal {

    private String typeFood;

    public Predators(String name, int age, String livingEnvironment, int speed, String typeFood) {
        super(name, age, livingEnvironment, speed);
        setTypeFood(typeFood);
    }

    public void hunting() {
        System.out.println("Охотятся на живность");
    }

    public String getTypeFood() {
        return typeFood;
    }

    public void setTypeFood(String typeFood) {
        if (typeFood == null || typeFood.equals("")) {
            this.typeFood = "default";
        } else {
            this.typeFood = typeFood;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Хищник " +
                ", тип пищи = " + typeFood + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predators predators = (Predators) o;
        return Objects.equals(typeFood, predators.typeFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeFood);
    }

    @Override
    public void walk() {
        System.out.println("Передвигаются по земле");
    }
}
