import java.util.Scanner;

public class pdf3zad9 {
    public static void main(String[] args) {
        Scanner wprowadz = new Scanner(System.in);
        String taklubnie;

        do {
            System.out.print("Podaj pierwszą liczbę: ");
            int liczba1 = wprowadz.nextInt();

            System.out.print("Podaj drugą liczbę: ");
            int liczba2 = wprowadz.nextInt();

            int wynik = liczba1 + liczba2;
            System.out.println("Wynik: " + wynik);

            System.out.print("Czy chcesz kontynuować? Wpisz T albo N: ");
            taklubnie = wprowadz.next();
        } while (taklubnie.equalsIgnoreCase("T"));
    }
}
