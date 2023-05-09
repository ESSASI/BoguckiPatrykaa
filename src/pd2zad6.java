import java.util.Scanner;

public class pd2zad6 {

    public static void main(String[] args) {
        Scanner wprowadz = new Scanner(System.in);
        System.out.print("Wprowadz czas w sekundach ");
        int n = wprowadz.nextInt();
        int nDni = n/86400;
        int nGodziny = (n%86400)/3600;
        int nMinuty = ((n%86400)%3600) /60;
        int nSekundy =(((n%86400)%3600)%60);
        System.out.println();
        System.out.print("To jest "+ nDni+ " dni,"+nGodziny+" godzin, "+nMinuty+"  minut, i "+nSekundy+" sekund. ");
    }
}
