package HomeWork2.Tranports;

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



