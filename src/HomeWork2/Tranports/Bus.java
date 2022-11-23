package HomeWork2.Tranports;

public class Bus extends Transport{
    public Bus(String brand, String model, int yearOfRelease, String country, String bodyColor, int maxSpeed) {
        super(brand, model, yearOfRelease, country, bodyColor, maxSpeed);
    }

    @Override
    public void refill() {
        System.out.println("Заправляем бензином или дизелем на заправке");
    }
}
