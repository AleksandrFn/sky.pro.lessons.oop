package HomeWork2.Tranports;

import HomeWork2.Tranports.Bus;
import HomeWork2.Tranports.Car;
import HomeWork2.Tranports.Train;

public class carsMain {
    public static void main(String[] args) {
        Car lada = new Car(null, "Granta", -100, 2015, "Россия", "Ручная", "Сидан", "а345фф325",5,"Летняя","Желтый",255);
        Car audi = new Car("Audi", null, 3.0, 2020, "Германия", "Автомат", "Купе", "г655фф625",10,"Зимняя","Черный", 330);
        Car bmw = new Car("", "Z8", 3.0, 2021, "Германия", "Автомат", "Сидан", "о225оо445",4,"Летняя","Черный", 290);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, 2018, "Южная Корея", "Ручная", "Сидан", "г444хх335",5,"Летняя","Красный", 325);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, -300, "", "Авомат", "Хэчбэк", "н666уу335",2,"Зимняя","Коричневый", 300);

//        Car.Key ladaKey = lada.new Key(true, true);
//        Car.Insurance ladaInsurance = lada.new Insurance(LocalDate.of(2023, 5, 11), 5000, "533433459");
//
//        lada.setKey(ladaKey);
//        lada.setInsurance(ladaInsurance);
//
//        System.out.println(lada);
//        System.out.println(audi);
//        System.out.println(bmw);
//        System.out.println(kia);
//        System.out.println(hyundai);
//        lada.ChangeSeasonWheels();
        Train lastochka = new Train("Ласточка","В-901",2011,"Россия","",301,3500,0,"Белорусский вокзал","Минск-Пассажирский",11);
        Train leningrag = new Train("Ленинград", "D-125", 2019, "Россия", "", 270, 1700, 0, "Ленинградский вокзал", "Ленинград-Пассажирский", 8);
        System.out.println(lastochka);

        Bus bogdan = new Bus("Богдан", "И-313", 2010, "Россия", "Синий", 180);
        Bus gazel = new Bus("Газель", "Н-222", 2015, "Белорусь", "Белый", 200);
        Bus groza = new Bus("Гроза", "АН-150", 2011, "Россия", "Голубой", 220);
        System.out.println(bogdan);
        System.out.println(gazel);
        System.out.println(groza);
        lada.refill();
        bogdan.refill();
    }
}
