package HomeWork2.Pets;

import java.util.Objects;

public class Amphibian extends Pet{

    private String livingEnvironment;


    public Amphibian(String name, int age, String livingEnvironment) {
        super(name,age);
        setLivingEnvironment(livingEnvironment);
    }
    public void hunting() {

    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment == null || livingEnvironment.equals("")) {
            this.livingEnvironment = "default";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibian amphibian = (Amphibian) o;
        return Objects.equals(livingEnvironment, amphibian.livingEnvironment);
    }

    @Override
    public String toString() {
        return super.toString() + " Земноводное " +
                ", среда обитания = " + livingEnvironment + ".";
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }

    @Override
    public void eat() {
        System.out.println("Едят траву, мясо или насекомых");
    }

    @Override
    public void sleep() {

    }

    @Override
    public void move() {
        System.out.println("Передвигаются по земле");
    }
}
