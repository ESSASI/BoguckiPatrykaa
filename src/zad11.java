import java.util.Scanner;
public class zad11 {
    public static void main(String[] args) {
        Scanner wprowadz = new Scanner(System.in);
        System.out.println("Podaj kupon produktu");
        int kupon = wprowadz.nextInt();


        double podatek1 = 0.04;
        double podatek2 = 0.02;
        double wartoscpopodatku1  = kupon * podatek1;
        double wartoscpopodatku2 = kupon * podatek2;
        double lacznacena = wartoscpopodatku2 + wartoscpopodatku1 + kupon;

        System.out.println("Kupon wynosi: " + kupon + " Wartosc z podatkiem stanowym wynosi: "+ wartoscpopodatku1 + " Wartosc z podatkiem lokanym wynosi: " + wartoscpopodatku2 + " Łączna wartosc wynosi: " + lacznacena);

    }
}