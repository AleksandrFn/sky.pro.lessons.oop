package HomeWork1.flowers;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Flower rose = new Flower("Роза обыкновенная", "Голландия", 35.59);
        Flower hrizantema = new Flower("Хризантема", null, 15, 5);
        Flower pion = new Flower("Пион", "Англия", 69.9, 1);
        Flower gipsophil = new Flower("Гипсофила", "Турция", 19.5, 10);

        Flower[] bouquet = {rose, hrizantema, pion, gipsophil, hrizantema};
        getBouquet(bouquet);
    }
    public static void getBouquet(Flower[] bouquet) {
        double cost = 0;
        int span = bouquet[0].getLifeSpan();
        String[] flowers = new String[bouquet.length];
        for (int i = 0; i < bouquet.length; i++) {
            cost += bouquet[i].getCost();
            if (bouquet[i].getLifeSpan() < span) {
                span = bouquet[i].getLifeSpan();
            }
            flowers[i] = bouquet[i].getFlowerName();
        }
        flowersToString(flowers);
        System.out.printf(" Цена букета составила - " + "%.2f", cost + (cost / 100 * 10));
        System.out.println(" р. Срок стояния - " + span + " дней.");
    }
    public static void flowersToString (String[] bouquet){
        String string = Arrays.toString(bouquet)
                .replace("[", "")
                .replace("]", "");

        System.out.print("Ваш букет : " + string);
    }
}
