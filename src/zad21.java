import java.util.Scanner;
public class zad21 {
    public static void main(String[] args) {
        Scanner wprowadz = new Scanner(System.in);

        System.out.println("Początkowa kwota zdeponowana w banku: ");
        double poczatkowakwota = wprowadz.nextDouble();
        System.out.println("Podaj roczna stope oprocentowania: (1% = 0.01 i tak dalej) ");
        double stopaoproc = wprowadz.nextDouble();
        System.out.println("Ile razy w roku odsetki sa kapitalizowane? :");
        double ilerazywroku = wprowadz.nextDouble();
        System.out.println("Przez ile lat srodki beda na koncie?:");
        double ilelat = wprowadz.nextDouble();


        double kwotapolatach = poczatkowakwota*stopaoproc*ilerazywroku*ilelat;
        double kwotapolatachikwota = poczatkowakwota+kwotapolatach;

        System.out.println("Po: "+ ilelat + " latach bedziesz miał na koncie " + kwotapolatachikwota + " zł");






    }
}