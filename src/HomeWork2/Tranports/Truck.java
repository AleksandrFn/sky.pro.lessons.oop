package HomeWork2.Tranports;

import java.util.Objects;

public class Truck extends Transport implements Competing{
    private final double pitStopTime;
    private final int maxSpeed;
    private final double bestLapTime;
    public Truck(String brand, String model, double engineVolume, double pitStopTime, int maxSpeed, double bestLapTime) {
        super(brand, model, engineVolume);
        this.pitStopTime = pitStopTime;
        this.maxSpeed = maxSpeed;
        this.bestLapTime = bestLapTime;
    }

    @Override
    public void startMoving() {
        System.out.println("Трак поехал!");
    }

    @Override
    public void finishTheMovement() {
        System.out.println("Трак остановился!");
    }

    @Override
    public String getBrand() {
        return getBrand();
    }

    @Override
    public String getModel() {
        return getModel();
    }

    @Override
    public double getEngineVolume() {
        return getEngineVolume();
    }

    @Override
    public String toString() {
        return super.toString() + "Truck{" +
                "pitStopTime=" + pitStopTime +
                ", maxSpeed=" + maxSpeed +
                ", bestLapTime=" + bestLapTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return Double.compare(truck.pitStopTime, pitStopTime) == 0 && maxSpeed == truck.maxSpeed && Double.compare(truck.bestLapTime, bestLapTime) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pitStopTime, maxSpeed, bestLapTime);
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
