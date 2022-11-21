package HomeWork1;

import HomeWork1.transport.Car;

import java.time.LocalDate;

public class carsMain {
    public static void main(String[] args) {
        Car lada = new Car(null, "Granta", -100, "желтый", 2015, "Россия", "Ручная", "Сидан","а345фф325",5,"Летняя");
        Car audi = new Car("Audi", null, 3.0, "черный", 2020, "Германия", "Автомат", "Купе","г655фф625",10,"Зимняя");
        Car bmw = new Car("", "Z8", 3.0, "черный", 2021, "Германия", "Автомат", "Сидан","о225оо445",4,"Летняя");
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея", "Ручная", "Сидан","г444хх335",5,"Летняя");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "", -300, "Южная Корея", "Автомат", "Хэчбэк","н666уу335",2,"Зимняя");

        Car.Key ladaKey = lada.new Key(true, true);
        Car.Insurance ladaInsurance = lada.new Insurance(LocalDate.of(2023, 5, 11), 5000, "533433459");

        lada.setKey(ladaKey);
        lada.setInsurance(ladaInsurance);
        
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
        lada.ChangeSeasonWheels();
    }
}
