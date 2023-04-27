import java.util.Scanner;
public class zad20 {
    public static void main(String[] args) {
        Scanner wprowadz = new Scanner(System.in);

        double  cukier1 = 1.5;
        double maslo1 =1.0;
        double maka1=2.75;
        double porcja=48;

        double cukier = cukier1/porcja;
        double maslo = maslo1/porcja;
        double maka = maka1/porcja;

        System.out.println("Podaj ile ciasteczek chcesz zrobic: ");
        double liczbaciasteczek  = wprowadz.nextDouble();

        double ilosccukru = liczbaciasteczek * cukier;
        double iloscmasla = liczbaciasteczek * maslo;
        double iloscmaka = liczbaciasteczek * maka;

        System.out.println("Zeby wykonac " + liczbaciasteczek + " ciasteczek potrzeba " + ilosccukru + " szklanek cukru , " + iloscmasla + " szklanek masla oraz " + iloscmaka + "  szklanek maki.");


    }
}
