//package HomeWork2.Tranports;
//
//public class Train extends Transport {
//    private int price;
//    private int travelTime;
//    private String nameOfTheDepartureStation;
//    private String finalStop;
//    private int wagons;
//
//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        if (price < 0) {
//            this.price = 0;
//        } else {
//            this.price = price;
//        }
//    }
//
//    public int getTravelTime() {
//        return travelTime;
//    }
//
//    public void setTravelTime(int travelTime) {
//        if (travelTime < 0) {
//            this.travelTime = 0;
//        } else {
//            this.travelTime = travelTime;
//        }
//    }
//
//    public String getNameOfTheDepartureStation() {
//        return nameOfTheDepartureStation;
//    }
//
//    public void setNameOfTheDepartureStation(String nameOfTheDepartureStation) {
//        if (nameOfTheDepartureStation == null || nameOfTheDepartureStation.equals("")) {
//            this.nameOfTheDepartureStation = "default";
//        } else {
//            this.nameOfTheDepartureStation = nameOfTheDepartureStation;
//        }
//    }
//
//    public String getFinalStop() {
//        return finalStop;
//    }
//
//    public void setFinalStop(String finalStop) {
//        if (finalStop == null || finalStop.equals("")) {
//            this.finalStop = "default";
//        } else {
//            this.finalStop = finalStop;
//        }
//    }
//
//    public int getWagons() {
//        return wagons;
//    }
//
//    public void setWagons(int wagons) {
//        if (wagons < 0) {
//            this.wagons = 0;
//        } else {
//            this.wagons = wagons;
//        }
//    }
//
//    public Train(String brand, String model, int yearOfRelease, String country, String bodyColor,
//                 int maxSpeed, int price, int travelTime, String nameOfTheDepartureStation,
//                 String finalStop, int wagons) {
//        super(brand, model, yearOfRelease, country, bodyColor, maxSpeed);
//        setPrice(price);
//        setTravelTime(travelTime);
//        setNameOfTheDepartureStation(nameOfTheDepartureStation);
//        setFinalStop(finalStop);
//        setWagons(wagons);
//    }
//
//    @Override
//    public void refill() {
//        System.out.println("Заправить дизелем");
//    }
//
//    @Override
//    public String toString() {
//        return "Train{" +
//                "price=" + price +
//                ", travelTime=" + travelTime +
//                ", nameOfTheDepartureStation='" + nameOfTheDepartureStation + '\'' +
//                ", finalStop='" + finalStop + '\'' +
//                ", wagons=" + wagons +
//                '}';
//    }
//}
