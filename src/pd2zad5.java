import java.util.Scanner;

public class pd2zad5 {

    public static void main(String[] args) {
        Scanner wprowadz = new Scanner(System.in);

        System.out.println("Podaj wage w kg");
        double waga  = wprowadz.nextDouble();
        double ciezar = waga*9.8;
        System.out.println("Twoj ciezar to " + ciezar);
        if(ciezar >=1000){
            System.out.println("Waga obiektu jest za duza");
        }else if(ciezar <= 10){
            System.out.println("Obiekt jest za lekki");
        }else{
            System.out.println("Waga jest prawidłowa");
        }







    }
}
