import java.util.Scanner;

public class pdf3zad1 {
    public static void main(String[] args) {
        Scanner wprowadz = new Scanner(System.in);
        int liczba;

        while (true) {
            System.out.print("Wpisz liczbe od 10 do 24: ");
            liczba = wprowadz.nextInt();

            if (liczba >= 10 && liczba <= 24) {
                break;
            }

            System.out.println("Nieprawidlowa liczba sprobuj jeszcze raz");
        }

        System.out.println("Podano prawidlowa liczbe: " + liczba);
    }
}

