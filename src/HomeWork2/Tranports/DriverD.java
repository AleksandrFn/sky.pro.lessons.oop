package HomeWork2.Tranports;

public class DriverD <T extends Bus> extends Driver {
    public DriverD(String FIO, boolean DRIVER_LICENSE, int EXPERIENCE) {
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
