package HomeWork2.Tranports;

public class DriverC<T extends Truck> extends Driver {
    public DriverC(String FIO, boolean DRIVER_LICENSE, int EXPERIENCE) {
        super(FIO, DRIVER_LICENSE, EXPERIENCE);
    }

    @Override
    String start() {
        return null;
    }

    @Override
    String finish() {
        return null;
    }

    @Override
    String refill() {
        return null;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
