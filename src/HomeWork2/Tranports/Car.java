package HomeWork2.Tranports;

import java.util.Objects;

public class Car extends Transport implements Competing {
    private final double pitStopTime;
    private final int maxSpeed;
    private final double bestLapTime;
    private final CarBodyType bodyType;
    public Car(String brand, String model, double engineVolume, double pitStopTime, int maxSpeed, double bestLapTime, CarBodyType bodyType) {
        super(brand, model, engineVolume);
        this.pitStopTime = pitStopTime;
        this.maxSpeed = maxSpeed;
        this.bestLapTime = bestLapTime;
        this.bodyType = bodyType;
    }
    public enum CarBodyType {
        SEDAN("Сидан"), HATCHBACK("Хэтчбэк"),
        COMPARTMENT("Купе"), STATION_WAGON("Универсал"),
        JEEP("Внедорожник"), CROSSOVER("Кроссовер"),
        PICKUP("Пикап"), VAN("Фургон"), MINIVAN("Минивэн");
        final String bodyType;
        CarBodyType(String bodyType) {
            this.bodyType = bodyType;
        }
        @Override
        public String toString() {
            return bodyType;
        }
    }
    public CarBodyType getBodyType() {
        return bodyType;
    }
    @Override
    public double getEngineVolume() {
        return getEngineVolume();
    }

    @Override
    public void getPitStopped() {
        System.out.println("Пит стоп" + pitStopTime);
    }

    @Override
    public void getBestLapTime() {
        System.out.println("Лучшее время круга - " + bestLapTime);
    }

    @Override
    public void startMoving() {
        System.out.println("Машина поехала!");
    }

    @Override
    public void finishTheMovement() {
        System.out.println("Машина остановилась");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость - " + maxSpeed);
    }

    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println("Данных об авто недостаточно");
        } else {
            System.out.println("Тип кузова - " + bodyType);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Car{" +
                "pitStopTime=" + pitStopTime +
                ", maxSpeed=" + maxSpeed +
                ", bestLapTime=" + bestLapTime +
                '}'+bodyType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.pitStopTime, pitStopTime) == 0 && maxSpeed == car.maxSpeed && Double.compare(car.bestLapTime, bestLapTime) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pitStopTime, maxSpeed, bestLapTime);
    }
}



