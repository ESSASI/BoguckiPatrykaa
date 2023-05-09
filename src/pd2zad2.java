import java.util.Scanner;

public class pd2zad2 {

    public static void main(String[] args) {
        Scanner wprowadz = new Scanner(System.in);

        System.out.println("Podaj dzien w postaci liczby");
        int dzien  = wprowadz.nextInt();
        System.out.println("Podaj miesiac w postaci liczby");
        int miesiac  = wprowadz.nextInt();
        System.out.println("Podaj 2 ostatnie cyfry roku");
        int rok  = wprowadz.nextInt();

        if(dzien*miesiac==rok){
            System.out.println("Podana data jest magiczna");
        }else{
            System.out.println("Podana data nie jest magiczna");
        }





    }
}
