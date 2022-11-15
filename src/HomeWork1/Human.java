package HomeWork1;

public class Human {

    int yearOfBitrh;
    String name;
    String town;
    String jobTittle;

    Human(String name) {
        this(name, 0, "Информация не указана", "Информация не указана");
    }

    Human(String name, int yearOfBitrh, String town, String jobTittle) {
        if (yearOfBitrh > 0) {
            this.yearOfBitrh = yearOfBitrh;
        } else {
            this.yearOfBitrh = 0;
        }
        if (name == null || name.equals("")) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (town == null || town.equals("")) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (jobTittle == null || jobTittle.equals("")) {
            this.jobTittle = "Информация не указана";
        } else {
            this.jobTittle = jobTittle;
        }
    }

    void greetings() {
        System.out.println("Привет! Меня зовут " + this.name + " Я из города " + town + " Я родился в " + yearOfBitrh + " году. Я работаю на должности " + jobTittle + ". Будем знакомы!");
    }

    public String toString() {
        return "Привет! Меня зовут " + this.name + " Я из города " + town + " Я родился в " + yearOfBitrh + " году. Я работаю на должности " + jobTittle + ". Будем знакомы!";
    }
}
