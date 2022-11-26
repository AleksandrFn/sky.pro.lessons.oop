package HomeWork2.Pets;

import java.util.Objects;

public abstract class Bird extends Pet{

    private String livingEnvironment;

    public Bird(String name, int age, String livingEnvironment) {
        super(name, age);
        setLivingEnvironment(livingEnvironment);

    }
    public abstract void hunting();

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
    public String toString() {
        return super.toString() + " Птица " +
                ", среда обитания = " + livingEnvironment + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return Objects.equals(livingEnvironment, bird.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void move() {

    }
}
