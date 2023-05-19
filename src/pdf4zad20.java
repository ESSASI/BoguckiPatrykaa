import java.util.Scanner;

public class pdf4zad20 {
    public static void main(String[] args) {
        Scan`ner wprowadz = new Scanner(System.in);

        System.out.print("Wprowadź wielkosc kwadratu nie wieksza od 15 oraz nie mniejsza od 1: ");
        int liczba = wprowadz.nextInt();

        for (int i = 0; i < liczba; i++) {
            for (int j = 0; j < liczba; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}


