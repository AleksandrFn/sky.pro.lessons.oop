package HomeWork2.Pets;

import java.util.Objects;

public abstract class Pet {
    private String name;
    private int age;

    public abstract void eat();

    public abstract void sleep();

    public abstract void move();

    public Pet(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.equals("")) {
            this.name = "default";
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age && Objects.equals(name, pet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return " Животное : " +
                "Имя = " + name  +
                ", возраст = " + age + "." ;
    }
}
