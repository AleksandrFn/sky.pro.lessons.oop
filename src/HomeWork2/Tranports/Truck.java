package HomeWork2.Tranports;

import java.util.Objects;

public class Truck extends Transport implements Competing {
    private final double pitStopTime;
    private final int maxSpeed;
    private final double bestLapTime;
    private Tonnage tonnage;

    public Truck(String brand, String model,
                 double engineVolume,
                 double pitStopTime, int maxSpeed,
                 double bestLapTime, Tonnage tonnage) {
        super(brand, model, engineVolume);
        this.pitStopTime = pitStopTime;
        this.maxSpeed = maxSpeed;
        this.bestLapTime = bestLapTime;
        this.tonnage = tonnage;
    }

    public enum Tonnage {
        N1(0D, 3.5),
        N2(3.5, 12D),
        N3(12D, null);
        Double from;
        Double to;

        public Double getFrom() {
            return from;
        }

        public Double getTo() {
            return to;
        }

        Tonnage(Double from, Double to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public String toString() {
            return "Tonnage{" +
                    "from=" + from +
                    ", to=" + to +
                    '}';
        }
    }

    public Tonnage getTonnage() {
        return tonnage;
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
    public void getPitStopped() {
        System.out.println("Пит стоп" + pitStopTime);
    }

    @Override
    public void getBestLapTime() {
        System.out.println("Лучшее время круга - " + bestLapTime);
    }

    @Override
    public double getEngineVolume() {
        return getEngineVolume();
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
    public void maxSpeed() {
        System.out.println("Максимальная скорость - " + maxSpeed);
    }

    @Override
    public void printType() {
        if (tonnage == null) {
            System.out.println("Данных об авто недостаточно");
        } else {
            String from = tonnage.getFrom() == null ? "" : "от " + tonnage.getFrom()+ " ";
            String to = tonnage.getFrom() == null ? "" : "до " + tonnage.getFrom();
            System.out.println("Грузоподьемность авто - " + from + to);
        }
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
}
