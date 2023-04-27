import java.util.Scanner;
public class zad15 {
    public static void main(String[] args) {
        Scanner wprowadz = new Scanner(System.in);
        System.out.println("Podaj cene detaliczna:");
        double cenadetaliczna = wprowadz.nextDouble();
        double marza = 0.4;

        double zysk=cenadetaliczna*marza;
        System.out.println("Zysk plytki z marzą wynosi:" +zysk);

    }
}
