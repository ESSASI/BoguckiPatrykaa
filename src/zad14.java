import java.util.Scanner;
public class zad14 {
    public static void main(String[] args) {
        Scanner wprowadz = new Scanner(System.in);
        System.out.println("Podaj wynik z testu numer1");
        int wynik1 = wprowadz.nextInt();
        System.out.println("Podaj wynik z testu numer2");
        int wynik2 = wprowadz.nextInt();
        System.out.println("Podaj wynik z testu numer3");
        int wynik3 = wprowadz.nextInt();
        int ilosctestów=3;
        double srednia = ((wynik1 + wynik2 + wynik3)/ilosctestów);

        System.out.println("Wynik z testu numer 1 to: "+ wynik1);
        System.out.println("Wynik z testu numer 2 to: "+ wynik2);
        System.out.println("Wynik z testu numer 3 to: "+ wynik3);
        System.out.println("Srednia z tych testów to:" + srednia);

}}
