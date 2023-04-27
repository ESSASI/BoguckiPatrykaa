import java.util.Scanner;
public class zad17 {
    public static void main(String[] args) {
        Scanner wprowadz = new Scanner(System.in);
        System.out.println("Podaj cene twojego posiłku:");
        double Cenaposiłku = wprowadz.nextDouble();

        double podatek = 0.0675;
        double cenapopodatku = podatek * Cenaposiłku;
        double napiwek = 0.2;
        double cenaponapiwku = napiwek * Cenaposiłku;

        double wynik = cenaponapiwku + cenapopodatku + Cenaposiłku;

        System.out.println("Cena twojego posiłku wynosi:" + Cenaposiłku + ", cena podatku kosztuje: " + cenapopodatku + ", cena napiwku kosztuje: " + cenaponapiwku + ". Łączna kwota rachunku wynosi: " + wynik);

    }
}
