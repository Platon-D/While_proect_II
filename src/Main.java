import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int Ink = 0;

        while (Ink<=20) {
            System.out.println(Ink);
            Ink++;
        }
        System.out.println("Success. Exit");
        System.out.println("Start new WOW");

        boolean ink = true;
        while (ink) {
            System.out.println("Wow");
            ink = new Random().nextInt(20) !=8;
        } System.out.println("ink cycle exit");

        boolean link = true;
        while (link) {
            System.out.println("Wow");
            link = new Random().nextInt(20) !=8;
        } System.out.println("Link cycle exit");

    }
}