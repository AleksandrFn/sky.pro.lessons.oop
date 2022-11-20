package HomeWork1;

public class Hw1 {
    public static void main(String[] args) {
        Human maxim = new Human("Максим", 1989, "Минск","Бренд-менеджера");
        Human anya = new Human("", 1993, "Москва", "Методиста образовательных программ");
        Human katya = new Human("Катя", 1992, null, "Продакт-менеджера");
        Human artem = new Human("Артем", 1995, "", "Директора по развитию бизнеса");
        Human vladimir = new Human("Владимир", 2022, "Казань", "Безработный");

        System.out.println(katya);
    }
}
