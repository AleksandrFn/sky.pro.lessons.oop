package HomeWork2.Tranports;

public abstract class Transport {

    private final String brand;
    private final String model;
    private double engineVolume;
    public Transport(String brand, String model, double engineVolume) {
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
        setEngineVolume(engineVolume);
    }

    public abstract void startMoving();

    public abstract   void finishTheMovement() ;
    public  String getBrand() {
        return brand;
    }

    public String getModel() {
       return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }
}
