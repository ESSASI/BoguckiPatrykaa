import java.util.Scanner;
public class zad13 {
    public static void main(String[] args) {
        Scanner wprowadz = new Scanner(System.in);
        System.out.println("Podaj ilosc zjedzonych ciasteczek");
        int iloscciasteczek = wprowadz.nextInt();
        int kaloriewjednymciastku = 75;// bo 40 ciasteczek w opakowaniu 1 porcja to 4 ciasta/i 400 kalorii wiec jedno ciastko ma 75kalorii
        int wynik = iloscciasteczek*kaloriewjednymciastku;
        System.out.println("Zjadłeś " + iloscciasteczek + " ciasteczek czyli zjadleś " + wynik   +"kalorii");

    }
}
