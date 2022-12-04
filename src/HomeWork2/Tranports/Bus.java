package HomeWork2.Tranports;

import java.util.Objects;

public class Bus extends Transport implements Competing {
    private final double pitStopTime;
    private final int maxSpeed;
    private final double bestLapTime;
    private Capacity capacity;

    public Bus(String brand, String model,
               double engineVolume, double pitStopTime,
               int maxSpeed, double bestLapTime, Capacity capacity) {
        super(brand, model, engineVolume);
        this.pitStopTime = pitStopTime;
        this.maxSpeed = maxSpeed;
        this.bestLapTime = bestLapTime;
        this.capacity = capacity;
    }

    public enum Capacity {
        EXTRA_SMALL(0, 10),
        SMALL(10, 25),
        MIDDLE(40, 50),
        LARGE(60, 80),
        EXTRA_LARGE(100, 120);

        final int from;
        final int to;

        Capacity(int from, int to) {
            this.from = from;
            this.to = to;
        }

        public int getTo() {
            return to;
        }

        public int getFrom() {
            return from;
        }
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void getPitStopped() {
        System.out.println("Пит стоп" + pitStopTime);
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
    public void getBestLapTime() {
        System.out.println("Лучшее время круга - " + bestLapTime);
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус поехал!");
    }

    @Override
    public void finishTheMovement() {
        System.out.println("Автобус остановился");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость - " + maxSpeed);
    }

    @Override
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных об авто недостаточно");
        } else {
            System.out.println("Вместимость автобуса - " + capacity.getFrom() + " " + capacity.getTo());
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Bus{" +
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
        Bus bus = (Bus) o;
        return Double.compare(bus.pitStopTime, pitStopTime) == 0 && maxSpeed == bus.maxSpeed && Double.compare(bus.bestLapTime, bestLapTime) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pitStopTime, maxSpeed, bestLapTime);
    }
}

