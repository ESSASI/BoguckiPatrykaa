import java.util.Scanner;
public class zad16 {
    public static void main(String[] args) {
        Scanner wprowadz = new Scanner(System.in);
        System.out.println("Podaj ulubione miasto:");
        String miasto = wprowadz.nextLine();

        int liczbaznakow = miasto.length();
        String wielkie = miasto.toUpperCase();
        String male = miasto.toLowerCase();
        char znak1 = miasto.charAt(0);

        System.out.println("Twoje ulubione miasto to: " + miasto + " Posiada ono " + liczbaznakow + " znaków , inicjałem tego miasta jest: " + znak1 + " , oraz tak sie je pisze duzymi oraz małymi literami: " + wielkie + " " + male);

    }
}
