package HomeWork2.Pets;

import java.util.Objects;

public class Flying extends Bird{

    private String typeOfMovement;

    public Flying(String name, int age, String livingEnvironment,String typeOfMovement) {
        super(name, age,livingEnvironment);
        setTypeOfMovement(typeOfMovement);
    }

    public void flying() {
        System.out.println("Летают по воздуху");
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    public void setTypeOfMovement(String typeOfMovement) {
        if (typeOfMovement == null || typeOfMovement.equals("")) {
            this.typeOfMovement = "default";
        } else {
            this.typeOfMovement = typeOfMovement;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Летающие " +
                ", тип передвижения = " + typeOfMovement + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return Objects.equals(typeOfMovement, flying.typeOfMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfMovement);
    }

    @Override
    public void hunting() {
        System.out.println("Охотятся на животных");
    }
}
