package HomeWork1.part2;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car(null, "Granta", -100, "желтый", 2015, "Россия");
        Car audi = new Car("Audi", null, 3.0, "черный", 2020, "Германия");
        Car bmw = new Car("", "Z8", 3.0, "черный", 2021, "Германия");
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "", -300, "Южная Корея");

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
    }
}
