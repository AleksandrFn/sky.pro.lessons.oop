package HomeWork2.Tranports;

import java.util.Objects;

public class Car extends Transport implements Competing {
    private final double pitStopTime;
    private final int maxSpeed;
    private final double bestLapTime;

    public Car(String brand, String model, double engineVolume, double pitStopTime, int maxSpeed, double bestLapTime) {
        super(brand, model, engineVolume);
        this.pitStopTime = pitStopTime;
        this.maxSpeed = maxSpeed;
        this.bestLapTime = bestLapTime;
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
    public String toString() {
        return super.toString() + "Car{" +
                "pitStopTime=" + pitStopTime +
                ", maxSpeed=" + maxSpeed +
                ", bestLapTime=" + bestLapTime +
                '}';
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
    public void maxSpeed() {
        System.out.println("Максимальная скорость - " + maxSpeed);
    }
}



