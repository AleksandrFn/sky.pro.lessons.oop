package HomeWork2.Tranports;

public class DriverB <T extends Car> extends Driver{
    public DriverB(String FIO, boolean DRIVER_LICENSE, int EXPERIENCE) {
        super(FIO, DRIVER_LICENSE, EXPERIENCE);
    }
    public String getMassage(Car car) {
        return "Водитель " + getFIO() + ", управляет автомобилем - " + car.getBrand() + " "
                + car.getModel() + " и будет участвовать в заезде";
    }

    @Override
    String start() {
        return "Легковой автомобиль поехал";
    }

    @Override
    String finish() {
        return "Легковой автомобиль остановился";
    }

    @Override
    String refill() {
        return "Легковой автомобиль заправляется";
    }

    @Override
    public String toString() {
        return super.toString() + "DriverB{}";
    }
}
