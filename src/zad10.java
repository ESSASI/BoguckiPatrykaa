import java.util.Scanner;
public class zad10 {
    public static void main(String[] args) {
        Scanner wprowadz = new Scanner(System.in);
        String imie,drugieimie,nazwisko;
        System.out.println("Podaj swoje imie");
        imie = wprowadz.nextLine();
        System.out.println("Podaj swoje drugie imie");
        drugieimie = wprowadz.nextLine();
        System.out.println("Podaj swoje nazwisko");
        nazwisko = wprowadz.nextLine();

        char PierwszyInitial = imie.charAt(0);
        char DrugiInitial = drugieimie.charAt(0);
        char TrzeciInitial = nazwisko.charAt(0);
        System.out.println("Twoje inicjały to:" +PierwszyInitial + DrugiInitial + TrzeciInitial);

    }
}