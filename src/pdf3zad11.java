import java.util.Scanner;

public class pdf3zad11 {
    public static void main(String[] args) {
        Scanner wprowadz = new Scanner(System.in);
        int suma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Wprowadź liczbę: ");
            int liczba = wprowadz.nextInt();
            suma += liczba;
        }

        System.out.println("Suma wprowadzonych liczb: " + suma);
    }
}
