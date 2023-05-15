import java.util.Scanner;

public class pdf3zad3 {
    public static void main(String[] args) {
        Scanner wprowadz = new Scanner(System.in);
        String taknie;

        while (true) {
            System.out.print("Wpisz 'Tak' lub 'Nie': ");
            taknie = wprowadz.nextLine();

            if (taknie.equalsIgnoreCase("Tak") || taknie.equalsIgnoreCase("Nie")) {
                break;
            }

            System.out.println("Nieprawidlowa odpowoiedz sprobuj jeszcze raz");
        }

        System.out.println("Wprowadzono poprawna odpowiedz: " + taknie);
    }
}
