import java.util.Scanner;

public class pdf3zad4 {
    public static void main(String[] args) {
        Scanner wprowadz = new Scanner(System.in);

        System.out.print("Podaj imię: ");
        String imie = wprowadz.nextLine();

        for (int i = 0; i < 10; i++) {
            System.out.println(imie);
        }
    }
}
