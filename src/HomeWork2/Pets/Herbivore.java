package HomeWork2.Pets;

import java.util.Objects;

public class Herbivore extends Mammal{

    private String typeFood;

    public Herbivore(String name, int age, String livingEnvironment, int speed,String typeFood) {
        super(name,age,livingEnvironment, speed);
        setTypeFood(typeFood);
    }

    public void graze() {
        System.out.println("Пасутся на полях");
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
        return super.toString() + " Травоядное " +
                ", тип пищи = " + typeFood + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivore herbivore = (Herbivore) o;
        return Objects.equals(typeFood, herbivore.typeFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeFood);
    }

    @Override
    public void walk() {
        System.out.println("Передвигается по земле");
    }
}
