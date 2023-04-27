import java.util.Scanner;
public class zad12 {
    public static void main(String[] args) {
        Scanner wprowadz = new Scanner(System.in);
        System.out.println("Podaj ilosc litrow paliwa");
        int paliwo = wprowadz.nextInt();
        System.out.println("Podaj ilosc kilometrow");
         int kilometry = wprowadz.nextInt();

         int kilometrynalitr = kilometry / paliwo;
        System.out.println("Spalanie auta wynosi: "+kilometrynalitr);


    }
}
