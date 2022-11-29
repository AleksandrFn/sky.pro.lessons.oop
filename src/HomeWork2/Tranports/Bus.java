package HomeWork2.Tranports;

public class Bus extends Transport implements Competing{
    private final double pitStopTime;
    private final int maxSpeed;
    private final double bestLapTime;
    public Bus(String brand, String model, double engineVolume, double pitStopTime, int maxSpeed, double bestLapTime) {
        super(brand, model, engineVolume);
        this.pitStopTime = pitStopTime;
        this.maxSpeed = maxSpeed;
        this.bestLapTime = bestLapTime;
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

