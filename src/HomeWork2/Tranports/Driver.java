package HomeWork2.Tranports;

public abstract class Driver {
    private final String FIO;
    private final boolean DRIVER_LICENSE;
    private final int EXPERIENCE;

    public Driver(String FIO, boolean DRIVER_LICENSE, int EXPERIENCE) {
        this.FIO = FIO;
        this.DRIVER_LICENSE = DRIVER_LICENSE;
        this.EXPERIENCE = EXPERIENCE;
    }

    public String getFIO() {
        return FIO;
    }

    public boolean isDRIVER_LICENSE() {
        return DRIVER_LICENSE;
    }

    public int getEXPERIENCE() {
        return EXPERIENCE;
    }

    abstract String start();
    abstract String finish();

    abstract String refill();
}
