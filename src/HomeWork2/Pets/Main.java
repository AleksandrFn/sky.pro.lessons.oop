package HomeWork2.Pets;

public class Main {
    public static void main(String[] args) {

        Herbivore gazelle = new Herbivore("Газель", 3, "саванна", 35, "трава");
        Herbivore giraffe = new Herbivore("Жираф", 4, "саванна", 15, "Листья");
        Herbivore horse = new Herbivore("Лошадь", 11, "степи", 55, "салома");

        Predators hyena = new Predators("Гиена", 6, "саванна", 40, "мясо");
        Predators tiger = new Predators("Тигр", 8, "саванна", 80, "мясо");
        Predators bear = new Predators("Медведь", 9, "лес", 40, "рыба");

        Amphibian frog = new Amphibian("Лягушка", 2, "болото");
        Amphibian grassSnake = new Amphibian("Уж пресноводный", 4, "степи");

        Flightless peacock = new Flightless("Павлин", 5, "савана", "хотьба");
        Flightless penguin = new Flightless("Пингвин", 3, "ледник", "хотьба");
        Flightless dodo = new Flightless("Птица додо", 11, "савана", "хотьба");

        Flying seagull = new Flying("Чайка", 3, "горы", "полет");
        Flying albatross = new Flying("Альбатрос", 1, "горы", "полет");
        Flying falcon = new Flying("Сокол", 2, "горы", "полет");

        System.out.println(gazelle.getClass() + gazelle.toString());
        System.out.println(hyena.getClass() + hyena.toString());
        System.out.println(frog.getClass() + frog.toString());
        System.out.println(peacock.getClass() + peacock.toString());
        System.out.println(albatross.getClass() + albatross.toString());
        System.out.println(seagull.equals(albatross));
    }
}
