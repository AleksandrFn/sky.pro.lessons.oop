package HomeWork2.Tranports;

import java.time.LocalDate;

public class Car extends Transport {
    private double engineVolume;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private String tires;
    private Key key;
    private Insurance insurance;

    public class Insurance {
        private LocalDate validityPeriod;
        private double cost;
        private String number;

        public Insurance(LocalDate validityPeriod, double cost, String number) {
            if (LocalDate.now().isAfter(validityPeriod)) {
                System.out.println("Страховка просрочена!");
            } else {
                System.out.println("Страховка активна");
            }
            if (cost <= 0) {
                this.cost = 1000;
            } else {
                this.cost = cost;
            }
            if (number.length() == 9) {
                this.number = number;
            } else {
                this.number = "Номер некорректен";
            }
        }

        @Override
        public String toString() {
            return "Insurance{" +
                    "validityPeriod=" + validityPeriod +
                    ", cost=" + cost +
                    ", number='" + number + '\'' +
                    '}';
        }
    }

    public class Key {
        private boolean keylessAccess;
        private boolean remoteEngineStart;

        public Key(boolean keylessAccess, boolean remoteEngineStart) {
            this.keylessAccess = keylessAccess;
            this.remoteEngineStart = remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "keylessAccess=" + keylessAccess +
                    ", remoteEngineStart=" + remoteEngineStart +
                    '}';
        }
    }

    public Car(String brand, String model, double engineVolume, int yearOfRelease, String country,
               String transmission, String bodyType, String registrationNumber, int numberOfSeats, String tires,
               String setBodyColor, int setMaxSpeed) {

        super(brand, model, yearOfRelease, country, setBodyColor, setMaxSpeed);

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (transmission == null || transmission.equals("")) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
        if (bodyType == null || bodyType.equals("")) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }
        if (tires == null || tires.equals("")) {
            this.tires = "default";
        } else {
            this.tires = tires;
        }
        if (registrationNumber.length() == 9) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = "default";
        }
        if (numberOfSeats <= 0) {
            this.numberOfSeats = 0;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
    }
    public void setKey(Key key) {
        this.key = key;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getTires() {
        return tires;
    }

    public void setTires(String tires) {
        this.tires = tires;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public static void ChangeSeasonWheels() {
        if (LocalDate.now().getMonthValue() == 12 || LocalDate.now().getMonthValue() <= 3) {
            System.out.println("Рекомендуем поставить зимнюю резину");
        } else {
            System.out.println("Рекомендуем поставить летнюю резину");
        }
    }

    @Override
    public void refill() {
        System.out.println("Заправляем бензином,дизелем на заправке или заряжаем на специальных электропарковках");
    }

    public String toString() {
        return this.getBrand() + " " + this.getModel()
                + ", обьем двигателя - "
                + this.getEngineVolume() + " л., цвет - "
                + this.getBodyColor() + ", год выпуска - "
                + this.getYearOfRelease() + ", сборка - "
                + this.getCountry() + ", " + this.getTransmission() + " коробка передач, "
                + "тип кузова - " + this.getBodyType()
                + ", количество мест - " + getNumberOfSeats()
                + ", регистрационный номер - " + getRegistrationNumber()
                + "," + getTires() + " резина";
    }
}

