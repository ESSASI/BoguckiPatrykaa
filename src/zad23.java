import java.util.Scanner;
public class zad23 {
    public static void main(String[] args) {
        Scanner wprowadz = new Scanner(System.in);

        System.out.println("Podaj dlugosc rzedu w metrach ");
        double dlugoscrzedu= wprowadz.nextDouble();
        System.out.println("Podaj ilosc miejsca zajmowanego przez okratowanie :");
        double okratowanie = wprowadz.nextDouble();
        System.out.println("Podaj odleglosc miedzy sadzonkami w metrach");
        double odstep = wprowadz.nextDouble();

double liczbasadzonek = (dlugoscrzedu-2*okratowanie)/odstep   ;

        System.out.println("Można posadzić " +  liczbasadzonek + "sadzonek");






    }
}