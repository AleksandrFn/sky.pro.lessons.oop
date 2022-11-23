package HomeWork2.Pets;

import java.util.Objects;

public abstract class Mammal extends Pet {

    private String livingEnvironment;

    private int speed;

    public Mammal(String name,int age, String livingEnvironment, int speed) {
        super(name,age);
        setLivingEnvironment(livingEnvironment);
        setSpeed(speed);
    }

    public abstract void walk();

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

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed <= 0) {
            this.speed = 0;
        } else {
            this.speed = speed;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return speed == mammal.speed && Objects.equals(livingEnvironment, mammal.livingEnvironment);
    }

    @Override
    public String toString() {
        return super.toString() + " Млекопитающее " +
                ", среда обитания = " + livingEnvironment +
                ", максимальная скорость = " + speed + " км.ч.";
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment, speed);
    }

    @Override
    public void eat() {
        System.out.println("Ест траву или мясо");
    }

    @Override
    public void sleep() {

    }

    @Override
    public void move() {
        System.out.println("Передвигается по земле");
    }
}
