package HomeWork2.Pets;

import java.util.Objects;

public class Flightless extends Bird{

    private String typeOfMovement;

    public Flightless(String name, int age, String livingEnvironment,String typeOfMovement) {
        super(name, age,livingEnvironment);
        setTypeOfMovement(typeOfMovement);
    }

    public void walk() {
        System.out.println("Передвигаются по земле");
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
        return super.toString() + " Нелетающие " +
                ", тип передвижения = " + typeOfMovement + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return Objects.equals(typeOfMovement, that.typeOfMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfMovement);
    }

    @Override
    public void hunting() {
        System.out.println("Едят рыбу или мясо");
    }
}
