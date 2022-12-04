package HomeWork2.Tranports;


public class carsMain {
    public static void main(String[] args) {
        Car lada = new Car("Лада", "Гранда", 1.3, 2.55, 255, 3.35, Car.CarBodyType.SEDAN);
        Car volvo = new Car("Вольво", "Бравиа", 2.2, 1.11, 195, 2.15, Car.CarBodyType.JEEP);
        Car moskvish = new Car("Москвич", "Т-34", 3.2, 1.97, 215, 2.25, Car.CarBodyType.PICKUP);
        Car kia = new Car("Киа", "К5", 2.7, 1.97, 215, 2.25, Car.CarBodyType.VAN);

        Truck suzuki = new Truck("Сузуки", "ОУ-33", 3.3, 1.97, 215, 2.25, Truck.Tonnage.N1);
        Truck begemot = new Truck("Бегемот", "ГГ-317", 1.6, 1.97, 215, 2.25, Truck.Tonnage.N2);
        Truck marussia = new Truck("Маруся", "Молния", 3.4, 1.97, 215, 2.25, Truck.Tonnage.N1);
        Truck haval = new Truck("Хавал", "Икс", 2.1, 1.97, 215, 2.25, Truck.Tonnage.N3);

        Bus lastochka = new Bus("Ласточка", "У-100", 1.1, 1.97, 215, 2.25, Bus.Capacity.LARGE);
        Bus gazelle = new Bus("Газель", "Витаро", 1.9, 1.97, 215, 2.25, Bus.Capacity.MIDDLE);
        Bus bogdan = new Bus("Богдан", "Ф-150", 2.5, 1.97, 215, 2.25, Bus.Capacity.SMALL);
        Bus minsk = new Bus("Минск", "Пассажирский", 3.5, 1.97, 215, 2.25, Bus.Capacity.EXTRA_SMALL);

/*        DriverB<Car> ivanov = new DriverB<>("Иванов Иван Иванович", true, 3);
        System.out.println(ivanov.getMassage(lada));
        System.out.println(lada);*/

        lada.printType();
    }
}
