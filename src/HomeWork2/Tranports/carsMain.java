package HomeWork2.Tranports;

import HomeWork2.Tranports.Bus;
import HomeWork2.Tranports.Car;


public class carsMain {
    public static void main(String[] args) {
        Car lada = new Car("Лада", "Гранда", 1.3,2.55,255,3.35);
        Car volvo = new Car("Вольво", "Бравиа", 2.2,1.11,195,2.15);
        Car moskvish = new Car("Москвич", "Т-34", 3.2,1.97,215,2.25);
        Car kia = new Car("Киа", "К5", 2.7,1.97,215,2.25);

        Truck suzuki = new Truck("Сузуки", "ОУ-33", 3.3,1.97,215,2.25);
        Truck begemot = new Truck("Бегемот", "ГГ-317", 1.6,1.97,215,2.25);
        Truck marussia = new Truck("Маруся", "Молния", 3.4,1.97,215,2.25);
        Truck haval = new Truck("Хавал", "Икс", 2.1,1.97,215,2.25);

        Bus lastochka = new Bus("Ласточка", "У-100", 1.1,1.97,215,2.25);
        Bus gazelle = new Bus("Газель", "Витаро", 1.9,1.97,215,2.25);
        Bus bogdan = new Bus("Богдан", "Ф-150", 2.5,1.97,215,2.25);
        Bus minsk = new Bus("Минск", "Пассажирский", 3.5,1.97,215,2.25);

        DriverB<Car> ivanov = new DriverB<>("Иванов Иван Иванович", true, 3);
        System.out.println(ivanov.getMassage(lada));
    }
}
