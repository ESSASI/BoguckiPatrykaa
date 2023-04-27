import java.util.Scanner;
public class zad8 {
    public static void main(String[] args) {

        Scanner wprowadz = new Scanner(System.in);

        System.out.println("Podaj dlugosc pokoju 1: ");
        int dlugosc1 = wprowadz.nextInt();
        System.out.println("Podaj szerokosc pokoju 1: ");
        int szerokosc1 = wprowadz.nextInt();

        System.out.println("Podaj dlugosc pokoju 2: ");
        int dlugosc2 = wprowadz.nextInt();
        System.out.println("Podaj szerokosc pokoju 2: ");
        int szerokosc2 = wprowadz.nextInt();

        System.out.println("Podaj dlugosc pokoju 3: ");
        int dlugosc3 = wprowadz.nextInt();
        System.out.println("Podaj szerokosc pokoju 3: ");
        int szerokosc3 = wprowadz.nextInt();

        System.out.println("Podaj dlugosc pokoju 4: ");
        int dlugosc4 = wprowadz.nextInt();
        System.out.println("Podaj szerokosc pokoju 4: ");
        int szerokosc4 = wprowadz.nextInt();

        int pomieszczeniejeden = dlugosc1*szerokosc1;
        int pomieszczeniedwa =dlugosc2*szerokosc2;
        int pomieszczenietrzy = dlugosc3*szerokosc3;
        int pomieszczeniecztery =dlugosc4*szerokosc4;
        int calkowitapowierzchnia = pomieszczeniejeden + pomieszczeniedwa + pomieszczenietrzy + pomieszczeniecztery;

        System.out.println("Powierzchnia calkowita wynosi: " + calkowitapowierzchnia);
        System.out.println("Powierzchnia pokoju numer 1 wynosi:" + pomieszczeniejeden);
        System.out.println("Powierzchnia pokoju numer 2 wynosi:" + pomieszczeniedwa);
        System.out.println("Powierzchnia pokoju numer 3 wynosi:" + pomieszczenietrzy);
        System.out.println("Powierzchnia pokoju numer 4 wynosi:" + pomieszczeniecztery);

        float liczbaosob = 4;
        float powierzchnianajednaosobe = calkowitapowierzchnia / liczbaosob;
        System.out.println("Powierzchnia na 1 osobe wynosi: " + powierzchnianajednaosobe);



    }
}