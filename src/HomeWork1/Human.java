package HomeWork1;

public class Human {

    private int yearOfBitrh;
    String name;
    private String town;
    String jobTittle;

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
    public String toString() {
        return "Привет! Меня зовут " + this.name + " Я из города " + town + " Я родился в " + yearOfBitrh + " году. Я работаю на должности " + jobTittle + ". Будем знакомы!";
    }

    public int getYearOfBitrh() {
        return yearOfBitrh;
    }

    public void setYearOfBitrh(int yearOfBitrh) {
        if (yearOfBitrh > 0) {
            this.yearOfBitrh = yearOfBitrh;
        } else {
            this.yearOfBitrh = 0;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town == null || town.equals("")) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
    }
}
