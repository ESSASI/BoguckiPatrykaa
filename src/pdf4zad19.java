import java.util.Scanner;
import java.util.Random;

public class pdf4zad19 {
    public static void main(String[] args) {
        Random random = new Random();
        int liczbaLosowa = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        int zgadywanaLiczba;

        do {
            System.out.print("Odgadnij liczbę: ");
            zgadywanaLiczba = scanner.nextInt();

            if (zgadywanaLiczba > liczbaLosowa) {
                System.out.println("Za duża liczba, spróbuj ponownie.");
            } else if (zgadywanaLiczba < liczbaLosowa) {
                System.out.println("Za mała liczba, spróbuj ponownie.");
            } else {
                System.out.println("Brawo! Odgadłeś liczbę!");
            }
        } while (zgadywanaLiczba != liczbaLosowa);
    }
}
