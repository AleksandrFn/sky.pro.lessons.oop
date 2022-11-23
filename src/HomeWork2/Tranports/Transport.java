package HomeWork2.Tranports;

public abstract class Transport {

    private String brand;
    private String model;
    private int yearOfRelease;
    private String country;
    private String bodyColor;
    private int maxSpeed;

    public Transport(String brand, String model, int yearOfRelease, String country, String bodyColor, int maxSpeed) {
        if (brand == null || brand.equals("")) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.equals("")) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (yearOfRelease <= 0) {
            this.yearOfRelease = 0;
        } else {
            this.yearOfRelease = yearOfRelease;
        }
        if (country == null || country.equals("")) {
            this.country = "default";
        } else {
            this.country = country;
        }
        setBodyColor(bodyColor);
        setMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }


    public String getCountry() {
        return country;
    }


    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        if (bodyColor == null || bodyColor.equals("")) {
            this.bodyColor = "default";
        } else {
            this.bodyColor = bodyColor;
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {
            this.maxSpeed = 0;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    public abstract void refill();
    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", country='" + country + '\'' +
                ", bodyColor='" + bodyColor + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
