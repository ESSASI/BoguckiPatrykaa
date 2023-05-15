import java.util.Scanner;

public class pdf3zad8 {
    public static void main(String[] args) {
        Scanner wprowadz = new Scanner(System.in);
        int produkt = 0;

        while (produkt < 100) {
            System.out.print("Wprowadź liczbę: ");
            int liczba = wprowadz.nextInt();
            produkt = liczba * 10;
        }

        System.out.println("Wprowadzono liczbę, której wynik pomnożony przez 10 wynosi " + produkt);
    }
}
