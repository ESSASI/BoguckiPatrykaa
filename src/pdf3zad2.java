import java.util.Scanner;

public class pdf3zad2 {
    public static void main(String[] args) {
        Scanner wprowadz = new Scanner(System.in);
        String litera;

        while (true) {
            System.out.print("Wpisz literę 'T', 't', 'N' lub 'n': ");
            litera = wprowadz.nextLine();

            if (litera.equalsIgnoreCase("T") || litera.equalsIgnoreCase("N")) {
                break;
            }

            System.out.println("Nieprawidlowa litera sprobuj jeszcze raz");
        }

        System.out.println("Podano prawidlowa litere: " + litera);
    }
}
