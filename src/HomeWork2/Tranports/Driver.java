package HomeWork2.Tranports;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Driver{" +
                "FIO='" + FIO + '\'' +
                ", DRIVER_LICENSE=" + DRIVER_LICENSE +
                ", EXPERIENCE=" + EXPERIENCE +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return DRIVER_LICENSE == driver.DRIVER_LICENSE && EXPERIENCE == driver.EXPERIENCE && Objects.equals(FIO, driver.FIO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FIO, DRIVER_LICENSE, EXPERIENCE);
    }

    abstract String start();
    abstract String finish();

    abstract String refill();
}
